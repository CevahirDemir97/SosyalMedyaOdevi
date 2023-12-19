package org.example.entity;
@Builder
@Data //getter,setter,toString
@NoArgsConstructor // bos const
@AllArgsConstructor //dolu const
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    @Column (unique = false,
             nullable = false,
             updatable = false
    )
    private int kullaniciid;
    @Column(unique = true,
            length = 50,
            nullable = false,
            updatable = false
    )
    private String kullaniciAdi;

    @Column(unique = false,
            length = 200,
            nullable = false,
            updatable = true
    )
    private String acıklama;
}
