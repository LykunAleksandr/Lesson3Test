package by.epam.task2.Main;

import by.epam.task2.dao.DaoFactory;
import by.epam.task2.dao.DataReader;
import by.epam.task2.dao.ProductDao;
import by.epam.task2.service.ImplProductService;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        ImplProductService service = new ImplProductService();
        System.out.println(service.getProductList());


    }
}
