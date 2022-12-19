package part3_design_pattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Document {

    private State state;
    private User user;

    public Document(User user, State state){
        this.user = user;
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /*
    state 의 상태 및 user 의 권한에 따라 조건 분기하도록 작성함

    1) 초안 상태이면 검토하도록
    2) 검토 상태이면
        2.1 관리자이면 발행하도록
        2.2 관리자가 아니면 발행할 수 없음
    3) 발행 상태이면
        아무것도 하지 않는다.
     */
    public void publish(){

        switch (state){
            case DRAFT:
                this.state = State.MODERATION;
                break;
            case MODERATION:
                if(user.getRole()==Role.ADMIN)
                    this.state = State.PUBLISHED;
                break;
            case PUBLISHED:
                break;
        }

        log.info("publish invoked - state : {}",this.state);

    }

}
