/*
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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage
 * @generated
 */
@ProviderType
public interface BaukastenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaukastenFactory eINSTANCE = de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Allgemeiner Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allgemeiner Name Type</em>'.
	 * @generated
	 */
	AllgemeinerNameType createAllgemeinerNameType();

	/**
	 * Returns a new object of class '<em>Antragsnachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Antragsnachricht Type</em>'.
	 * @generated
	 */
	AntragsnachrichtType createAntragsnachrichtType();

	/**
	 * Returns a new object of class '<em>Aufenthaltstitel Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aufenthaltstitel Nachweisbezug Type</em>'.
	 * @generated
	 */
	AufenthaltstitelNachweisbezugType createAufenthaltstitelNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Auslandsanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auslandsanschrift Type</em>'.
	 * @generated
	 */
	AuslandsanschriftType createAuslandsanschriftType();

	/**
	 * Returns a new object of class '<em>Bankverbindung IBAN Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bankverbindung IBAN Optional Type</em>'.
	 * @generated
	 */
	BankverbindungIBANOptionalType createBankverbindungIBANOptionalType();

	/**
	 * Returns a new object of class '<em>Bankverbindung Inhaber Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bankverbindung Inhaber Optional Type</em>'.
	 * @generated
	 */
	BankverbindungInhaberOptionalType createBankverbindungInhaberOptionalType();

	/**
	 * Returns a new object of class '<em>Bankverbindung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bankverbindung Type</em>'.
	 * @generated
	 */
	BankverbindungType createBankverbindungType();

	/**
	 * Returns a new object of class '<em>Behoerdenkennung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behoerdenkennung Type</em>'.
	 * @generated
	 */
	BehoerdenkennungType createBehoerdenkennungType();

	/**
	 * Returns a new object of class '<em>Code Anrede Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Anrede Type</em>'.
	 * @generated
	 */
	CodeAnredeType createCodeAnredeType();

	/**
	 * Returns a new object of class '<em>Code Art Abruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Art Abruf Type</em>'.
	 * @generated
	 */
	CodeArtAbrufType createCodeArtAbrufType();

	/**
	 * Returns a new object of class '<em>Code Aufenthaltsstatus Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Aufenthaltsstatus Type</em>'.
	 * @generated
	 */
	CodeAufenthaltsstatusType createCodeAufenthaltsstatusType();

	/**
	 * Returns a new object of class '<em>Code Bundesland Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Bundesland Type</em>'.
	 * @generated
	 */
	CodeBundeslandType createCodeBundeslandType();

	/**
	 * Returns a new object of class '<em>Code Eigenschaft Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Eigenschaft Type</em>'.
	 * @generated
	 */
	CodeEigenschaftType createCodeEigenschaftType();

	/**
	 * Returns a new object of class '<em>Code Einkommensarten Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Einkommensarten Type</em>'.
	 * @generated
	 */
	CodeEinkommensartenType createCodeEinkommensartenType();

	/**
	 * Returns a new object of class '<em>Code Erreichbarkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Erreichbarkeit Type</em>'.
	 * @generated
	 */
	CodeErreichbarkeitType createCodeErreichbarkeitType();

	/**
	 * Returns a new object of class '<em>Code Familienstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Familienstand Type</em>'.
	 * @generated
	 */
	CodeFamilienstandType createCodeFamilienstandType();

	/**
	 * Returns a new object of class '<em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>'.
	 * @generated
	 */
	CodeGemeindeVZAmtlicherGemeindeschluesselType createCodeGemeindeVZAmtlicherGemeindeschluesselType();

	/**
	 * Returns a new object of class '<em>Code Gemeinde VZ Regionalschluessel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Gemeinde VZ Regionalschluessel Type</em>'.
	 * @generated
	 */
	CodeGemeindeVZRegionalschluesselType createCodeGemeindeVZRegionalschluesselType();

	/**
	 * Returns a new object of class '<em>Code Geschlecht Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Geschlecht Type</em>'.
	 * @generated
	 */
	CodeGeschlechtType createCodeGeschlechtType();

	/**
	 * Returns a new object of class '<em>Code Kindschaftsbeziehung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Kindschaftsbeziehung Type</em>'.
	 * @generated
	 */
	CodeKindschaftsbeziehungType createCodeKindschaftsbeziehungType();

	/**
	 * Returns a new object of class '<em>Code Kind Wohnhaft Bei Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Kind Wohnhaft Bei Type</em>'.
	 * @generated
	 */
	CodeKindWohnhaftBeiType createCodeKindWohnhaftBeiType();

	/**
	 * Returns a new object of class '<em>Code Leistungserhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Leistungserhalt Type</em>'.
	 * @generated
	 */
	CodeLeistungserhaltType createCodeLeistungserhaltType();

	/**
	 * Returns a new object of class '<em>Code Leistungsgewaehrung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Leistungsgewaehrung Type</em>'.
	 * @generated
	 */
	CodeLeistungsgewaehrungType createCodeLeistungsgewaehrungType();

	/**
	 * Returns a new object of class '<em>Code Nachrichtentyp Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Nachrichtentyp Type</em>'.
	 * @generated
	 */
	CodeNachrichtentypType createCodeNachrichtentypType();

	/**
	 * Returns a new object of class '<em>Code Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Nachweisbezug Type</em>'.
	 * @generated
	 */
	CodeNachweisbezugType createCodeNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Code Personensorgerecht Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Personensorgerecht Type</em>'.
	 * @generated
	 */
	CodePersonensorgerechtType createCodePersonensorgerechtType();

	/**
	 * Returns a new object of class '<em>Code Praefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Praefix Type</em>'.
	 * @generated
	 */
	CodePraefixType createCodePraefixType();

	/**
	 * Returns a new object of class '<em>Code Sonderstatus Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Sonderstatus Type</em>'.
	 * @generated
	 */
	CodeSonderstatusType createCodeSonderstatusType();

	/**
	 * Returns a new object of class '<em>Code Sonstige Leistungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Sonstige Leistungen Type</em>'.
	 * @generated
	 */
	CodeSonstigeLeistungenType createCodeSonstigeLeistungenType();

	/**
	 * Returns a new object of class '<em>Code Staatsangehoerigkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Staatsangehoerigkeit Type</em>'.
	 * @generated
	 */
	CodeStaatsangehoerigkeitType createCodeStaatsangehoerigkeitType();

	/**
	 * Returns a new object of class '<em>Code Staat Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Staat Type</em>'.
	 * @generated
	 */
	CodeStaatType createCodeStaatType();

	/**
	 * Returns a new object of class '<em>Code Standesamtnummern Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Standesamtnummern Type</em>'.
	 * @generated
	 */
	CodeStandesamtnummernType createCodeStandesamtnummernType();

	/**
	 * Returns a new object of class '<em>Code Status Datenabruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Status Datenabruf Type</em>'.
	 * @generated
	 */
	CodeStatusDatenabrufType createCodeStatusDatenabrufType();

	/**
	 * Returns a new object of class '<em>Code Tatsachenbehauptung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Tatsachenbehauptung Type</em>'.
	 * @generated
	 */
	CodeTatsachenbehauptungType createCodeTatsachenbehauptungType();

	/**
	 * Returns a new object of class '<em>Code Vermoegensart Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Vermoegensart Type</em>'.
	 * @generated
	 */
	CodeVermoegensartType createCodeVermoegensartType();

	/**
	 * Returns a new object of class '<em>Code Vertrauensniveau Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Vertrauensniveau Type</em>'.
	 * @generated
	 */
	CodeVertrauensniveauType createCodeVertrauensniveauType();

	/**
	 * Returns a new object of class '<em>Code Vertretung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Vertretung Type</em>'.
	 * @generated
	 */
	CodeVertretungType createCodeVertretungType();

	/**
	 * Returns a new object of class '<em>Code Wohnsitz Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Wohnsitz Type</em>'.
	 * @generated
	 */
	CodeWohnsitzType createCodeWohnsitzType();

	/**
	 * Returns a new object of class '<em>Code Zuschuesse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Zuschuesse Type</em>'.
	 * @generated
	 */
	CodeZuschuesseType createCodeZuschuesseType();

	/**
	 * Returns a new object of class '<em>Datenabruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenabruf Type</em>'.
	 * @generated
	 */
	DatenabrufType createDatenabrufType();

	/**
	 * Returns a new object of class '<em>Datenschutzerklaerungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenschutzerklaerungen Type</em>'.
	 * @generated
	 */
	DatenschutzerklaerungenType createDatenschutzerklaerungenType();

	/**
	 * Returns a new object of class '<em>Entgeltdaten Arbeitgeber Dsrv Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entgeltdaten Arbeitgeber Dsrv Type</em>'.
	 * @generated
	 */
	EntgeltdatenArbeitgeberDsrvType createEntgeltdatenArbeitgeberDsrvType();

	/**
	 * Returns a new object of class '<em>Entgeltdaten Dsrv Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entgeltdaten Dsrv Nachweisbezug Type</em>'.
	 * @generated
	 */
	EntgeltdatenDsrvNachweisbezugType createEntgeltdatenDsrvNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Erreichbarkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Erreichbarkeit Type</em>'.
	 * @generated
	 */
	ErreichbarkeitType createErreichbarkeitType();

	/**
	 * Returns a new object of class '<em>Familienname Unstrukturiert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Familienname Unstrukturiert Type</em>'.
	 * @generated
	 */
	FamiliennameUnstrukturiertType createFamiliennameUnstrukturiertType();

	/**
	 * Returns a new object of class '<em>Familienstand Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Familienstand Nachweisbezug Type</em>'.
	 * @generated
	 */
	FamilienstandNachweisbezugType createFamilienstandNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Familienstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Familienstand Type</em>'.
	 * @generated
	 */
	FamilienstandType createFamilienstandType();

	/**
	 * Returns a new object of class '<em>Feldgruppe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feldgruppe Type</em>'.
	 * @generated
	 */
	FeldgruppeType createFeldgruppeType();

	/**
	 * Returns a new object of class '<em>Feld Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feld Type</em>'.
	 * @generated
	 */
	FeldType createFeldType();

	/**
	 * Returns a new object of class '<em>Geburt Geburtsort Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geburt Geburtsort Optional Type</em>'.
	 * @generated
	 */
	GeburtGeburtsortOptionalType createGeburtGeburtsortOptionalType();

	/**
	 * Returns a new object of class '<em>Geburt Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geburt Nachweisbezug Type</em>'.
	 * @generated
	 */
	GeburtNachweisbezugType createGeburtNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Geburt Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geburt Optional Type</em>'.
	 * @generated
	 */
	GeburtOptionalType createGeburtOptionalType();

	/**
	 * Returns a new object of class '<em>Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geburt Type</em>'.
	 * @generated
	 */
	GeburtType createGeburtType();

	/**
	 * Returns a new object of class '<em>Hausnummern Bis Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hausnummern Bis Type</em>'.
	 * @generated
	 */
	HausnummernBisType createHausnummernBisType();

	/**
	 * Returns a new object of class '<em>Identifikation Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifikation Nachricht Type</em>'.
	 * @generated
	 */
	IdentifikationNachrichtType createIdentifikationNachrichtType();

	/**
	 * Returns a new object of class '<em>Kommunikationspartner Erreichbar Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kommunikationspartner Erreichbar Type</em>'.
	 * @generated
	 */
	KommunikationspartnerErreichbarType createKommunikationspartnerErreichbarType();

	/**
	 * Returns a new object of class '<em>Kommunikationspartner Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kommunikationspartner Type</em>'.
	 * @generated
	 */
	KommunikationspartnerType createKommunikationspartnerType();

	/**
	 * Returns a new object of class '<em>Meldeanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meldeanschrift Type</em>'.
	 * @generated
	 */
	MeldeanschriftType createMeldeanschriftType();

	/**
	 * Returns a new object of class '<em>Nachrichtenkopf Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nachrichtenkopf Type</em>'.
	 * @generated
	 */
	NachrichtenkopfType createNachrichtenkopfType();

	/**
	 * Returns a new object of class '<em>Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nachricht Type</em>'.
	 * @generated
	 */
	NachrichtType createNachrichtType();

	/**
	 * Returns a new object of class '<em>Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nachweisbezug Type</em>'.
	 * @generated
	 */
	NachweisbezugType createNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Nachweisdokument Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nachweisdokument Type</em>'.
	 * @generated
	 */
	NachweisdokumentType createNachweisdokumentType();

	/**
	 * Returns a new object of class '<em>Name Natuerliche Person Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Natuerliche Person Nachweisbezug Type</em>'.
	 * @generated
	 */
	NameNatuerlichePersonNachweisbezugType createNameNatuerlichePersonNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Name Natuerliche Person Ohne Geburtsname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Natuerliche Person Ohne Geburtsname Type</em>'.
	 * @generated
	 */
	NameNatuerlichePersonOhneGeburtsnameType createNameNatuerlichePersonOhneGeburtsnameType();

	/**
	 * Returns a new object of class '<em>Name Natuerliche Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Natuerliche Person Type</em>'.
	 * @generated
	 */
	NameNatuerlichePersonType createNameNatuerlichePersonType();

	/**
	 * Returns a new object of class '<em>Name Natuerliche Person Vorname Verpflichtend Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Natuerliche Person Vorname Verpflichtend Type</em>'.
	 * @generated
	 */
	NameNatuerlichePersonVornameVerpflichtendType createNameNatuerlichePersonVornameVerpflichtendType();

	/**
	 * Returns a new object of class '<em>Nutzerkonto Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutzerkonto Type</em>'.
	 * @generated
	 */
	NutzerkontoType createNutzerkontoType();

	/**
	 * Returns a new object of class '<em>Postalische Inlandsanschrift Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postalische Inlandsanschrift Basis Type</em>'.
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType createPostalischeInlandsanschriftBasisType();

	/**
	 * Returns a new object of class '<em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>'.
	 * @generated
	 */
	PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType createPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>'.
	 * @generated
	 */
	PostalischeInlandsanschriftGebaeudeanschriftType createPostalischeInlandsanschriftGebaeudeanschriftType();

	/**
	 * Returns a new object of class '<em>Postalische Inlandsanschrift Postfachanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postalische Inlandsanschrift Postfachanschrift Type</em>'.
	 * @generated
	 */
	PostalischeInlandsanschriftPostfachanschriftType createPostalischeInlandsanschriftPostfachanschriftType();

	/**
	 * Returns a new object of class '<em>Postalische Inlandsanschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postalische Inlandsanschrift Type</em>'.
	 * @generated
	 */
	PostalischeInlandsanschriftType createPostalischeInlandsanschriftType();

	/**
	 * Returns a new object of class '<em>Postkorb Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postkorb Handle Type</em>'.
	 * @generated
	 */
	PostkorbHandleType createPostkorbHandleType();

	/**
	 * Returns a new object of class '<em>Staatsangehoerigkeiten Nachweisbezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staatsangehoerigkeiten Nachweisbezug Type</em>'.
	 * @generated
	 */
	StaatsangehoerigkeitenNachweisbezugType createStaatsangehoerigkeitenNachweisbezugType();

	/**
	 * Returns a new object of class '<em>Status Datenabruf Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Datenabruf Type</em>'.
	 * @generated
	 */
	StatusDatenabrufType createStatusDatenabrufType();

	/**
	 * Returns a new object of class '<em>Tatsache Mit Freitext Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tatsache Mit Freitext Type</em>'.
	 * @generated
	 */
	TatsacheMitFreitextType createTatsacheMitFreitextType();

	/**
	 * Returns a new object of class '<em>Tatsache Mit Nachweis Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tatsache Mit Nachweis Type</em>'.
	 * @generated
	 */
	TatsacheMitNachweisType createTatsacheMitNachweisType();

	/**
	 * Returns a new object of class '<em>Tatsache Mit Zeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tatsache Mit Zeitraum Type</em>'.
	 * @generated
	 */
	TatsacheMitZeitraumType createTatsacheMitZeitraumType();

	/**
	 * Returns a new object of class '<em>Teilbekanntes Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teilbekanntes Datum Type</em>'.
	 * @generated
	 */
	TeilbekanntesDatumType createTeilbekanntesDatumType();

	/**
	 * Returns a new object of class '<em>Terminwunsch Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminwunsch Type</em>'.
	 * @generated
	 */
	TerminwunschType createTerminwunschType();

	/**
	 * Returns a new object of class '<em>Zeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zeitraum Type</em>'.
	 * @generated
	 */
	ZeitraumType createZeitraumType();

	/**
	 * Returns a new object of class '<em>Zusatzparametergruppe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zusatzparametergruppe Type</em>'.
	 * @generated
	 */
	ZusatzparametergruppeType createZusatzparametergruppeType();

	/**
	 * Returns a new object of class '<em>Zustimmung Abruf Oder Weitergabe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zustimmung Abruf Oder Weitergabe Type</em>'.
	 * @generated
	 */
	ZustimmungAbrufOderWeitergabeType createZustimmungAbrufOderWeitergabeType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BaukastenPackage getBaukastenPackage();

} //BaukastenFactory
