package com.jpa.springjpa.JPA;

import jakarta.persistence.*;


@NamedNativeQuery(name = "ChessPlayer.findPlayerNameDtoById_Named",
        query = "SELECT p.firstName as first, p.lastName as last FROM Chess_Player p ",
        resultSetMapping = "Mapping.PlayerNameDto")
@SqlResultSetMapping(name = "Mapping.PlayerNameDto",
        classes = @ConstructorResult(targetClass = PlayerNameDto.class,
                columns = {@ColumnResult(name = "first"),
                        @ColumnResult(name = "last")}))


@Entity
@Table(name = "chess_player")
public class ChessPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
