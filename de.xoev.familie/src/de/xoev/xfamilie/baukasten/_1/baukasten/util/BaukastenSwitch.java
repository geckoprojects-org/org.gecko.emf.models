/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.xoev.xfamilie.baukasten._1.baukasten.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage
 * @generated
 */
public class BaukastenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BaukastenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaukastenSwitch() {
		if (modelPackage == null) {
			modelPackage = BaukastenPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE: {
				AllgemeinerNameType allgemeinerNameType = (AllgemeinerNameType)theEObject;
				T result = caseAllgemeinerNameType(allgemeinerNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE: {
				AntragsnachrichtType antragsnachrichtType = (AntragsnachrichtType)theEObject;
				T result = caseAntragsnachrichtType(antragsnachrichtType);
				if (result == null) result = caseNachrichtType(antragsnachrichtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE: {
				AufenthaltstitelNachweisbezugType aufenthaltstitelNachweisbezugType = (AufenthaltstitelNachweisbezugType)theEObject;
				T result = caseAufenthaltstitelNachweisbezugType(aufenthaltstitelNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE: {
				AuslandsanschriftType auslandsanschriftType = (AuslandsanschriftType)theEObject;
				T result = caseAuslandsanschriftType(auslandsanschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.BANKVERBINDUNG_IBAN_OPTIONAL_TYPE: {
				BankverbindungIBANOptionalType bankverbindungIBANOptionalType = (BankverbindungIBANOptionalType)theEObject;
				T result = caseBankverbindungIBANOptionalType(bankverbindungIBANOptionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE: {
				BankverbindungInhaberOptionalType bankverbindungInhaberOptionalType = (BankverbindungInhaberOptionalType)theEObject;
				T result = caseBankverbindungInhaberOptionalType(bankverbindungInhaberOptionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.BANKVERBINDUNG_TYPE: {
				BankverbindungType bankverbindungType = (BankverbindungType)theEObject;
				T result = caseBankverbindungType(bankverbindungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE: {
				BehoerdenkennungType behoerdenkennungType = (BehoerdenkennungType)theEObject;
				T result = caseBehoerdenkennungType(behoerdenkennungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_ANREDE_TYPE: {
				CodeAnredeType codeAnredeType = (CodeAnredeType)theEObject;
				T result = caseCodeAnredeType(codeAnredeType);
				if (result == null) result = caseCode(codeAnredeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_ART_ABRUF_TYPE: {
				CodeArtAbrufType codeArtAbrufType = (CodeArtAbrufType)theEObject;
				T result = caseCodeArtAbrufType(codeArtAbrufType);
				if (result == null) result = caseCode(codeArtAbrufType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_AUFENTHALTSSTATUS_TYPE: {
				CodeAufenthaltsstatusType codeAufenthaltsstatusType = (CodeAufenthaltsstatusType)theEObject;
				T result = caseCodeAufenthaltsstatusType(codeAufenthaltsstatusType);
				if (result == null) result = caseCode(codeAufenthaltsstatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_BUNDESLAND_TYPE: {
				CodeBundeslandType codeBundeslandType = (CodeBundeslandType)theEObject;
				T result = caseCodeBundeslandType(codeBundeslandType);
				if (result == null) result = caseCode(codeBundeslandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_EIGENSCHAFT_TYPE: {
				CodeEigenschaftType codeEigenschaftType = (CodeEigenschaftType)theEObject;
				T result = caseCodeEigenschaftType(codeEigenschaftType);
				if (result == null) result = caseCode(codeEigenschaftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_EINKOMMENSARTEN_TYPE: {
				CodeEinkommensartenType codeEinkommensartenType = (CodeEinkommensartenType)theEObject;
				T result = caseCodeEinkommensartenType(codeEinkommensartenType);
				if (result == null) result = caseCode(codeEinkommensartenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_ERREICHBARKEIT_TYPE: {
				CodeErreichbarkeitType codeErreichbarkeitType = (CodeErreichbarkeitType)theEObject;
				T result = caseCodeErreichbarkeitType(codeErreichbarkeitType);
				if (result == null) result = caseCode(codeErreichbarkeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_FAMILIENSTAND_TYPE: {
				CodeFamilienstandType codeFamilienstandType = (CodeFamilienstandType)theEObject;
				T result = caseCodeFamilienstandType(codeFamilienstandType);
				if (result == null) result = caseCode(codeFamilienstandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE: {
				CodeGemeindeVZAmtlicherGemeindeschluesselType codeGemeindeVZAmtlicherGemeindeschluesselType = (CodeGemeindeVZAmtlicherGemeindeschluesselType)theEObject;
				T result = caseCodeGemeindeVZAmtlicherGemeindeschluesselType(codeGemeindeVZAmtlicherGemeindeschluesselType);
				if (result == null) result = caseCode(codeGemeindeVZAmtlicherGemeindeschluesselType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE: {
				CodeGemeindeVZRegionalschluesselType codeGemeindeVZRegionalschluesselType = (CodeGemeindeVZRegionalschluesselType)theEObject;
				T result = caseCodeGemeindeVZRegionalschluesselType(codeGemeindeVZRegionalschluesselType);
				if (result == null) result = caseCode(codeGemeindeVZRegionalschluesselType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_GESCHLECHT_TYPE: {
				CodeGeschlechtType codeGeschlechtType = (CodeGeschlechtType)theEObject;
				T result = caseCodeGeschlechtType(codeGeschlechtType);
				if (result == null) result = caseCode(codeGeschlechtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_KINDSCHAFTSBEZIEHUNG_TYPE: {
				CodeKindschaftsbeziehungType codeKindschaftsbeziehungType = (CodeKindschaftsbeziehungType)theEObject;
				T result = caseCodeKindschaftsbeziehungType(codeKindschaftsbeziehungType);
				if (result == null) result = caseCode(codeKindschaftsbeziehungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_KIND_WOHNHAFT_BEI_TYPE: {
				CodeKindWohnhaftBeiType codeKindWohnhaftBeiType = (CodeKindWohnhaftBeiType)theEObject;
				T result = caseCodeKindWohnhaftBeiType(codeKindWohnhaftBeiType);
				if (result == null) result = caseCode(codeKindWohnhaftBeiType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_LEISTUNGSERHALT_TYPE: {
				CodeLeistungserhaltType codeLeistungserhaltType = (CodeLeistungserhaltType)theEObject;
				T result = caseCodeLeistungserhaltType(codeLeistungserhaltType);
				if (result == null) result = caseCode(codeLeistungserhaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_LEISTUNGSGEWAEHRUNG_TYPE: {
				CodeLeistungsgewaehrungType codeLeistungsgewaehrungType = (CodeLeistungsgewaehrungType)theEObject;
				T result = caseCodeLeistungsgewaehrungType(codeLeistungsgewaehrungType);
				if (result == null) result = caseCode(codeLeistungsgewaehrungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_NACHRICHTENTYP_TYPE: {
				CodeNachrichtentypType codeNachrichtentypType = (CodeNachrichtentypType)theEObject;
				T result = caseCodeNachrichtentypType(codeNachrichtentypType);
				if (result == null) result = caseCode(codeNachrichtentypType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_NACHWEISBEZUG_TYPE: {
				CodeNachweisbezugType codeNachweisbezugType = (CodeNachweisbezugType)theEObject;
				T result = caseCodeNachweisbezugType(codeNachweisbezugType);
				if (result == null) result = caseCode(codeNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_PERSONENSORGERECHT_TYPE: {
				CodePersonensorgerechtType codePersonensorgerechtType = (CodePersonensorgerechtType)theEObject;
				T result = caseCodePersonensorgerechtType(codePersonensorgerechtType);
				if (result == null) result = caseCode(codePersonensorgerechtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_PRAEFIX_TYPE: {
				CodePraefixType codePraefixType = (CodePraefixType)theEObject;
				T result = caseCodePraefixType(codePraefixType);
				if (result == null) result = caseCode(codePraefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_SONDERSTATUS_TYPE: {
				CodeSonderstatusType codeSonderstatusType = (CodeSonderstatusType)theEObject;
				T result = caseCodeSonderstatusType(codeSonderstatusType);
				if (result == null) result = caseCode(codeSonderstatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_SONSTIGE_LEISTUNGEN_TYPE: {
				CodeSonstigeLeistungenType codeSonstigeLeistungenType = (CodeSonstigeLeistungenType)theEObject;
				T result = caseCodeSonstigeLeistungenType(codeSonstigeLeistungenType);
				if (result == null) result = caseCode(codeSonstigeLeistungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_STAATSANGEHOERIGKEIT_TYPE: {
				CodeStaatsangehoerigkeitType codeStaatsangehoerigkeitType = (CodeStaatsangehoerigkeitType)theEObject;
				T result = caseCodeStaatsangehoerigkeitType(codeStaatsangehoerigkeitType);
				if (result == null) result = caseCode(codeStaatsangehoerigkeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_STAAT_TYPE: {
				CodeStaatType codeStaatType = (CodeStaatType)theEObject;
				T result = caseCodeStaatType(codeStaatType);
				if (result == null) result = caseCode(codeStaatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_STANDESAMTNUMMERN_TYPE: {
				CodeStandesamtnummernType codeStandesamtnummernType = (CodeStandesamtnummernType)theEObject;
				T result = caseCodeStandesamtnummernType(codeStandesamtnummernType);
				if (result == null) result = caseCode(codeStandesamtnummernType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_STATUS_DATENABRUF_TYPE: {
				CodeStatusDatenabrufType codeStatusDatenabrufType = (CodeStatusDatenabrufType)theEObject;
				T result = caseCodeStatusDatenabrufType(codeStatusDatenabrufType);
				if (result == null) result = caseCode(codeStatusDatenabrufType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_TATSACHENBEHAUPTUNG_TYPE: {
				CodeTatsachenbehauptungType codeTatsachenbehauptungType = (CodeTatsachenbehauptungType)theEObject;
				T result = caseCodeTatsachenbehauptungType(codeTatsachenbehauptungType);
				if (result == null) result = caseCode(codeTatsachenbehauptungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_VERMOEGENSART_TYPE: {
				CodeVermoegensartType codeVermoegensartType = (CodeVermoegensartType)theEObject;
				T result = caseCodeVermoegensartType(codeVermoegensartType);
				if (result == null) result = caseCode(codeVermoegensartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_VERTRAUENSNIVEAU_TYPE: {
				CodeVertrauensniveauType codeVertrauensniveauType = (CodeVertrauensniveauType)theEObject;
				T result = caseCodeVertrauensniveauType(codeVertrauensniveauType);
				if (result == null) result = caseCode(codeVertrauensniveauType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_VERTRETUNG_TYPE: {
				CodeVertretungType codeVertretungType = (CodeVertretungType)theEObject;
				T result = caseCodeVertretungType(codeVertretungType);
				if (result == null) result = caseCode(codeVertretungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_WOHNSITZ_TYPE: {
				CodeWohnsitzType codeWohnsitzType = (CodeWohnsitzType)theEObject;
				T result = caseCodeWohnsitzType(codeWohnsitzType);
				if (result == null) result = caseCode(codeWohnsitzType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.CODE_ZUSCHUESSE_TYPE: {
				CodeZuschuesseType codeZuschuesseType = (CodeZuschuesseType)theEObject;
				T result = caseCodeZuschuesseType(codeZuschuesseType);
				if (result == null) result = caseCode(codeZuschuesseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.DATENABRUF_TYPE: {
				DatenabrufType datenabrufType = (DatenabrufType)theEObject;
				T result = caseDatenabrufType(datenabrufType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE: {
				DatenschutzerklaerungenType datenschutzerklaerungenType = (DatenschutzerklaerungenType)theEObject;
				T result = caseDatenschutzerklaerungenType(datenschutzerklaerungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE: {
				EntgeltdatenArbeitgeberDsrvType entgeltdatenArbeitgeberDsrvType = (EntgeltdatenArbeitgeberDsrvType)theEObject;
				T result = caseEntgeltdatenArbeitgeberDsrvType(entgeltdatenArbeitgeberDsrvType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE: {
				EntgeltdatenDsrvNachweisbezugType entgeltdatenDsrvNachweisbezugType = (EntgeltdatenDsrvNachweisbezugType)theEObject;
				T result = caseEntgeltdatenDsrvNachweisbezugType(entgeltdatenDsrvNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.ERREICHBARKEIT_TYPE: {
				ErreichbarkeitType erreichbarkeitType = (ErreichbarkeitType)theEObject;
				T result = caseErreichbarkeitType(erreichbarkeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE: {
				FamiliennameUnstrukturiertType familiennameUnstrukturiertType = (FamiliennameUnstrukturiertType)theEObject;
				T result = caseFamiliennameUnstrukturiertType(familiennameUnstrukturiertType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.FAMILIENSTAND_NACHWEISBEZUG_TYPE: {
				FamilienstandNachweisbezugType familienstandNachweisbezugType = (FamilienstandNachweisbezugType)theEObject;
				T result = caseFamilienstandNachweisbezugType(familienstandNachweisbezugType);
				if (result == null) result = caseFamilienstandType(familienstandNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.FAMILIENSTAND_TYPE: {
				FamilienstandType familienstandType = (FamilienstandType)theEObject;
				T result = caseFamilienstandType(familienstandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.FELDGRUPPE_TYPE: {
				FeldgruppeType feldgruppeType = (FeldgruppeType)theEObject;
				T result = caseFeldgruppeType(feldgruppeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.FELD_TYPE: {
				FeldType feldType = (FeldType)theEObject;
				T result = caseFeldType(feldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.GEBURT_GEBURTSORT_OPTIONAL_TYPE: {
				GeburtGeburtsortOptionalType geburtGeburtsortOptionalType = (GeburtGeburtsortOptionalType)theEObject;
				T result = caseGeburtGeburtsortOptionalType(geburtGeburtsortOptionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE: {
				GeburtNachweisbezugType geburtNachweisbezugType = (GeburtNachweisbezugType)theEObject;
				T result = caseGeburtNachweisbezugType(geburtNachweisbezugType);
				if (result == null) result = caseGeburtType(geburtNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.GEBURT_OPTIONAL_TYPE: {
				GeburtOptionalType geburtOptionalType = (GeburtOptionalType)theEObject;
				T result = caseGeburtOptionalType(geburtOptionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.GEBURT_TYPE: {
				GeburtType geburtType = (GeburtType)theEObject;
				T result = caseGeburtType(geburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE: {
				HausnummernBisType hausnummernBisType = (HausnummernBisType)theEObject;
				T result = caseHausnummernBisType(hausnummernBisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.IDENTIFIKATION_NACHRICHT_TYPE: {
				IdentifikationNachrichtType identifikationNachrichtType = (IdentifikationNachrichtType)theEObject;
				T result = caseIdentifikationNachrichtType(identifikationNachrichtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE: {
				KommunikationspartnerErreichbarType kommunikationspartnerErreichbarType = (KommunikationspartnerErreichbarType)theEObject;
				T result = caseKommunikationspartnerErreichbarType(kommunikationspartnerErreichbarType);
				if (result == null) result = caseKommunikationspartnerType(kommunikationspartnerErreichbarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE: {
				KommunikationspartnerType kommunikationspartnerType = (KommunikationspartnerType)theEObject;
				T result = caseKommunikationspartnerType(kommunikationspartnerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.MELDEANSCHRIFT_TYPE: {
				MeldeanschriftType meldeanschriftType = (MeldeanschriftType)theEObject;
				T result = caseMeldeanschriftType(meldeanschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NACHRICHTENKOPF_TYPE: {
				NachrichtenkopfType nachrichtenkopfType = (NachrichtenkopfType)theEObject;
				T result = caseNachrichtenkopfType(nachrichtenkopfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NACHRICHT_TYPE: {
				NachrichtType nachrichtType = (NachrichtType)theEObject;
				T result = caseNachrichtType(nachrichtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NACHWEISBEZUG_TYPE: {
				NachweisbezugType nachweisbezugType = (NachweisbezugType)theEObject;
				T result = caseNachweisbezugType(nachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE: {
				NachweisdokumentType nachweisdokumentType = (NachweisdokumentType)theEObject;
				T result = caseNachweisdokumentType(nachweisdokumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE: {
				NameNatuerlichePersonNachweisbezugType nameNatuerlichePersonNachweisbezugType = (NameNatuerlichePersonNachweisbezugType)theEObject;
				T result = caseNameNatuerlichePersonNachweisbezugType(nameNatuerlichePersonNachweisbezugType);
				if (result == null) result = caseNameNatuerlichePersonType(nameNatuerlichePersonNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE: {
				NameNatuerlichePersonOhneGeburtsnameType nameNatuerlichePersonOhneGeburtsnameType = (NameNatuerlichePersonOhneGeburtsnameType)theEObject;
				T result = caseNameNatuerlichePersonOhneGeburtsnameType(nameNatuerlichePersonOhneGeburtsnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_TYPE: {
				NameNatuerlichePersonType nameNatuerlichePersonType = (NameNatuerlichePersonType)theEObject;
				T result = caseNameNatuerlichePersonType(nameNatuerlichePersonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE: {
				NameNatuerlichePersonVornameVerpflichtendType nameNatuerlichePersonVornameVerpflichtendType = (NameNatuerlichePersonVornameVerpflichtendType)theEObject;
				T result = caseNameNatuerlichePersonVornameVerpflichtendType(nameNatuerlichePersonVornameVerpflichtendType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.NUTZERKONTO_TYPE: {
				NutzerkontoType nutzerkontoType = (NutzerkontoType)theEObject;
				T result = caseNutzerkontoType(nutzerkontoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE: {
				PostalischeInlandsanschriftBasisType postalischeInlandsanschriftBasisType = (PostalischeInlandsanschriftBasisType)theEObject;
				T result = casePostalischeInlandsanschriftBasisType(postalischeInlandsanschriftBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE: {
				PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType = (PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)theEObject;
				T result = casePostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType(postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType);
				if (result == null) result = casePostalischeInlandsanschriftGebaeudeanschriftType(postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType);
				if (result == null) result = casePostalischeInlandsanschriftBasisType(postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE: {
				PostalischeInlandsanschriftGebaeudeanschriftType postalischeInlandsanschriftGebaeudeanschriftType = (PostalischeInlandsanschriftGebaeudeanschriftType)theEObject;
				T result = casePostalischeInlandsanschriftGebaeudeanschriftType(postalischeInlandsanschriftGebaeudeanschriftType);
				if (result == null) result = casePostalischeInlandsanschriftBasisType(postalischeInlandsanschriftGebaeudeanschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE: {
				PostalischeInlandsanschriftPostfachanschriftType postalischeInlandsanschriftPostfachanschriftType = (PostalischeInlandsanschriftPostfachanschriftType)theEObject;
				T result = casePostalischeInlandsanschriftPostfachanschriftType(postalischeInlandsanschriftPostfachanschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE: {
				PostalischeInlandsanschriftType postalischeInlandsanschriftType = (PostalischeInlandsanschriftType)theEObject;
				T result = casePostalischeInlandsanschriftType(postalischeInlandsanschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.POSTKORB_HANDLE_TYPE: {
				PostkorbHandleType postkorbHandleType = (PostkorbHandleType)theEObject;
				T result = casePostkorbHandleType(postkorbHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE: {
				StaatsangehoerigkeitenNachweisbezugType staatsangehoerigkeitenNachweisbezugType = (StaatsangehoerigkeitenNachweisbezugType)theEObject;
				T result = caseStaatsangehoerigkeitenNachweisbezugType(staatsangehoerigkeitenNachweisbezugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.STATUS_DATENABRUF_TYPE: {
				StatusDatenabrufType statusDatenabrufType = (StatusDatenabrufType)theEObject;
				T result = caseStatusDatenabrufType(statusDatenabrufType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.TATSACHE_MIT_FREITEXT_TYPE: {
				TatsacheMitFreitextType tatsacheMitFreitextType = (TatsacheMitFreitextType)theEObject;
				T result = caseTatsacheMitFreitextType(tatsacheMitFreitextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE: {
				TatsacheMitNachweisType tatsacheMitNachweisType = (TatsacheMitNachweisType)theEObject;
				T result = caseTatsacheMitNachweisType(tatsacheMitNachweisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.TATSACHE_MIT_ZEITRAUM_TYPE: {
				TatsacheMitZeitraumType tatsacheMitZeitraumType = (TatsacheMitZeitraumType)theEObject;
				T result = caseTatsacheMitZeitraumType(tatsacheMitZeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE: {
				TeilbekanntesDatumType teilbekanntesDatumType = (TeilbekanntesDatumType)theEObject;
				T result = caseTeilbekanntesDatumType(teilbekanntesDatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.TERMINWUNSCH_TYPE: {
				TerminwunschType terminwunschType = (TerminwunschType)theEObject;
				T result = caseTerminwunschType(terminwunschType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.ZEITRAUM_TYPE: {
				ZeitraumType zeitraumType = (ZeitraumType)theEObject;
				T result = caseZeitraumType(zeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE: {
				ZusatzparametergruppeType zusatzparametergruppeType = (ZusatzparametergruppeType)theEObject;
				T result = caseZusatzparametergruppeType(zusatzparametergruppeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE: {
				ZustimmungAbrufOderWeitergabeType zustimmungAbrufOderWeitergabeType = (ZustimmungAbrufOderWeitergabeType)theEObject;
				T result = caseZustimmungAbrufOderWeitergabeType(zustimmungAbrufOderWeitergabeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeiner Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeiner Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeinerNameType(AllgemeinerNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragsnachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragsnachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragsnachrichtType(AntragsnachrichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufenthaltstitel Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufenthaltstitel Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufenthaltstitelNachweisbezugType(AufenthaltstitelNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auslandsanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auslandsanschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuslandsanschriftType(AuslandsanschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bankverbindung IBAN Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bankverbindung IBAN Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankverbindungIBANOptionalType(BankverbindungIBANOptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bankverbindung Inhaber Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bankverbindung Inhaber Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankverbindungInhaberOptionalType(BankverbindungInhaberOptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bankverbindung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bankverbindung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankverbindungType(BankverbindungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behoerdenkennung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behoerdenkennung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehoerdenkennungType(BehoerdenkennungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Anrede Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Anrede Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAnredeType(CodeAnredeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Art Abruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Art Abruf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeArtAbrufType(CodeArtAbrufType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Aufenthaltsstatus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Aufenthaltsstatus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAufenthaltsstatusType(CodeAufenthaltsstatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Bundesland Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Bundesland Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBundeslandType(CodeBundeslandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Eigenschaft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Eigenschaft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeEigenschaftType(CodeEigenschaftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Einkommensarten Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Einkommensarten Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeEinkommensartenType(CodeEinkommensartenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Erreichbarkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Erreichbarkeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeErreichbarkeitType(CodeErreichbarkeitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Familienstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Familienstand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeFamilienstandType(CodeFamilienstandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeGemeindeVZAmtlicherGemeindeschluesselType(CodeGemeindeVZAmtlicherGemeindeschluesselType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Gemeinde VZ Regionalschluessel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Gemeinde VZ Regionalschluessel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeGemeindeVZRegionalschluesselType(CodeGemeindeVZRegionalschluesselType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Geschlecht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Geschlecht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeGeschlechtType(CodeGeschlechtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Kindschaftsbeziehung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Kindschaftsbeziehung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeKindschaftsbeziehungType(CodeKindschaftsbeziehungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Kind Wohnhaft Bei Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Kind Wohnhaft Bei Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeKindWohnhaftBeiType(CodeKindWohnhaftBeiType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Leistungserhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Leistungserhalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLeistungserhaltType(CodeLeistungserhaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Leistungsgewaehrung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Leistungsgewaehrung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLeistungsgewaehrungType(CodeLeistungsgewaehrungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Nachrichtentyp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Nachrichtentyp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeNachrichtentypType(CodeNachrichtentypType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeNachweisbezugType(CodeNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Personensorgerecht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Personensorgerecht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodePersonensorgerechtType(CodePersonensorgerechtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Praefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Praefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodePraefixType(CodePraefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Sonderstatus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Sonderstatus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSonderstatusType(CodeSonderstatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Sonstige Leistungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Sonstige Leistungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSonstigeLeistungenType(CodeSonstigeLeistungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Staatsangehoerigkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Staatsangehoerigkeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeStaatsangehoerigkeitType(CodeStaatsangehoerigkeitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Staat Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Staat Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeStaatType(CodeStaatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Standesamtnummern Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Standesamtnummern Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeStandesamtnummernType(CodeStandesamtnummernType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Status Datenabruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Status Datenabruf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeStatusDatenabrufType(CodeStatusDatenabrufType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Tatsachenbehauptung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Tatsachenbehauptung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTatsachenbehauptungType(CodeTatsachenbehauptungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Vermoegensart Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Vermoegensart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeVermoegensartType(CodeVermoegensartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Vertrauensniveau Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Vertrauensniveau Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeVertrauensniveauType(CodeVertrauensniveauType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Vertretung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Vertretung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeVertretungType(CodeVertretungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Wohnsitz Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Wohnsitz Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeWohnsitzType(CodeWohnsitzType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Zuschuesse Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Zuschuesse Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeZuschuesseType(CodeZuschuesseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenabruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenabruf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenabrufType(DatenabrufType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenschutzerklaerungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenschutzerklaerungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenschutzerklaerungenType(DatenschutzerklaerungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entgeltdaten Arbeitgeber Dsrv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entgeltdaten Arbeitgeber Dsrv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntgeltdatenArbeitgeberDsrvType(EntgeltdatenArbeitgeberDsrvType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entgeltdaten Dsrv Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entgeltdaten Dsrv Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntgeltdatenDsrvNachweisbezugType(EntgeltdatenDsrvNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erreichbarkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erreichbarkeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErreichbarkeitType(ErreichbarkeitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familienname Unstrukturiert Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familienname Unstrukturiert Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamiliennameUnstrukturiertType(FamiliennameUnstrukturiertType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familienstand Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familienstand Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilienstandNachweisbezugType(FamilienstandNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familienstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familienstand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilienstandType(FamilienstandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feldgruppe Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feldgruppe Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeldgruppeType(FeldgruppeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeldType(FeldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Geburtsort Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Geburtsort Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtGeburtsortOptionalType(GeburtGeburtsortOptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtNachweisbezugType(GeburtNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtOptionalType(GeburtOptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtType(GeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hausnummern Bis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hausnummern Bis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHausnummernBisType(HausnummernBisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifikation Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifikation Nachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifikationNachrichtType(IdentifikationNachrichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kommunikationspartner Erreichbar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kommunikationspartner Erreichbar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKommunikationspartnerErreichbarType(KommunikationspartnerErreichbarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kommunikationspartner Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kommunikationspartner Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKommunikationspartnerType(KommunikationspartnerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meldeanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meldeanschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeldeanschriftType(MeldeanschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachrichtenkopf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachrichtenkopf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtenkopfType(NachrichtenkopfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtType(NachrichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweisbezugType(NachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweisdokument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweisdokument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweisdokumentType(NachweisdokumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Natuerliche Person Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Natuerliche Person Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameNatuerlichePersonNachweisbezugType(NameNatuerlichePersonNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Natuerliche Person Ohne Geburtsname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Natuerliche Person Ohne Geburtsname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameNatuerlichePersonOhneGeburtsnameType(NameNatuerlichePersonOhneGeburtsnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Natuerliche Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Natuerliche Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameNatuerlichePersonType(NameNatuerlichePersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Natuerliche Person Vorname Verpflichtend Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Natuerliche Person Vorname Verpflichtend Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameNatuerlichePersonVornameVerpflichtendType(NameNatuerlichePersonVornameVerpflichtendType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutzerkonto Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutzerkonto Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutzerkontoType(NutzerkontoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalischeInlandsanschriftBasisType(PostalischeInlandsanschriftBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalischeInlandsanschriftGebaeudeanschriftType(PostalischeInlandsanschriftGebaeudeanschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Postfachanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Postfachanschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalischeInlandsanschriftPostfachanschriftType(PostalischeInlandsanschriftPostfachanschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postalische Inlandsanschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalischeInlandsanschriftType(PostalischeInlandsanschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postkorb Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postkorb Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostkorbHandleType(PostkorbHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staatsangehoerigkeiten Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staatsangehoerigkeiten Nachweisbezug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaatsangehoerigkeitenNachweisbezugType(StaatsangehoerigkeitenNachweisbezugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Datenabruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Datenabruf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusDatenabrufType(StatusDatenabrufType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tatsache Mit Freitext Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tatsache Mit Freitext Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTatsacheMitFreitextType(TatsacheMitFreitextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tatsache Mit Nachweis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tatsache Mit Nachweis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTatsacheMitNachweisType(TatsacheMitNachweisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tatsache Mit Zeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tatsache Mit Zeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTatsacheMitZeitraumType(TatsacheMitZeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teilbekanntes Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teilbekanntes Datum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeilbekanntesDatumType(TeilbekanntesDatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminwunsch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminwunsch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminwunschType(TerminwunschType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeitraumType(ZeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zusatzparametergruppe Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zusatzparametergruppe Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZusatzparametergruppeType(ZusatzparametergruppeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zustimmung Abruf Oder Weitergabe Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zustimmung Abruf Oder Weitergabe Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZustimmungAbrufOderWeitergabeType(ZustimmungAbrufOderWeitergabeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BaukastenSwitch
