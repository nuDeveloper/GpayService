package amount.transfer.byphone.amounttransferbyphone.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import amount.transfer.byphone.amounttransferbyphone.dtos.StatementByPhoneResponseDto;
import amount.transfer.byphone.amounttransferbyphone.feignclient.BankApplicationService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
public class StatementServiceTest {

	@InjectMocks
	StatementService statementService;

	@Mock
	BankApplicationService bankApplicationService;

	@Test
	public void testGetStatementByPhone() {

		String phoneNumber = "9998880000";
		Mockito.when(bankApplicationService.getStatementByPhone(phoneNumber))
				.thenReturn(new ArrayList<StatementByPhoneResponseDto>());

		List<StatementByPhoneResponseDto> statementByPhoneResponseDtos = statementService
				.getStatementByPhone(phoneNumber);

		assertNotNull(statementByPhoneResponseDtos);
	}
}