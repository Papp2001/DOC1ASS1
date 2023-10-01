@Service
public class TeamService {
    @Autowired
    TeamMemberRepository teamRepository;
    private static final List<TeamMember> team_members = new
            ArrayList<>();
    // the rest of the code as before
    public TeamMember getTeamMember2 (String memberId) {
        return teamRepository.findById(memberId).get();
    }
// the rest of the code as before
}