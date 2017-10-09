package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList taskListDo = context.getBean("toDoList",TaskList.class);
        taskListDo.addTask("to Do");
        TaskList taskListProgress = context.getBean("inProgressList",TaskList.class);
        taskListProgress.addTask("in Progress");
        TaskList taskListDone = context.getBean("doneList",TaskList.class);
        taskListDone.addTask("done");
        //Then
        board.getToDoList().getTasks().stream()
                .forEach(System.out::println);
        board.getInProgressList().getTasks().stream()
                .forEach(System.out::println);
        board.getDoneList().getTasks().stream()
                .forEach(System.out::println);
    }
}
