package com.demo.seoacount.controller;

import com.demo.seoacount.model.Game;
import com.demo.seoacount.model.ListMenu;
import com.demo.seoacount.model.MenuItem;
import com.demo.seoacount.utils.Contant;
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
    @PostConstruct
    public void mockData() {
//    insert data for lst Menu header
        lstMenu.add(new ListMenu("Hành động"));
        lstMenu.add(new ListMenu("Băn súng"));
        lstMenu.add(new ListMenu("Game ARBG"));
        lstMenu.add(new ListMenu("RBG"));
        lstMenu.add(new ListMenu("Sport"));
        lstMenu.add(new ListMenu("Puzzel"));
        lstMenu.add(new ListMenu("Racing"));
        lstMenu.add(new ListMenu("Casual"));
        lstMenu.add(new ListMenu("Strategy"));
        lstMenu.add(new ListMenu("Adventure"));

//        insert data for Menu content
        lstItem.add(new MenuItem("Steam", "steam"));
        lstItem.add(new MenuItem("Origin", "Origin"));
        lstItem.add(new MenuItem("Uplay", "Uplay-icon"));
        lstItem.add(new MenuItem("Ubiisoft", "Ubiisoft_logo"));
        lstItem.add(new MenuItem("GOD", "steam"));
        lstItem.add(new MenuItem("Blizzard", "blizzard"));

//       insert data for all game
        allLstGame.add(new Game(1, "Con cha", 12, "1.700.000", "700.000", "1" , 5));
        allLstGame.add(new Game(2, "Liên Quân", 73, "1.700.000", "700.000", "2", 3 ));
        allLstGame.add(new Game(3, "identity V", 70, "1.700.000", "700.000", "3", 5 ));
        allLstGame.add(new Game(4,"mario", 72, "1.700", "20.000", "4", 4 ));
        allLstGame.add(new Game(5, "LOL", 70, "1.400.000", "800.000", "5", 2 ));
        allLstGame.add(new Game(6,"Fortnite Royale", 80, "1.700.000", "700.000", "6" ,3));
        allLstGame.add(new Game(7, "Fortnite Battle", 50, "1.000.000", "500.000", "9", 5 ));
        allLstGame.add(new Game(8,"Pikachu", 50, "1.000.000", "500.000", "9", 4 ));
        allLstGame.add(new Game(9,"Fortnite Battle", 70, "1.700.000", "501.000", "9", 3 ));
        allLstGame.add(new Game(11, "Battle Royale", 75, "1.100.000", "7.000", "10", 2 ));
        allLstGame.add(new Game(11, "Fortnite Battle Royale", 10, "1.500.000", "70.000", "11", 3 ));
        allLstGame.add(new Game(12, "Destity", 30, "1.710.000", "760.000", "12", 3 ));
        allLstGame.add(new Game(13, "Con cha", 12, "1.700.000", "700.000", "1" , 5));
        allLstGame.add(new Game(14, "Liên Quân", 73, "1.700.000", "700.000", "2", 3 ));
        allLstGame.add(new Game(15, "identity V", 70, "1.700.000", "700.000", "3", 5 ));
        allLstGame.add(new Game(16,"mario", 72, "1.700", "20.000", "4", 4 ));
        allLstGame.add(new Game(17, "Fortnite Battle", 50, "1.000.000", "500.000", "9", 5 ));
        allLstGame.add(new Game(18,"Pikachu", 50, "1.000.000", "500.000", "9", 4 ));
        allLstGame.add(new Game(19,"Fortnite Battle", 70, "1.700.000", "501.000", "9", 3 ));
        allLstGame.add(new Game(20, "Battle Royale", 75, "1.100.000", "7.000", "10", 2 ));
        allLstGame.add(new Game(21, "Fortnite Battle Royale", 10, "1.500.000", "70.000", "11", 3 ));
        allLstGame.add(new Game(22, "Destity", 30, "1.710.000", "760.000", "12", 3 ));
        allLstGame.add(new Game(23, "Con cha", 12, "1.700.000", "700.000", "11" , 5));
        allLstGame.add(new Game(24, "Liên Quân", 73, "1.700.000", "700.000", "2", 3 ));
        allLstGame.add(new Game(25, "identity V", 70, "1.700.000", "700.000", "3", 5 ));
        allLstGame.add(new Game(26,"mario", 72, "1.700", "20.000", "3", 4 ));
        allLstGame.add(new Game(27, "LOL", 70, "1.400.000", "800.000", "5", 2 ));
        allLstGame.add(new Game(28,"Fortnite Royale", 80, "1.700.000", "700.000", "7" ,3));
        allLstGame.add(new Game(29, "Fortnite Battle", 50, "1.000.000", "500.000", "8", 5 ));
        allLstGame.add(new Game(30,"Pikachu", 50, "1.000.000", "500.000", "9", 4 ));
        allLstGame.add(new Game(31,"Fortnite Battle", 70, "1.700.000", "501.000", "11", 3 ));
        allLstGame.add(new Game(32, "Battle Royale", 75, "1.100.000", "7.000", "10", 2 ));
        allLstGame.add(new Game(33, "Fortnite Battle Royale", 10, "1.500.000", "70.000", "11", 3 ));
        allLstGame.add(new Game(34, "Destity", 30, "1.710.000", "760.000", "10", 3 ));


//        insert data for good game
        goodLstGame.add(new Game(6,"Fortnite Royale", 80, "1.700.000", "700.000", "6" ,3));
        goodLstGame.add(new Game(3,"identity V", 70, "1.700.000", "700.000", "3", 5 ));
        goodLstGame.add(new Game(1, "Con cha", 12, "1.700.000", "700.000", "1", 5 ));
        goodLstGame.add(new Game(12, "Destity", 30, "1.710.000", "760.000", "12", 3 ));
        goodLstGame.add(new Game(11, "Fortnite Battle Royale", 10, "1.500.000", "70.000", "11", 3 ));
        goodLstGame.add(new Game(9, "Fortnite Battle", 70, "1.700.000", "501.000", "9", 3 ));

//        insert data for slide game
        slideGame.add(new Game(12, "Destity", 30, "1.710.000", "760.000", "12", 3 ));
        slideGame.add(new Game(11, "Fortnite Battle Royale", 10, "1.500.000", "70.000", "11", 3 ));
        slideGame.add(new Game(9, "Fortnite Battle", 70, "1.700.000", "501.000", "9", 3 ));
    }

    @RequestMapping("/home")
    public String home(Model model,  @RequestParam(value = "Page", defaultValue = "0") int page,
                       @RequestParam(value = "filter", defaultValue = "0") int filter) {
        int basketSize = (basketGame.size());
        int loveSize = (loveGame.size());
        List<Game> gameOfPage = new ArrayList<>();

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
        model.addAttribute("listGame", gameOfPage);
//        sau sẽ ko dùng size nưa sẽ dùng hàm đếm số phần tử trong database
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("currentPage", page);

        model.addAttribute("lstMenu", lstMenu );
        model.addAttribute("lstItem", lstItem );
        model.addAttribute("basketGame", basketGame);
        model.addAttribute("loveGame", loveGame);
        model.addAttribute("gameOfPage", gameOfPage);
        model.addAttribute("goodLstGame", goodLstGame);
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
