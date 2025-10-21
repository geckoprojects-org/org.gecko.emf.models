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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Factory;
import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.xfamilie.baukasten._1.baukasten.*;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaukastenFactoryImpl extends EFactoryImpl implements BaukastenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaukastenFactory init() {
		try {
			BaukastenFactory theBaukastenFactory = (BaukastenFactory)EPackage.Registry.INSTANCE.getEFactory(BaukastenPackage.eNS_URI);
			if (theBaukastenFactory != null) {
				return theBaukastenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaukastenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaukastenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE: return createAllgemeinerNameType();
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE: return createAntragsnachrichtType();
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE: return createAufenthaltstitelNachweisbezugType();
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE: return createAuslandsanschriftType();
			case BaukastenPackage.BANKVERBINDUNG_IBAN_OPTIONAL_TYPE: return createBankverbindungIBANOptionalType();
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE: return createBankverbindungInhaberOptionalType();
			case BaukastenPackage.BANKVERBINDUNG_TYPE: return createBankverbindungType();
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE: return createBehoerdenkennungType();
			case BaukastenPackage.CODE_ANREDE_TYPE: return createCodeAnredeType();
			case BaukastenPackage.CODE_ART_ABRUF_TYPE: return createCodeArtAbrufType();
			case BaukastenPackage.CODE_AUFENTHALTSSTATUS_TYPE: return createCodeAufenthaltsstatusType();
			case BaukastenPackage.CODE_BUNDESLAND_TYPE: return createCodeBundeslandType();
			case BaukastenPackage.CODE_EIGENSCHAFT_TYPE: return createCodeEigenschaftType();
			case BaukastenPackage.CODE_EINKOMMENSARTEN_TYPE: return createCodeEinkommensartenType();
			case BaukastenPackage.CODE_ERREICHBARKEIT_TYPE: return createCodeErreichbarkeitType();
			case BaukastenPackage.CODE_FAMILIENSTAND_TYPE: return createCodeFamilienstandType();
			case BaukastenPackage.CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE: return createCodeGemeindeVZAmtlicherGemeindeschluesselType();
			case BaukastenPackage.CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE: return createCodeGemeindeVZRegionalschluesselType();
			case BaukastenPackage.CODE_GESCHLECHT_TYPE: return createCodeGeschlechtType();
			case BaukastenPackage.CODE_KINDSCHAFTSBEZIEHUNG_TYPE: return createCodeKindschaftsbeziehungType();
			case BaukastenPackage.CODE_KIND_WOHNHAFT_BEI_TYPE: return createCodeKindWohnhaftBeiType();
			case BaukastenPackage.CODE_LEISTUNGSERHALT_TYPE: return createCodeLeistungserhaltType();
			case BaukastenPackage.CODE_LEISTUNGSGEWAEHRUNG_TYPE: return createCodeLeistungsgewaehrungType();
			case BaukastenPackage.CODE_NACHRICHTENTYP_TYPE: return createCodeNachrichtentypType();
			case BaukastenPackage.CODE_NACHWEISBEZUG_TYPE: return createCodeNachweisbezugType();
			case BaukastenPackage.CODE_PERSONENSORGERECHT_TYPE: return createCodePersonensorgerechtType();
			case BaukastenPackage.CODE_PRAEFIX_TYPE: return createCodePraefixType();
			case BaukastenPackage.CODE_SONDERSTATUS_TYPE: return createCodeSonderstatusType();
			case BaukastenPackage.CODE_SONSTIGE_LEISTUNGEN_TYPE: return createCodeSonstigeLeistungenType();
			case BaukastenPackage.CODE_STAATSANGEHOERIGKEIT_TYPE: return createCodeStaatsangehoerigkeitType();
			case BaukastenPackage.CODE_STAAT_TYPE: return createCodeStaatType();
			case BaukastenPackage.CODE_STANDESAMTNUMMERN_TYPE: return createCodeStandesamtnummernType();
			case BaukastenPackage.CODE_STATUS_DATENABRUF_TYPE: return createCodeStatusDatenabrufType();
			case BaukastenPackage.CODE_TATSACHENBEHAUPTUNG_TYPE: return createCodeTatsachenbehauptungType();
			case BaukastenPackage.CODE_VERMOEGENSART_TYPE: return createCodeVermoegensartType();
			case BaukastenPackage.CODE_VERTRAUENSNIVEAU_TYPE: return createCodeVertrauensniveauType();
			case BaukastenPackage.CODE_VERTRETUNG_TYPE: return createCodeVertretungType();
			case BaukastenPackage.CODE_WOHNSITZ_TYPE: return createCodeWohnsitzType();
			case BaukastenPackage.CODE_ZUSCHUESSE_TYPE: return createCodeZuschuesseType();
			case BaukastenPackage.DATENABRUF_TYPE: return createDatenabrufType();
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE: return createDatenschutzerklaerungenType();
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE: return createEntgeltdatenArbeitgeberDsrvType();
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE: return createEntgeltdatenDsrvNachweisbezugType();
			case BaukastenPackage.ERREICHBARKEIT_TYPE: return createErreichbarkeitType();
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE: return createFamiliennameUnstrukturiertType();
			case BaukastenPackage.FAMILIENSTAND_NACHWEISBEZUG_TYPE: return createFamilienstandNachweisbezugType();
			case BaukastenPackage.FAMILIENSTAND_TYPE: return createFamilienstandType();
			case BaukastenPackage.FELDGRUPPE_TYPE: return createFeldgruppeType();
			case BaukastenPackage.FELD_TYPE: return createFeldType();
			case BaukastenPackage.GEBURT_GEBURTSORT_OPTIONAL_TYPE: return createGeburtGeburtsortOptionalType();
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE: return createGeburtNachweisbezugType();
			case BaukastenPackage.GEBURT_OPTIONAL_TYPE: return createGeburtOptionalType();
			case BaukastenPackage.GEBURT_TYPE: return createGeburtType();
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE: return createHausnummernBisType();
			case BaukastenPackage.IDENTIFIKATION_NACHRICHT_TYPE: return createIdentifikationNachrichtType();
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE: return createKommunikationspartnerErreichbarType();
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE: return createKommunikationspartnerType();
			case BaukastenPackage.MELDEANSCHRIFT_TYPE: return createMeldeanschriftType();
			case BaukastenPackage.NACHRICHTENKOPF_TYPE: return createNachrichtenkopfType();
			case BaukastenPackage.NACHRICHT_TYPE: return createNachrichtType();
			case BaukastenPackage.NACHWEISBEZUG_TYPE: return createNachweisbezugType();
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE: return createNachweisdokumentType();
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE: return createNameNatuerlichePersonNachweisbezugType();
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE: return createNameNatuerlichePersonOhneGeburtsnameType();
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_TYPE: return createNameNatuerlichePersonType();
			case BaukastenPackage.NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE: return createNameNatuerlichePersonVornameVerpflichtendType();
			case BaukastenPackage.NUTZERKONTO_TYPE: return createNutzerkontoType();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE: return createPostalischeInlandsanschriftBasisType();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE: return createPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE: return createPostalischeInlandsanschriftGebaeudeanschriftType();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE: return createPostalischeInlandsanschriftPostfachanschriftType();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE: return createPostalischeInlandsanschriftType();
			case BaukastenPackage.POSTKORB_HANDLE_TYPE: return createPostkorbHandleType();
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE: return createStaatsangehoerigkeitenNachweisbezugType();
			case BaukastenPackage.STATUS_DATENABRUF_TYPE: return createStatusDatenabrufType();
			case BaukastenPackage.TATSACHE_MIT_FREITEXT_TYPE: return createTatsacheMitFreitextType();
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE: return createTatsacheMitNachweisType();
			case BaukastenPackage.TATSACHE_MIT_ZEITRAUM_TYPE: return createTatsacheMitZeitraumType();
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE: return createTeilbekanntesDatumType();
			case BaukastenPackage.TERMINWUNSCH_TYPE: return createTerminwunschType();
			case BaukastenPackage.ZEITRAUM_TYPE: return createZeitraumType();
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE: return createZusatzparametergruppeType();
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE: return createZustimmungAbrufOderWeitergabeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BaukastenPackage.ANREDE:
				return createAnredeFromString(eDataType, initialValue);
			case BaukastenPackage.ARTABRUF:
				return createArtabrufFromString(eDataType, initialValue);
			case BaukastenPackage.ARTNACHWEIS:
				return createArtnachweisFromString(eDataType, initialValue);
			case BaukastenPackage.AUFENTHALTSSTATUS:
				return createAufenthaltsstatusFromString(eDataType, initialValue);
			case BaukastenPackage.EIGENSCHAFT:
				return createEigenschaftFromString(eDataType, initialValue);
			case BaukastenPackage.EINKOMMENSARTEN:
				return createEinkommensartenFromString(eDataType, initialValue);
			case BaukastenPackage.FAMILIENSTAND:
				return createFamilienstandFromString(eDataType, initialValue);
			case BaukastenPackage.GESCHLECHT:
				return createGeschlechtFromString(eDataType, initialValue);
			case BaukastenPackage.KINDSCHAFTSBEZIEHUNG:
				return createKindschaftsbeziehungFromString(eDataType, initialValue);
			case BaukastenPackage.KINDWOHNHAFTBEI:
				return createKindwohnhaftbeiFromString(eDataType, initialValue);
			case BaukastenPackage.LEISTUNGSERHALT:
				return createLeistungserhaltFromString(eDataType, initialValue);
			case BaukastenPackage.LEISTUNGSGEWAEHRUNG:
				return createLeistungsgewaehrungFromString(eDataType, initialValue);
			case BaukastenPackage.NACHRICHTENTYP:
				return createNachrichtentypFromString(eDataType, initialValue);
			case BaukastenPackage.NACHWEISBEZUG:
				return createNachweisbezugFromString(eDataType, initialValue);
			case BaukastenPackage.PERSONENSORGERECHT:
				return createPersonensorgerechtFromString(eDataType, initialValue);
			case BaukastenPackage.SONDERSTATUS:
				return createSonderstatusFromString(eDataType, initialValue);
			case BaukastenPackage.SONSTIGELEISTUNGEN:
				return createSonstigeleistungenFromString(eDataType, initialValue);
			case BaukastenPackage.STATUSDATENABRUF:
				return createStatusdatenabrufFromString(eDataType, initialValue);
			case BaukastenPackage.TATSACHENBEHAUPTUNG:
				return createTatsachenbehauptungFromString(eDataType, initialValue);
			case BaukastenPackage.VERTRAUENSNIVEAU:
				return createVertrauensniveauFromString(eDataType, initialValue);
			case BaukastenPackage.VERTRETUNG:
				return createVertretungFromString(eDataType, initialValue);
			case BaukastenPackage.WOHNSITZ:
				return createWohnsitzFromString(eDataType, initialValue);
			case BaukastenPackage.ZUSCHUESSE:
				return createZuschuesseFromString(eDataType, initialValue);
			case BaukastenPackage.ANREDE_OBJECT:
				return createAnredeObjectFromString(eDataType, initialValue);
			case BaukastenPackage.ARTABRUF_OBJECT:
				return createArtabrufObjectFromString(eDataType, initialValue);
			case BaukastenPackage.ARTNACHWEIS_OBJECT:
				return createArtnachweisObjectFromString(eDataType, initialValue);
			case BaukastenPackage.AUFENTHALTSSTATUS_OBJECT:
				return createAufenthaltsstatusObjectFromString(eDataType, initialValue);
			case BaukastenPackage.EIGENSCHAFT_OBJECT:
				return createEigenschaftObjectFromString(eDataType, initialValue);
			case BaukastenPackage.EINKOMMENSARTEN_OBJECT:
				return createEinkommensartenObjectFromString(eDataType, initialValue);
			case BaukastenPackage.FAMILIENSTAND_OBJECT:
				return createFamilienstandObjectFromString(eDataType, initialValue);
			case BaukastenPackage.GESCHLECHT_OBJECT:
				return createGeschlechtObjectFromString(eDataType, initialValue);
			case BaukastenPackage.JAHR_MONAT_TYPE:
				return createJahrMonatTypeFromString(eDataType, initialValue);
			case BaukastenPackage.JAHR_TYPE:
				return createJahrTypeFromString(eDataType, initialValue);
			case BaukastenPackage.KINDSCHAFTSBEZIEHUNG_OBJECT:
				return createKindschaftsbeziehungObjectFromString(eDataType, initialValue);
			case BaukastenPackage.KINDWOHNHAFTBEI_OBJECT:
				return createKindwohnhaftbeiObjectFromString(eDataType, initialValue);
			case BaukastenPackage.KRANKENVERSICHERTENNUMMER_TYPE:
				return createKrankenversichertennummerTypeFromString(eDataType, initialValue);
			case BaukastenPackage.LEISTUNGSERHALT_OBJECT:
				return createLeistungserhaltObjectFromString(eDataType, initialValue);
			case BaukastenPackage.LEISTUNGSGEWAEHRUNG_OBJECT:
				return createLeistungsgewaehrungObjectFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_TYPE:
				return createMeldeanschriftHausnummerBuchstabeZusatzzifferTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_HAUSNUMMER_TYPE:
				return createMeldeanschriftHausnummerTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_POSTLEITZAHL_TYPE:
				return createMeldeanschriftPostleitzahlTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_STOCKWERKSWOHNUNGSNUMMER_TYPE:
				return createMeldeanschriftStockwerkswohnungsnummerTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_STRASSE_TYPE:
				return createMeldeanschriftStrasseTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_TEILNUMMER_DER_HAUSNUMMER_TYPE:
				return createMeldeanschriftTeilnummerDerHausnummerTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNORT_FRUEHERER_GEMEINDENAME_TYPE:
				return createMeldeanschriftWohnortFruehererGemeindenameTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNORT_TYPE:
				return createMeldeanschriftWohnortTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNUNGSINHABER_TYPE:
				return createMeldeanschriftWohnungsinhaberTypeFromString(eDataType, initialValue);
			case BaukastenPackage.MELDEANSCHRIFT_ZUSATZANGABEN_TYPE:
				return createMeldeanschriftZusatzangabenTypeFromString(eDataType, initialValue);
			case BaukastenPackage.NACHRICHTENTYP_OBJECT:
				return createNachrichtentypObjectFromString(eDataType, initialValue);
			case BaukastenPackage.NACHWEISBEZUG_OBJECT:
				return createNachweisbezugObjectFromString(eDataType, initialValue);
			case BaukastenPackage.PERSONENSORGERECHT_OBJECT:
				return createPersonensorgerechtObjectFromString(eDataType, initialValue);
			case BaukastenPackage.SONDERSTATUS_OBJECT:
				return createSonderstatusObjectFromString(eDataType, initialValue);
			case BaukastenPackage.SONSTIGELEISTUNGEN_OBJECT:
				return createSonstigeleistungenObjectFromString(eDataType, initialValue);
			case BaukastenPackage.STATUSDATENABRUF_OBJECT:
				return createStatusdatenabrufObjectFromString(eDataType, initialValue);
			case BaukastenPackage.STEUERLICHE_IDENTIFIKATIONSNUMMER_TYPE:
				return createSteuerlicheIdentifikationsnummerTypeFromString(eDataType, initialValue);
			case BaukastenPackage.TAGESDATUM_TYPE:
				return createTagesdatumTypeFromString(eDataType, initialValue);
			case BaukastenPackage.TATSACHENBEHAUPTUNG_OBJECT:
				return createTatsachenbehauptungObjectFromString(eDataType, initialValue);
			case BaukastenPackage.UUID_TYPE:
				return createUUIDTypeFromString(eDataType, initialValue);
			case BaukastenPackage.VERTRAUENSNIVEAU_OBJECT:
				return createVertrauensniveauObjectFromString(eDataType, initialValue);
			case BaukastenPackage.VERTRETUNG_OBJECT:
				return createVertretungObjectFromString(eDataType, initialValue);
			case BaukastenPackage.WOHNSITZ_OBJECT:
				return createWohnsitzObjectFromString(eDataType, initialValue);
			case BaukastenPackage.ZUSCHUESSE_OBJECT:
				return createZuschuesseObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BaukastenPackage.ANREDE:
				return convertAnredeToString(eDataType, instanceValue);
			case BaukastenPackage.ARTABRUF:
				return convertArtabrufToString(eDataType, instanceValue);
			case BaukastenPackage.ARTNACHWEIS:
				return convertArtnachweisToString(eDataType, instanceValue);
			case BaukastenPackage.AUFENTHALTSSTATUS:
				return convertAufenthaltsstatusToString(eDataType, instanceValue);
			case BaukastenPackage.EIGENSCHAFT:
				return convertEigenschaftToString(eDataType, instanceValue);
			case BaukastenPackage.EINKOMMENSARTEN:
				return convertEinkommensartenToString(eDataType, instanceValue);
			case BaukastenPackage.FAMILIENSTAND:
				return convertFamilienstandToString(eDataType, instanceValue);
			case BaukastenPackage.GESCHLECHT:
				return convertGeschlechtToString(eDataType, instanceValue);
			case BaukastenPackage.KINDSCHAFTSBEZIEHUNG:
				return convertKindschaftsbeziehungToString(eDataType, instanceValue);
			case BaukastenPackage.KINDWOHNHAFTBEI:
				return convertKindwohnhaftbeiToString(eDataType, instanceValue);
			case BaukastenPackage.LEISTUNGSERHALT:
				return convertLeistungserhaltToString(eDataType, instanceValue);
			case BaukastenPackage.LEISTUNGSGEWAEHRUNG:
				return convertLeistungsgewaehrungToString(eDataType, instanceValue);
			case BaukastenPackage.NACHRICHTENTYP:
				return convertNachrichtentypToString(eDataType, instanceValue);
			case BaukastenPackage.NACHWEISBEZUG:
				return convertNachweisbezugToString(eDataType, instanceValue);
			case BaukastenPackage.PERSONENSORGERECHT:
				return convertPersonensorgerechtToString(eDataType, instanceValue);
			case BaukastenPackage.SONDERSTATUS:
				return convertSonderstatusToString(eDataType, instanceValue);
			case BaukastenPackage.SONSTIGELEISTUNGEN:
				return convertSonstigeleistungenToString(eDataType, instanceValue);
			case BaukastenPackage.STATUSDATENABRUF:
				return convertStatusdatenabrufToString(eDataType, instanceValue);
			case BaukastenPackage.TATSACHENBEHAUPTUNG:
				return convertTatsachenbehauptungToString(eDataType, instanceValue);
			case BaukastenPackage.VERTRAUENSNIVEAU:
				return convertVertrauensniveauToString(eDataType, instanceValue);
			case BaukastenPackage.VERTRETUNG:
				return convertVertretungToString(eDataType, instanceValue);
			case BaukastenPackage.WOHNSITZ:
				return convertWohnsitzToString(eDataType, instanceValue);
			case BaukastenPackage.ZUSCHUESSE:
				return convertZuschuesseToString(eDataType, instanceValue);
			case BaukastenPackage.ANREDE_OBJECT:
				return convertAnredeObjectToString(eDataType, instanceValue);
			case BaukastenPackage.ARTABRUF_OBJECT:
				return convertArtabrufObjectToString(eDataType, instanceValue);
			case BaukastenPackage.ARTNACHWEIS_OBJECT:
				return convertArtnachweisObjectToString(eDataType, instanceValue);
			case BaukastenPackage.AUFENTHALTSSTATUS_OBJECT:
				return convertAufenthaltsstatusObjectToString(eDataType, instanceValue);
			case BaukastenPackage.EIGENSCHAFT_OBJECT:
				return convertEigenschaftObjectToString(eDataType, instanceValue);
			case BaukastenPackage.EINKOMMENSARTEN_OBJECT:
				return convertEinkommensartenObjectToString(eDataType, instanceValue);
			case BaukastenPackage.FAMILIENSTAND_OBJECT:
				return convertFamilienstandObjectToString(eDataType, instanceValue);
			case BaukastenPackage.GESCHLECHT_OBJECT:
				return convertGeschlechtObjectToString(eDataType, instanceValue);
			case BaukastenPackage.JAHR_MONAT_TYPE:
				return convertJahrMonatTypeToString(eDataType, instanceValue);
			case BaukastenPackage.JAHR_TYPE:
				return convertJahrTypeToString(eDataType, instanceValue);
			case BaukastenPackage.KINDSCHAFTSBEZIEHUNG_OBJECT:
				return convertKindschaftsbeziehungObjectToString(eDataType, instanceValue);
			case BaukastenPackage.KINDWOHNHAFTBEI_OBJECT:
				return convertKindwohnhaftbeiObjectToString(eDataType, instanceValue);
			case BaukastenPackage.KRANKENVERSICHERTENNUMMER_TYPE:
				return convertKrankenversichertennummerTypeToString(eDataType, instanceValue);
			case BaukastenPackage.LEISTUNGSERHALT_OBJECT:
				return convertLeistungserhaltObjectToString(eDataType, instanceValue);
			case BaukastenPackage.LEISTUNGSGEWAEHRUNG_OBJECT:
				return convertLeistungsgewaehrungObjectToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_TYPE:
				return convertMeldeanschriftHausnummerBuchstabeZusatzzifferTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_HAUSNUMMER_TYPE:
				return convertMeldeanschriftHausnummerTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_POSTLEITZAHL_TYPE:
				return convertMeldeanschriftPostleitzahlTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_STOCKWERKSWOHNUNGSNUMMER_TYPE:
				return convertMeldeanschriftStockwerkswohnungsnummerTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_STRASSE_TYPE:
				return convertMeldeanschriftStrasseTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_TEILNUMMER_DER_HAUSNUMMER_TYPE:
				return convertMeldeanschriftTeilnummerDerHausnummerTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNORT_FRUEHERER_GEMEINDENAME_TYPE:
				return convertMeldeanschriftWohnortFruehererGemeindenameTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNORT_TYPE:
				return convertMeldeanschriftWohnortTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_WOHNUNGSINHABER_TYPE:
				return convertMeldeanschriftWohnungsinhaberTypeToString(eDataType, instanceValue);
			case BaukastenPackage.MELDEANSCHRIFT_ZUSATZANGABEN_TYPE:
				return convertMeldeanschriftZusatzangabenTypeToString(eDataType, instanceValue);
			case BaukastenPackage.NACHRICHTENTYP_OBJECT:
				return convertNachrichtentypObjectToString(eDataType, instanceValue);
			case BaukastenPackage.NACHWEISBEZUG_OBJECT:
				return convertNachweisbezugObjectToString(eDataType, instanceValue);
			case BaukastenPackage.PERSONENSORGERECHT_OBJECT:
				return convertPersonensorgerechtObjectToString(eDataType, instanceValue);
			case BaukastenPackage.SONDERSTATUS_OBJECT:
				return convertSonderstatusObjectToString(eDataType, instanceValue);
			case BaukastenPackage.SONSTIGELEISTUNGEN_OBJECT:
				return convertSonstigeleistungenObjectToString(eDataType, instanceValue);
			case BaukastenPackage.STATUSDATENABRUF_OBJECT:
				return convertStatusdatenabrufObjectToString(eDataType, instanceValue);
			case BaukastenPackage.STEUERLICHE_IDENTIFIKATIONSNUMMER_TYPE:
				return convertSteuerlicheIdentifikationsnummerTypeToString(eDataType, instanceValue);
			case BaukastenPackage.TAGESDATUM_TYPE:
				return convertTagesdatumTypeToString(eDataType, instanceValue);
			case BaukastenPackage.TATSACHENBEHAUPTUNG_OBJECT:
				return convertTatsachenbehauptungObjectToString(eDataType, instanceValue);
			case BaukastenPackage.UUID_TYPE:
				return convertUUIDTypeToString(eDataType, instanceValue);
			case BaukastenPackage.VERTRAUENSNIVEAU_OBJECT:
				return convertVertrauensniveauObjectToString(eDataType, instanceValue);
			case BaukastenPackage.VERTRETUNG_OBJECT:
				return convertVertretungObjectToString(eDataType, instanceValue);
			case BaukastenPackage.WOHNSITZ_OBJECT:
				return convertWohnsitzObjectToString(eDataType, instanceValue);
			case BaukastenPackage.ZUSCHUESSE_OBJECT:
				return convertZuschuesseObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType createAllgemeinerNameType() {
		AllgemeinerNameTypeImpl allgemeinerNameType = new AllgemeinerNameTypeImpl();
		return allgemeinerNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragsnachrichtType createAntragsnachrichtType() {
		AntragsnachrichtTypeImpl antragsnachrichtType = new AntragsnachrichtTypeImpl();
		return antragsnachrichtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufenthaltstitelNachweisbezugType createAufenthaltstitelNachweisbezugType() {
		AufenthaltstitelNachweisbezugTypeImpl aufenthaltstitelNachweisbezugType = new AufenthaltstitelNachweisbezugTypeImpl();
		return aufenthaltstitelNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsanschriftType createAuslandsanschriftType() {
		AuslandsanschriftTypeImpl auslandsanschriftType = new AuslandsanschriftTypeImpl();
		return auslandsanschriftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungIBANOptionalType createBankverbindungIBANOptionalType() {
		BankverbindungIBANOptionalTypeImpl bankverbindungIBANOptionalType = new BankverbindungIBANOptionalTypeImpl();
		return bankverbindungIBANOptionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungInhaberOptionalType createBankverbindungInhaberOptionalType() {
		BankverbindungInhaberOptionalTypeImpl bankverbindungInhaberOptionalType = new BankverbindungInhaberOptionalTypeImpl();
		return bankverbindungInhaberOptionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungType createBankverbindungType() {
		BankverbindungTypeImpl bankverbindungType = new BankverbindungTypeImpl();
		return bankverbindungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdenkennungType createBehoerdenkennungType() {
		BehoerdenkennungTypeImpl behoerdenkennungType = new BehoerdenkennungTypeImpl();
		return behoerdenkennungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAnredeType createCodeAnredeType() {
		CodeAnredeTypeImpl codeAnredeType = new CodeAnredeTypeImpl();
		return codeAnredeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeArtAbrufType createCodeArtAbrufType() {
		CodeArtAbrufTypeImpl codeArtAbrufType = new CodeArtAbrufTypeImpl();
		return codeArtAbrufType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAufenthaltsstatusType createCodeAufenthaltsstatusType() {
		CodeAufenthaltsstatusTypeImpl codeAufenthaltsstatusType = new CodeAufenthaltsstatusTypeImpl();
		return codeAufenthaltsstatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBundeslandType createCodeBundeslandType() {
		CodeBundeslandTypeImpl codeBundeslandType = new CodeBundeslandTypeImpl();
		return codeBundeslandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEigenschaftType createCodeEigenschaftType() {
		CodeEigenschaftTypeImpl codeEigenschaftType = new CodeEigenschaftTypeImpl();
		return codeEigenschaftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEinkommensartenType createCodeEinkommensartenType() {
		CodeEinkommensartenTypeImpl codeEinkommensartenType = new CodeEinkommensartenTypeImpl();
		return codeEinkommensartenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeErreichbarkeitType createCodeErreichbarkeitType() {
		CodeErreichbarkeitTypeImpl codeErreichbarkeitType = new CodeErreichbarkeitTypeImpl();
		return codeErreichbarkeitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeFamilienstandType createCodeFamilienstandType() {
		CodeFamilienstandTypeImpl codeFamilienstandType = new CodeFamilienstandTypeImpl();
		return codeFamilienstandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGemeindeVZAmtlicherGemeindeschluesselType createCodeGemeindeVZAmtlicherGemeindeschluesselType() {
		CodeGemeindeVZAmtlicherGemeindeschluesselTypeImpl codeGemeindeVZAmtlicherGemeindeschluesselType = new CodeGemeindeVZAmtlicherGemeindeschluesselTypeImpl();
		return codeGemeindeVZAmtlicherGemeindeschluesselType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGemeindeVZRegionalschluesselType createCodeGemeindeVZRegionalschluesselType() {
		CodeGemeindeVZRegionalschluesselTypeImpl codeGemeindeVZRegionalschluesselType = new CodeGemeindeVZRegionalschluesselTypeImpl();
		return codeGemeindeVZRegionalschluesselType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGeschlechtType createCodeGeschlechtType() {
		CodeGeschlechtTypeImpl codeGeschlechtType = new CodeGeschlechtTypeImpl();
		return codeGeschlechtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsbeziehungType createCodeKindschaftsbeziehungType() {
		CodeKindschaftsbeziehungTypeImpl codeKindschaftsbeziehungType = new CodeKindschaftsbeziehungTypeImpl();
		return codeKindschaftsbeziehungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindWohnhaftBeiType createCodeKindWohnhaftBeiType() {
		CodeKindWohnhaftBeiTypeImpl codeKindWohnhaftBeiType = new CodeKindWohnhaftBeiTypeImpl();
		return codeKindWohnhaftBeiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLeistungserhaltType createCodeLeistungserhaltType() {
		CodeLeistungserhaltTypeImpl codeLeistungserhaltType = new CodeLeistungserhaltTypeImpl();
		return codeLeistungserhaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLeistungsgewaehrungType createCodeLeistungsgewaehrungType() {
		CodeLeistungsgewaehrungTypeImpl codeLeistungsgewaehrungType = new CodeLeistungsgewaehrungTypeImpl();
		return codeLeistungsgewaehrungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeNachrichtentypType createCodeNachrichtentypType() {
		CodeNachrichtentypTypeImpl codeNachrichtentypType = new CodeNachrichtentypTypeImpl();
		return codeNachrichtentypType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeNachweisbezugType createCodeNachweisbezugType() {
		CodeNachweisbezugTypeImpl codeNachweisbezugType = new CodeNachweisbezugTypeImpl();
		return codeNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodePersonensorgerechtType createCodePersonensorgerechtType() {
		CodePersonensorgerechtTypeImpl codePersonensorgerechtType = new CodePersonensorgerechtTypeImpl();
		return codePersonensorgerechtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodePraefixType createCodePraefixType() {
		CodePraefixTypeImpl codePraefixType = new CodePraefixTypeImpl();
		return codePraefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSonderstatusType createCodeSonderstatusType() {
		CodeSonderstatusTypeImpl codeSonderstatusType = new CodeSonderstatusTypeImpl();
		return codeSonderstatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSonstigeLeistungenType createCodeSonstigeLeistungenType() {
		CodeSonstigeLeistungenTypeImpl codeSonstigeLeistungenType = new CodeSonstigeLeistungenTypeImpl();
		return codeSonstigeLeistungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatsangehoerigkeitType createCodeStaatsangehoerigkeitType() {
		CodeStaatsangehoerigkeitTypeImpl codeStaatsangehoerigkeitType = new CodeStaatsangehoerigkeitTypeImpl();
		return codeStaatsangehoerigkeitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatType createCodeStaatType() {
		CodeStaatTypeImpl codeStaatType = new CodeStaatTypeImpl();
		return codeStaatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStandesamtnummernType createCodeStandesamtnummernType() {
		CodeStandesamtnummernTypeImpl codeStandesamtnummernType = new CodeStandesamtnummernTypeImpl();
		return codeStandesamtnummernType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStatusDatenabrufType createCodeStatusDatenabrufType() {
		CodeStatusDatenabrufTypeImpl codeStatusDatenabrufType = new CodeStatusDatenabrufTypeImpl();
		return codeStatusDatenabrufType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeTatsachenbehauptungType createCodeTatsachenbehauptungType() {
		CodeTatsachenbehauptungTypeImpl codeTatsachenbehauptungType = new CodeTatsachenbehauptungTypeImpl();
		return codeTatsachenbehauptungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVermoegensartType createCodeVermoegensartType() {
		CodeVermoegensartTypeImpl codeVermoegensartType = new CodeVermoegensartTypeImpl();
		return codeVermoegensartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVertrauensniveauType createCodeVertrauensniveauType() {
		CodeVertrauensniveauTypeImpl codeVertrauensniveauType = new CodeVertrauensniveauTypeImpl();
		return codeVertrauensniveauType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVertretungType createCodeVertretungType() {
		CodeVertretungTypeImpl codeVertretungType = new CodeVertretungTypeImpl();
		return codeVertretungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWohnsitzType createCodeWohnsitzType() {
		CodeWohnsitzTypeImpl codeWohnsitzType = new CodeWohnsitzTypeImpl();
		return codeWohnsitzType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeZuschuesseType createCodeZuschuesseType() {
		CodeZuschuesseTypeImpl codeZuschuesseType = new CodeZuschuesseTypeImpl();
		return codeZuschuesseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenabrufType createDatenabrufType() {
		DatenabrufTypeImpl datenabrufType = new DatenabrufTypeImpl();
		return datenabrufType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzerklaerungenType createDatenschutzerklaerungenType() {
		DatenschutzerklaerungenTypeImpl datenschutzerklaerungenType = new DatenschutzerklaerungenTypeImpl();
		return datenschutzerklaerungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntgeltdatenArbeitgeberDsrvType createEntgeltdatenArbeitgeberDsrvType() {
		EntgeltdatenArbeitgeberDsrvTypeImpl entgeltdatenArbeitgeberDsrvType = new EntgeltdatenArbeitgeberDsrvTypeImpl();
		return entgeltdatenArbeitgeberDsrvType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntgeltdatenDsrvNachweisbezugType createEntgeltdatenDsrvNachweisbezugType() {
		EntgeltdatenDsrvNachweisbezugTypeImpl entgeltdatenDsrvNachweisbezugType = new EntgeltdatenDsrvNachweisbezugTypeImpl();
		return entgeltdatenDsrvNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErreichbarkeitType createErreichbarkeitType() {
		ErreichbarkeitTypeImpl erreichbarkeitType = new ErreichbarkeitTypeImpl();
		return erreichbarkeitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamiliennameUnstrukturiertType createFamiliennameUnstrukturiertType() {
		FamiliennameUnstrukturiertTypeImpl familiennameUnstrukturiertType = new FamiliennameUnstrukturiertTypeImpl();
		return familiennameUnstrukturiertType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilienstandNachweisbezugType createFamilienstandNachweisbezugType() {
		FamilienstandNachweisbezugTypeImpl familienstandNachweisbezugType = new FamilienstandNachweisbezugTypeImpl();
		return familienstandNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilienstandType createFamilienstandType() {
		FamilienstandTypeImpl familienstandType = new FamilienstandTypeImpl();
		return familienstandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeldgruppeType createFeldgruppeType() {
		FeldgruppeTypeImpl feldgruppeType = new FeldgruppeTypeImpl();
		return feldgruppeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeldType createFeldType() {
		FeldTypeImpl feldType = new FeldTypeImpl();
		return feldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtGeburtsortOptionalType createGeburtGeburtsortOptionalType() {
		GeburtGeburtsortOptionalTypeImpl geburtGeburtsortOptionalType = new GeburtGeburtsortOptionalTypeImpl();
		return geburtGeburtsortOptionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtNachweisbezugType createGeburtNachweisbezugType() {
		GeburtNachweisbezugTypeImpl geburtNachweisbezugType = new GeburtNachweisbezugTypeImpl();
		return geburtNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtOptionalType createGeburtOptionalType() {
		GeburtOptionalTypeImpl geburtOptionalType = new GeburtOptionalTypeImpl();
		return geburtOptionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtType createGeburtType() {
		GeburtTypeImpl geburtType = new GeburtTypeImpl();
		return geburtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HausnummernBisType createHausnummernBisType() {
		HausnummernBisTypeImpl hausnummernBisType = new HausnummernBisTypeImpl();
		return hausnummernBisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationNachrichtType createIdentifikationNachrichtType() {
		IdentifikationNachrichtTypeImpl identifikationNachrichtType = new IdentifikationNachrichtTypeImpl();
		return identifikationNachrichtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KommunikationspartnerErreichbarType createKommunikationspartnerErreichbarType() {
		KommunikationspartnerErreichbarTypeImpl kommunikationspartnerErreichbarType = new KommunikationspartnerErreichbarTypeImpl();
		return kommunikationspartnerErreichbarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KommunikationspartnerType createKommunikationspartnerType() {
		KommunikationspartnerTypeImpl kommunikationspartnerType = new KommunikationspartnerTypeImpl();
		return kommunikationspartnerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeldeanschriftType createMeldeanschriftType() {
		MeldeanschriftTypeImpl meldeanschriftType = new MeldeanschriftTypeImpl();
		return meldeanschriftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtenkopfType createNachrichtenkopfType() {
		NachrichtenkopfTypeImpl nachrichtenkopfType = new NachrichtenkopfTypeImpl();
		return nachrichtenkopfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtType createNachrichtType() {
		NachrichtTypeImpl nachrichtType = new NachrichtTypeImpl();
		return nachrichtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisbezugType createNachweisbezugType() {
		NachweisbezugTypeImpl nachweisbezugType = new NachweisbezugTypeImpl();
		return nachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType createNachweisdokumentType() {
		NachweisdokumentTypeImpl nachweisdokumentType = new NachweisdokumentTypeImpl();
		return nachweisdokumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonNachweisbezugType createNameNatuerlichePersonNachweisbezugType() {
		NameNatuerlichePersonNachweisbezugTypeImpl nameNatuerlichePersonNachweisbezugType = new NameNatuerlichePersonNachweisbezugTypeImpl();
		return nameNatuerlichePersonNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonOhneGeburtsnameType createNameNatuerlichePersonOhneGeburtsnameType() {
		NameNatuerlichePersonOhneGeburtsnameTypeImpl nameNatuerlichePersonOhneGeburtsnameType = new NameNatuerlichePersonOhneGeburtsnameTypeImpl();
		return nameNatuerlichePersonOhneGeburtsnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType createNameNatuerlichePersonType() {
		NameNatuerlichePersonTypeImpl nameNatuerlichePersonType = new NameNatuerlichePersonTypeImpl();
		return nameNatuerlichePersonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonVornameVerpflichtendType createNameNatuerlichePersonVornameVerpflichtendType() {
		NameNatuerlichePersonVornameVerpflichtendTypeImpl nameNatuerlichePersonVornameVerpflichtendType = new NameNatuerlichePersonVornameVerpflichtendTypeImpl();
		return nameNatuerlichePersonVornameVerpflichtendType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutzerkontoType createNutzerkontoType() {
		NutzerkontoTypeImpl nutzerkontoType = new NutzerkontoTypeImpl();
		return nutzerkontoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType createPostalischeInlandsanschriftBasisType() {
		PostalischeInlandsanschriftBasisTypeImpl postalischeInlandsanschriftBasisType = new PostalischeInlandsanschriftBasisTypeImpl();
		return postalischeInlandsanschriftBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType createPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType() {
		PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeImpl postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType = new PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeImpl();
		return postalischeInlandsanschriftGebaeudeanschriftNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftGebaeudeanschriftType createPostalischeInlandsanschriftGebaeudeanschriftType() {
		PostalischeInlandsanschriftGebaeudeanschriftTypeImpl postalischeInlandsanschriftGebaeudeanschriftType = new PostalischeInlandsanschriftGebaeudeanschriftTypeImpl();
		return postalischeInlandsanschriftGebaeudeanschriftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftPostfachanschriftType createPostalischeInlandsanschriftPostfachanschriftType() {
		PostalischeInlandsanschriftPostfachanschriftTypeImpl postalischeInlandsanschriftPostfachanschriftType = new PostalischeInlandsanschriftPostfachanschriftTypeImpl();
		return postalischeInlandsanschriftPostfachanschriftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftType createPostalischeInlandsanschriftType() {
		PostalischeInlandsanschriftTypeImpl postalischeInlandsanschriftType = new PostalischeInlandsanschriftTypeImpl();
		return postalischeInlandsanschriftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostkorbHandleType createPostkorbHandleType() {
		PostkorbHandleTypeImpl postkorbHandleType = new PostkorbHandleTypeImpl();
		return postkorbHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitenNachweisbezugType createStaatsangehoerigkeitenNachweisbezugType() {
		StaatsangehoerigkeitenNachweisbezugTypeImpl staatsangehoerigkeitenNachweisbezugType = new StaatsangehoerigkeitenNachweisbezugTypeImpl();
		return staatsangehoerigkeitenNachweisbezugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusDatenabrufType createStatusDatenabrufType() {
		StatusDatenabrufTypeImpl statusDatenabrufType = new StatusDatenabrufTypeImpl();
		return statusDatenabrufType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitFreitextType createTatsacheMitFreitextType() {
		TatsacheMitFreitextTypeImpl tatsacheMitFreitextType = new TatsacheMitFreitextTypeImpl();
		return tatsacheMitFreitextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType createTatsacheMitNachweisType() {
		TatsacheMitNachweisTypeImpl tatsacheMitNachweisType = new TatsacheMitNachweisTypeImpl();
		return tatsacheMitNachweisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitZeitraumType createTatsacheMitZeitraumType() {
		TatsacheMitZeitraumTypeImpl tatsacheMitZeitraumType = new TatsacheMitZeitraumTypeImpl();
		return tatsacheMitZeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType createTeilbekanntesDatumType() {
		TeilbekanntesDatumTypeImpl teilbekanntesDatumType = new TeilbekanntesDatumTypeImpl();
		return teilbekanntesDatumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminwunschType createTerminwunschType() {
		TerminwunschTypeImpl terminwunschType = new TerminwunschTypeImpl();
		return terminwunschType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType createZeitraumType() {
		ZeitraumTypeImpl zeitraumType = new ZeitraumTypeImpl();
		return zeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZusatzparametergruppeType createZusatzparametergruppeType() {
		ZusatzparametergruppeTypeImpl zusatzparametergruppeType = new ZusatzparametergruppeTypeImpl();
		return zusatzparametergruppeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZustimmungAbrufOderWeitergabeType createZustimmungAbrufOderWeitergabeType() {
		ZustimmungAbrufOderWeitergabeTypeImpl zustimmungAbrufOderWeitergabeType = new ZustimmungAbrufOderWeitergabeTypeImpl();
		return zustimmungAbrufOderWeitergabeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anrede createAnredeFromString(EDataType eDataType, String initialValue) {
		Anrede result = Anrede.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnredeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artabruf createArtabrufFromString(EDataType eDataType, String initialValue) {
		Artabruf result = Artabruf.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtabrufToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artnachweis createArtnachweisFromString(EDataType eDataType, String initialValue) {
		Artnachweis result = Artnachweis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtnachweisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aufenthaltsstatus createAufenthaltsstatusFromString(EDataType eDataType, String initialValue) {
		Aufenthaltsstatus result = Aufenthaltsstatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAufenthaltsstatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eigenschaft createEigenschaftFromString(EDataType eDataType, String initialValue) {
		Eigenschaft result = Eigenschaft.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEigenschaftToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkommensarten createEinkommensartenFromString(EDataType eDataType, String initialValue) {
		Einkommensarten result = Einkommensarten.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkommensartenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Familienstand createFamilienstandFromString(EDataType eDataType, String initialValue) {
		Familienstand result = Familienstand.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilienstandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geschlecht createGeschlechtFromString(EDataType eDataType, String initialValue) {
		Geschlecht result = Geschlecht.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeschlechtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kindschaftsbeziehung createKindschaftsbeziehungFromString(EDataType eDataType, String initialValue) {
		Kindschaftsbeziehung result = Kindschaftsbeziehung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindschaftsbeziehungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kindwohnhaftbei createKindwohnhaftbeiFromString(EDataType eDataType, String initialValue) {
		Kindwohnhaftbei result = Kindwohnhaftbei.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindwohnhaftbeiToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leistungserhalt createLeistungserhaltFromString(EDataType eDataType, String initialValue) {
		Leistungserhalt result = Leistungserhalt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeistungserhaltToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leistungsgewaehrung createLeistungsgewaehrungFromString(EDataType eDataType, String initialValue) {
		Leistungsgewaehrung result = Leistungsgewaehrung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeistungsgewaehrungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nachrichtentyp createNachrichtentypFromString(EDataType eDataType, String initialValue) {
		Nachrichtentyp result = Nachrichtentyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNachrichtentypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nachweisbezug createNachweisbezugFromString(EDataType eDataType, String initialValue) {
		Nachweisbezug result = Nachweisbezug.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNachweisbezugToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personensorgerecht createPersonensorgerechtFromString(EDataType eDataType, String initialValue) {
		Personensorgerecht result = Personensorgerecht.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonensorgerechtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sonderstatus createSonderstatusFromString(EDataType eDataType, String initialValue) {
		Sonderstatus result = Sonderstatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSonderstatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sonstigeleistungen createSonstigeleistungenFromString(EDataType eDataType, String initialValue) {
		Sonstigeleistungen result = Sonstigeleistungen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSonstigeleistungenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statusdatenabruf createStatusdatenabrufFromString(EDataType eDataType, String initialValue) {
		Statusdatenabruf result = Statusdatenabruf.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusdatenabrufToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tatsachenbehauptung createTatsachenbehauptungFromString(EDataType eDataType, String initialValue) {
		Tatsachenbehauptung result = Tatsachenbehauptung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTatsachenbehauptungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertrauensniveau createVertrauensniveauFromString(EDataType eDataType, String initialValue) {
		Vertrauensniveau result = Vertrauensniveau.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVertrauensniveauToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertretung createVertretungFromString(EDataType eDataType, String initialValue) {
		Vertretung result = Vertretung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVertretungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wohnsitz createWohnsitzFromString(EDataType eDataType, String initialValue) {
		Wohnsitz result = Wohnsitz.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWohnsitzToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zuschuesse createZuschuesseFromString(EDataType eDataType, String initialValue) {
		Zuschuesse result = Zuschuesse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZuschuesseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anrede createAnredeObjectFromString(EDataType eDataType, String initialValue) {
		return createAnredeFromString(BaukastenPackage.Literals.ANREDE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnredeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnredeToString(BaukastenPackage.Literals.ANREDE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artabruf createArtabrufObjectFromString(EDataType eDataType, String initialValue) {
		return createArtabrufFromString(BaukastenPackage.Literals.ARTABRUF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtabrufObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtabrufToString(BaukastenPackage.Literals.ARTABRUF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artnachweis createArtnachweisObjectFromString(EDataType eDataType, String initialValue) {
		return createArtnachweisFromString(BaukastenPackage.Literals.ARTNACHWEIS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtnachweisObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtnachweisToString(BaukastenPackage.Literals.ARTNACHWEIS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aufenthaltsstatus createAufenthaltsstatusObjectFromString(EDataType eDataType, String initialValue) {
		return createAufenthaltsstatusFromString(BaukastenPackage.Literals.AUFENTHALTSSTATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAufenthaltsstatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAufenthaltsstatusToString(BaukastenPackage.Literals.AUFENTHALTSSTATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eigenschaft createEigenschaftObjectFromString(EDataType eDataType, String initialValue) {
		return createEigenschaftFromString(BaukastenPackage.Literals.EIGENSCHAFT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEigenschaftObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEigenschaftToString(BaukastenPackage.Literals.EIGENSCHAFT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkommensarten createEinkommensartenObjectFromString(EDataType eDataType, String initialValue) {
		return createEinkommensartenFromString(BaukastenPackage.Literals.EINKOMMENSARTEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkommensartenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEinkommensartenToString(BaukastenPackage.Literals.EINKOMMENSARTEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Familienstand createFamilienstandObjectFromString(EDataType eDataType, String initialValue) {
		return createFamilienstandFromString(BaukastenPackage.Literals.FAMILIENSTAND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilienstandObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFamilienstandToString(BaukastenPackage.Literals.FAMILIENSTAND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geschlecht createGeschlechtObjectFromString(EDataType eDataType, String initialValue) {
		return createGeschlechtFromString(BaukastenPackage.Literals.GESCHLECHT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeschlechtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGeschlechtToString(BaukastenPackage.Literals.GESCHLECHT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createJahrMonatTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJahrMonatTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createJahrTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJahrTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kindschaftsbeziehung createKindschaftsbeziehungObjectFromString(EDataType eDataType, String initialValue) {
		return createKindschaftsbeziehungFromString(BaukastenPackage.Literals.KINDSCHAFTSBEZIEHUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindschaftsbeziehungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindschaftsbeziehungToString(BaukastenPackage.Literals.KINDSCHAFTSBEZIEHUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kindwohnhaftbei createKindwohnhaftbeiObjectFromString(EDataType eDataType, String initialValue) {
		return createKindwohnhaftbeiFromString(BaukastenPackage.Literals.KINDWOHNHAFTBEI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindwohnhaftbeiObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindwohnhaftbeiToString(BaukastenPackage.Literals.KINDWOHNHAFTBEI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKrankenversichertennummerTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKrankenversichertennummerTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leistungserhalt createLeistungserhaltObjectFromString(EDataType eDataType, String initialValue) {
		return createLeistungserhaltFromString(BaukastenPackage.Literals.LEISTUNGSERHALT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeistungserhaltObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLeistungserhaltToString(BaukastenPackage.Literals.LEISTUNGSERHALT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leistungsgewaehrung createLeistungsgewaehrungObjectFromString(EDataType eDataType, String initialValue) {
		return createLeistungsgewaehrungFromString(BaukastenPackage.Literals.LEISTUNGSGEWAEHRUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeistungsgewaehrungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLeistungsgewaehrungToString(BaukastenPackage.Literals.LEISTUNGSGEWAEHRUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftHausnummerBuchstabeZusatzzifferTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftHausnummerBuchstabeZusatzzifferTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftHausnummerTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftHausnummerTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftPostleitzahlTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftPostleitzahlTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftStockwerkswohnungsnummerTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftStockwerkswohnungsnummerTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftStrasseTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftStrasseTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftTeilnummerDerHausnummerTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftTeilnummerDerHausnummerTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftWohnortFruehererGemeindenameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftWohnortFruehererGemeindenameTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftWohnortTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftWohnortTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftWohnungsinhaberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftWohnungsinhaberTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMeldeanschriftZusatzangabenTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeldeanschriftZusatzangabenTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nachrichtentyp createNachrichtentypObjectFromString(EDataType eDataType, String initialValue) {
		return createNachrichtentypFromString(BaukastenPackage.Literals.NACHRICHTENTYP, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNachrichtentypObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNachrichtentypToString(BaukastenPackage.Literals.NACHRICHTENTYP, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nachweisbezug createNachweisbezugObjectFromString(EDataType eDataType, String initialValue) {
		return createNachweisbezugFromString(BaukastenPackage.Literals.NACHWEISBEZUG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNachweisbezugObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNachweisbezugToString(BaukastenPackage.Literals.NACHWEISBEZUG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personensorgerecht createPersonensorgerechtObjectFromString(EDataType eDataType, String initialValue) {
		return createPersonensorgerechtFromString(BaukastenPackage.Literals.PERSONENSORGERECHT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonensorgerechtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersonensorgerechtToString(BaukastenPackage.Literals.PERSONENSORGERECHT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sonderstatus createSonderstatusObjectFromString(EDataType eDataType, String initialValue) {
		return createSonderstatusFromString(BaukastenPackage.Literals.SONDERSTATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSonderstatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSonderstatusToString(BaukastenPackage.Literals.SONDERSTATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sonstigeleistungen createSonstigeleistungenObjectFromString(EDataType eDataType, String initialValue) {
		return createSonstigeleistungenFromString(BaukastenPackage.Literals.SONSTIGELEISTUNGEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSonstigeleistungenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSonstigeleistungenToString(BaukastenPackage.Literals.SONSTIGELEISTUNGEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statusdatenabruf createStatusdatenabrufObjectFromString(EDataType eDataType, String initialValue) {
		return createStatusdatenabrufFromString(BaukastenPackage.Literals.STATUSDATENABRUF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusdatenabrufObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusdatenabrufToString(BaukastenPackage.Literals.STATUSDATENABRUF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSteuerlicheIdentifikationsnummerTypeFromString(EDataType eDataType, String initialValue) {
		return (String)DIN913792204Factory.eINSTANCE.createFromString(DIN913792204Package.Literals.DATATYPE_C, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSteuerlicheIdentifikationsnummerTypeToString(EDataType eDataType, Object instanceValue) {
		return DIN913792204Factory.eINSTANCE.convertToString(DIN913792204Package.Literals.DATATYPE_C, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTagesdatumTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTagesdatumTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tatsachenbehauptung createTatsachenbehauptungObjectFromString(EDataType eDataType, String initialValue) {
		return createTatsachenbehauptungFromString(BaukastenPackage.Literals.TATSACHENBEHAUPTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTatsachenbehauptungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTatsachenbehauptungToString(BaukastenPackage.Literals.TATSACHENBEHAUPTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUUIDTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertrauensniveau createVertrauensniveauObjectFromString(EDataType eDataType, String initialValue) {
		return createVertrauensniveauFromString(BaukastenPackage.Literals.VERTRAUENSNIVEAU, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVertrauensniveauObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVertrauensniveauToString(BaukastenPackage.Literals.VERTRAUENSNIVEAU, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertretung createVertretungObjectFromString(EDataType eDataType, String initialValue) {
		return createVertretungFromString(BaukastenPackage.Literals.VERTRETUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVertretungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVertretungToString(BaukastenPackage.Literals.VERTRETUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wohnsitz createWohnsitzObjectFromString(EDataType eDataType, String initialValue) {
		return createWohnsitzFromString(BaukastenPackage.Literals.WOHNSITZ, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWohnsitzObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWohnsitzToString(BaukastenPackage.Literals.WOHNSITZ, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zuschuesse createZuschuesseObjectFromString(EDataType eDataType, String initialValue) {
		return createZuschuesseFromString(BaukastenPackage.Literals.ZUSCHUESSE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZuschuesseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertZuschuesseToString(BaukastenPackage.Literals.ZUSCHUESSE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaukastenPackage getBaukastenPackage() {
		return (BaukastenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BaukastenPackage getPackage() {
		return BaukastenPackage.eINSTANCE;
	}

} //BaukastenFactoryImpl
