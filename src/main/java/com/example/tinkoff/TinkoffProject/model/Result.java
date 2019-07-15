package com.example.tinkoff.TinkoffProject.model;


import javax.persistence.*;

/*
 * Result entity for PostgreDB
 *
 */

@Entity
@Table(name = "RESULT")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String code;

    private int number;

    private String fileNames;

    private String error;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFileNames() {
        return fileNames;
    }

    public void setFileNames(String fileNames) {
        this.fileNames = fileNames;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
