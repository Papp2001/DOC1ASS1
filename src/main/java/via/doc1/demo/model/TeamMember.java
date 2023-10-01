@Entity(name = "TeamMember")
@Table(name = "team_member")
public class TeamMember {
    @Id
    private String id;
    private String name;
    private String email;
    @OneToMany(
            fetch=FetchType.LAZY,
            mappedBy = "teamMember")
    @JsonIgnore
    private List<Task> tasks = new ArrayList<>();
    public TeamMember(){
    }
// …
// the rest of the code as before
}