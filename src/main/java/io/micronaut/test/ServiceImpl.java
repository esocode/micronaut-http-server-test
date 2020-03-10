package io.micronaut.test;

import io.micronaut.http.annotation.Controller;
import io.reactivex.Maybe;

@Controller
public class ServiceImpl implements Service {

	@Override
	public Maybe<Integer> getIdForName(String forName) {
		System.out.println("get ID for " + forName);
		return Maybe.just(forName.hashCode());
	}
}