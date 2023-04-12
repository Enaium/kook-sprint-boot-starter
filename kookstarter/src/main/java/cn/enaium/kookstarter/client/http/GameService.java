/*
 * Copyright 2023 Enaium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.enaium.kookstarter.client.http;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * @author Enaium
 * @since 0.3.0
 */
public interface GameService {
    /**
     * 游戏列表
     *
     * @since 0.3.0
     */
    @GetExchange("game")
    Mono<String> getGame(Object... params);


    /**
     * 添加游戏
     *
     * @since 0.3.0
     */
    @PostExchange("game/create")
    Mono<String> postGameCreate(Object... params);


    /**
     * 更新游戏
     *
     * @since 0.3.0
     */
    @PostExchange("game/update")
    Mono<String> postGameUpdate(Object... params);


    /**
     * 删除游戏
     *
     * @since 0.3.0
     */
    @PostExchange("game/delete")
    Mono<String> postGameDelete(Object... params);


    /**
     * 添加游戏/音乐记录(开始玩/听)
     *
     * @since 0.3.0
     */
    @PostExchange("game/activity")
    Mono<String> postGameActivity(Object... params);


    /**
     * 删除游戏/音乐记录(结束玩/听)
     *
     * @since 0.3.0
     */
    @PostExchange("game/delete-activity")
    Mono<String> postGameDeleteActivity(Object... params);

}
