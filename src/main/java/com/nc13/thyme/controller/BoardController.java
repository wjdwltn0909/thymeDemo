package com.nc13.thyme.controller;

import com.nc13.thyme.model.BoardDTO;
import com.nc13.thyme.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardController {
    private final BoardService BOARD_SERVICE;

    @GetMapping("showAll")
    public String showAll(Model model) {
        List<BoardDTO> list = BOARD_SERVICE.selectAll();
        model.addAttribute("list", list);

        return "board/showAll";
    }

}
