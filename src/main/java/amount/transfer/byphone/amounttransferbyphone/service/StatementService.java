package amount.transfer.byphone.amounttransferbyphone.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amount.transfer.byphone.amounttransferbyphone.dtos.StatementByPhoneResponseDto;
import amount.transfer.byphone.amounttransferbyphone.feignclient.BankApplicationService;

@Service
public class StatementService {

	@Autowired
	BankApplicationService bankApplicationService;

	public List<StatementByPhoneResponseDto> getStatementByPhone(String phoneNumber) {
		return bankApplicationService.getStatementByPhone(phoneNumber);
	}

}
