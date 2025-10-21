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

import de.xoev.kosit.datentyp._202204.din91379.util.DIN913792204Validator;

import de.xoev.xfamilie.baukasten._1.baukasten.*;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage
 * @generated
 */
public class BaukastenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BaukastenValidator INSTANCE = new BaukastenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.xoev.xfamilie.baukasten._1.baukasten";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DIN913792204Validator din913792204Validator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaukastenValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
		din913792204Validator = DIN913792204Validator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BaukastenPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE:
				return validateAllgemeinerNameType((AllgemeinerNameType)value, diagnostics, context);
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE:
				return validateAntragsnachrichtType((AntragsnachrichtType)value, diagnostics, context);
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE:
				return validateAufenthaltstitelNachweisbezugType((AufenthaltstitelNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE:
				return validateAuslandsanschriftType((AuslandsanschriftType)value, diagnostics, context);
			case BaukastenPackage.BANKVERBINDUNG_IBAN_OPTIONAL_TYPE:
				return validateBankverbindungIBANOptionalType((BankverbindungIBANOptionalType)value, diagnostics, context);
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE:
				return validateBankverbindungInhaberOptionalType((BankverbindungInhaberOptionalType)value, diagnostics, context);
			case BaukastenPackage.BANKVERBINDUNG_TYPE:
				return validateBankverbindungType((BankverbindungType)value, diagnostics, context);
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE:
				return validateBehoerdenkennungType((BehoerdenkennungType)value, diagnostics, context);
			case BaukastenPackage.CODE_ANREDE_TYPE:
				return validateCodeAnredeType((CodeAnredeType)value, diagnostics, context);
			case BaukastenPackage.CODE_ART_ABRUF_TYPE:
				return validateCodeArtAbrufType((CodeArtAbrufType)value, diagnostics, context);
			case BaukastenPackage.CODE_AUFENTHALTSSTATUS_TYPE:
				return validateCodeAufenthaltsstatusType((CodeAufenthaltsstatusType)value, diagnostics, context);
			case BaukastenPackage.CODE_BUNDESLAND_TYPE:
				return validateCodeBundeslandType((CodeBundeslandType)value, diagnostics, context);
			case BaukastenPackage.CODE_EIGENSCHAFT_TYPE:
				return validateCodeEigenschaftType((CodeEigenschaftType)value, diagnostics, context);
			case BaukastenPackage.CODE_EINKOMMENSARTEN_TYPE:
				return validateCodeEinkommensartenType((CodeEinkommensartenType)value, diagnostics, context);
			case BaukastenPackage.CODE_ERREICHBARKEIT_TYPE:
				return validateCodeErreichbarkeitType((CodeErreichbarkeitType)value, diagnostics, context);
			case BaukastenPackage.CODE_FAMILIENSTAND_TYPE:
				return validateCodeFamilienstandType((CodeFamilienstandType)value, diagnostics, context);
			case BaukastenPackage.CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE:
				return validateCodeGemeindeVZAmtlicherGemeindeschluesselType((CodeGemeindeVZAmtlicherGemeindeschluesselType)value, diagnostics, context);
			case BaukastenPackage.CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE:
				return validateCodeGemeindeVZRegionalschluesselType((CodeGemeindeVZRegionalschluesselType)value, diagnostics, context);
			case BaukastenPackage.CODE_GESCHLECHT_TYPE:
				return validateCodeGeschlechtType((CodeGeschlechtType)value, diagnostics, context);
			case BaukastenPackage.CODE_KINDSCHAFTSBEZIEHUNG_TYPE:
				return validateCodeKindschaftsbeziehungType((CodeKindschaftsbeziehungType)value, diagnostics, context);
			case BaukastenPackage.CODE_KIND_WOHNHAFT_BEI_TYPE:
				return validateCodeKindWohnhaftBeiType((CodeKindWohnhaftBeiType)value, diagnostics, context);
			case BaukastenPackage.CODE_LEISTUNGSERHALT_TYPE:
				return validateCodeLeistungserhaltType((CodeLeistungserhaltType)value, diagnostics, context);
			case BaukastenPackage.CODE_LEISTUNGSGEWAEHRUNG_TYPE:
				return validateCodeLeistungsgewaehrungType((CodeLeistungsgewaehrungType)value, diagnostics, context);
			case BaukastenPackage.CODE_NACHRICHTENTYP_TYPE:
				return validateCodeNachrichtentypType((CodeNachrichtentypType)value, diagnostics, context);
			case BaukastenPackage.CODE_NACHWEISBEZUG_TYPE:
				return validateCodeNachweisbezugType((CodeNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.CODE_PERSONENSORGERECHT_TYPE:
				return validateCodePersonensorgerechtType((CodePersonensorgerechtType)value, diagnostics, context);
			case BaukastenPackage.CODE_PRAEFIX_TYPE:
				return validateCodePraefixType((CodePraefixType)value, diagnostics, context);
			case BaukastenPackage.CODE_SONDERSTATUS_TYPE:
				return validateCodeSonderstatusType((CodeSonderstatusType)value, diagnostics, context);
			case BaukastenPackage.CODE_SONSTIGE_LEISTUNGEN_TYPE:
				return validateCodeSonstigeLeistungenType((CodeSonstigeLeistungenType)value, diagnostics, context);
			case BaukastenPackage.CODE_STAATSANGEHOERIGKEIT_TYPE:
				return validateCodeStaatsangehoerigkeitType((CodeStaatsangehoerigkeitType)value, diagnostics, context);
			case BaukastenPackage.CODE_STAAT_TYPE:
				return validateCodeStaatType((CodeStaatType)value, diagnostics, context);
			case BaukastenPackage.CODE_STANDESAMTNUMMERN_TYPE:
				return validateCodeStandesamtnummernType((CodeStandesamtnummernType)value, diagnostics, context);
			case BaukastenPackage.CODE_STATUS_DATENABRUF_TYPE:
				return validateCodeStatusDatenabrufType((CodeStatusDatenabrufType)value, diagnostics, context);
			case BaukastenPackage.CODE_TATSACHENBEHAUPTUNG_TYPE:
				return validateCodeTatsachenbehauptungType((CodeTatsachenbehauptungType)value, diagnostics, context);
			case BaukastenPackage.CODE_VERMOEGENSART_TYPE:
				return validateCodeVermoegensartType((CodeVermoegensartType)value, diagnostics, context);
			case BaukastenPackage.CODE_VERTRAUENSNIVEAU_TYPE:
				return validateCodeVertrauensniveauType((CodeVertrauensniveauType)value, diagnostics, context);
			case BaukastenPackage.CODE_VERTRETUNG_TYPE:
				return validateCodeVertretungType((CodeVertretungType)value, diagnostics, context);
			case BaukastenPackage.CODE_WOHNSITZ_TYPE:
				return validateCodeWohnsitzType((CodeWohnsitzType)value, diagnostics, context);
			case BaukastenPackage.CODE_ZUSCHUESSE_TYPE:
				return validateCodeZuschuesseType((CodeZuschuesseType)value, diagnostics, context);
			case BaukastenPackage.DATENABRUF_TYPE:
				return validateDatenabrufType((DatenabrufType)value, diagnostics, context);
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE:
				return validateDatenschutzerklaerungenType((DatenschutzerklaerungenType)value, diagnostics, context);
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE:
				return validateEntgeltdatenArbeitgeberDsrvType((EntgeltdatenArbeitgeberDsrvType)value, diagnostics, context);
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE:
				return validateEntgeltdatenDsrvNachweisbezugType((EntgeltdatenDsrvNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.ERREICHBARKEIT_TYPE:
				return validateErreichbarkeitType((ErreichbarkeitType)value, diagnostics, context);
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE:
				return validateFamiliennameUnstrukturiertType((FamiliennameUnstrukturiertType)value, diagnostics, context);
			case BaukastenPackage.FAMILIENSTAND_NACHWEISBEZUG_TYPE:
				return validateFamilienstandNachweisbezugType((FamilienstandNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.FAMILIENSTAND_TYPE:
				return validateFamilienstandType((FamilienstandType)value, diagnostics, context);
			case BaukastenPackage.FELDGRUPPE_TYPE:
				return validateFeldgruppeType((FeldgruppeType)value, diagnostics, context);
			case BaukastenPackage.FELD_TYPE:
				return validateFeldType((FeldType)value, diagnostics, context);
			case BaukastenPackage.GEBURT_GEBURTSORT_OPTIONAL_TYPE:
				return validateGeburtGeburtsortOptionalType((GeburtGeburtsortOptionalType)value, diagnostics, context);
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE:
				return validateGeburtNachweisbezugType((GeburtNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.GEBURT_OPTIONAL_TYPE:
				return validateGeburtOptionalType((GeburtOptionalType)value, diagnostics, context);
			case BaukastenPackage.GEBURT_TYPE:
				return validateGeburtType((GeburtType)value, diagnostics, context);
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE:
				return validateHausnummernBisType((HausnummernBisType)value, diagnostics, context);
			case BaukastenPackage.IDENTIFIKATION_NACHRICHT_TYPE:
				return validateIdentifikationNachrichtType((IdentifikationNachrichtType)value, diagnostics, context);
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE:
				return validateKommunikationspartnerErreichbarType((KommunikationspartnerErreichbarType)value, diagnostics, context);
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE:
				return validateKommunikationspartnerType((KommunikationspartnerType)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_TYPE:
				return validateMeldeanschriftType((MeldeanschriftType)value, diagnostics, context);
			case BaukastenPackage.NACHRICHTENKOPF_TYPE:
				return validateNachrichtenkopfType((NachrichtenkopfType)value, diagnostics, context);
			case BaukastenPackage.NACHRICHT_TYPE:
				return validateNachrichtType((NachrichtType)value, diagnostics, context);
			case BaukastenPackage.NACHWEISBEZUG_TYPE:
				return validateNachweisbezugType((NachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE:
				return validateNachweisdokumentType((NachweisdokumentType)value, diagnostics, context);
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE:
				return validateNameNatuerlichePersonNachweisbezugType((NameNatuerlichePersonNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE:
				return validateNameNatuerlichePersonOhneGeburtsnameType((NameNatuerlichePersonOhneGeburtsnameType)value, diagnostics, context);
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_TYPE:
				return validateNameNatuerlichePersonType((NameNatuerlichePersonType)value, diagnostics, context);
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE:
				return validateNameNatuerlichePersonVornameVerpflichtendType((NameNatuerlichePersonVornameVerpflichtendType)value, diagnostics, context);
			case BaukastenPackage.NUTZERKONTO_TYPE:
				return validateNutzerkontoType((NutzerkontoType)value, diagnostics, context);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE:
				return validatePostalischeInlandsanschriftBasisType((PostalischeInlandsanschriftBasisType)value, diagnostics, context);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE:
				return validatePostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType((PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE:
				return validatePostalischeInlandsanschriftGebaeudeanschriftType((PostalischeInlandsanschriftGebaeudeanschriftType)value, diagnostics, context);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE:
				return validatePostalischeInlandsanschriftPostfachanschriftType((PostalischeInlandsanschriftPostfachanschriftType)value, diagnostics, context);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE:
				return validatePostalischeInlandsanschriftType((PostalischeInlandsanschriftType)value, diagnostics, context);
			case BaukastenPackage.POSTKORB_HANDLE_TYPE:
				return validatePostkorbHandleType((PostkorbHandleType)value, diagnostics, context);
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE:
				return validateStaatsangehoerigkeitenNachweisbezugType((StaatsangehoerigkeitenNachweisbezugType)value, diagnostics, context);
			case BaukastenPackage.STATUS_DATENABRUF_TYPE:
				return validateStatusDatenabrufType((StatusDatenabrufType)value, diagnostics, context);
			case BaukastenPackage.TATSACHE_MIT_FREITEXT_TYPE:
				return validateTatsacheMitFreitextType((TatsacheMitFreitextType)value, diagnostics, context);
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE:
				return validateTatsacheMitNachweisType((TatsacheMitNachweisType)value, diagnostics, context);
			case BaukastenPackage.TATSACHE_MIT_ZEITRAUM_TYPE:
				return validateTatsacheMitZeitraumType((TatsacheMitZeitraumType)value, diagnostics, context);
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE:
				return validateTeilbekanntesDatumType((TeilbekanntesDatumType)value, diagnostics, context);
			case BaukastenPackage.TERMINWUNSCH_TYPE:
				return validateTerminwunschType((TerminwunschType)value, diagnostics, context);
			case BaukastenPackage.ZEITRAUM_TYPE:
				return validateZeitraumType((ZeitraumType)value, diagnostics, context);
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE:
				return validateZusatzparametergruppeType((ZusatzparametergruppeType)value, diagnostics, context);
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE:
				return validateZustimmungAbrufOderWeitergabeType((ZustimmungAbrufOderWeitergabeType)value, diagnostics, context);
			case BaukastenPackage.ANREDE:
				return validateAnrede((Anrede)value, diagnostics, context);
			case BaukastenPackage.ARTABRUF:
				return validateArtabruf((Artabruf)value, diagnostics, context);
			case BaukastenPackage.ARTNACHWEIS:
				return validateArtnachweis((Artnachweis)value, diagnostics, context);
			case BaukastenPackage.AUFENTHALTSSTATUS:
				return validateAufenthaltsstatus((Aufenthaltsstatus)value, diagnostics, context);
			case BaukastenPackage.EIGENSCHAFT:
				return validateEigenschaft((Eigenschaft)value, diagnostics, context);
			case BaukastenPackage.EINKOMMENSARTEN:
				return validateEinkommensarten((Einkommensarten)value, diagnostics, context);
			case BaukastenPackage.FAMILIENSTAND:
				return validateFamilienstand((Familienstand)value, diagnostics, context);
			case BaukastenPackage.GESCHLECHT:
				return validateGeschlecht((Geschlecht)value, diagnostics, context);
			case BaukastenPackage.KINDSCHAFTSBEZIEHUNG:
				return validateKindschaftsbeziehung((Kindschaftsbeziehung)value, diagnostics, context);
			case BaukastenPackage.KINDWOHNHAFTBEI:
				return validateKindwohnhaftbei((Kindwohnhaftbei)value, diagnostics, context);
			case BaukastenPackage.LEISTUNGSERHALT:
				return validateLeistungserhalt((Leistungserhalt)value, diagnostics, context);
			case BaukastenPackage.LEISTUNGSGEWAEHRUNG:
				return validateLeistungsgewaehrung((Leistungsgewaehrung)value, diagnostics, context);
			case BaukastenPackage.NACHRICHTENTYP:
				return validateNachrichtentyp((Nachrichtentyp)value, diagnostics, context);
			case BaukastenPackage.NACHWEISBEZUG:
				return validateNachweisbezug((Nachweisbezug)value, diagnostics, context);
			case BaukastenPackage.PERSONENSORGERECHT:
				return validatePersonensorgerecht((Personensorgerecht)value, diagnostics, context);
			case BaukastenPackage.SONDERSTATUS:
				return validateSonderstatus((Sonderstatus)value, diagnostics, context);
			case BaukastenPackage.SONSTIGELEISTUNGEN:
				return validateSonstigeleistungen((Sonstigeleistungen)value, diagnostics, context);
			case BaukastenPackage.STATUSDATENABRUF:
				return validateStatusdatenabruf((Statusdatenabruf)value, diagnostics, context);
			case BaukastenPackage.TATSACHENBEHAUPTUNG:
				return validateTatsachenbehauptung((Tatsachenbehauptung)value, diagnostics, context);
			case BaukastenPackage.VERTRAUENSNIVEAU:
				return validateVertrauensniveau((Vertrauensniveau)value, diagnostics, context);
			case BaukastenPackage.VERTRETUNG:
				return validateVertretung((Vertretung)value, diagnostics, context);
			case BaukastenPackage.WOHNSITZ:
				return validateWohnsitz((Wohnsitz)value, diagnostics, context);
			case BaukastenPackage.ZUSCHUESSE:
				return validateZuschuesse((Zuschuesse)value, diagnostics, context);
			case BaukastenPackage.ANREDE_OBJECT:
				return validateAnredeObject((Anrede)value, diagnostics, context);
			case BaukastenPackage.ARTABRUF_OBJECT:
				return validateArtabrufObject((Artabruf)value, diagnostics, context);
			case BaukastenPackage.ARTNACHWEIS_OBJECT:
				return validateArtnachweisObject((Artnachweis)value, diagnostics, context);
			case BaukastenPackage.AUFENTHALTSSTATUS_OBJECT:
				return validateAufenthaltsstatusObject((Aufenthaltsstatus)value, diagnostics, context);
			case BaukastenPackage.EIGENSCHAFT_OBJECT:
				return validateEigenschaftObject((Eigenschaft)value, diagnostics, context);
			case BaukastenPackage.EINKOMMENSARTEN_OBJECT:
				return validateEinkommensartenObject((Einkommensarten)value, diagnostics, context);
			case BaukastenPackage.FAMILIENSTAND_OBJECT:
				return validateFamilienstandObject((Familienstand)value, diagnostics, context);
			case BaukastenPackage.GESCHLECHT_OBJECT:
				return validateGeschlechtObject((Geschlecht)value, diagnostics, context);
			case BaukastenPackage.JAHR_MONAT_TYPE:
				return validateJahrMonatType((XMLGregorianCalendar)value, diagnostics, context);
			case BaukastenPackage.JAHR_TYPE:
				return validateJahrType((XMLGregorianCalendar)value, diagnostics, context);
			case BaukastenPackage.KINDSCHAFTSBEZIEHUNG_OBJECT:
				return validateKindschaftsbeziehungObject((Kindschaftsbeziehung)value, diagnostics, context);
			case BaukastenPackage.KINDWOHNHAFTBEI_OBJECT:
				return validateKindwohnhaftbeiObject((Kindwohnhaftbei)value, diagnostics, context);
			case BaukastenPackage.KRANKENVERSICHERTENNUMMER_TYPE:
				return validateKrankenversichertennummerType((String)value, diagnostics, context);
			case BaukastenPackage.LEISTUNGSERHALT_OBJECT:
				return validateLeistungserhaltObject((Leistungserhalt)value, diagnostics, context);
			case BaukastenPackage.LEISTUNGSGEWAEHRUNG_OBJECT:
				return validateLeistungsgewaehrungObject((Leistungsgewaehrung)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_TYPE:
				return validateMeldeanschriftHausnummerBuchstabeZusatzzifferType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_HAUSNUMMER_TYPE:
				return validateMeldeanschriftHausnummerType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_POSTLEITZAHL_TYPE:
				return validateMeldeanschriftPostleitzahlType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_STOCKWERKSWOHNUNGSNUMMER_TYPE:
				return validateMeldeanschriftStockwerkswohnungsnummerType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_STRASSE_TYPE:
				return validateMeldeanschriftStrasseType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_TEILNUMMER_DER_HAUSNUMMER_TYPE:
				return validateMeldeanschriftTeilnummerDerHausnummerType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNORT_FRUEHERER_GEMEINDENAME_TYPE:
				return validateMeldeanschriftWohnortFruehererGemeindenameType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNORT_TYPE:
				return validateMeldeanschriftWohnortType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNUNGSINHABER_TYPE:
				return validateMeldeanschriftWohnungsinhaberType((String)value, diagnostics, context);
			case BaukastenPackage.MELDEANSCHRIFT_ZUSATZANGABEN_TYPE:
				return validateMeldeanschriftZusatzangabenType((String)value, diagnostics, context);
			case BaukastenPackage.NACHRICHTENTYP_OBJECT:
				return validateNachrichtentypObject((Nachrichtentyp)value, diagnostics, context);
			case BaukastenPackage.NACHWEISBEZUG_OBJECT:
				return validateNachweisbezugObject((Nachweisbezug)value, diagnostics, context);
			case BaukastenPackage.PERSONENSORGERECHT_OBJECT:
				return validatePersonensorgerechtObject((Personensorgerecht)value, diagnostics, context);
			case BaukastenPackage.SONDERSTATUS_OBJECT:
				return validateSonderstatusObject((Sonderstatus)value, diagnostics, context);
			case BaukastenPackage.SONSTIGELEISTUNGEN_OBJECT:
				return validateSonstigeleistungenObject((Sonstigeleistungen)value, diagnostics, context);
			case BaukastenPackage.STATUSDATENABRUF_OBJECT:
				return validateStatusdatenabrufObject((Statusdatenabruf)value, diagnostics, context);
			case BaukastenPackage.STEUERLICHE_IDENTIFIKATIONSNUMMER_TYPE:
				return validateSteuerlicheIdentifikationsnummerType((String)value, diagnostics, context);
			case BaukastenPackage.TAGESDATUM_TYPE:
				return validateTagesdatumType((XMLGregorianCalendar)value, diagnostics, context);
			case BaukastenPackage.TATSACHENBEHAUPTUNG_OBJECT:
				return validateTatsachenbehauptungObject((Tatsachenbehauptung)value, diagnostics, context);
			case BaukastenPackage.UUID_TYPE:
				return validateUUIDType((String)value, diagnostics, context);
			case BaukastenPackage.VERTRAUENSNIVEAU_OBJECT:
				return validateVertrauensniveauObject((Vertrauensniveau)value, diagnostics, context);
			case BaukastenPackage.VERTRETUNG_OBJECT:
				return validateVertretungObject((Vertretung)value, diagnostics, context);
			case BaukastenPackage.WOHNSITZ_OBJECT:
				return validateWohnsitzObject((Wohnsitz)value, diagnostics, context);
			case BaukastenPackage.ZUSCHUESSE_OBJECT:
				return validateZuschuesseObject((Zuschuesse)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllgemeinerNameType(AllgemeinerNameType allgemeinerNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allgemeinerNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAntragsnachrichtType(AntragsnachrichtType antragsnachrichtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(antragsnachrichtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufenthaltstitelNachweisbezugType(AufenthaltstitelNachweisbezugType aufenthaltstitelNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aufenthaltstitelNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuslandsanschriftType(AuslandsanschriftType auslandsanschriftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auslandsanschriftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankverbindungIBANOptionalType(BankverbindungIBANOptionalType bankverbindungIBANOptionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bankverbindungIBANOptionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankverbindungInhaberOptionalType(BankverbindungInhaberOptionalType bankverbindungInhaberOptionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bankverbindungInhaberOptionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankverbindungType(BankverbindungType bankverbindungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bankverbindungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehoerdenkennungType(BehoerdenkennungType behoerdenkennungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behoerdenkennungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeAnredeType(CodeAnredeType codeAnredeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeAnredeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeArtAbrufType(CodeArtAbrufType codeArtAbrufType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeArtAbrufType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeAufenthaltsstatusType(CodeAufenthaltsstatusType codeAufenthaltsstatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeAufenthaltsstatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeBundeslandType(CodeBundeslandType codeBundeslandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeBundeslandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeEigenschaftType(CodeEigenschaftType codeEigenschaftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeEigenschaftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeEinkommensartenType(CodeEinkommensartenType codeEinkommensartenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeEinkommensartenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeErreichbarkeitType(CodeErreichbarkeitType codeErreichbarkeitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeErreichbarkeitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeFamilienstandType(CodeFamilienstandType codeFamilienstandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeFamilienstandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeGemeindeVZAmtlicherGemeindeschluesselType(CodeGemeindeVZAmtlicherGemeindeschluesselType codeGemeindeVZAmtlicherGemeindeschluesselType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeGemeindeVZAmtlicherGemeindeschluesselType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeGemeindeVZRegionalschluesselType(CodeGemeindeVZRegionalschluesselType codeGemeindeVZRegionalschluesselType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeGemeindeVZRegionalschluesselType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeGeschlechtType(CodeGeschlechtType codeGeschlechtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeGeschlechtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeKindschaftsbeziehungType(CodeKindschaftsbeziehungType codeKindschaftsbeziehungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeKindschaftsbeziehungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeKindWohnhaftBeiType(CodeKindWohnhaftBeiType codeKindWohnhaftBeiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeKindWohnhaftBeiType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLeistungserhaltType(CodeLeistungserhaltType codeLeistungserhaltType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeLeistungserhaltType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLeistungsgewaehrungType(CodeLeistungsgewaehrungType codeLeistungsgewaehrungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeLeistungsgewaehrungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeNachrichtentypType(CodeNachrichtentypType codeNachrichtentypType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeNachrichtentypType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeNachweisbezugType(CodeNachweisbezugType codeNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePersonensorgerechtType(CodePersonensorgerechtType codePersonensorgerechtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codePersonensorgerechtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePraefixType(CodePraefixType codePraefixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codePraefixType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSonderstatusType(CodeSonderstatusType codeSonderstatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSonderstatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSonstigeLeistungenType(CodeSonstigeLeistungenType codeSonstigeLeistungenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSonstigeLeistungenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeStaatsangehoerigkeitType(CodeStaatsangehoerigkeitType codeStaatsangehoerigkeitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeStaatsangehoerigkeitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeStaatType(CodeStaatType codeStaatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeStaatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeStandesamtnummernType(CodeStandesamtnummernType codeStandesamtnummernType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeStandesamtnummernType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeStatusDatenabrufType(CodeStatusDatenabrufType codeStatusDatenabrufType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeStatusDatenabrufType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTatsachenbehauptungType(CodeTatsachenbehauptungType codeTatsachenbehauptungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTatsachenbehauptungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeVermoegensartType(CodeVermoegensartType codeVermoegensartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeVermoegensartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeVertrauensniveauType(CodeVertrauensniveauType codeVertrauensniveauType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeVertrauensniveauType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeVertretungType(CodeVertretungType codeVertretungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeVertretungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeWohnsitzType(CodeWohnsitzType codeWohnsitzType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeWohnsitzType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeZuschuesseType(CodeZuschuesseType codeZuschuesseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeZuschuesseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenabrufType(DatenabrufType datenabrufType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenabrufType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenschutzerklaerungenType(DatenschutzerklaerungenType datenschutzerklaerungenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenschutzerklaerungenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntgeltdatenArbeitgeberDsrvType(EntgeltdatenArbeitgeberDsrvType entgeltdatenArbeitgeberDsrvType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entgeltdatenArbeitgeberDsrvType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntgeltdatenDsrvNachweisbezugType(EntgeltdatenDsrvNachweisbezugType entgeltdatenDsrvNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entgeltdatenDsrvNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErreichbarkeitType(ErreichbarkeitType erreichbarkeitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(erreichbarkeitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamiliennameUnstrukturiertType(FamiliennameUnstrukturiertType familiennameUnstrukturiertType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familiennameUnstrukturiertType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilienstandNachweisbezugType(FamilienstandNachweisbezugType familienstandNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familienstandNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilienstandType(FamilienstandType familienstandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familienstandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeldgruppeType(FeldgruppeType feldgruppeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feldgruppeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeldType(FeldType feldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeburtGeburtsortOptionalType(GeburtGeburtsortOptionalType geburtGeburtsortOptionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geburtGeburtsortOptionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeburtNachweisbezugType(GeburtNachweisbezugType geburtNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geburtNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeburtOptionalType(GeburtOptionalType geburtOptionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geburtOptionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeburtType(GeburtType geburtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geburtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHausnummernBisType(HausnummernBisType hausnummernBisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hausnummernBisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifikationNachrichtType(IdentifikationNachrichtType identifikationNachrichtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifikationNachrichtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKommunikationspartnerErreichbarType(KommunikationspartnerErreichbarType kommunikationspartnerErreichbarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kommunikationspartnerErreichbarType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKommunikationspartnerType(KommunikationspartnerType kommunikationspartnerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kommunikationspartnerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftType(MeldeanschriftType meldeanschriftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meldeanschriftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachrichtenkopfType(NachrichtenkopfType nachrichtenkopfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nachrichtenkopfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachrichtType(NachrichtType nachrichtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nachrichtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachweisbezugType(NachweisbezugType nachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachweisdokumentType(NachweisdokumentType nachweisdokumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nachweisdokumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameNatuerlichePersonNachweisbezugType(NameNatuerlichePersonNachweisbezugType nameNatuerlichePersonNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameNatuerlichePersonNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameNatuerlichePersonOhneGeburtsnameType(NameNatuerlichePersonOhneGeburtsnameType nameNatuerlichePersonOhneGeburtsnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameNatuerlichePersonOhneGeburtsnameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameNatuerlichePersonType(NameNatuerlichePersonType nameNatuerlichePersonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameNatuerlichePersonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameNatuerlichePersonVornameVerpflichtendType(NameNatuerlichePersonVornameVerpflichtendType nameNatuerlichePersonVornameVerpflichtendType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameNatuerlichePersonVornameVerpflichtendType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutzerkontoType(NutzerkontoType nutzerkontoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutzerkontoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalischeInlandsanschriftBasisType(PostalischeInlandsanschriftBasisType postalischeInlandsanschriftBasisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postalischeInlandsanschriftBasisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalischeInlandsanschriftGebaeudeanschriftType(PostalischeInlandsanschriftGebaeudeanschriftType postalischeInlandsanschriftGebaeudeanschriftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postalischeInlandsanschriftGebaeudeanschriftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalischeInlandsanschriftPostfachanschriftType(PostalischeInlandsanschriftPostfachanschriftType postalischeInlandsanschriftPostfachanschriftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postalischeInlandsanschriftPostfachanschriftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalischeInlandsanschriftType(PostalischeInlandsanschriftType postalischeInlandsanschriftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postalischeInlandsanschriftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostkorbHandleType(PostkorbHandleType postkorbHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postkorbHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaatsangehoerigkeitenNachweisbezugType(StaatsangehoerigkeitenNachweisbezugType staatsangehoerigkeitenNachweisbezugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staatsangehoerigkeitenNachweisbezugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusDatenabrufType(StatusDatenabrufType statusDatenabrufType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusDatenabrufType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTatsacheMitFreitextType(TatsacheMitFreitextType tatsacheMitFreitextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tatsacheMitFreitextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTatsacheMitNachweisType(TatsacheMitNachweisType tatsacheMitNachweisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tatsacheMitNachweisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTatsacheMitZeitraumType(TatsacheMitZeitraumType tatsacheMitZeitraumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tatsacheMitZeitraumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeilbekanntesDatumType(TeilbekanntesDatumType teilbekanntesDatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(teilbekanntesDatumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminwunschType(TerminwunschType terminwunschType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminwunschType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeitraumType(ZeitraumType zeitraumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zeitraumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZusatzparametergruppeType(ZusatzparametergruppeType zusatzparametergruppeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zusatzparametergruppeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZustimmungAbrufOderWeitergabeType(ZustimmungAbrufOderWeitergabeType zustimmungAbrufOderWeitergabeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zustimmungAbrufOderWeitergabeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnrede(Anrede anrede, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtabruf(Artabruf artabruf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtnachweis(Artnachweis artnachweis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufenthaltsstatus(Aufenthaltsstatus aufenthaltsstatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEigenschaft(Eigenschaft eigenschaft, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinkommensarten(Einkommensarten einkommensarten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilienstand(Familienstand familienstand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschlecht(Geschlecht geschlecht, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindschaftsbeziehung(Kindschaftsbeziehung kindschaftsbeziehung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindwohnhaftbei(Kindwohnhaftbei kindwohnhaftbei, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeistungserhalt(Leistungserhalt leistungserhalt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeistungsgewaehrung(Leistungsgewaehrung leistungsgewaehrung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachrichtentyp(Nachrichtentyp nachrichtentyp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachweisbezug(Nachweisbezug nachweisbezug, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonensorgerecht(Personensorgerecht personensorgerecht, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonderstatus(Sonderstatus sonderstatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonstigeleistungen(Sonstigeleistungen sonstigeleistungen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusdatenabruf(Statusdatenabruf statusdatenabruf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTatsachenbehauptung(Tatsachenbehauptung tatsachenbehauptung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertrauensniveau(Vertrauensniveau vertrauensniveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertretung(Vertretung vertretung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWohnsitz(Wohnsitz wohnsitz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZuschuesse(Zuschuesse zuschuesse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnredeObject(Anrede anredeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtabrufObject(Artabruf artabrufObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtnachweisObject(Artnachweis artnachweisObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufenthaltsstatusObject(Aufenthaltsstatus aufenthaltsstatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEigenschaftObject(Eigenschaft eigenschaftObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinkommensartenObject(Einkommensarten einkommensartenObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilienstandObject(Familienstand familienstandObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschlechtObject(Geschlecht geschlechtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJahrMonatType(XMLGregorianCalendar jahrMonatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateJahrMonatType_Pattern(jahrMonatType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateJahrMonatType_Pattern
	 */
	public static final  PatternMatcher [][] JAHR_MONAT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Jahr Monat Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJahrMonatType_Pattern(XMLGregorianCalendar jahrMonatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BaukastenPackage.Literals.JAHR_MONAT_TYPE, jahrMonatType, JAHR_MONAT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJahrType(XMLGregorianCalendar jahrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateJahrType_Pattern(jahrType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateJahrType_Pattern
	 */
	public static final  PatternMatcher [][] JAHR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Jahr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJahrType_Pattern(XMLGregorianCalendar jahrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BaukastenPackage.Literals.JAHR_TYPE, jahrType, JAHR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindschaftsbeziehungObject(Kindschaftsbeziehung kindschaftsbeziehungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindwohnhaftbeiObject(Kindwohnhaftbei kindwohnhaftbeiObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKrankenversichertennummerType(String krankenversichertennummerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(krankenversichertennummerType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeistungserhaltObject(Leistungserhalt leistungserhaltObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeistungsgewaehrungObject(Leistungsgewaehrung leistungsgewaehrungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftHausnummerBuchstabeZusatzzifferType(String meldeanschriftHausnummerBuchstabeZusatzzifferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftHausnummerBuchstabeZusatzzifferType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftHausnummerType(String meldeanschriftHausnummerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftHausnummerType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftPostleitzahlType(String meldeanschriftPostleitzahlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftPostleitzahlType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftStockwerkswohnungsnummerType(String meldeanschriftStockwerkswohnungsnummerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftStockwerkswohnungsnummerType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftStrasseType(String meldeanschriftStrasseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftStrasseType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftTeilnummerDerHausnummerType(String meldeanschriftTeilnummerDerHausnummerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftTeilnummerDerHausnummerType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftWohnortFruehererGemeindenameType(String meldeanschriftWohnortFruehererGemeindenameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftWohnortFruehererGemeindenameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftWohnortType(String meldeanschriftWohnortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftWohnortType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftWohnungsinhaberType(String meldeanschriftWohnungsinhaberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftWohnungsinhaberType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldeanschriftZusatzangabenType(String meldeanschriftZusatzangabenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(meldeanschriftZusatzangabenType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachrichtentypObject(Nachrichtentyp nachrichtentypObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNachweisbezugObject(Nachweisbezug nachweisbezugObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonensorgerechtObject(Personensorgerecht personensorgerechtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonderstatusObject(Sonderstatus sonderstatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonstigeleistungenObject(Sonstigeleistungen sonstigeleistungenObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusdatenabrufObject(Statusdatenabruf statusdatenabrufObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteuerlicheIdentifikationsnummerType(String steuerlicheIdentifikationsnummerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = din913792204Validator.validateDatatypeC_Pattern(steuerlicheIdentifikationsnummerType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagesdatumType(XMLGregorianCalendar tagesdatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTagesdatumType_Pattern(tagesdatumType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTagesdatumType_Pattern
	 */
	public static final  PatternMatcher [][] TAGESDATUM_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9]{2}-[0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Tagesdatum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagesdatumType_Pattern(XMLGregorianCalendar tagesdatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BaukastenPackage.Literals.TAGESDATUM_TYPE, tagesdatumType, TAGESDATUM_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTatsachenbehauptungObject(Tatsachenbehauptung tatsachenbehauptungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUUIDType(String uuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertrauensniveauObject(Vertrauensniveau vertrauensniveauObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertretungObject(Vertretung vertretungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWohnsitzObject(Wohnsitz wohnsitzObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZuschuesseObject(Zuschuesse zuschuesseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BaukastenValidator
