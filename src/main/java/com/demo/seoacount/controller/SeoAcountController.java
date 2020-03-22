package com.demo.seoacount.controller;

import com.demo.seoacount.model.Game;
import com.demo.seoacount.model.ListMenu;
import com.demo.seoacount.model.MenuItem;
import com.demo.seoacount.repository.CategoryRepository;
import com.demo.seoacount.repository.GameRepository;
import com.demo.seoacount.repository.MenuRepository;
import com.demo.seoacount.utils.Contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class SeoAcountController {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private CategoryRepository categoryRepository;


//    list menu header
    private List<ListMenu> lstMenu = new ArrayList<>();
//    list menu content
    private List<MenuItem> lstItem = new ArrayList<>();
//    all game
    private List<Game> allLstGame = new ArrayList<>();
//    top game
    private List<Game> goodLstGame = new ArrayList<>();
//    list game in basket
    private Set<Game> basketGame = new HashSet<>();
//    list love game
    private Set<Game> loveGame = new HashSet<>();
//    slide game
    private List<Game> slideGame = new ArrayList<>();

    @RequestMapping("/home")
    public String home(Model model,  @RequestParam(value = "Page", defaultValue = "0") int page, @RequestParam(value = "PageGood", defaultValue = "0") int pageGood,
                       @RequestParam(value = "filter", defaultValue = "0") int filter) {
        lstMenu = categoryRepository.findAll();
        goodLstGame = gameRepository.findGoodGame(5);
        slideGame = gameRepository.findSlideGame(10);
        lstItem = menuRepository.findAll();
        allLstGame = gameRepository.findAll();
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());
        List<Game> gameOfPage = new ArrayList<>();
        List<Game> goodGameOfPage = new ArrayList<>();

        int index = page * Contant.PAGE_SIZE;
        int lengthGame = page * Contant.PAGE_SIZE + Contant.PAGE_SIZE > allLstGame.size() ? allLstGame.size() :
                page * Contant.PAGE_SIZE + Contant.PAGE_SIZE;

        for(int i = index; i< lengthGame; i++) {
            Game game = allLstGame.get(i);
            gameOfPage.add(game);
        }
        int totalPage = allLstGame.size() % Contant.PAGE_SIZE != 0
                ? (allLstGame.size()/Contant.PAGE_SIZE )
                : (allLstGame.size()/Contant.PAGE_SIZE -1);

        int indexGood = pageGood * Contant.PAGE_GOOD_SIZE;
        int lengthGameGood =  pageGood * Contant.PAGE_GOOD_SIZE + Contant.PAGE_GOOD_SIZE > goodLstGame.size() ? goodLstGame.size() :
                pageGood * Contant.PAGE_GOOD_SIZE + Contant.PAGE_GOOD_SIZE;
        for (int i = indexGood; i < lengthGameGood; i++) {
            Game game = goodLstGame.get(i);
            goodGameOfPage.add(game);
        }

        int totalGoodPage = goodLstGame.size() % Contant.PAGE_GOOD_SIZE != 0
                ? (goodLstGame.size()/Contant.PAGE_GOOD_SIZE )
                : (goodLstGame.size()/Contant.PAGE_GOOD_SIZE -1);
        model.addAttribute("listGame", gameOfPage);
//        sau sẽ ko dùng size nưa sẽ dùng hàm đếm số phần tử trong database
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("currentGoodPage", pageGood);
        model.addAttribute("totalGoodPage", totalGoodPage);
        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("gameOfPage", gameOfPage);
        model.addAttribute("goodLstGame", goodGameOfPage);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return "index";
    }

    @RequestMapping("/detail")
    public String detail(Model model) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());

        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("allLstGame", allLstGame);
        model.addAttribute("goodLstGame", goodLstGame);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return "detail";
    }

    @RequestMapping("/header")
    public String header(Model model) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());

        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("allLstGame", allLstGame);
        model.addAttribute("goodLstGame", goodLstGame);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return "default/header";
    }

    @RequestMapping(value = "seo/{gameId}/detail")
    public String editGame(Model model, @PathVariable("gameId") int gameId) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());
        Game seoGame = null;
        for (Game g : allLstGame ) {
            if(g.getId()== gameId) {
                seoGame = g;
            }
        }
        model.addAttribute("game", seoGame);
        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("allLstGame", allLstGame);
        model.addAttribute("goodLstGame", goodLstGame);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return "detail";
    }

    @RequestMapping(value = "/home/{gameId}")
    public String basketGame(Model model
                             ,@PathVariable("gameId") int gameId) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());
        for (Game g : allLstGame ) {
            if(g.getId()== gameId) {
                basketGame.add(g);
            }
        }

        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("allLstGame", allLstGame);
        model.addAttribute("goodLstGame", goodLstGame);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return  "redirect:/home";
    }


    @RequestMapping("/parcel")
    public String parcel(Model model) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());
        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("allLstGame", allLstGame);
        model.addAttribute("goodLstGame", goodLstGame);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return "parcel";
    }

    @RequestMapping(value = "/deletes/{gameId}")
    public String deleteGame(Model model
            ,@PathVariable("gameId") int gameId) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());
        for (Game g : basketGame ) {
            if(g.getId()== gameId) {
                basketGame.remove(g);
            }
        }
        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("allLstGame", allLstGame);
        model.addAttribute("goodLstGame", goodLstGame);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return  "redirect:/parcel";
    }

    @RequestMapping(value = "/love/{gameId}")
    public String loveGame(Model model
            ,@PathVariable("gameId") int gameId) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());
        for (Game g : allLstGame ) {
            if(g.getId()== gameId) {
                loveGame.add(g);
            }
        }
        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("allLstGame", allLstGame);
        model.addAttribute("goodLstGame", goodLstGame);
        model.addAttribute("basketSize", basketSize);
        model.addAttribute("loveSize", loveSize);
        model.addAttribute("slideGame", slideGame);
        return  "redirect:/parcel";
    }
}
