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

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl;

import de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType;
import de.xoev.xfamilie.baukasten._1.baukasten.Anrede;
import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.Artabruf;
import de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis;
import de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus;
import de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenFactory;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeAnredeType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeArtAbrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeEigenschaftType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeEinkommensartenType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZAmtlicherGemeindeschluesselType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZRegionalschluesselType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungserhaltType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungsgewaehrungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeNachrichtentypType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodePraefixType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeSonderstatusType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeSonstigeLeistungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStandesamtnummernType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStatusDatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeVermoegensartType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeVertrauensniveauType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeVertretungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeWohnsitzType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft;
import de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten;
import de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType;
import de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType;
import de.xoev.xfamilie.baukasten._1.baukasten.Familienstand;
import de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType;
import de.xoev.xfamilie.baukasten._1.baukasten.FeldType;
import de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht;
import de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType;
import de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung;
import de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei;
import de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerErreichbarType;
import de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType;
import de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt;
import de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType;
import de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp;
import de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType;
import de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType;
import de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus;
import de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen;
import de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType;
import de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;
import de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType;
import de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau;
import de.xoev.xfamilie.baukasten._1.baukasten.Vertretung;
import de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType;
import de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse;
import de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType;

import de.xoev.xfamilie.baukasten._1.baukasten.util.BaukastenValidator;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl;

import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;

import de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl;

import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

import de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaukastenPackageImpl extends EPackageImpl implements BaukastenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeinerNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragsnachrichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufenthaltstitelNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auslandsanschriftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankverbindungIBANOptionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankverbindungInhaberOptionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankverbindungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behoerdenkennungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAnredeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeArtAbrufTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAufenthaltsstatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBundeslandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEigenschaftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEinkommensartenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeErreichbarkeitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeFamilienstandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeGemeindeVZAmtlicherGemeindeschluesselTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeGemeindeVZRegionalschluesselTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeGeschlechtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeKindschaftsbeziehungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeKindWohnhaftBeiTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeLeistungserhaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeLeistungsgewaehrungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeNachrichtentypTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codePersonensorgerechtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codePraefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSonderstatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSonstigeLeistungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeStaatsangehoerigkeitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeStaatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeStandesamtnummernTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeStatusDatenabrufTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTatsachenbehauptungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeVermoegensartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeVertrauensniveauTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeVertretungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeWohnsitzTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeZuschuesseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenabrufTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenschutzerklaerungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entgeltdatenArbeitgeberDsrvTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entgeltdatenDsrvNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erreichbarkeitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familiennameUnstrukturiertTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familienstandNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familienstandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feldgruppeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geburtGeburtsortOptionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geburtNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geburtOptionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hausnummernBisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifikationNachrichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kommunikationspartnerErreichbarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kommunikationspartnerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meldeanschriftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtenkopfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweisdokumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameNatuerlichePersonNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameNatuerlichePersonOhneGeburtsnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameNatuerlichePersonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameNatuerlichePersonVornameVerpflichtendTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutzerkontoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalischeInlandsanschriftBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalischeInlandsanschriftGebaeudeanschriftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalischeInlandsanschriftPostfachanschriftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalischeInlandsanschriftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postkorbHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staatsangehoerigkeitenNachweisbezugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusDatenabrufTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tatsacheMitFreitextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tatsacheMitNachweisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tatsacheMitZeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teilbekanntesDatumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminwunschTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zusatzparametergruppeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zustimmungAbrufOderWeitergabeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anredeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artabrufEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artnachweisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aufenthaltsstatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eigenschaftEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum einkommensartenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familienstandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geschlechtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindschaftsbeziehungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindwohnhaftbeiEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leistungserhaltEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leistungsgewaehrungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nachrichtentypEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nachweisbezugEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personensorgerechtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sonderstatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sonstigeleistungenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusdatenabrufEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tatsachenbehauptungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vertrauensniveauEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vertretungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wohnsitzEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum zuschuesseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anredeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artabrufObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artnachweisObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aufenthaltsstatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eigenschaftObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType einkommensartenObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType familienstandObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geschlechtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jahrMonatTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jahrTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindschaftsbeziehungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindwohnhaftbeiObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType krankenversichertennummerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leistungserhaltObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leistungsgewaehrungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftHausnummerBuchstabeZusatzzifferTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftHausnummerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftPostleitzahlTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftStockwerkswohnungsnummerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftStrasseTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftTeilnummerDerHausnummerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftWohnortFruehererGemeindenameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftWohnortTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftWohnungsinhaberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meldeanschriftZusatzangabenTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nachrichtentypObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nachweisbezugObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType personensorgerechtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sonderstatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sonstigeleistungenObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusdatenabrufObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType steuerlicheIdentifikationsnummerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tagesdatumTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tatsachenbehauptungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vertrauensniveauObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vertretungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wohnsitzObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zuschuesseObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BaukastenPackageImpl() {
		super(eNS_URI, BaukastenFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BaukastenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BaukastenPackage init() {
		if (isInited) return (BaukastenPackage)EPackage.Registry.INSTANCE.getEPackage(BaukastenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBaukastenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BaukastenPackageImpl theBaukastenPackage = registeredBaukastenPackage instanceof BaukastenPackageImpl ? (BaukastenPackageImpl)registeredBaukastenPackage : new BaukastenPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913792204Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdoptionPackage.eNS_URI);
		AdoptionPackageImpl theAdoptionPackage = (AdoptionPackageImpl)(registeredPackage instanceof AdoptionPackageImpl ? registeredPackage : AdoptionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllgemeineNachrichtenPackage.eNS_URI);
		AllgemeineNachrichtenPackageImpl theAllgemeineNachrichtenPackage = (AllgemeineNachrichtenPackageImpl)(registeredPackage instanceof AllgemeineNachrichtenPackageImpl ? registeredPackage : AllgemeineNachrichtenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BeistandschaftPackage.eNS_URI);
		BeistandschaftPackageImpl theBeistandschaftPackage = (BeistandschaftPackageImpl)(registeredPackage instanceof BeistandschaftPackageImpl ? registeredPackage : BeistandschaftPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DSRVPackage.eNS_URI);
		DSRVPackageImpl theDSRVPackage = (DSRVPackageImpl)(registeredPackage instanceof DSRVPackageImpl ? registeredPackage : DSRVPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI);
		ElterngeldPackageImpl theElterngeldPackage = (ElterngeldPackageImpl)(registeredPackage instanceof ElterngeldPackageImpl ? registeredPackage : ElterngeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeburtPackage.eNS_URI);
		GeburtPackageImpl theGeburtPackage = (GeburtPackageImpl)(registeredPackage instanceof GeburtPackageImpl ? registeredPackage : GeburtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ErziehungshilfePackage.eNS_URI);
		ErziehungshilfePackageImpl theErziehungshilfePackage = (ErziehungshilfePackageImpl)(registeredPackage instanceof ErziehungshilfePackageImpl ? registeredPackage : ErziehungshilfePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KinderwunschPackage.eNS_URI);
		KinderwunschPackageImpl theKinderwunschPackage = (KinderwunschPackageImpl)(registeredPackage instanceof KinderwunschPackageImpl ? registeredPackage : KinderwunschPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MutterschaftsgeldPackage.eNS_URI);
		MutterschaftsgeldPackageImpl theMutterschaftsgeldPackage = (MutterschaftsgeldPackageImpl)(registeredPackage instanceof MutterschaftsgeldPackageImpl ? registeredPackage : MutterschaftsgeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI);
		UnterhaltsvorschussPackageImpl theUnterhaltsvorschussPackage = (UnterhaltsvorschussPackageImpl)(registeredPackage instanceof UnterhaltsvorschussPackageImpl ? registeredPackage : UnterhaltsvorschussPackage.eINSTANCE);

		// Load packages
		theElterngeldPackage.loadPackage();
		theUnterhaltsvorschussPackage.loadPackage();

		// Create package meta-data objects
		theBaukastenPackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theBaukastenPackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBaukastenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BaukastenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBaukastenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BaukastenPackage.eNS_URI, theBaukastenPackage);
		return theBaukastenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeinerNameType() {
		return allgemeinerNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeinerNameType_Name() {
		return (EAttribute)allgemeinerNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeinerNameType_NichtVorhanden() {
		return (EAttribute)allgemeinerNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragsnachrichtType() {
		return antragsnachrichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragsnachrichtType_ZeitstempelAntragsstellung() {
		return (EAttribute)antragsnachrichtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragsnachrichtType_Transaktionsid() {
		return (EAttribute)antragsnachrichtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufenthaltstitelNachweisbezugType() {
		return aufenthaltstitelNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufenthaltstitelNachweisbezugType_Dokumenttyp() {
		return (EAttribute)aufenthaltstitelNachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufenthaltstitelNachweisbezugType_Nebenbestimmungen() {
		return (EAttribute)aufenthaltstitelNachweisbezugTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufenthaltstitelNachweisbezugType_Ablaufdatum() {
		return (EAttribute)aufenthaltstitelNachweisbezugTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAufenthaltstitelNachweisbezugType_Nachweisbezug() {
		return (EReference)aufenthaltstitelNachweisbezugTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuslandsanschriftType() {
		return auslandsanschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuslandsanschriftType_Staat() {
		return (EReference)auslandsanschriftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslandsanschriftType_Anschriftszeile() {
		return (EAttribute)auslandsanschriftTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBankverbindungIBANOptionalType() {
		return bankverbindungIBANOptionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBankverbindungIBANOptionalType_Inhaber() {
		return (EReference)bankverbindungIBANOptionalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungIBANOptionalType_Iban() {
		return (EAttribute)bankverbindungIBANOptionalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungIBANOptionalType_Bic() {
		return (EAttribute)bankverbindungIBANOptionalTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungIBANOptionalType_Institut() {
		return (EAttribute)bankverbindungIBANOptionalTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBankverbindungInhaberOptionalType() {
		return bankverbindungInhaberOptionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBankverbindungInhaberOptionalType_Inhaber() {
		return (EReference)bankverbindungInhaberOptionalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungInhaberOptionalType_Iban() {
		return (EAttribute)bankverbindungInhaberOptionalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungInhaberOptionalType_Bic() {
		return (EAttribute)bankverbindungInhaberOptionalTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungInhaberOptionalType_Institut() {
		return (EAttribute)bankverbindungInhaberOptionalTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBankverbindungType() {
		return bankverbindungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBankverbindungType_Inhaber() {
		return (EReference)bankverbindungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungType_Iban() {
		return (EAttribute)bankverbindungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungType_Bic() {
		return (EAttribute)bankverbindungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankverbindungType_Institut() {
		return (EAttribute)bankverbindungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehoerdenkennungType() {
		return behoerdenkennungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehoerdenkennungType_Praefix() {
		return (EReference)behoerdenkennungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehoerdenkennungType_Kennung() {
		return (EReference)behoerdenkennungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAnredeType() {
		return codeAnredeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeArtAbrufType() {
		return codeArtAbrufTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAufenthaltsstatusType() {
		return codeAufenthaltsstatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeBundeslandType() {
		return codeBundeslandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeEigenschaftType() {
		return codeEigenschaftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeEinkommensartenType() {
		return codeEinkommensartenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeErreichbarkeitType() {
		return codeErreichbarkeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeFamilienstandType() {
		return codeFamilienstandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeGemeindeVZAmtlicherGemeindeschluesselType() {
		return codeGemeindeVZAmtlicherGemeindeschluesselTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeGemeindeVZRegionalschluesselType() {
		return codeGemeindeVZRegionalschluesselTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeGeschlechtType() {
		return codeGeschlechtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeKindschaftsbeziehungType() {
		return codeKindschaftsbeziehungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeKindWohnhaftBeiType() {
		return codeKindWohnhaftBeiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeLeistungserhaltType() {
		return codeLeistungserhaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeLeistungsgewaehrungType() {
		return codeLeistungsgewaehrungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeNachrichtentypType() {
		return codeNachrichtentypTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeNachweisbezugType() {
		return codeNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodePersonensorgerechtType() {
		return codePersonensorgerechtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodePraefixType() {
		return codePraefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeSonderstatusType() {
		return codeSonderstatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeSonstigeLeistungenType() {
		return codeSonstigeLeistungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeStaatsangehoerigkeitType() {
		return codeStaatsangehoerigkeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeStaatType() {
		return codeStaatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeStandesamtnummernType() {
		return codeStandesamtnummernTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeStatusDatenabrufType() {
		return codeStatusDatenabrufTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeTatsachenbehauptungType() {
		return codeTatsachenbehauptungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeVermoegensartType() {
		return codeVermoegensartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeVertrauensniveauType() {
		return codeVertrauensniveauTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeVertretungType() {
		return codeVertretungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeWohnsitzType() {
		return codeWohnsitzTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeZuschuesseType() {
		return codeZuschuesseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenabrufType() {
		return datenabrufTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenabrufType_Id() {
		return (EAttribute)datenabrufTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenabrufType_Zeitstempel() {
		return (EAttribute)datenabrufTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenabrufType_Quelle() {
		return (EAttribute)datenabrufTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenabrufType_ArtDesAbrufs() {
		return (EAttribute)datenabrufTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenabrufType_AbgerufenFuer() {
		return (EAttribute)datenabrufTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenabrufType_StatusDatenabruf() {
		return (EReference)datenabrufTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenschutzerklaerungenType() {
		return datenschutzerklaerungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenschutzerklaerungenType_DsgvoBetreiber() {
		return (EAttribute)datenschutzerklaerungenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenschutzerklaerungenType_DsgvoNachnutzer() {
		return (EAttribute)datenschutzerklaerungenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntgeltdatenArbeitgeberDsrvType() {
		return entgeltdatenArbeitgeberDsrvTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntgeltdatenArbeitgeberDsrvType_AbfrageID() {
		return (EAttribute)entgeltdatenArbeitgeberDsrvTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntgeltdatenArbeitgeberDsrvType_IfdNrArbeitgeber() {
		return (EAttribute)entgeltdatenArbeitgeberDsrvTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntgeltdatenArbeitgeberDsrvType_AbrufergebnisDrv() {
		return (EReference)entgeltdatenArbeitgeberDsrvTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntgeltdatenDsrvNachweisbezugType() {
		return entgeltdatenDsrvNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntgeltdatenDsrvNachweisbezugType_Nachweisbezug() {
		return (EReference)entgeltdatenDsrvNachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntgeltdatenDsrvNachweisbezugType_ZeitraumVon() {
		return (EAttribute)entgeltdatenDsrvNachweisbezugTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntgeltdatenDsrvNachweisbezugType_ZeitraumBis() {
		return (EAttribute)entgeltdatenDsrvNachweisbezugTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntgeltdatenDsrvNachweisbezugType_EntgeltdatenArbeitgeber() {
		return (EReference)entgeltdatenDsrvNachweisbezugTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErreichbarkeitType() {
		return erreichbarkeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErreichbarkeitType_Kanal() {
		return (EReference)erreichbarkeitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErreichbarkeitType_Kennung() {
		return (EAttribute)erreichbarkeitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErreichbarkeitType_Zusatz() {
		return (EAttribute)erreichbarkeitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamiliennameUnstrukturiertType() {
		return familiennameUnstrukturiertTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamiliennameUnstrukturiertType_Nachname() {
		return (EReference)familiennameUnstrukturiertTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamiliennameUnstrukturiertType_Nachnamepass() {
		return (EReference)familiennameUnstrukturiertTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilienstandNachweisbezugType() {
		return familienstandNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilienstandNachweisbezugType_Nachweisbezug() {
		return (EReference)familienstandNachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilienstandType() {
		return familienstandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFamilienstandType_Seit() {
		return (EAttribute)familienstandTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilienstandType_Familienstand() {
		return (EReference)familienstandTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeldgruppeType() {
		return feldgruppeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldgruppeType_Name() {
		return (EAttribute)feldgruppeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeldgruppeType_Feld() {
		return (EReference)feldgruppeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeldgruppeType_Feldgruppe() {
		return (EReference)feldgruppeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldgruppeType_LaufendeNummer() {
		return (EAttribute)feldgruppeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeldType() {
		return feldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldType_Name() {
		return (EAttribute)feldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldType_Wert() {
		return (EAttribute)feldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldType_LaufendeNummer() {
		return (EAttribute)feldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtGeburtsortOptionalType() {
		return geburtGeburtsortOptionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeburtGeburtsortOptionalType_Geburtsort() {
		return (EAttribute)geburtGeburtsortOptionalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtGeburtsortOptionalType_GeburtsortStaat() {
		return (EReference)geburtGeburtsortOptionalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtGeburtsortOptionalType_Geburtsdatum() {
		return (EReference)geburtGeburtsortOptionalTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtNachweisbezugType() {
		return geburtNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtNachweisbezugType_Nachweisbezug() {
		return (EReference)geburtNachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtOptionalType() {
		return geburtOptionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeburtOptionalType_Geburtsort() {
		return (EAttribute)geburtOptionalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtOptionalType_GeburtsortStaat() {
		return (EReference)geburtOptionalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtOptionalType_Geburtsdatum() {
		return (EReference)geburtOptionalTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtType() {
		return geburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeburtType_Geburtsort() {
		return (EAttribute)geburtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtType_GeburtsortStaat() {
		return (EReference)geburtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtType_Geburtsdatum() {
		return (EReference)geburtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHausnummernBisType() {
		return hausnummernBisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHausnummernBisType_HausnummerBis() {
		return (EAttribute)hausnummernBisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHausnummernBisType_HausnummerbuchstabezusatzzifferBis() {
		return (EAttribute)hausnummernBisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHausnummernBisType_TeilnummerderhausnummerBis() {
		return (EAttribute)hausnummernBisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifikationNachrichtType() {
		return identifikationNachrichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationNachrichtType_NachrichtenUUID() {
		return (EAttribute)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifikationNachrichtType_Nachrichtentyp() {
		return (EReference)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationNachrichtType_Erstellungszeitpunkt() {
		return (EAttribute)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKommunikationspartnerErreichbarType() {
		return kommunikationspartnerErreichbarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKommunikationspartnerType() {
		return kommunikationspartnerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKommunikationspartnerType_Behoerdenkennung() {
		return (EReference)kommunikationspartnerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKommunikationspartnerType_Erreichbarkeit() {
		return (EReference)kommunikationspartnerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKommunikationspartnerType_Anschrift() {
		return (EReference)kommunikationspartnerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommunikationspartnerType_Behoerdenname() {
		return (EAttribute)kommunikationspartnerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeldeanschriftType() {
		return meldeanschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeldeanschriftType_Gemeindeschluessel() {
		return (EReference)meldeanschriftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_Hausnummer() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_HausnummerBuchstabeZusatzziffer() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_Postleitzahl() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_Stockwerkswohnungsnummer() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_Strasse() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_TeilnummerDerHausnummer() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_Wohnort() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_WohnortFruehererGemeindename() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_Wohnungsinhaber() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldeanschriftType_Zusatzangaben() {
		return (EAttribute)meldeanschriftTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeldeanschriftType_Regionalschluessel() {
		return (EReference)meldeanschriftTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtenkopfType() {
		return nachrichtenkopfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_IdentifikationNachricht() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_Leser() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_Autor() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_PostkorbHandle() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtType() {
		return nachrichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtType_Nachrichtenkopf() {
		return (EReference)nachrichtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtType_Zusatzparametergruppe() {
		return (EReference)nachrichtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Produkt() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Produkthersteller() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Produktversion() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Standard() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Test() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Version() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweisbezugType() {
		return nachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweisbezugType_DatenabrufBezug() {
		return (EReference)nachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweisbezugType_DatenabrufId() {
		return (EAttribute)nachweisbezugTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweisdokumentType() {
		return nachweisdokumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweisdokumentType_Dokumentid() {
		return (EAttribute)nachweisdokumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweisdokumentType_Dateiname() {
		return (EAttribute)nachweisdokumentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweisdokumentType_Mimetype() {
		return (EAttribute)nachweisdokumentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweisdokumentType_Kategorie() {
		return (EAttribute)nachweisdokumentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameNatuerlichePersonNachweisbezugType() {
		return nameNatuerlichePersonNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonNachweisbezugType_Nachweisbezug() {
		return (EReference)nameNatuerlichePersonNachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameNatuerlichePersonOhneGeburtsnameType() {
		return nameNatuerlichePersonOhneGeburtsnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonOhneGeburtsnameType_FamiliennameUnstrukturiert() {
		return (EReference)nameNatuerlichePersonOhneGeburtsnameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonOhneGeburtsnameType_Vornamen() {
		return (EReference)nameNatuerlichePersonOhneGeburtsnameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameNatuerlichePersonType() {
		return nameNatuerlichePersonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonType_FamiliennameUnstrukturiert() {
		return (EReference)nameNatuerlichePersonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonType_GeburtsnameUnstrukturiert() {
		return (EReference)nameNatuerlichePersonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonType_Vornamen() {
		return (EReference)nameNatuerlichePersonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameNatuerlichePersonVornameVerpflichtendType() {
		return nameNatuerlichePersonVornameVerpflichtendTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonVornameVerpflichtendType_FamiliennameUnstrukturiert() {
		return (EReference)nameNatuerlichePersonVornameVerpflichtendTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonVornameVerpflichtendType_GeburtsnameUnstrukturiert() {
		return (EReference)nameNatuerlichePersonVornameVerpflichtendTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonVornameVerpflichtendType_Vornamen() {
		return (EReference)nameNatuerlichePersonVornameVerpflichtendTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNutzerkontoType() {
		return nutzerkontoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutzerkontoType_Name() {
		return (EReference)nutzerkontoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutzerkontoType_Vertrauensniveau() {
		return (EReference)nutzerkontoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutzerkontoType_NachweisNutzerkonto() {
		return (EReference)nutzerkontoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalischeInlandsanschriftBasisType() {
		return postalischeInlandsanschriftBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_Hausnummer() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_HausnummerBuchstabeZusatzziffer() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_Postleitzahl() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_Stockwerkswohnungsnummer() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_Strasse() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_TeilnummerDerHausnummer() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_Wohnort() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_WohnortFruehererGemeindename() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_Wohnungsinhaber() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftBasisType_Zusatzangaben() {
		return (EAttribute)postalischeInlandsanschriftBasisTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType() {
		return postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType_Nachweisbezug() {
		return (EReference)postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalischeInlandsanschriftGebaeudeanschriftType() {
		return postalischeInlandsanschriftGebaeudeanschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalischeInlandsanschriftGebaeudeanschriftType_HausnummernBis() {
		return (EReference)postalischeInlandsanschriftGebaeudeanschriftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalischeInlandsanschriftPostfachanschriftType() {
		return postalischeInlandsanschriftPostfachanschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Postfach() {
		return (EAttribute)postalischeInlandsanschriftPostfachanschriftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Wohnort() {
		return (EAttribute)postalischeInlandsanschriftPostfachanschriftTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Postleitzahl() {
		return (EAttribute)postalischeInlandsanschriftPostfachanschriftTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Zusatzangaben() {
		return (EAttribute)postalischeInlandsanschriftPostfachanschriftTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalischeInlandsanschriftType() {
		return postalischeInlandsanschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalischeInlandsanschriftType_Postfach() {
		return (EReference)postalischeInlandsanschriftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalischeInlandsanschriftType_Gebaeude() {
		return (EReference)postalischeInlandsanschriftTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostkorbHandleType() {
		return postkorbHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostkorbHandleType_PostkorbHandle() {
		return (EAttribute)postkorbHandleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostkorbHandleType_ZustimmungElektronischerBescheid() {
		return (EAttribute)postkorbHandleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaatsangehoerigkeitenNachweisbezugType() {
		return staatsangehoerigkeitenNachweisbezugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaatsangehoerigkeitenNachweisbezugType_Staatsangehoerigkeit() {
		return (EReference)staatsangehoerigkeitenNachweisbezugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaatsangehoerigkeitenNachweisbezugType_Nachweisbezug() {
		return (EReference)staatsangehoerigkeitenNachweisbezugTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusDatenabrufType() {
		return statusDatenabrufTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatusDatenabrufType_Status() {
		return (EReference)statusDatenabrufTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusDatenabrufType_Hinweis() {
		return (EAttribute)statusDatenabrufTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTatsacheMitFreitextType() {
		return tatsacheMitFreitextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTatsacheMitFreitextType_LiegtVor() {
		return (EAttribute)tatsacheMitFreitextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTatsacheMitFreitextType_Freitext() {
		return (EAttribute)tatsacheMitFreitextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTatsacheMitNachweisType() {
		return tatsacheMitNachweisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTatsacheMitNachweisType_LiegtVor() {
		return (EAttribute)tatsacheMitNachweisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTatsacheMitNachweisType_Nachweis() {
		return (EAttribute)tatsacheMitNachweisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTatsacheMitZeitraumType() {
		return tatsacheMitZeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTatsacheMitZeitraumType_LiegtVor() {
		return (EAttribute)tatsacheMitZeitraumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTatsacheMitZeitraumType_Zeitraum() {
		return (EReference)tatsacheMitZeitraumTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeilbekanntesDatumType() {
		return teilbekanntesDatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeilbekanntesDatumType_JahrMonatTag() {
		return (EAttribute)teilbekanntesDatumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeilbekanntesDatumType_JahrMonat() {
		return (EAttribute)teilbekanntesDatumTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeilbekanntesDatumType_Jahr() {
		return (EAttribute)teilbekanntesDatumTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminwunschType() {
		return terminwunschTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTerminwunschType_Wochentag() {
		return (EAttribute)terminwunschTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTerminwunschType_Uhrzeit() {
		return (EAttribute)terminwunschTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZeitraumType() {
		return zeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeitraumType_Beginn() {
		return (EAttribute)zeitraumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeitraumType_Ende() {
		return (EAttribute)zeitraumTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZusatzparametergruppeType() {
		return zusatzparametergruppeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZusatzparametergruppeType_Feld() {
		return (EReference)zusatzparametergruppeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZusatzparametergruppeType_Feldgruppe() {
		return (EReference)zusatzparametergruppeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzparametergruppeType_Name() {
		return (EAttribute)zusatzparametergruppeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzparametergruppeType_FassungHandlungsanweisung() {
		return (EAttribute)zusatzparametergruppeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZustimmungAbrufOderWeitergabeType() {
		return zustimmungAbrufOderWeitergabeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZustimmungAbrufOderWeitergabeType_ArtDesAbrufsOderWeitergabe() {
		return (EReference)zustimmungAbrufOderWeitergabeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZustimmungAbrufOderWeitergabeType_ZustimmungAbrufOderWeitergabe() {
		return (EAttribute)zustimmungAbrufOderWeitergabeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZustimmungAbrufOderWeitergabeType_InhalteDesAbrufs() {
		return (EAttribute)zustimmungAbrufOderWeitergabeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAnrede() {
		return anredeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArtabruf() {
		return artabrufEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArtnachweis() {
		return artnachweisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAufenthaltsstatus() {
		return aufenthaltsstatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEigenschaft() {
		return eigenschaftEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEinkommensarten() {
		return einkommensartenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFamilienstand() {
		return familienstandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGeschlecht() {
		return geschlechtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKindschaftsbeziehung() {
		return kindschaftsbeziehungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKindwohnhaftbei() {
		return kindwohnhaftbeiEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLeistungserhalt() {
		return leistungserhaltEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLeistungsgewaehrung() {
		return leistungsgewaehrungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNachrichtentyp() {
		return nachrichtentypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNachweisbezug() {
		return nachweisbezugEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPersonensorgerecht() {
		return personensorgerechtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSonderstatus() {
		return sonderstatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSonstigeleistungen() {
		return sonstigeleistungenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatusdatenabruf() {
		return statusdatenabrufEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTatsachenbehauptung() {
		return tatsachenbehauptungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVertrauensniveau() {
		return vertrauensniveauEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVertretung() {
		return vertretungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWohnsitz() {
		return wohnsitzEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getZuschuesse() {
		return zuschuesseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnredeObject() {
		return anredeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getArtabrufObject() {
		return artabrufObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getArtnachweisObject() {
		return artnachweisObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAufenthaltsstatusObject() {
		return aufenthaltsstatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEigenschaftObject() {
		return eigenschaftObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEinkommensartenObject() {
		return einkommensartenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFamilienstandObject() {
		return familienstandObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeschlechtObject() {
		return geschlechtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJahrMonatType() {
		return jahrMonatTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJahrType() {
		return jahrTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKindschaftsbeziehungObject() {
		return kindschaftsbeziehungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKindwohnhaftbeiObject() {
		return kindwohnhaftbeiObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKrankenversichertennummerType() {
		return krankenversichertennummerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLeistungserhaltObject() {
		return leistungserhaltObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLeistungsgewaehrungObject() {
		return leistungsgewaehrungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftHausnummerBuchstabeZusatzzifferType() {
		return meldeanschriftHausnummerBuchstabeZusatzzifferTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftHausnummerType() {
		return meldeanschriftHausnummerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftPostleitzahlType() {
		return meldeanschriftPostleitzahlTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftStockwerkswohnungsnummerType() {
		return meldeanschriftStockwerkswohnungsnummerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftStrasseType() {
		return meldeanschriftStrasseTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftTeilnummerDerHausnummerType() {
		return meldeanschriftTeilnummerDerHausnummerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftWohnortFruehererGemeindenameType() {
		return meldeanschriftWohnortFruehererGemeindenameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftWohnortType() {
		return meldeanschriftWohnortTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftWohnungsinhaberType() {
		return meldeanschriftWohnungsinhaberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeldeanschriftZusatzangabenType() {
		return meldeanschriftZusatzangabenTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNachrichtentypObject() {
		return nachrichtentypObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNachweisbezugObject() {
		return nachweisbezugObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPersonensorgerechtObject() {
		return personensorgerechtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSonderstatusObject() {
		return sonderstatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSonstigeleistungenObject() {
		return sonstigeleistungenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStatusdatenabrufObject() {
		return statusdatenabrufObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSteuerlicheIdentifikationsnummerType() {
		return steuerlicheIdentifikationsnummerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTagesdatumType() {
		return tagesdatumTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTatsachenbehauptungObject() {
		return tatsachenbehauptungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUUIDType() {
		return uuidTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVertrauensniveauObject() {
		return vertrauensniveauObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVertretungObject() {
		return vertretungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWohnsitzObject() {
		return wohnsitzObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZuschuesseObject() {
		return zuschuesseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaukastenFactory getBaukastenFactory() {
		return (BaukastenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		allgemeinerNameTypeEClass = createEClass(ALLGEMEINER_NAME_TYPE);
		createEAttribute(allgemeinerNameTypeEClass, ALLGEMEINER_NAME_TYPE__NAME);
		createEAttribute(allgemeinerNameTypeEClass, ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN);

		antragsnachrichtTypeEClass = createEClass(ANTRAGSNACHRICHT_TYPE);
		createEAttribute(antragsnachrichtTypeEClass, ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG);
		createEAttribute(antragsnachrichtTypeEClass, ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID);

		aufenthaltstitelNachweisbezugTypeEClass = createEClass(AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE);
		createEAttribute(aufenthaltstitelNachweisbezugTypeEClass, AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP);
		createEAttribute(aufenthaltstitelNachweisbezugTypeEClass, AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN);
		createEAttribute(aufenthaltstitelNachweisbezugTypeEClass, AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM);
		createEReference(aufenthaltstitelNachweisbezugTypeEClass, AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG);

		auslandsanschriftTypeEClass = createEClass(AUSLANDSANSCHRIFT_TYPE);
		createEReference(auslandsanschriftTypeEClass, AUSLANDSANSCHRIFT_TYPE__STAAT);
		createEAttribute(auslandsanschriftTypeEClass, AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE);

		bankverbindungIBANOptionalTypeEClass = createEClass(BANKVERBINDUNG_IBAN_OPTIONAL_TYPE);
		createEReference(bankverbindungIBANOptionalTypeEClass, BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__INHABER);
		createEAttribute(bankverbindungIBANOptionalTypeEClass, BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__IBAN);
		createEAttribute(bankverbindungIBANOptionalTypeEClass, BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__BIC);
		createEAttribute(bankverbindungIBANOptionalTypeEClass, BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__INSTITUT);

		bankverbindungInhaberOptionalTypeEClass = createEClass(BANKVERBINDUNG_INHABER_OPTIONAL_TYPE);
		createEReference(bankverbindungInhaberOptionalTypeEClass, BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER);
		createEAttribute(bankverbindungInhaberOptionalTypeEClass, BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN);
		createEAttribute(bankverbindungInhaberOptionalTypeEClass, BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC);
		createEAttribute(bankverbindungInhaberOptionalTypeEClass, BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT);

		bankverbindungTypeEClass = createEClass(BANKVERBINDUNG_TYPE);
		createEReference(bankverbindungTypeEClass, BANKVERBINDUNG_TYPE__INHABER);
		createEAttribute(bankverbindungTypeEClass, BANKVERBINDUNG_TYPE__IBAN);
		createEAttribute(bankverbindungTypeEClass, BANKVERBINDUNG_TYPE__BIC);
		createEAttribute(bankverbindungTypeEClass, BANKVERBINDUNG_TYPE__INSTITUT);

		behoerdenkennungTypeEClass = createEClass(BEHOERDENKENNUNG_TYPE);
		createEReference(behoerdenkennungTypeEClass, BEHOERDENKENNUNG_TYPE__PRAEFIX);
		createEReference(behoerdenkennungTypeEClass, BEHOERDENKENNUNG_TYPE__KENNUNG);

		codeAnredeTypeEClass = createEClass(CODE_ANREDE_TYPE);

		codeArtAbrufTypeEClass = createEClass(CODE_ART_ABRUF_TYPE);

		codeAufenthaltsstatusTypeEClass = createEClass(CODE_AUFENTHALTSSTATUS_TYPE);

		codeBundeslandTypeEClass = createEClass(CODE_BUNDESLAND_TYPE);

		codeEigenschaftTypeEClass = createEClass(CODE_EIGENSCHAFT_TYPE);

		codeEinkommensartenTypeEClass = createEClass(CODE_EINKOMMENSARTEN_TYPE);

		codeErreichbarkeitTypeEClass = createEClass(CODE_ERREICHBARKEIT_TYPE);

		codeFamilienstandTypeEClass = createEClass(CODE_FAMILIENSTAND_TYPE);

		codeGemeindeVZAmtlicherGemeindeschluesselTypeEClass = createEClass(CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE);

		codeGemeindeVZRegionalschluesselTypeEClass = createEClass(CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE);

		codeGeschlechtTypeEClass = createEClass(CODE_GESCHLECHT_TYPE);

		codeKindschaftsbeziehungTypeEClass = createEClass(CODE_KINDSCHAFTSBEZIEHUNG_TYPE);

		codeKindWohnhaftBeiTypeEClass = createEClass(CODE_KIND_WOHNHAFT_BEI_TYPE);

		codeLeistungserhaltTypeEClass = createEClass(CODE_LEISTUNGSERHALT_TYPE);

		codeLeistungsgewaehrungTypeEClass = createEClass(CODE_LEISTUNGSGEWAEHRUNG_TYPE);

		codeNachrichtentypTypeEClass = createEClass(CODE_NACHRICHTENTYP_TYPE);

		codeNachweisbezugTypeEClass = createEClass(CODE_NACHWEISBEZUG_TYPE);

		codePersonensorgerechtTypeEClass = createEClass(CODE_PERSONENSORGERECHT_TYPE);

		codePraefixTypeEClass = createEClass(CODE_PRAEFIX_TYPE);

		codeSonderstatusTypeEClass = createEClass(CODE_SONDERSTATUS_TYPE);

		codeSonstigeLeistungenTypeEClass = createEClass(CODE_SONSTIGE_LEISTUNGEN_TYPE);

		codeStaatsangehoerigkeitTypeEClass = createEClass(CODE_STAATSANGEHOERIGKEIT_TYPE);

		codeStaatTypeEClass = createEClass(CODE_STAAT_TYPE);

		codeStandesamtnummernTypeEClass = createEClass(CODE_STANDESAMTNUMMERN_TYPE);

		codeStatusDatenabrufTypeEClass = createEClass(CODE_STATUS_DATENABRUF_TYPE);

		codeTatsachenbehauptungTypeEClass = createEClass(CODE_TATSACHENBEHAUPTUNG_TYPE);

		codeVermoegensartTypeEClass = createEClass(CODE_VERMOEGENSART_TYPE);

		codeVertrauensniveauTypeEClass = createEClass(CODE_VERTRAUENSNIVEAU_TYPE);

		codeVertretungTypeEClass = createEClass(CODE_VERTRETUNG_TYPE);

		codeWohnsitzTypeEClass = createEClass(CODE_WOHNSITZ_TYPE);

		codeZuschuesseTypeEClass = createEClass(CODE_ZUSCHUESSE_TYPE);

		datenabrufTypeEClass = createEClass(DATENABRUF_TYPE);
		createEAttribute(datenabrufTypeEClass, DATENABRUF_TYPE__ID);
		createEAttribute(datenabrufTypeEClass, DATENABRUF_TYPE__ZEITSTEMPEL);
		createEAttribute(datenabrufTypeEClass, DATENABRUF_TYPE__QUELLE);
		createEAttribute(datenabrufTypeEClass, DATENABRUF_TYPE__ART_DES_ABRUFS);
		createEAttribute(datenabrufTypeEClass, DATENABRUF_TYPE__ABGERUFEN_FUER);
		createEReference(datenabrufTypeEClass, DATENABRUF_TYPE__STATUS_DATENABRUF);

		datenschutzerklaerungenTypeEClass = createEClass(DATENSCHUTZERKLAERUNGEN_TYPE);
		createEAttribute(datenschutzerklaerungenTypeEClass, DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER);
		createEAttribute(datenschutzerklaerungenTypeEClass, DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER);

		entgeltdatenArbeitgeberDsrvTypeEClass = createEClass(ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE);
		createEAttribute(entgeltdatenArbeitgeberDsrvTypeEClass, ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID);
		createEAttribute(entgeltdatenArbeitgeberDsrvTypeEClass, ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER);
		createEReference(entgeltdatenArbeitgeberDsrvTypeEClass, ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV);

		entgeltdatenDsrvNachweisbezugTypeEClass = createEClass(ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE);
		createEReference(entgeltdatenDsrvNachweisbezugTypeEClass, ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG);
		createEAttribute(entgeltdatenDsrvNachweisbezugTypeEClass, ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON);
		createEAttribute(entgeltdatenDsrvNachweisbezugTypeEClass, ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS);
		createEReference(entgeltdatenDsrvNachweisbezugTypeEClass, ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER);

		erreichbarkeitTypeEClass = createEClass(ERREICHBARKEIT_TYPE);
		createEReference(erreichbarkeitTypeEClass, ERREICHBARKEIT_TYPE__KANAL);
		createEAttribute(erreichbarkeitTypeEClass, ERREICHBARKEIT_TYPE__KENNUNG);
		createEAttribute(erreichbarkeitTypeEClass, ERREICHBARKEIT_TYPE__ZUSATZ);

		familiennameUnstrukturiertTypeEClass = createEClass(FAMILIENNAME_UNSTRUKTURIERT_TYPE);
		createEReference(familiennameUnstrukturiertTypeEClass, FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME);
		createEReference(familiennameUnstrukturiertTypeEClass, FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS);

		familienstandNachweisbezugTypeEClass = createEClass(FAMILIENSTAND_NACHWEISBEZUG_TYPE);
		createEReference(familienstandNachweisbezugTypeEClass, FAMILIENSTAND_NACHWEISBEZUG_TYPE__NACHWEISBEZUG);

		familienstandTypeEClass = createEClass(FAMILIENSTAND_TYPE);
		createEAttribute(familienstandTypeEClass, FAMILIENSTAND_TYPE__SEIT);
		createEReference(familienstandTypeEClass, FAMILIENSTAND_TYPE__FAMILIENSTAND);

		feldgruppeTypeEClass = createEClass(FELDGRUPPE_TYPE);
		createEAttribute(feldgruppeTypeEClass, FELDGRUPPE_TYPE__NAME);
		createEReference(feldgruppeTypeEClass, FELDGRUPPE_TYPE__FELD);
		createEReference(feldgruppeTypeEClass, FELDGRUPPE_TYPE__FELDGRUPPE);
		createEAttribute(feldgruppeTypeEClass, FELDGRUPPE_TYPE__LAUFENDE_NUMMER);

		feldTypeEClass = createEClass(FELD_TYPE);
		createEAttribute(feldTypeEClass, FELD_TYPE__NAME);
		createEAttribute(feldTypeEClass, FELD_TYPE__WERT);
		createEAttribute(feldTypeEClass, FELD_TYPE__LAUFENDE_NUMMER);

		geburtGeburtsortOptionalTypeEClass = createEClass(GEBURT_GEBURTSORT_OPTIONAL_TYPE);
		createEAttribute(geburtGeburtsortOptionalTypeEClass, GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSORT);
		createEReference(geburtGeburtsortOptionalTypeEClass, GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSORT_STAAT);
		createEReference(geburtGeburtsortOptionalTypeEClass, GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSDATUM);

		geburtNachweisbezugTypeEClass = createEClass(GEBURT_NACHWEISBEZUG_TYPE);
		createEReference(geburtNachweisbezugTypeEClass, GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG);

		geburtOptionalTypeEClass = createEClass(GEBURT_OPTIONAL_TYPE);
		createEAttribute(geburtOptionalTypeEClass, GEBURT_OPTIONAL_TYPE__GEBURTSORT);
		createEReference(geburtOptionalTypeEClass, GEBURT_OPTIONAL_TYPE__GEBURTSORT_STAAT);
		createEReference(geburtOptionalTypeEClass, GEBURT_OPTIONAL_TYPE__GEBURTSDATUM);

		geburtTypeEClass = createEClass(GEBURT_TYPE);
		createEAttribute(geburtTypeEClass, GEBURT_TYPE__GEBURTSORT);
		createEReference(geburtTypeEClass, GEBURT_TYPE__GEBURTSORT_STAAT);
		createEReference(geburtTypeEClass, GEBURT_TYPE__GEBURTSDATUM);

		hausnummernBisTypeEClass = createEClass(HAUSNUMMERN_BIS_TYPE);
		createEAttribute(hausnummernBisTypeEClass, HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS);
		createEAttribute(hausnummernBisTypeEClass, HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS);
		createEAttribute(hausnummernBisTypeEClass, HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS);

		identifikationNachrichtTypeEClass = createEClass(IDENTIFIKATION_NACHRICHT_TYPE);
		createEAttribute(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID);
		createEReference(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP);
		createEAttribute(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT);

		kommunikationspartnerErreichbarTypeEClass = createEClass(KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE);

		kommunikationspartnerTypeEClass = createEClass(KOMMUNIKATIONSPARTNER_TYPE);
		createEReference(kommunikationspartnerTypeEClass, KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG);
		createEReference(kommunikationspartnerTypeEClass, KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT);
		createEReference(kommunikationspartnerTypeEClass, KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT);
		createEAttribute(kommunikationspartnerTypeEClass, KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME);

		meldeanschriftTypeEClass = createEClass(MELDEANSCHRIFT_TYPE);
		createEReference(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__GEMEINDESCHLUESSEL);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__HAUSNUMMER);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__POSTLEITZAHL);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__STOCKWERKSWOHNUNGSNUMMER);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__STRASSE);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__TEILNUMMER_DER_HAUSNUMMER);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__WOHNORT);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__WOHNUNGSINHABER);
		createEAttribute(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__ZUSATZANGABEN);
		createEReference(meldeanschriftTypeEClass, MELDEANSCHRIFT_TYPE__REGIONALSCHLUESSEL);

		nachrichtenkopfTypeEClass = createEClass(NACHRICHTENKOPF_TYPE);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__LESER);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__AUTOR);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE);

		nachrichtTypeEClass = createEClass(NACHRICHT_TYPE);
		createEReference(nachrichtTypeEClass, NACHRICHT_TYPE__NACHRICHTENKOPF);
		createEReference(nachrichtTypeEClass, NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__PRODUKT);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__PRODUKTHERSTELLER);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__PRODUKTVERSION);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__STANDARD);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__TEST);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__VERSION);

		nachweisbezugTypeEClass = createEClass(NACHWEISBEZUG_TYPE);
		createEReference(nachweisbezugTypeEClass, NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG);
		createEAttribute(nachweisbezugTypeEClass, NACHWEISBEZUG_TYPE__DATENABRUF_ID);

		nachweisdokumentTypeEClass = createEClass(NACHWEISDOKUMENT_TYPE);
		createEAttribute(nachweisdokumentTypeEClass, NACHWEISDOKUMENT_TYPE__DOKUMENTID);
		createEAttribute(nachweisdokumentTypeEClass, NACHWEISDOKUMENT_TYPE__DATEINAME);
		createEAttribute(nachweisdokumentTypeEClass, NACHWEISDOKUMENT_TYPE__MIMETYPE);
		createEAttribute(nachweisdokumentTypeEClass, NACHWEISDOKUMENT_TYPE__KATEGORIE);

		nameNatuerlichePersonNachweisbezugTypeEClass = createEClass(NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE);
		createEReference(nameNatuerlichePersonNachweisbezugTypeEClass, NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE__NACHWEISBEZUG);

		nameNatuerlichePersonOhneGeburtsnameTypeEClass = createEClass(NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE);
		createEReference(nameNatuerlichePersonOhneGeburtsnameTypeEClass, NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE__FAMILIENNAME_UNSTRUKTURIERT);
		createEReference(nameNatuerlichePersonOhneGeburtsnameTypeEClass, NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE__VORNAMEN);

		nameNatuerlichePersonTypeEClass = createEClass(NAME_NATUERLICHE_PERSON_TYPE);
		createEReference(nameNatuerlichePersonTypeEClass, NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME_UNSTRUKTURIERT);
		createEReference(nameNatuerlichePersonTypeEClass, NAME_NATUERLICHE_PERSON_TYPE__GEBURTSNAME_UNSTRUKTURIERT);
		createEReference(nameNatuerlichePersonTypeEClass, NAME_NATUERLICHE_PERSON_TYPE__VORNAMEN);

		nameNatuerlichePersonVornameVerpflichtendTypeEClass = createEClass(NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE);
		createEReference(nameNatuerlichePersonVornameVerpflichtendTypeEClass, NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__FAMILIENNAME_UNSTRUKTURIERT);
		createEReference(nameNatuerlichePersonVornameVerpflichtendTypeEClass, NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__GEBURTSNAME_UNSTRUKTURIERT);
		createEReference(nameNatuerlichePersonVornameVerpflichtendTypeEClass, NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__VORNAMEN);

		nutzerkontoTypeEClass = createEClass(NUTZERKONTO_TYPE);
		createEReference(nutzerkontoTypeEClass, NUTZERKONTO_TYPE__NAME);
		createEReference(nutzerkontoTypeEClass, NUTZERKONTO_TYPE__VERTRAUENSNIVEAU);
		createEReference(nutzerkontoTypeEClass, NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO);

		postalischeInlandsanschriftBasisTypeEClass = createEClass(POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER);
		createEAttribute(postalischeInlandsanschriftBasisTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN);

		postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass = createEClass(POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE);
		createEReference(postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG);

		postalischeInlandsanschriftGebaeudeanschriftTypeEClass = createEClass(POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE);
		createEReference(postalischeInlandsanschriftGebaeudeanschriftTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS);

		postalischeInlandsanschriftPostfachanschriftTypeEClass = createEClass(POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE);
		createEAttribute(postalischeInlandsanschriftPostfachanschriftTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH);
		createEAttribute(postalischeInlandsanschriftPostfachanschriftTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT);
		createEAttribute(postalischeInlandsanschriftPostfachanschriftTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL);
		createEAttribute(postalischeInlandsanschriftPostfachanschriftTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN);

		postalischeInlandsanschriftTypeEClass = createEClass(POSTALISCHE_INLANDSANSCHRIFT_TYPE);
		createEReference(postalischeInlandsanschriftTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH);
		createEReference(postalischeInlandsanschriftTypeEClass, POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE);

		postkorbHandleTypeEClass = createEClass(POSTKORB_HANDLE_TYPE);
		createEAttribute(postkorbHandleTypeEClass, POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE);
		createEAttribute(postkorbHandleTypeEClass, POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID);

		staatsangehoerigkeitenNachweisbezugTypeEClass = createEClass(STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE);
		createEReference(staatsangehoerigkeitenNachweisbezugTypeEClass, STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT);
		createEReference(staatsangehoerigkeitenNachweisbezugTypeEClass, STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG);

		statusDatenabrufTypeEClass = createEClass(STATUS_DATENABRUF_TYPE);
		createEReference(statusDatenabrufTypeEClass, STATUS_DATENABRUF_TYPE__STATUS);
		createEAttribute(statusDatenabrufTypeEClass, STATUS_DATENABRUF_TYPE__HINWEIS);

		tatsacheMitFreitextTypeEClass = createEClass(TATSACHE_MIT_FREITEXT_TYPE);
		createEAttribute(tatsacheMitFreitextTypeEClass, TATSACHE_MIT_FREITEXT_TYPE__LIEGT_VOR);
		createEAttribute(tatsacheMitFreitextTypeEClass, TATSACHE_MIT_FREITEXT_TYPE__FREITEXT);

		tatsacheMitNachweisTypeEClass = createEClass(TATSACHE_MIT_NACHWEIS_TYPE);
		createEAttribute(tatsacheMitNachweisTypeEClass, TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR);
		createEAttribute(tatsacheMitNachweisTypeEClass, TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS);

		tatsacheMitZeitraumTypeEClass = createEClass(TATSACHE_MIT_ZEITRAUM_TYPE);
		createEAttribute(tatsacheMitZeitraumTypeEClass, TATSACHE_MIT_ZEITRAUM_TYPE__LIEGT_VOR);
		createEReference(tatsacheMitZeitraumTypeEClass, TATSACHE_MIT_ZEITRAUM_TYPE__ZEITRAUM);

		teilbekanntesDatumTypeEClass = createEClass(TEILBEKANNTES_DATUM_TYPE);
		createEAttribute(teilbekanntesDatumTypeEClass, TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG);
		createEAttribute(teilbekanntesDatumTypeEClass, TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT);
		createEAttribute(teilbekanntesDatumTypeEClass, TEILBEKANNTES_DATUM_TYPE__JAHR);

		terminwunschTypeEClass = createEClass(TERMINWUNSCH_TYPE);
		createEAttribute(terminwunschTypeEClass, TERMINWUNSCH_TYPE__WOCHENTAG);
		createEAttribute(terminwunschTypeEClass, TERMINWUNSCH_TYPE__UHRZEIT);

		zeitraumTypeEClass = createEClass(ZEITRAUM_TYPE);
		createEAttribute(zeitraumTypeEClass, ZEITRAUM_TYPE__BEGINN);
		createEAttribute(zeitraumTypeEClass, ZEITRAUM_TYPE__ENDE);

		zusatzparametergruppeTypeEClass = createEClass(ZUSATZPARAMETERGRUPPE_TYPE);
		createEReference(zusatzparametergruppeTypeEClass, ZUSATZPARAMETERGRUPPE_TYPE__FELD);
		createEReference(zusatzparametergruppeTypeEClass, ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE);
		createEAttribute(zusatzparametergruppeTypeEClass, ZUSATZPARAMETERGRUPPE_TYPE__NAME);
		createEAttribute(zusatzparametergruppeTypeEClass, ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG);

		zustimmungAbrufOderWeitergabeTypeEClass = createEClass(ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE);
		createEReference(zustimmungAbrufOderWeitergabeTypeEClass, ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE);
		createEAttribute(zustimmungAbrufOderWeitergabeTypeEClass, ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE);
		createEAttribute(zustimmungAbrufOderWeitergabeTypeEClass, ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS);

		// Create enums
		anredeEEnum = createEEnum(ANREDE);
		artabrufEEnum = createEEnum(ARTABRUF);
		artnachweisEEnum = createEEnum(ARTNACHWEIS);
		aufenthaltsstatusEEnum = createEEnum(AUFENTHALTSSTATUS);
		eigenschaftEEnum = createEEnum(EIGENSCHAFT);
		einkommensartenEEnum = createEEnum(EINKOMMENSARTEN);
		familienstandEEnum = createEEnum(FAMILIENSTAND);
		geschlechtEEnum = createEEnum(GESCHLECHT);
		kindschaftsbeziehungEEnum = createEEnum(KINDSCHAFTSBEZIEHUNG);
		kindwohnhaftbeiEEnum = createEEnum(KINDWOHNHAFTBEI);
		leistungserhaltEEnum = createEEnum(LEISTUNGSERHALT);
		leistungsgewaehrungEEnum = createEEnum(LEISTUNGSGEWAEHRUNG);
		nachrichtentypEEnum = createEEnum(NACHRICHTENTYP);
		nachweisbezugEEnum = createEEnum(NACHWEISBEZUG);
		personensorgerechtEEnum = createEEnum(PERSONENSORGERECHT);
		sonderstatusEEnum = createEEnum(SONDERSTATUS);
		sonstigeleistungenEEnum = createEEnum(SONSTIGELEISTUNGEN);
		statusdatenabrufEEnum = createEEnum(STATUSDATENABRUF);
		tatsachenbehauptungEEnum = createEEnum(TATSACHENBEHAUPTUNG);
		vertrauensniveauEEnum = createEEnum(VERTRAUENSNIVEAU);
		vertretungEEnum = createEEnum(VERTRETUNG);
		wohnsitzEEnum = createEEnum(WOHNSITZ);
		zuschuesseEEnum = createEEnum(ZUSCHUESSE);

		// Create data types
		anredeObjectEDataType = createEDataType(ANREDE_OBJECT);
		artabrufObjectEDataType = createEDataType(ARTABRUF_OBJECT);
		artnachweisObjectEDataType = createEDataType(ARTNACHWEIS_OBJECT);
		aufenthaltsstatusObjectEDataType = createEDataType(AUFENTHALTSSTATUS_OBJECT);
		eigenschaftObjectEDataType = createEDataType(EIGENSCHAFT_OBJECT);
		einkommensartenObjectEDataType = createEDataType(EINKOMMENSARTEN_OBJECT);
		familienstandObjectEDataType = createEDataType(FAMILIENSTAND_OBJECT);
		geschlechtObjectEDataType = createEDataType(GESCHLECHT_OBJECT);
		jahrMonatTypeEDataType = createEDataType(JAHR_MONAT_TYPE);
		jahrTypeEDataType = createEDataType(JAHR_TYPE);
		kindschaftsbeziehungObjectEDataType = createEDataType(KINDSCHAFTSBEZIEHUNG_OBJECT);
		kindwohnhaftbeiObjectEDataType = createEDataType(KINDWOHNHAFTBEI_OBJECT);
		krankenversichertennummerTypeEDataType = createEDataType(KRANKENVERSICHERTENNUMMER_TYPE);
		leistungserhaltObjectEDataType = createEDataType(LEISTUNGSERHALT_OBJECT);
		leistungsgewaehrungObjectEDataType = createEDataType(LEISTUNGSGEWAEHRUNG_OBJECT);
		meldeanschriftHausnummerBuchstabeZusatzzifferTypeEDataType = createEDataType(MELDEANSCHRIFT_HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_TYPE);
		meldeanschriftHausnummerTypeEDataType = createEDataType(MELDEANSCHRIFT_HAUSNUMMER_TYPE);
		meldeanschriftPostleitzahlTypeEDataType = createEDataType(MELDEANSCHRIFT_POSTLEITZAHL_TYPE);
		meldeanschriftStockwerkswohnungsnummerTypeEDataType = createEDataType(MELDEANSCHRIFT_STOCKWERKSWOHNUNGSNUMMER_TYPE);
		meldeanschriftStrasseTypeEDataType = createEDataType(MELDEANSCHRIFT_STRASSE_TYPE);
		meldeanschriftTeilnummerDerHausnummerTypeEDataType = createEDataType(MELDEANSCHRIFT_TEILNUMMER_DER_HAUSNUMMER_TYPE);
		meldeanschriftWohnortFruehererGemeindenameTypeEDataType = createEDataType(MELDEANSCHRIFT_WOHNORT_FRUEHERER_GEMEINDENAME_TYPE);
		meldeanschriftWohnortTypeEDataType = createEDataType(MELDEANSCHRIFT_WOHNORT_TYPE);
		meldeanschriftWohnungsinhaberTypeEDataType = createEDataType(MELDEANSCHRIFT_WOHNUNGSINHABER_TYPE);
		meldeanschriftZusatzangabenTypeEDataType = createEDataType(MELDEANSCHRIFT_ZUSATZANGABEN_TYPE);
		nachrichtentypObjectEDataType = createEDataType(NACHRICHTENTYP_OBJECT);
		nachweisbezugObjectEDataType = createEDataType(NACHWEISBEZUG_OBJECT);
		personensorgerechtObjectEDataType = createEDataType(PERSONENSORGERECHT_OBJECT);
		sonderstatusObjectEDataType = createEDataType(SONDERSTATUS_OBJECT);
		sonstigeleistungenObjectEDataType = createEDataType(SONSTIGELEISTUNGEN_OBJECT);
		statusdatenabrufObjectEDataType = createEDataType(STATUSDATENABRUF_OBJECT);
		steuerlicheIdentifikationsnummerTypeEDataType = createEDataType(STEUERLICHE_IDENTIFIKATIONSNUMMER_TYPE);
		tagesdatumTypeEDataType = createEDataType(TAGESDATUM_TYPE);
		tatsachenbehauptungObjectEDataType = createEDataType(TATSACHENBEHAUPTUNG_OBJECT);
		uuidTypeEDataType = createEDataType(UUID_TYPE);
		vertrauensniveauObjectEDataType = createEDataType(VERTRAUENSNIVEAU_OBJECT);
		vertretungObjectEDataType = createEDataType(VERTRETUNG_OBJECT);
		wohnsitzObjectEDataType = createEDataType(WOHNSITZ_OBJECT);
		zuschuesseObjectEDataType = createEDataType(ZUSCHUESSE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DIN913792204Package theDIN913792204Package = (DIN913792204Package)EPackage.Registry.INSTANCE.getEPackage(DIN913792204Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		antragsnachrichtTypeEClass.getESuperTypes().add(this.getNachrichtType());
		codeAnredeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeArtAbrufTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeAufenthaltsstatusTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeBundeslandTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeEigenschaftTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeEinkommensartenTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeErreichbarkeitTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeFamilienstandTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeGemeindeVZAmtlicherGemeindeschluesselTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeGemeindeVZRegionalschluesselTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeGeschlechtTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeKindschaftsbeziehungTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeKindWohnhaftBeiTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeLeistungserhaltTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeLeistungsgewaehrungTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeNachrichtentypTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeNachweisbezugTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codePersonensorgerechtTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codePraefixTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeSonderstatusTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeSonstigeLeistungenTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeStaatsangehoerigkeitTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeStaatTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeStandesamtnummernTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeStatusDatenabrufTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeTatsachenbehauptungTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeVermoegensartTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeVertrauensniveauTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeVertretungTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeWohnsitzTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeZuschuesseTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		familienstandNachweisbezugTypeEClass.getESuperTypes().add(this.getFamilienstandType());
		geburtNachweisbezugTypeEClass.getESuperTypes().add(this.getGeburtType());
		kommunikationspartnerErreichbarTypeEClass.getESuperTypes().add(this.getKommunikationspartnerType());
		nameNatuerlichePersonNachweisbezugTypeEClass.getESuperTypes().add(this.getNameNatuerlichePersonType());
		postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass.getESuperTypes().add(this.getPostalischeInlandsanschriftGebaeudeanschriftType());
		postalischeInlandsanschriftGebaeudeanschriftTypeEClass.getESuperTypes().add(this.getPostalischeInlandsanschriftBasisType());

		// Initialize classes, features, and operations; add parameters
		initEClass(allgemeinerNameTypeEClass, AllgemeinerNameType.class, "AllgemeinerNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllgemeinerNameType_Name(), theDIN913792204Package.getDatatypeC(), "name", null, 0, 1, AllgemeinerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeinerNameType_NichtVorhanden(), theXMLTypePackage.getBoolean(), "nichtVorhanden", "true", 0, 1, AllgemeinerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragsnachrichtTypeEClass, AntragsnachrichtType.class, "AntragsnachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAntragsnachrichtType_ZeitstempelAntragsstellung(), theXMLTypePackage.getDateTime(), "zeitstempelAntragsstellung", null, 1, 1, AntragsnachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragsnachrichtType_Transaktionsid(), this.getUUIDType(), "transaktionsid", null, 1, 1, AntragsnachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aufenthaltstitelNachweisbezugTypeEClass, AufenthaltstitelNachweisbezugType.class, "AufenthaltstitelNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAufenthaltstitelNachweisbezugType_Dokumenttyp(), theDIN913792204Package.getDatatypeC(), "dokumenttyp", null, 1, 1, AufenthaltstitelNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAufenthaltstitelNachweisbezugType_Nebenbestimmungen(), theDIN913792204Package.getDatatypeC(), "nebenbestimmungen", null, 0, 2, AufenthaltstitelNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAufenthaltstitelNachweisbezugType_Ablaufdatum(), theXMLTypePackage.getDate(), "ablaufdatum", null, 0, 1, AufenthaltstitelNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAufenthaltstitelNachweisbezugType_Nachweisbezug(), this.getNachweisbezugType(), null, "nachweisbezug", null, 1, 1, AufenthaltstitelNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auslandsanschriftTypeEClass, AuslandsanschriftType.class, "AuslandsanschriftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuslandsanschriftType_Staat(), this.getCodeStaatType(), null, "staat", null, 1, 1, AuslandsanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuslandsanschriftType_Anschriftszeile(), theDIN913792204Package.getDatatypeC(), "anschriftszeile", null, 2, 5, AuslandsanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bankverbindungIBANOptionalTypeEClass, BankverbindungIBANOptionalType.class, "BankverbindungIBANOptionalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBankverbindungIBANOptionalType_Inhaber(), this.getNameNatuerlichePersonType(), null, "inhaber", null, 0, 1, BankverbindungIBANOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungIBANOptionalType_Iban(), theDIN913792204Package.getDatatypeC(), "iban", null, 0, 1, BankverbindungIBANOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungIBANOptionalType_Bic(), theDIN913792204Package.getDatatypeC(), "bic", null, 0, 1, BankverbindungIBANOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungIBANOptionalType_Institut(), theDIN913792204Package.getDatatypeC(), "institut", null, 0, 1, BankverbindungIBANOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bankverbindungInhaberOptionalTypeEClass, BankverbindungInhaberOptionalType.class, "BankverbindungInhaberOptionalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBankverbindungInhaberOptionalType_Inhaber(), this.getNameNatuerlichePersonType(), null, "inhaber", null, 0, 1, BankverbindungInhaberOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungInhaberOptionalType_Iban(), theDIN913792204Package.getDatatypeC(), "iban", null, 1, 1, BankverbindungInhaberOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungInhaberOptionalType_Bic(), theDIN913792204Package.getDatatypeC(), "bic", null, 0, 1, BankverbindungInhaberOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungInhaberOptionalType_Institut(), theDIN913792204Package.getDatatypeC(), "institut", null, 0, 1, BankverbindungInhaberOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bankverbindungTypeEClass, BankverbindungType.class, "BankverbindungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBankverbindungType_Inhaber(), this.getNameNatuerlichePersonType(), null, "inhaber", null, 1, 1, BankverbindungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungType_Iban(), theDIN913792204Package.getDatatypeC(), "iban", null, 1, 1, BankverbindungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungType_Bic(), theDIN913792204Package.getDatatypeC(), "bic", null, 0, 1, BankverbindungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankverbindungType_Institut(), theDIN913792204Package.getDatatypeC(), "institut", null, 0, 1, BankverbindungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behoerdenkennungTypeEClass, BehoerdenkennungType.class, "BehoerdenkennungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehoerdenkennungType_Praefix(), this.getCodePraefixType(), null, "praefix", null, 1, 1, BehoerdenkennungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehoerdenkennungType_Kennung(), theCode10Package.getCode(), null, "kennung", null, 1, 1, BehoerdenkennungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeAnredeTypeEClass, CodeAnredeType.class, "CodeAnredeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeArtAbrufTypeEClass, CodeArtAbrufType.class, "CodeArtAbrufType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeAufenthaltsstatusTypeEClass, CodeAufenthaltsstatusType.class, "CodeAufenthaltsstatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeBundeslandTypeEClass, CodeBundeslandType.class, "CodeBundeslandType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeEigenschaftTypeEClass, CodeEigenschaftType.class, "CodeEigenschaftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeEinkommensartenTypeEClass, CodeEinkommensartenType.class, "CodeEinkommensartenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeErreichbarkeitTypeEClass, CodeErreichbarkeitType.class, "CodeErreichbarkeitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeFamilienstandTypeEClass, CodeFamilienstandType.class, "CodeFamilienstandType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeGemeindeVZAmtlicherGemeindeschluesselTypeEClass, CodeGemeindeVZAmtlicherGemeindeschluesselType.class, "CodeGemeindeVZAmtlicherGemeindeschluesselType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeGemeindeVZRegionalschluesselTypeEClass, CodeGemeindeVZRegionalschluesselType.class, "CodeGemeindeVZRegionalschluesselType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeGeschlechtTypeEClass, CodeGeschlechtType.class, "CodeGeschlechtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeKindschaftsbeziehungTypeEClass, CodeKindschaftsbeziehungType.class, "CodeKindschaftsbeziehungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeKindWohnhaftBeiTypeEClass, CodeKindWohnhaftBeiType.class, "CodeKindWohnhaftBeiType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeLeistungserhaltTypeEClass, CodeLeistungserhaltType.class, "CodeLeistungserhaltType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeLeistungsgewaehrungTypeEClass, CodeLeistungsgewaehrungType.class, "CodeLeistungsgewaehrungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeNachrichtentypTypeEClass, CodeNachrichtentypType.class, "CodeNachrichtentypType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeNachweisbezugTypeEClass, CodeNachweisbezugType.class, "CodeNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codePersonensorgerechtTypeEClass, CodePersonensorgerechtType.class, "CodePersonensorgerechtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codePraefixTypeEClass, CodePraefixType.class, "CodePraefixType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeSonderstatusTypeEClass, CodeSonderstatusType.class, "CodeSonderstatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeSonstigeLeistungenTypeEClass, CodeSonstigeLeistungenType.class, "CodeSonstigeLeistungenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeStaatsangehoerigkeitTypeEClass, CodeStaatsangehoerigkeitType.class, "CodeStaatsangehoerigkeitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeStaatTypeEClass, CodeStaatType.class, "CodeStaatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeStandesamtnummernTypeEClass, CodeStandesamtnummernType.class, "CodeStandesamtnummernType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeStatusDatenabrufTypeEClass, CodeStatusDatenabrufType.class, "CodeStatusDatenabrufType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeTatsachenbehauptungTypeEClass, CodeTatsachenbehauptungType.class, "CodeTatsachenbehauptungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeVermoegensartTypeEClass, CodeVermoegensartType.class, "CodeVermoegensartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeVertrauensniveauTypeEClass, CodeVertrauensniveauType.class, "CodeVertrauensniveauType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeVertretungTypeEClass, CodeVertretungType.class, "CodeVertretungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeWohnsitzTypeEClass, CodeWohnsitzType.class, "CodeWohnsitzType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeZuschuesseTypeEClass, CodeZuschuesseType.class, "CodeZuschuesseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datenabrufTypeEClass, DatenabrufType.class, "DatenabrufType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatenabrufType_Id(), this.getUUIDType(), "id", null, 1, 1, DatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatenabrufType_Zeitstempel(), theXMLTypePackage.getDateTime(), "zeitstempel", null, 1, 1, DatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatenabrufType_Quelle(), theDIN913792204Package.getDatatypeC(), "quelle", null, 1, 1, DatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatenabrufType_ArtDesAbrufs(), theDIN913792204Package.getDatatypeC(), "artDesAbrufs", null, 1, 1, DatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatenabrufType_AbgerufenFuer(), theDIN913792204Package.getDatatypeC(), "abgerufenFuer", null, 1, 1, DatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatenabrufType_StatusDatenabruf(), this.getStatusDatenabrufType(), null, "statusDatenabruf", null, 1, 1, DatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datenschutzerklaerungenTypeEClass, DatenschutzerklaerungenType.class, "DatenschutzerklaerungenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatenschutzerklaerungenType_DsgvoBetreiber(), theXMLTypePackage.getBoolean(), "dsgvoBetreiber", "true", 1, 1, DatenschutzerklaerungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatenschutzerklaerungenType_DsgvoNachnutzer(), theXMLTypePackage.getBoolean(), "dsgvoNachnutzer", "true", 1, 1, DatenschutzerklaerungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entgeltdatenArbeitgeberDsrvTypeEClass, EntgeltdatenArbeitgeberDsrvType.class, "EntgeltdatenArbeitgeberDsrvType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntgeltdatenArbeitgeberDsrvType_AbfrageID(), this.getUUIDType(), "abfrageID", null, 1, 1, EntgeltdatenArbeitgeberDsrvType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntgeltdatenArbeitgeberDsrvType_IfdNrArbeitgeber(), theXMLTypePackage.getInteger(), "ifdNrArbeitgeber", null, 0, 1, EntgeltdatenArbeitgeberDsrvType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntgeltdatenArbeitgeberDsrvType_AbrufergebnisDrv(), ecorePackage.getEObject(), null, "abrufergebnisDrv", null, 0, 1, EntgeltdatenArbeitgeberDsrvType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entgeltdatenDsrvNachweisbezugTypeEClass, EntgeltdatenDsrvNachweisbezugType.class, "EntgeltdatenDsrvNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntgeltdatenDsrvNachweisbezugType_Nachweisbezug(), this.getNachweisbezugType(), null, "nachweisbezug", null, 1, 1, EntgeltdatenDsrvNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntgeltdatenDsrvNachweisbezugType_ZeitraumVon(), theXMLTypePackage.getDate(), "zeitraumVon", null, 1, 1, EntgeltdatenDsrvNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntgeltdatenDsrvNachweisbezugType_ZeitraumBis(), theXMLTypePackage.getDate(), "zeitraumBis", null, 1, 1, EntgeltdatenDsrvNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntgeltdatenDsrvNachweisbezugType_EntgeltdatenArbeitgeber(), this.getEntgeltdatenArbeitgeberDsrvType(), null, "entgeltdatenArbeitgeber", null, 0, -1, EntgeltdatenDsrvNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erreichbarkeitTypeEClass, ErreichbarkeitType.class, "ErreichbarkeitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErreichbarkeitType_Kanal(), this.getCodeErreichbarkeitType(), null, "kanal", null, 1, 1, ErreichbarkeitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErreichbarkeitType_Kennung(), theDIN913792204Package.getDatatypeC(), "kennung", null, 1, 1, ErreichbarkeitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErreichbarkeitType_Zusatz(), theDIN913792204Package.getDatatypeC(), "zusatz", null, 0, 1, ErreichbarkeitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familiennameUnstrukturiertTypeEClass, FamiliennameUnstrukturiertType.class, "FamiliennameUnstrukturiertType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamiliennameUnstrukturiertType_Nachname(), this.getAllgemeinerNameType(), null, "nachname", null, 1, 1, FamiliennameUnstrukturiertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamiliennameUnstrukturiertType_Nachnamepass(), this.getAllgemeinerNameType(), null, "nachnamepass", null, 0, 1, FamiliennameUnstrukturiertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familienstandNachweisbezugTypeEClass, FamilienstandNachweisbezugType.class, "FamilienstandNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamilienstandNachweisbezugType_Nachweisbezug(), this.getNachweisbezugType(), null, "nachweisbezug", null, 0, 1, FamilienstandNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familienstandTypeEClass, FamilienstandType.class, "FamilienstandType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamilienstandType_Seit(), this.getTagesdatumType(), "seit", null, 0, 1, FamilienstandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilienstandType_Familienstand(), this.getCodeFamilienstandType(), null, "familienstand", null, 1, 1, FamilienstandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feldgruppeTypeEClass, FeldgruppeType.class, "FeldgruppeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeldgruppeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeldgruppeType_Feld(), this.getFeldType(), null, "feld", null, 0, -1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeldgruppeType_Feldgruppe(), this.getFeldgruppeType(), null, "feldgruppe", null, 0, -1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeldgruppeType_LaufendeNummer(), theXMLTypePackage.getString(), "laufendeNummer", null, 0, 1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feldTypeEClass, FeldType.class, "FeldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeldType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeldType_Wert(), theXMLTypePackage.getString(), "wert", null, 1, 1, FeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeldType_LaufendeNummer(), theXMLTypePackage.getString(), "laufendeNummer", null, 0, 1, FeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geburtGeburtsortOptionalTypeEClass, GeburtGeburtsortOptionalType.class, "GeburtGeburtsortOptionalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeburtGeburtsortOptionalType_Geburtsort(), theDIN913792204Package.getDatatypeC(), "geburtsort", null, 0, 1, GeburtGeburtsortOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtGeburtsortOptionalType_GeburtsortStaat(), this.getCodeStaatType(), null, "geburtsortStaat", null, 0, 1, GeburtGeburtsortOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtGeburtsortOptionalType_Geburtsdatum(), this.getTeilbekanntesDatumType(), null, "geburtsdatum", null, 1, 1, GeburtGeburtsortOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geburtNachweisbezugTypeEClass, GeburtNachweisbezugType.class, "GeburtNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeburtNachweisbezugType_Nachweisbezug(), this.getNachweisbezugType(), null, "nachweisbezug", null, 0, 1, GeburtNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geburtOptionalTypeEClass, GeburtOptionalType.class, "GeburtOptionalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeburtOptionalType_Geburtsort(), theDIN913792204Package.getDatatypeC(), "geburtsort", null, 0, 1, GeburtOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtOptionalType_GeburtsortStaat(), this.getCodeStaatType(), null, "geburtsortStaat", null, 0, 1, GeburtOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtOptionalType_Geburtsdatum(), this.getTeilbekanntesDatumType(), null, "geburtsdatum", null, 0, 1, GeburtOptionalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geburtTypeEClass, GeburtType.class, "GeburtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeburtType_Geburtsort(), theDIN913792204Package.getDatatypeC(), "geburtsort", null, 1, 1, GeburtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtType_GeburtsortStaat(), this.getCodeStaatType(), null, "geburtsortStaat", null, 0, 1, GeburtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtType_Geburtsdatum(), this.getTeilbekanntesDatumType(), null, "geburtsdatum", null, 1, 1, GeburtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hausnummernBisTypeEClass, HausnummernBisType.class, "HausnummernBisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHausnummernBisType_HausnummerBis(), this.getMeldeanschriftHausnummerType(), "hausnummerBis", null, 0, 1, HausnummernBisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHausnummernBisType_HausnummerbuchstabezusatzzifferBis(), this.getMeldeanschriftHausnummerBuchstabeZusatzzifferType(), "hausnummerbuchstabezusatzzifferBis", null, 0, 1, HausnummernBisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHausnummernBisType_TeilnummerderhausnummerBis(), this.getMeldeanschriftTeilnummerDerHausnummerType(), "teilnummerderhausnummerBis", null, 0, 1, HausnummernBisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifikationNachrichtTypeEClass, IdentifikationNachrichtType.class, "IdentifikationNachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifikationNachrichtType_NachrichtenUUID(), this.getUUIDType(), "nachrichtenUUID", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifikationNachrichtType_Nachrichtentyp(), this.getCodeNachrichtentypType(), null, "nachrichtentyp", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifikationNachrichtType_Erstellungszeitpunkt(), theXMLTypePackage.getDateTime(), "erstellungszeitpunkt", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kommunikationspartnerErreichbarTypeEClass, KommunikationspartnerErreichbarType.class, "KommunikationspartnerErreichbarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kommunikationspartnerTypeEClass, KommunikationspartnerType.class, "KommunikationspartnerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKommunikationspartnerType_Behoerdenkennung(), this.getBehoerdenkennungType(), null, "behoerdenkennung", null, 1, 1, KommunikationspartnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKommunikationspartnerType_Erreichbarkeit(), this.getErreichbarkeitType(), null, "erreichbarkeit", null, 0, -1, KommunikationspartnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKommunikationspartnerType_Anschrift(), this.getPostalischeInlandsanschriftType(), null, "anschrift", null, 0, 1, KommunikationspartnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationspartnerType_Behoerdenname(), theDIN913792204Package.getDatatypeC(), "behoerdenname", null, 1, 1, KommunikationspartnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meldeanschriftTypeEClass, MeldeanschriftType.class, "MeldeanschriftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeldeanschriftType_Gemeindeschluessel(), this.getCodeGemeindeVZAmtlicherGemeindeschluesselType(), null, "gemeindeschluessel", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_Hausnummer(), this.getMeldeanschriftHausnummerType(), "hausnummer", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_HausnummerBuchstabeZusatzziffer(), this.getMeldeanschriftHausnummerBuchstabeZusatzzifferType(), "hausnummerBuchstabeZusatzziffer", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_Postleitzahl(), this.getMeldeanschriftPostleitzahlType(), "postleitzahl", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_Stockwerkswohnungsnummer(), this.getMeldeanschriftStockwerkswohnungsnummerType(), "stockwerkswohnungsnummer", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_Strasse(), this.getMeldeanschriftStrasseType(), "strasse", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_TeilnummerDerHausnummer(), this.getMeldeanschriftTeilnummerDerHausnummerType(), "teilnummerDerHausnummer", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_Wohnort(), this.getMeldeanschriftWohnortType(), "wohnort", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_WohnortFruehererGemeindename(), this.getMeldeanschriftWohnortFruehererGemeindenameType(), "wohnortFruehererGemeindename", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_Wohnungsinhaber(), this.getMeldeanschriftWohnungsinhaberType(), "wohnungsinhaber", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeldeanschriftType_Zusatzangaben(), this.getMeldeanschriftZusatzangabenType(), "zusatzangaben", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeldeanschriftType_Regionalschluessel(), this.getCodeGemeindeVZRegionalschluesselType(), null, "regionalschluessel", null, 0, 1, MeldeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtenkopfTypeEClass, NachrichtenkopfType.class, "NachrichtenkopfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtenkopfType_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 1, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfType_Leser(), this.getKommunikationspartnerType(), null, "leser", null, 1, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfType_Autor(), this.getKommunikationspartnerErreichbarType(), null, "autor", null, 1, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfType_PostkorbHandle(), this.getPostkorbHandleType(), null, "postkorbHandle", null, 0, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtTypeEClass, NachrichtType.class, "NachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtType_Nachrichtenkopf(), this.getNachrichtenkopfType(), null, "nachrichtenkopf", null, 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtType_Zusatzparametergruppe(), this.getZusatzparametergruppeType(), null, "zusatzparametergruppe", null, 0, -1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Produkt(), theDIN913792204Package.getDatatypeC(), "produkt", null, 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Produkthersteller(), theDIN913792204Package.getDatatypeC(), "produkthersteller", null, 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Produktversion(), theDIN913792204Package.getDatatypeC(), "produktversion", null, 0, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Standard(), theDIN913792204Package.getDatatypeC(), "standard", "XFamilie", 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Test(), theDIN913792204Package.getDatatypeC(), "test", null, 0, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Version(), theDIN913792204Package.getDatatypeC(), "version", null, 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweisbezugTypeEClass, NachweisbezugType.class, "NachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachweisbezugType_DatenabrufBezug(), this.getCodeNachweisbezugType(), null, "datenabrufBezug", null, 1, 1, NachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweisbezugType_DatenabrufId(), this.getUUIDType(), "datenabrufId", null, 1, 1, NachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweisdokumentTypeEClass, NachweisdokumentType.class, "NachweisdokumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNachweisdokumentType_Dokumentid(), theDIN913792204Package.getDatatypeC(), "dokumentid", null, 1, 1, NachweisdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweisdokumentType_Dateiname(), theDIN913792204Package.getDatatypeC(), "dateiname", null, 1, 1, NachweisdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweisdokumentType_Mimetype(), theDIN913792204Package.getDatatypeC(), "mimetype", null, 1, 1, NachweisdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweisdokumentType_Kategorie(), theDIN913792204Package.getDatatypeC(), "kategorie", null, 1, 1, NachweisdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameNatuerlichePersonNachweisbezugTypeEClass, NameNatuerlichePersonNachweisbezugType.class, "NameNatuerlichePersonNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameNatuerlichePersonNachweisbezugType_Nachweisbezug(), this.getNachweisbezugType(), null, "nachweisbezug", null, 0, 1, NameNatuerlichePersonNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameNatuerlichePersonOhneGeburtsnameTypeEClass, NameNatuerlichePersonOhneGeburtsnameType.class, "NameNatuerlichePersonOhneGeburtsnameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameNatuerlichePersonOhneGeburtsnameType_FamiliennameUnstrukturiert(), this.getAllgemeinerNameType(), null, "familiennameUnstrukturiert", null, 1, 1, NameNatuerlichePersonOhneGeburtsnameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameNatuerlichePersonOhneGeburtsnameType_Vornamen(), this.getAllgemeinerNameType(), null, "vornamen", null, 0, 1, NameNatuerlichePersonOhneGeburtsnameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameNatuerlichePersonTypeEClass, NameNatuerlichePersonType.class, "NameNatuerlichePersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameNatuerlichePersonType_FamiliennameUnstrukturiert(), this.getAllgemeinerNameType(), null, "familiennameUnstrukturiert", null, 1, 1, NameNatuerlichePersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameNatuerlichePersonType_GeburtsnameUnstrukturiert(), this.getAllgemeinerNameType(), null, "geburtsnameUnstrukturiert", null, 0, 1, NameNatuerlichePersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameNatuerlichePersonType_Vornamen(), this.getAllgemeinerNameType(), null, "vornamen", null, 0, 1, NameNatuerlichePersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameNatuerlichePersonVornameVerpflichtendTypeEClass, NameNatuerlichePersonVornameVerpflichtendType.class, "NameNatuerlichePersonVornameVerpflichtendType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameNatuerlichePersonVornameVerpflichtendType_FamiliennameUnstrukturiert(), this.getAllgemeinerNameType(), null, "familiennameUnstrukturiert", null, 1, 1, NameNatuerlichePersonVornameVerpflichtendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameNatuerlichePersonVornameVerpflichtendType_GeburtsnameUnstrukturiert(), this.getAllgemeinerNameType(), null, "geburtsnameUnstrukturiert", null, 0, 1, NameNatuerlichePersonVornameVerpflichtendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameNatuerlichePersonVornameVerpflichtendType_Vornamen(), this.getAllgemeinerNameType(), null, "vornamen", null, 1, 1, NameNatuerlichePersonVornameVerpflichtendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutzerkontoTypeEClass, NutzerkontoType.class, "NutzerkontoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNutzerkontoType_Name(), this.getNameNatuerlichePersonType(), null, "name", null, 1, 1, NutzerkontoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutzerkontoType_Vertrauensniveau(), this.getCodeVertrauensniveauType(), null, "vertrauensniveau", null, 1, 1, NutzerkontoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutzerkontoType_NachweisNutzerkonto(), this.getNachweisdokumentType(), null, "nachweisNutzerkonto", null, 0, -1, NutzerkontoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalischeInlandsanschriftBasisTypeEClass, PostalischeInlandsanschriftBasisType.class, "PostalischeInlandsanschriftBasisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostalischeInlandsanschriftBasisType_Hausnummer(), this.getMeldeanschriftHausnummerType(), "hausnummer", null, 0, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_HausnummerBuchstabeZusatzziffer(), this.getMeldeanschriftHausnummerBuchstabeZusatzzifferType(), "hausnummerBuchstabeZusatzziffer", null, 0, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_Postleitzahl(), this.getMeldeanschriftPostleitzahlType(), "postleitzahl", null, 1, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_Stockwerkswohnungsnummer(), this.getMeldeanschriftStockwerkswohnungsnummerType(), "stockwerkswohnungsnummer", null, 0, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_Strasse(), this.getMeldeanschriftStrasseType(), "strasse", null, 1, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_TeilnummerDerHausnummer(), this.getMeldeanschriftTeilnummerDerHausnummerType(), "teilnummerDerHausnummer", null, 0, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_Wohnort(), this.getMeldeanschriftWohnortType(), "wohnort", null, 1, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_WohnortFruehererGemeindename(), this.getMeldeanschriftWohnortFruehererGemeindenameType(), "wohnortFruehererGemeindename", null, 0, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_Wohnungsinhaber(), this.getMeldeanschriftWohnungsinhaberType(), "wohnungsinhaber", null, 0, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftBasisType_Zusatzangaben(), this.getMeldeanschriftZusatzangabenType(), "zusatzangaben", null, 0, 1, PostalischeInlandsanschriftBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass, PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType.class, "PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType_Nachweisbezug(), this.getNachweisbezugType(), null, "nachweisbezug", null, 0, 1, PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalischeInlandsanschriftGebaeudeanschriftTypeEClass, PostalischeInlandsanschriftGebaeudeanschriftType.class, "PostalischeInlandsanschriftGebaeudeanschriftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostalischeInlandsanschriftGebaeudeanschriftType_HausnummernBis(), this.getHausnummernBisType(), null, "hausnummernBis", null, 0, 1, PostalischeInlandsanschriftGebaeudeanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalischeInlandsanschriftPostfachanschriftTypeEClass, PostalischeInlandsanschriftPostfachanschriftType.class, "PostalischeInlandsanschriftPostfachanschriftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostalischeInlandsanschriftPostfachanschriftType_Postfach(), theDIN913792204Package.getDatatypeC(), "postfach", null, 0, 1, PostalischeInlandsanschriftPostfachanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftPostfachanschriftType_Wohnort(), this.getMeldeanschriftWohnortType(), "wohnort", null, 1, 1, PostalischeInlandsanschriftPostfachanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftPostfachanschriftType_Postleitzahl(), this.getMeldeanschriftPostleitzahlType(), "postleitzahl", null, 1, 1, PostalischeInlandsanschriftPostfachanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalischeInlandsanschriftPostfachanschriftType_Zusatzangaben(), theDIN913792204Package.getDatatypeC(), "zusatzangaben", null, 0, 1, PostalischeInlandsanschriftPostfachanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalischeInlandsanschriftTypeEClass, PostalischeInlandsanschriftType.class, "PostalischeInlandsanschriftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostalischeInlandsanschriftType_Postfach(), this.getPostalischeInlandsanschriftPostfachanschriftType(), null, "postfach", null, 0, 1, PostalischeInlandsanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostalischeInlandsanschriftType_Gebaeude(), this.getPostalischeInlandsanschriftGebaeudeanschriftType(), null, "gebaeude", null, 0, 1, PostalischeInlandsanschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postkorbHandleTypeEClass, PostkorbHandleType.class, "PostkorbHandleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostkorbHandleType_PostkorbHandle(), theDIN913792204Package.getDatatypeC(), "postkorbHandle", null, 0, 1, PostkorbHandleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostkorbHandleType_ZustimmungElektronischerBescheid(), theXMLTypePackage.getBoolean(), "zustimmungElektronischerBescheid", null, 0, 1, PostkorbHandleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staatsangehoerigkeitenNachweisbezugTypeEClass, StaatsangehoerigkeitenNachweisbezugType.class, "StaatsangehoerigkeitenNachweisbezugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaatsangehoerigkeitenNachweisbezugType_Staatsangehoerigkeit(), this.getCodeStaatsangehoerigkeitType(), null, "staatsangehoerigkeit", null, 1, -1, StaatsangehoerigkeitenNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaatsangehoerigkeitenNachweisbezugType_Nachweisbezug(), this.getNachweisbezugType(), null, "nachweisbezug", null, 0, 1, StaatsangehoerigkeitenNachweisbezugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusDatenabrufTypeEClass, StatusDatenabrufType.class, "StatusDatenabrufType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatusDatenabrufType_Status(), this.getCodeStatusDatenabrufType(), null, "status", null, 1, 1, StatusDatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusDatenabrufType_Hinweis(), theDIN913792204Package.getDatatypeC(), "hinweis", null, 0, 1, StatusDatenabrufType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tatsacheMitFreitextTypeEClass, TatsacheMitFreitextType.class, "TatsacheMitFreitextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTatsacheMitFreitextType_LiegtVor(), theXMLTypePackage.getBoolean(), "liegtVor", null, 1, 1, TatsacheMitFreitextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTatsacheMitFreitextType_Freitext(), theDIN913792204Package.getDatatypeC(), "freitext", null, 0, 1, TatsacheMitFreitextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tatsacheMitNachweisTypeEClass, TatsacheMitNachweisType.class, "TatsacheMitNachweisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTatsacheMitNachweisType_LiegtVor(), theXMLTypePackage.getBoolean(), "liegtVor", null, 1, 1, TatsacheMitNachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTatsacheMitNachweisType_Nachweis(), this.getUUIDType(), "nachweis", null, 0, -1, TatsacheMitNachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tatsacheMitZeitraumTypeEClass, TatsacheMitZeitraumType.class, "TatsacheMitZeitraumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTatsacheMitZeitraumType_LiegtVor(), theXMLTypePackage.getBoolean(), "liegtVor", null, 1, 1, TatsacheMitZeitraumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTatsacheMitZeitraumType_Zeitraum(), this.getZeitraumType(), null, "zeitraum", null, 0, 1, TatsacheMitZeitraumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teilbekanntesDatumTypeEClass, TeilbekanntesDatumType.class, "TeilbekanntesDatumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeilbekanntesDatumType_JahrMonatTag(), this.getTagesdatumType(), "jahrMonatTag", null, 0, 1, TeilbekanntesDatumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeilbekanntesDatumType_JahrMonat(), this.getJahrMonatType(), "jahrMonat", null, 0, 1, TeilbekanntesDatumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeilbekanntesDatumType_Jahr(), this.getJahrType(), "jahr", null, 0, 1, TeilbekanntesDatumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminwunschTypeEClass, TerminwunschType.class, "TerminwunschType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminwunschType_Wochentag(), theDIN913792204Package.getDatatypeC(), "wochentag", null, 0, -1, TerminwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminwunschType_Uhrzeit(), theDIN913792204Package.getDatatypeC(), "uhrzeit", null, 0, -1, TerminwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeitraumTypeEClass, ZeitraumType.class, "ZeitraumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZeitraumType_Beginn(), theXMLTypePackage.getDate(), "beginn", null, 0, 1, ZeitraumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZeitraumType_Ende(), theXMLTypePackage.getDate(), "ende", null, 0, 1, ZeitraumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zusatzparametergruppeTypeEClass, ZusatzparametergruppeType.class, "ZusatzparametergruppeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZusatzparametergruppeType_Feld(), this.getFeldType(), null, "feld", null, 0, -1, ZusatzparametergruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZusatzparametergruppeType_Feldgruppe(), this.getFeldgruppeType(), null, "feldgruppe", null, 0, -1, ZusatzparametergruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZusatzparametergruppeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ZusatzparametergruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZusatzparametergruppeType_FassungHandlungsanweisung(), theXMLTypePackage.getDate(), "fassungHandlungsanweisung", null, 1, 1, ZusatzparametergruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zustimmungAbrufOderWeitergabeTypeEClass, ZustimmungAbrufOderWeitergabeType.class, "ZustimmungAbrufOderWeitergabeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZustimmungAbrufOderWeitergabeType_ArtDesAbrufsOderWeitergabe(), this.getCodeArtAbrufType(), null, "artDesAbrufsOderWeitergabe", null, 1, 1, ZustimmungAbrufOderWeitergabeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZustimmungAbrufOderWeitergabeType_ZustimmungAbrufOderWeitergabe(), theXMLTypePackage.getBoolean(), "zustimmungAbrufOderWeitergabe", null, 1, 1, ZustimmungAbrufOderWeitergabeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZustimmungAbrufOderWeitergabeType_InhalteDesAbrufs(), theDIN913792204Package.getDatatypeC(), "inhalteDesAbrufs", null, 0, 1, ZustimmungAbrufOderWeitergabeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(anredeEEnum, Anrede.class, "Anrede");
		addEEnumLiteral(anredeEEnum, Anrede.M);
		addEEnumLiteral(anredeEEnum, Anrede.W);
		addEEnumLiteral(anredeEEnum, Anrede.X);

		initEEnum(artabrufEEnum, Artabruf.class, "Artabruf");
		addEEnumLiteral(artabrufEEnum, Artabruf._01);
		addEEnumLiteral(artabrufEEnum, Artabruf._02);
		addEEnumLiteral(artabrufEEnum, Artabruf._03);
		addEEnumLiteral(artabrufEEnum, Artabruf._04);

		initEEnum(artnachweisEEnum, Artnachweis.class, "Artnachweis");
		addEEnumLiteral(artnachweisEEnum, Artnachweis._01);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._02);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._03);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._04);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._05);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._06);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._07);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._08);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._09);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._10);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._11);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._12);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._13);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._14);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._15);
		addEEnumLiteral(artnachweisEEnum, Artnachweis._16);

		initEEnum(aufenthaltsstatusEEnum, Aufenthaltsstatus.class, "Aufenthaltsstatus");
		addEEnumLiteral(aufenthaltsstatusEEnum, Aufenthaltsstatus._01);
		addEEnumLiteral(aufenthaltsstatusEEnum, Aufenthaltsstatus._02);
		addEEnumLiteral(aufenthaltsstatusEEnum, Aufenthaltsstatus._03);
		addEEnumLiteral(aufenthaltsstatusEEnum, Aufenthaltsstatus._04);
		addEEnumLiteral(aufenthaltsstatusEEnum, Aufenthaltsstatus._05);
		addEEnumLiteral(aufenthaltsstatusEEnum, Aufenthaltsstatus._06);
		addEEnumLiteral(aufenthaltsstatusEEnum, Aufenthaltsstatus._07);

		initEEnum(eigenschaftEEnum, Eigenschaft.class, "Eigenschaft");
		addEEnumLiteral(eigenschaftEEnum, Eigenschaft._01);
		addEEnumLiteral(eigenschaftEEnum, Eigenschaft._02);

		initEEnum(einkommensartenEEnum, Einkommensarten.class, "Einkommensarten");
		addEEnumLiteral(einkommensartenEEnum, Einkommensarten._1000);
		addEEnumLiteral(einkommensartenEEnum, Einkommensarten._1100);
		addEEnumLiteral(einkommensartenEEnum, Einkommensarten._2050);
		addEEnumLiteral(einkommensartenEEnum, Einkommensarten._2070);
		addEEnumLiteral(einkommensartenEEnum, Einkommensarten._2140);
		addEEnumLiteral(einkommensartenEEnum, Einkommensarten._3000);
		addEEnumLiteral(einkommensartenEEnum, Einkommensarten._6180);

		initEEnum(familienstandEEnum, Familienstand.class, "Familienstand");
		addEEnumLiteral(familienstandEEnum, Familienstand.EA);
		addEEnumLiteral(familienstandEEnum, Familienstand.GS);
		addEEnumLiteral(familienstandEEnum, Familienstand.LA);
		addEEnumLiteral(familienstandEEnum, Familienstand.LD);
		addEEnumLiteral(familienstandEEnum, Familienstand.LE);
		addEEnumLiteral(familienstandEEnum, Familienstand.LP);
		addEEnumLiteral(familienstandEEnum, Familienstand.LV);
		addEEnumLiteral(familienstandEEnum, Familienstand.NB);
		addEEnumLiteral(familienstandEEnum, Familienstand.VH);
		addEEnumLiteral(familienstandEEnum, Familienstand.VW);

		initEEnum(geschlechtEEnum, Geschlecht.class, "Geschlecht");
		addEEnumLiteral(geschlechtEEnum, Geschlecht.D);
		addEEnumLiteral(geschlechtEEnum, Geschlecht.M);
		addEEnumLiteral(geschlechtEEnum, Geschlecht.U);
		addEEnumLiteral(geschlechtEEnum, Geschlecht.W);
		addEEnumLiteral(geschlechtEEnum, Geschlecht.X);

		initEEnum(kindschaftsbeziehungEEnum, Kindschaftsbeziehung.class, "Kindschaftsbeziehung");
		addEEnumLiteral(kindschaftsbeziehungEEnum, Kindschaftsbeziehung._01);
		addEEnumLiteral(kindschaftsbeziehungEEnum, Kindschaftsbeziehung._02);
		addEEnumLiteral(kindschaftsbeziehungEEnum, Kindschaftsbeziehung._03);
		addEEnumLiteral(kindschaftsbeziehungEEnum, Kindschaftsbeziehung._04);

		initEEnum(kindwohnhaftbeiEEnum, Kindwohnhaftbei.class, "Kindwohnhaftbei");
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._01);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._02);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._03);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._04);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._05);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._06);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._07);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._08);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._09);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._10);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._11);
		addEEnumLiteral(kindwohnhaftbeiEEnum, Kindwohnhaftbei._12);

		initEEnum(leistungserhaltEEnum, Leistungserhalt.class, "Leistungserhalt");
		addEEnumLiteral(leistungserhaltEEnum, Leistungserhalt._01);
		addEEnumLiteral(leistungserhaltEEnum, Leistungserhalt._02);
		addEEnumLiteral(leistungserhaltEEnum, Leistungserhalt._03);
		addEEnumLiteral(leistungserhaltEEnum, Leistungserhalt._04);

		initEEnum(leistungsgewaehrungEEnum, Leistungsgewaehrung.class, "Leistungsgewaehrung");
		addEEnumLiteral(leistungsgewaehrungEEnum, Leistungsgewaehrung._01);
		addEEnumLiteral(leistungsgewaehrungEEnum, Leistungsgewaehrung._02);
		addEEnumLiteral(leistungsgewaehrungEEnum, Leistungsgewaehrung._03);

		initEEnum(nachrichtentypEEnum, Nachrichtentyp.class, "Nachrichtentyp");
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0001);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0003);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0011);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0201);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0202);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0203);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0204);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0205);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0206);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0301);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0302);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0303);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0311);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0401);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0402);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0403);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0501);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0502);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0601);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0604);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0701);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0702);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0703);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0704);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0711);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0801);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0802);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0803);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0804);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0805);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0806);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0901);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._0902);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._1001);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._1002);
		addEEnumLiteral(nachrichtentypEEnum, Nachrichtentyp._1003);

		initEEnum(nachweisbezugEEnum, Nachweisbezug.class, "Nachweisbezug");
		addEEnumLiteral(nachweisbezugEEnum, Nachweisbezug._01);
		addEEnumLiteral(nachweisbezugEEnum, Nachweisbezug._02);
		addEEnumLiteral(nachweisbezugEEnum, Nachweisbezug._03);

		initEEnum(personensorgerechtEEnum, Personensorgerecht.class, "Personensorgerecht");
		addEEnumLiteral(personensorgerechtEEnum, Personensorgerecht._01);
		addEEnumLiteral(personensorgerechtEEnum, Personensorgerecht._02);
		addEEnumLiteral(personensorgerechtEEnum, Personensorgerecht._03);
		addEEnumLiteral(personensorgerechtEEnum, Personensorgerecht._04);

		initEEnum(sonderstatusEEnum, Sonderstatus.class, "Sonderstatus");
		addEEnumLiteral(sonderstatusEEnum, Sonderstatus._01);
		addEEnumLiteral(sonderstatusEEnum, Sonderstatus._02);
		addEEnumLiteral(sonderstatusEEnum, Sonderstatus._03);
		addEEnumLiteral(sonderstatusEEnum, Sonderstatus._04);

		initEEnum(sonstigeleistungenEEnum, Sonstigeleistungen.class, "Sonstigeleistungen");
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._01);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._02);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._03);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._04);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._05);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._06);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._07);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._08);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._09);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._10);
		addEEnumLiteral(sonstigeleistungenEEnum, Sonstigeleistungen._11);

		initEEnum(statusdatenabrufEEnum, Statusdatenabruf.class, "Statusdatenabruf");
		addEEnumLiteral(statusdatenabrufEEnum, Statusdatenabruf._01);
		addEEnumLiteral(statusdatenabrufEEnum, Statusdatenabruf._02);

		initEEnum(tatsachenbehauptungEEnum, Tatsachenbehauptung.class, "Tatsachenbehauptung");
		addEEnumLiteral(tatsachenbehauptungEEnum, Tatsachenbehauptung._01);
		addEEnumLiteral(tatsachenbehauptungEEnum, Tatsachenbehauptung._02);
		addEEnumLiteral(tatsachenbehauptungEEnum, Tatsachenbehauptung._03);

		initEEnum(vertrauensniveauEEnum, Vertrauensniveau.class, "Vertrauensniveau");
		addEEnumLiteral(vertrauensniveauEEnum, Vertrauensniveau._01);
		addEEnumLiteral(vertrauensniveauEEnum, Vertrauensniveau._02);
		addEEnumLiteral(vertrauensniveauEEnum, Vertrauensniveau._03);
		addEEnumLiteral(vertrauensniveauEEnum, Vertrauensniveau._04);

		initEEnum(vertretungEEnum, Vertretung.class, "Vertretung");
		addEEnumLiteral(vertretungEEnum, Vertretung._01);
		addEEnumLiteral(vertretungEEnum, Vertretung._02);
		addEEnumLiteral(vertretungEEnum, Vertretung._03);
		addEEnumLiteral(vertretungEEnum, Vertretung._04);
		addEEnumLiteral(vertretungEEnum, Vertretung._05);
		addEEnumLiteral(vertretungEEnum, Vertretung._06);
		addEEnumLiteral(vertretungEEnum, Vertretung._07);

		initEEnum(wohnsitzEEnum, Wohnsitz.class, "Wohnsitz");
		addEEnumLiteral(wohnsitzEEnum, Wohnsitz._01);
		addEEnumLiteral(wohnsitzEEnum, Wohnsitz._02);
		addEEnumLiteral(wohnsitzEEnum, Wohnsitz._03);
		addEEnumLiteral(wohnsitzEEnum, Wohnsitz._04);

		initEEnum(zuschuesseEEnum, Zuschuesse.class, "Zuschuesse");
		addEEnumLiteral(zuschuesseEEnum, Zuschuesse._01);
		addEEnumLiteral(zuschuesseEEnum, Zuschuesse._02);

		// Initialize data types
		initEDataType(anredeObjectEDataType, Anrede.class, "AnredeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(artabrufObjectEDataType, Artabruf.class, "ArtabrufObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(artnachweisObjectEDataType, Artnachweis.class, "ArtnachweisObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(aufenthaltsstatusObjectEDataType, Aufenthaltsstatus.class, "AufenthaltsstatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eigenschaftObjectEDataType, Eigenschaft.class, "EigenschaftObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(einkommensartenObjectEDataType, Einkommensarten.class, "EinkommensartenObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(familienstandObjectEDataType, Familienstand.class, "FamilienstandObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geschlechtObjectEDataType, Geschlecht.class, "GeschlechtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jahrMonatTypeEDataType, XMLGregorianCalendar.class, "JahrMonatType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jahrTypeEDataType, XMLGregorianCalendar.class, "JahrType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindschaftsbeziehungObjectEDataType, Kindschaftsbeziehung.class, "KindschaftsbeziehungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindwohnhaftbeiObjectEDataType, Kindwohnhaftbei.class, "KindwohnhaftbeiObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(krankenversichertennummerTypeEDataType, String.class, "KrankenversichertennummerType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(leistungserhaltObjectEDataType, Leistungserhalt.class, "LeistungserhaltObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(leistungsgewaehrungObjectEDataType, Leistungsgewaehrung.class, "LeistungsgewaehrungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftHausnummerBuchstabeZusatzzifferTypeEDataType, String.class, "MeldeanschriftHausnummerBuchstabeZusatzzifferType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftHausnummerTypeEDataType, String.class, "MeldeanschriftHausnummerType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftPostleitzahlTypeEDataType, String.class, "MeldeanschriftPostleitzahlType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftStockwerkswohnungsnummerTypeEDataType, String.class, "MeldeanschriftStockwerkswohnungsnummerType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftStrasseTypeEDataType, String.class, "MeldeanschriftStrasseType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftTeilnummerDerHausnummerTypeEDataType, String.class, "MeldeanschriftTeilnummerDerHausnummerType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftWohnortFruehererGemeindenameTypeEDataType, String.class, "MeldeanschriftWohnortFruehererGemeindenameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftWohnortTypeEDataType, String.class, "MeldeanschriftWohnortType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftWohnungsinhaberTypeEDataType, String.class, "MeldeanschriftWohnungsinhaberType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meldeanschriftZusatzangabenTypeEDataType, String.class, "MeldeanschriftZusatzangabenType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nachrichtentypObjectEDataType, Nachrichtentyp.class, "NachrichtentypObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nachweisbezugObjectEDataType, Nachweisbezug.class, "NachweisbezugObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(personensorgerechtObjectEDataType, Personensorgerecht.class, "PersonensorgerechtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sonderstatusObjectEDataType, Sonderstatus.class, "SonderstatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sonstigeleistungenObjectEDataType, Sonstigeleistungen.class, "SonstigeleistungenObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statusdatenabrufObjectEDataType, Statusdatenabruf.class, "StatusdatenabrufObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(steuerlicheIdentifikationsnummerTypeEDataType, String.class, "SteuerlicheIdentifikationsnummerType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tagesdatumTypeEDataType, XMLGregorianCalendar.class, "TagesdatumType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tatsachenbehauptungObjectEDataType, Tatsachenbehauptung.class, "TatsachenbehauptungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uuidTypeEDataType, String.class, "UUIDType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vertrauensniveauObjectEDataType, Vertrauensniveau.class, "VertrauensniveauObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vertretungObjectEDataType, Vertretung.class, "VertretungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wohnsitzObjectEDataType, Wohnsitz.class, "WohnsitzObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zuschuesseObjectEDataType, Zuschuesse.class, "ZuschuesseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n           \n  <standard>\n                \n    <nameLang>XFamilie</nameLang>\n                \n    <nameKurz>XFamilie</nameKurz>\n                \n    <nameTechnisch>xfamilie</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:standard:xfamilie</kennung>\n                \n    <beschreibung>Projektziel ist die elektronische Kommunikation im Familienbereich zwischen verschiedenen Beh\u00f6rden, Institutionen, Registern und Onlineportalen, die Daten untereinander austauschen, zu unterst\u00fctzen. Der Nutzen des Projekts besteht in der Kostenreduktion und einer Verbesserung der Qualit\u00e4t von Daten f\u00fcr Familienleistungen, sowie einer Verbesserung der Interoperabilit\u00e4t von Akteuren im Familienbereich und weiteren Kommunikationspartner.</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>1.3.0</version>\n                \n    <beschreibung>Die \u00c4nderungshistorie befindet sich in Tabellenform nach Change Requests gegliedert in Kapitel E.</beschreibung>\n                \n    <versionXOEVProfil>3.0.2</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.2</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.0</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n"
		   });
		addAnnotation
		  (anredeEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Anrede</nameLang>\n                   \n    <nameKurz>Anrede</nameKurz>\n                   \n    <nameTechnisch>anrede</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:anrede</kennung>\n                   \n    <beschreibung>Die Art der Anreden.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Anreden an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (anredeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Herr</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (anredeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Frau</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (anredeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ohne Angabe</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artabrufEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Art des Abrufs</nameLang>\n                   \n    <nameKurz>Art des Abrufs</nameKurz>\n                   \n    <nameTechnisch>artabruf</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:artabruf</kennung>\n                   \n    <beschreibung>Die Codeliste enth\u00e4lt m\u00f6gliche Werte, die die Art des Datenabrufs beschreiben.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Abrufe an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (artabrufEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>DSRV</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artabrufEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Meldeamt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artabrufEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Standesamt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artabrufEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstige</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>ArtNachweis</nameLang>\n                   \n    <nameKurz>ArtNachweis</nameKurz>\n                   \n    <nameTechnisch>artnachweis</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:artnachweis</kennung>\n                   \n    <beschreibung>Die Codeliste enth\u00e4lt m\u00f6gliche Werte, die die Art des Nachweises beschreiben.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Nachweise an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2023-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Rechnungen der Reproduktionseinrichtung, Apotheken, des Labors, ggf. an\u00e4sthesiologischen Praxis</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Negativbescheinigung(en) Ihrer Versicherung(en) bzw. Kostentr\u00e4ger</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Leistungsnachweis der privaten Krankenversicherung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Zahlungsnachweis der gesetzlichen Krankenversicherung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Leistungsnachweis der Beihilfe</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Personalausweis, Meldebescheinigung oder Aufenthaltstitel</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Meldebescheinigung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>\u00c4rztliche Bescheinigung einer auf Dauer angelegten Lebensgemeinschaft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Notwendigkeitsbescheinigung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Kosten\u00fcbernahmeerkl\u00e4rung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Behandlungsplan</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Kostenvoranschlag</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Negativbescheid</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Erkl\u00e4rung der Reproduktionseinrichtung (nur f\u00fcr Rheinland-Pfalz relevant)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Eheurkunde (nur f\u00fcr Rheinland-Pfalz relevant)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (artnachweisEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstiger</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Aufenthaltsstatus</nameLang>\n                   \n    <nameKurz>Aufenthaltsstatus</nameKurz>\n                   \n    <nameTechnisch>aufenthaltsstatus</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:aufenthaltsstatus</kennung>\n                   \n    <beschreibung>Die Liste codiert den Aufenthaltsstatus.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Visum</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>ICT-Karte</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Blaue Karte EU</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Aufenthaltserlaubnis</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Mobiler-ICT-Karte</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Niederlassungserlaubnis</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Erlaubnis zum Daueraufenthalt \u2013 EU</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (codeAnredeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Anrede</nameLang>\n                   \n    <nameKurz>Anrede</nameKurz>\n                   \n    <nameTechnisch>anrede</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:anrede</kennung>\n                   \n    <beschreibung>Die Art der Anreden.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Anreden an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeArtAbrufTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Art des Abrufs</nameLang>\n                   \n    <nameKurz>Art des Abrufs</nameKurz>\n                   \n    <nameTechnisch>artabruf</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:artabruf</kennung>\n                   \n    <beschreibung>Die Codeliste enth\u00e4lt m\u00f6gliche Werte, die die Art des Datenabrufs beschreiben.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Abrufe an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeAufenthaltsstatusTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Aufenthaltsstatus</nameLang>\n                   \n    <nameKurz>Aufenthaltsstatus</nameKurz>\n                   \n    <nameTechnisch>aufenthaltsstatus</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:aufenthaltsstatus</kennung>\n                   \n    <beschreibung>Die Liste codiert den Aufenthaltsstatus.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeBundeslandTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Bundesland</nameLang>\n                   \n    <nameKurz>Bundesland</nameKurz>\n                   \n    <nameTechnisch>bundesland</nameTechnisch>\n                   \n    <kennung>urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:bundesland</kennung>\n                   \n    <beschreibung>Die Bundesrepublik Deutschland ist ein Zusammenschluss von Bundesl\u00e4ndern. Die meisten Bundesl\u00e4nder umfassen mehrere Kreise und Bezirke.Diese Codeliste stellt die deutschen Bundesl\u00e4nder nach dem Gemeindeverzeichnis des Statistischen Bundesamtes dar. Dieser Code ist auch Bestandteil des Amtlichen Gemeindeschl\u00fcssels (AGS).</beschreibung>\n                   \n    <herausgebernameLang>Statistisches Bundesamt, Wiesbaden</herausgebernameLang>\n                   \n    <herausgebernameKurz>Destatis</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeEigenschaftTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Eigenschaft</nameLang>\n                   \n    <nameKurz>Eigenschaft</nameKurz>\n                   \n    <nameTechnisch>eigenschaft</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:eigenschaft</kennung>\n                   \n    <beschreibung>Die Codeliste gibt an in welcher Eigenschaft man Hilfe beantragt.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeEinkommensartenTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Einkommensarten</nameLang>\n                   \n    <nameKurz>Einkommensarten</nameKurz>\n                   \n    <nameTechnisch>einkommensarten</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:einkommensarten</kennung>\n                   \n    <beschreibung>Die Liste codiert die verschiedenen Einkommensarten.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeErreichbarkeitTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Erreichbarkeit</nameLang>\n                   \n    <nameKurz>Erreichbarkeit</nameKurz>\n                   \n    <nameTechnisch>erreichbarkeit</nameTechnisch>\n                   \n    <kennung>urn:de:xoev:codeliste:erreichbarkeit</kennung>\n                   \n    <beschreibung>Eine Liste der Kommunikationsmedien und -kan\u00e4le, \u00fcber die man eine Person oder Institution erreichen kann.</beschreibung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeFamilienstandTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Familienstand</nameLang>\n                   \n    <nameKurz>Familienstand</nameKurz>\n                   \n    <nameTechnisch>familienstand</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:familienstand</kennung>\n                   \n    <beschreibung>Die Liste codiert den Familienstand.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeGemeindeVZAmtlicherGemeindeschluesselTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Amtlicher Gemeindeschl\u00fcssel</nameLang>\n                   \n    <nameKurz>AGS</nameKurz>\n                   \n    <nameTechnisch>ags</nameTechnisch>\n                   \n    <kennung>urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:ags</kennung>\n                   \n    <beschreibung>Diese Codeliste stellt alle Gemeinden Deutschlands durch den Amtlichen Gemeindeschl\u00fcssel (AGS) dar, wie im Gemeindeverzeichnis des Statistischen Bundesamtes enthalten.</beschreibung>\n                   \n    <herausgebernameLang>Statistisches Bundesamt, Wiesbaden</herausgebernameLang>\n                   \n    <herausgebernameKurz>Destatis</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeGemeindeVZRegionalschluesselTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Gemeinden, dargestellt durch den Regionalschl\u00fcssel(RS) des Statistischen Bundesamtes</nameLang>\n                   \n    <nameKurz>Regionalschl\u00fcssel</nameKurz>\n                   \n    <nameTechnisch>rs</nameTechnisch>\n                   \n    <kennung>urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:rs</kennung>\n                   \n    <beschreibung>Diese Codeliste stellt alle Gemeinden Deutschlands durch den Amtlichen Regionalschl\u00fcssel (ARS) dar, wie im Gemeindeverzeichnis des Statistischen Bundesamtes enthalten. Dar\u00fcber hinaus enth\u00e4lt die Codeliste f\u00fcr die Stadtstaaten Hamburg, Bremen und Berlin Eintr\u00e4ge f\u00fcr Stadt-/Ortsteile bzw. Stadtbezirke. Diese Eintr\u00e4ge sind mit einem entsprechenden Hinweis versehen.</beschreibung>\n                   \n    <herausgebernameLang>Statistisches Bundesamt, Wiesbaden</herausgebernameLang>\n                   \n    <herausgebernameKurz>Destatis</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeGeschlechtTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Geschlecht</nameLang>\n                   \n    <nameKurz>Geschlecht</nameKurz>\n                   \n    <nameTechnisch>geschlecht</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:geschlecht</kennung>\n                   \n    <beschreibung>Die Liste codiert das Geschlecht.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeKindschaftsbeziehungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Kindschaftsbeziehung</nameLang>\n                   \n    <nameKurz>Kindschaftsbeziehung</nameKurz>\n                   \n    <nameTechnisch>kindschaftsbeziehung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:kindschaftsbeziehung</kennung>\n                   \n    <beschreibung>Beschreibt das Verh\u00e4ltnis und den Verwandschaftsgrad zwischen Kindern und Elternteilen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeKindWohnhaftBeiTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>KindWohnhaftBei</nameLang>\n                   \n    <nameKurz>KindWohnhaftBei</nameKurz>\n                   \n    <nameTechnisch>kindwohnhaftbei</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:kindwohnhaftbei</kennung>\n                   \n    <beschreibung>Wohnort des Kindes im Kindergeldantrag.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2024-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeLeistungserhaltTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Leistungserhalt</nameLang>\n                   \n    <nameKurz>Leistungserhalt</nameKurz>\n                   \n    <nameTechnisch>leistungserhalt</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:leistungserhalt</kennung>\n                   \n    <beschreibung>Die Liste codiert verschiede Rollen, die eine Leistung erhalten k\u00f6nnen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeLeistungsgewaehrungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Leistungsgewaehrung</nameLang>\n                   \n    <nameKurz>Leistungsgewaehrung</nameKurz>\n                   \n    <nameTechnisch>leistungsgewaehrung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:leistungsgewaehrung</kennung>\n                   \n    <beschreibung>Die Liste codiert verschiede Rollen, die eine Leistung erhalten k\u00f6nnen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeNachrichtentypTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Nachrichtentyp</nameLang>\n                   \n    <nameKurz>Nachrichtentyp</nameKurz>\n                   \n    <nameTechnisch>nachrichtentyp</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:nachrichtentyp</kennung>\n                   \n    <beschreibung>Die Werteliste der Nachrichtentypen, die den Namen der jeweiligen Nachricht angeben.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>4.0</version>\n                   \n    <beschreibung>Die Werteliste der Nachrichtentypen, die den Namen der jeweiligen Nachricht angeben.</beschreibung>\n                   \n    <datumGueltigkeitAb>2024-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Nachweisbezug</nameLang>\n                   \n    <nameKurz>Nachweisbezug</nameKurz>\n                   \n    <nameTechnisch>nachweisbezug</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:nachweisbezug</kennung>\n                   \n    <beschreibung>Die Liste codiert, wie das Datenfeld mit Nachweisbezug behandelt wird.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codePersonensorgerechtTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Personensorgerecht</nameLang>\n                   \n    <nameKurz>Personensorgerecht</nameKurz>\n                   \n    <nameTechnisch>personensorgerecht</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:personensorgerecht</kennung>\n                   \n    <beschreibung>Die Codeliste gibt an, bei wem das Personensorgerecht liegt.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codePraefixTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Praefix</nameLang>\n                   \n    <nameKurz>Pr\u00e4fix</nameKurz>\n                   \n    <nameTechnisch>praefix</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:bund:bmi:bit:codeliste:dvdv.praefix</kennung>\n                   \n    <beschreibung>Diese Codeliste enth\u00e4lt alle Pr\u00e4fixe, welche im DVDV zum Einsatz kommen. Diese Pr\u00e4fixe werden f\u00fcr die fachliche Adressierung \u00fcber das DVDV verwendet.</beschreibung>\n                   \n    <herausgebernameLang>Bundesverwaltungsamt (koordinierende Stelle f\u00fcr das DVDV)</herausgebernameLang>\n                   \n    <herausgebernameKurz>Bundesverwaltungsamt</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeSonderstatusTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Sonderstatus</nameLang>\n                   \n    <nameKurz>Sonderstatus</nameKurz>\n                   \n    <nameTechnisch>sonderstatus</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:sonderstatus</kennung>\n                   \n    <beschreibung>Die Liste codiert, die verschiedenen Sonderf\u00e4lle f\u00fcr die Antragsnachrichten.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeSonstigeLeistungenTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>SonstigeLeistungen</nameLang>\n                   \n    <nameKurz>SonstigeLeistungen</nameKurz>\n                   \n    <nameTechnisch>sonstigeleistungen</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:sonstigeleistungen</kennung>\n                   \n    <beschreibung>Die Liste codiert die unterschiedlichen Sozial-, Familien- und Entgeltersatzleistungen, die auf die zu beantragenden Leistungen angerechnet werden.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2025-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeStaatsangehoerigkeitTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Staatsangehoerigkeit</nameLang>\n                   \n    <nameKurz>Staatsangehoerigkeit</nameKurz>\n                   \n    <nameTechnisch>staatsangehoerigkeit</nameTechnisch>\n                   \n    <kennung>urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staatsangehoerigkeit</kennung>\n                   \n    <beschreibung>Hier werden Angaben zur Staatsangeh\u00f6rigkeit zusammengefasst.</beschreibung>\n                   \n    <herausgebernameLang>Statistisches Bundesamt, Wiesbaden</herausgebernameLang>\n                   \n    <herausgebernameKurz>Destatis</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeStaatTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Die deutschen Bundesl\u00e4nder nach dem Gemeindeverzeichnis des Statistischen Bundesamtes</nameLang>\n                   \n    <nameKurz>Bundesland</nameKurz>\n                   \n    <nameTechnisch>Bundesland</nameTechnisch>\n                   \n    <kennung>urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat</kennung>\n                   \n    <beschreibung>Codeliste Staat aus der Staats- und Gebietssystematik des Statistischen Bundesamtes.</beschreibung>\n                   \n    <herausgebernameLang>Statistisches Bundesamt, Wiesbaden</herausgebernameLang>\n                   \n    <herausgebernameKurz>Destatis</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeStandesamtnummernTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Basis+ Standesamtsnummern</nameLang>\n                   \n    <nameKurz>standesamtsnummern</nameKurz>\n                   \n    <nameTechnisch>standesamtsnummern</nameTechnisch>\n                   \n    <kennung>urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:standesamtsnummern</kennung>\n                   \n    <beschreibung>Nummern der Standes\u00e4mter in Deutschland. Werden von den Statistischen Landes\u00e4mtern vergeben und indentifiziern ein Standesamt eindeutig. Gestatten die Adressierung eines Standesamtes in der X\u00d6V-DVDV-Infrastruktur des Bundes und der L\u00e4nder.</beschreibung>\n                   \n    <herausgebernameLang>Basis+</herausgebernameLang>\n                   \n    <herausgebernameKurz>Basis+</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeStatusDatenabrufTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>StatusDatenabruf</nameLang>\n                   \n    <nameKurz>StatusDatenabruf</nameKurz>\n                   \n    <nameTechnisch>statusdatenabruf</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:statusdatenabruf</kennung>\n                   \n    <beschreibung>Beschreibt die m\u00f6glichen Statuswerte eines Datenabrufs.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeTatsachenbehauptungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Tatsachenbehauptung</nameLang>\n                   \n    <nameKurz>Tatsachenbehauptung</nameKurz>\n                   \n    <nameTechnisch>tatsachenbehauptung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:tatsachenbehauptung</kennung>\n                   \n    <beschreibung>Die Liste codiert Tatsachenbehauptung, die eine Person in einem Antrag machen kann.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeVermoegensartTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Vermoegensart</nameLang>\n                   \n    <nameKurz>Vermoegensart</nameKurz>\n                   \n    <nameTechnisch>vermoegensart</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:d-nrw:codeliste:vermoegensart</kennung>\n                   \n    <beschreibung>Mit dieser Schl\u00fcsseltabelle wird das Verm\u00f6gen abgebildet.</beschreibung>\n                   \n    <herausgebernameLang>d-NRW A\u00f6R</herausgebernameLang>\n                   \n    <herausgebernameKurz>d-NRW A\u00f6R</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeVertrauensniveauTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Vertrauensniveau</nameLang>\n                   \n    <nameKurz>Vertrauensniveau</nameKurz>\n                   \n    <nameTechnisch>vertrauensniveau</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:vertrauensniveau</kennung>\n                   \n    <beschreibung>Die Liste codiert das Vertrauensniveau des genutzten Nutzerkontos.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeVertretungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Vertretung</nameLang>\n                   \n    <nameKurz>Vertretung</nameKurz>\n                   \n    <nameTechnisch>vertretung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:vertretung</kennung>\n                   \n    <beschreibung>Rechtliche Vertretung, Verm\u00f6gens- oder Personensorge einer Person.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeWohnsitzTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Wohnsitz</nameLang>\n                   \n    <nameKurz>Wohnsitz</nameKurz>\n                   \n    <nameTechnisch>wohnsitz</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:wohnsitz</kennung>\n                   \n    <beschreibung>Die Liste codiert die verschiedenen m\u00f6glichen Wohnsitze der Eltern.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeZuschuesseTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Zuschuesse</nameLang>\n                   \n    <nameKurz>Zuschuesse</nameKurz>\n                   \n    <nameTechnisch>zuschuesse</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:zuschuesse</kennung>\n                   \n    <beschreibung>Die Codeliste gibt an, ob es Zusch\u00fcsse gibt oder nicht.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (eigenschaftEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Eigenschaft</nameLang>\n                   \n    <nameKurz>Eigenschaft</nameKurz>\n                   \n    <nameTechnisch>eigenschaft</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:eigenschaft</kennung>\n                   \n    <beschreibung>Die Codeliste gibt an in welcher Eigenschaft man Hilfe beantragt.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (eigenschaftEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Pflegeperson</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (eigenschaftEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vormund/in</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommensartenEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Einkommensarten</nameLang>\n                   \n    <nameKurz>Einkommensarten</nameKurz>\n                   \n    <nameTechnisch>einkommensarten</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:einkommensarten</kennung>\n                   \n    <beschreibung>Die Liste codiert die verschiedenen Einkommensarten.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (einkommensartenEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Erwerbseinkommen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommensartenEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ausbildungsverg\u00fctung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommensartenEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>BAB</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommensartenEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstige Leistungen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommensartenEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>BAf\u00f6G</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommensartenEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Rente</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommensartenEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstiges Einkommen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Familienstand</nameLang>\n                   \n    <nameKurz>Familienstand</nameKurz>\n                   \n    <nameTechnisch>familienstand</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:familienstand</kennung>\n                   \n    <beschreibung>Die Liste codiert den Familienstand.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ehe aufgehoben</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>geschieden</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>aufgehobene Lebenspartnerschaft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>ledig</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>durch Todeserkl\u00e4rung aufgel\u00f6ste Lebenspartnerschaft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>in eingetragener Lebenspartnerschaft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>durch Tod aufgel\u00f6ste Lebenspartnerschaft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>nicht bekannt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>verheiratet</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (familienstandEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>verwitwet</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (feldgruppeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Feldgruppe</title>\n           \n"
		   });
		addAnnotation
		  (feldTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Feld</title>\n           \n"
		   });
		addAnnotation
		  (getGeburtGeburtsortOptionalType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Deutschland wird immer durch Weglassen dieses Elementes abgebildet.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getGeburtOptionalType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Deutschland wird immer durch Weglassen dieses Elementes abgebildet.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getGeburtType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Deutschland wird immer durch Weglassen dieses Elementes abgebildet.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (geschlechtEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Geschlecht</nameLang>\n                   \n    <nameKurz>Geschlecht</nameKurz>\n                   \n    <nameTechnisch>geschlecht</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:geschlecht</kennung>\n                   \n    <beschreibung>Die Liste codiert das Geschlecht.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (geschlechtEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>divers</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (geschlechtEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>m\u00e4nnlich</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (geschlechtEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>unbekannt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (geschlechtEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>weiblich</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (geschlechtEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>ohne Angabe</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindschaftsbeziehungEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Kindschaftsbeziehung</nameLang>\n                   \n    <nameKurz>Kindschaftsbeziehung</nameKurz>\n                   \n    <nameTechnisch>kindschaftsbeziehung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:kindschaftsbeziehung</kennung>\n                   \n    <beschreibung>Beschreibt das Verh\u00e4ltnis und den Verwandschaftsgrad zwischen Kindern und Elternteilen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (kindschaftsbeziehungEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>leibliche Mutter</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindschaftsbeziehungEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>leiblicher Vater</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindschaftsbeziehungEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>nur rechtlicher und nicht leiblicher Elternteil</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindschaftsbeziehungEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>nicht leiblich und nicht rechtlich</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>KindWohnhaftBei</nameLang>\n                   \n    <nameKurz>KindWohnhaftBei</nameKurz>\n                   \n    <nameTechnisch>kindwohnhaftbei</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:kindwohnhaftbei</kennung>\n                   \n    <beschreibung>Wohnort des Kindes im Kindergeldantrag.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2024-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Zusammen mit beiden Eltern</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bei der Mutter</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bei dem anderen Elternteil</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bei einer weiteren Person</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Beim Antragstellenden Elternteil</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Auslandsschuljahr</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ausbildungsbedingt nicht im elterlichen Haushalt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Im Heim oder Pflegestelle und regelmaessig beim Elternteil</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Im Heim oder Pflegestelle und selten beim Elternteil nur fuer Umgangskontakte</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>In Haft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstiger Aufenthaltsort</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bei mir</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (krankenversichertennummerTypeEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Krankenversichertennummer</title>\n           \n"
		   });
		addAnnotation
		  (leistungserhaltEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Leistungserhalt</nameLang>\n                   \n    <nameKurz>Leistungserhalt</nameKurz>\n                   \n    <nameTechnisch>leistungserhalt</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:leistungserhalt</kennung>\n                   \n    <beschreibung>Die Liste codiert verschiede Rollen, die eine Leistung erhalten k\u00f6nnen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (leistungserhaltEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Antragskind</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (leistungserhaltEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>antragstellend und alleinerziehender Elternteil</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (leistungserhaltEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>anderer Elternteil</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (leistungserhaltEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>andere Person</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (leistungsgewaehrungEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Leistungsgewaehrung</nameLang>\n                   \n    <nameKurz>Leistungsgewaehrung</nameKurz>\n                   \n    <nameTechnisch>leistungsgewaehrung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:leistungsgewaehrung</kennung>\n                   \n    <beschreibung>Die Liste codiert verschiede Rollen, die eine Leistung erhalten k\u00f6nnen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (leistungsgewaehrungEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Antrag abgelehnt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (leistungsgewaehrungEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Antrag beantragt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (leistungsgewaehrungEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>nicht beantragt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (getMeldeanschriftType_Gemeindeschluessel(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Solange die Aktualit\u00e4t der verwendeten Schl\u00fcsseltabelle nicht gegeben ist, wird vollst\u00e4ndig auf die Plausibilisierung der listVersionID verzichtet.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getMeldeanschriftType_Regionalschluessel(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Solange die Aktualit\u00e4t der verwendeten Schl\u00fcsseltabelle nicht gegeben ist, wird vollst\u00e4ndig auf die Plausibilisierung der listVersionID verzichtet.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Nachrichtentyp</nameLang>\n                   \n    <nameKurz>Nachrichtentyp</nameKurz>\n                   \n    <nameTechnisch>nachrichtentyp</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:nachrichtentyp</kennung>\n                   \n    <beschreibung>Die Werteliste der Nachrichtentypen, die den Namen der jeweiligen Nachricht angeben.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>4.0</version>\n                   \n    <beschreibung>Die Werteliste der Nachrichtentypen, die den Namen der jeweiligen Nachricht angeben.</beschreibung>\n                   \n    <datumGueltigkeitAb>2024-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>allgemeinenachrichten.rueckweisung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>kinderwunsch.nachreichung.1003</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>allgemeinenachrichten.quittung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>elterngeldantrag.antrag</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>elterngeldantrag.vorabmeldung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>elterngeldantrag.standesamtsmeldung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>elterngeldantrag.anfrage</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>elterngeldantrag.anfrageabschluss</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>elterngeldantrag.abbruch</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>unterhaltsvorschussantrag.antrag</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>unterhaltsvorschussantrag.JaehrlicheUeberpruefung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>unterhaltsvorschussantrag.nachreichen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>unterhaltsvorschussantrag.nachweisnachricht</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>dsrv.anfragervbea</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>dsrv.einkommensdatenrvbea</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>dsrv.statusantwortrvbea</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>mutterschaftsgeldmeldung.anforderung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>mutterschaftsgeldmeldung.rueckmeldung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>beistandschaft.antrag</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>beistandschaft.beendigung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(20),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>hilfenZurErziehung.antrag</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(21),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>hilfenZurErziehung.anfrageHJV</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(22),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>hilfenZurErziehung.eingliederungshilfe</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(23),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>hilfenZurErziehung.widerspruch.0704</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(24),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>hilfenZurErziehung.nachweisnachricht.0711</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(25),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>sorge.alleinsorge.antrag</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(26),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>sorge.erklaerung.vorbeitung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(27),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>sorge.alleinsorge.auskunft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(28),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>sorge.nachweisregister.eintragung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(29),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>sorge.nachweisregister.korrektur</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(30),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>sorge.nachweisregister.loeschung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(31),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>adoptionundpflegekinder.adoption</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(32),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>adoptionundpflegekinder.pflegekinder</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(33),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>kinderwunsch.bewilligungsantrag</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(34),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>kinderwunsch.verwendungsnachweispruefung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypEEnum.getELiterals().get(35),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>kinderwunsch.nachreichung.1003</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachweisbezugEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Nachweisbezug</nameLang>\n                   \n    <nameKurz>Nachweisbezug</nameKurz>\n                   \n    <nameTechnisch>nachweisbezug</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:nachweisbezug</kennung>\n                   \n    <beschreibung>Die Liste codiert, wie das Datenfeld mit Nachweisbezug behandelt wird.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (nachweisbezugEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Datum wurde nicht vom Antragssteller angegeben, sondern aufgrund des Datenabrufs bzw. einer Daten\u00fcbernahme erg\u00e4nzt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachweisbezugEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Datum wurde vom Antragssteller angegeben und durch diesen Datenabruf bzw. diese Daten\u00fcbernahme best\u00e4tigt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (nachweisbezugEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Angabe des Antragsstellers wurde durch diesen Datenabruf bzw. diese Daten\u00fcbernahme NICHT best\u00e4tigt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (personensorgerechtEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Personensorgerecht</nameLang>\n                   \n    <nameKurz>Personensorgerecht</nameKurz>\n                   \n    <nameTechnisch>personensorgerecht</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:personensorgerecht</kennung>\n                   \n    <beschreibung>Die Codeliste gibt an, bei wem das Personensorgerecht liegt.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (personensorgerechtEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Mutter</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (personensorgerechtEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vater</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (personensorgerechtEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vormund</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (personensorgerechtEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstige</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonderstatusEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Sonderstatus</nameLang>\n                   \n    <nameKurz>Sonderstatus</nameKurz>\n                   \n    <nameTechnisch>sonderstatus</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:sonderstatus</kennung>\n                   \n    <beschreibung>Die Liste codiert, die verschiedenen Sonderf\u00e4lle f\u00fcr die Antragsnachrichten.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (sonderstatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Entwicklungshelfer</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonderstatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Entsandter</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonderstatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Missionar</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonderstatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nato-Mitglied</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>SonstigeLeistungen</nameLang>\n                   \n    <nameKurz>SonstigeLeistungen</nameKurz>\n                   \n    <nameTechnisch>sonstigeleistungen</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:sonstigeleistungen</kennung>\n                   \n    <beschreibung>Die Liste codiert die unterschiedlichen Sozial-, Familien- und Entgeltersatzleistungen, die auf die zu beantragenden Leistungen angerechnet werden.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2025-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ausl\u00e4ndische Einkommensersatzleistungen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Arbeitslosengeld I/B\u00fcrgergeld</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Arbeitslosengeld II</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Kurzarbeitergeld</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Insolvenzgeld</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Krankengeld</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Renten</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vergleichbare Leistungen und vergleichbare private Leistungen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Elterngeld f\u00fcr \u00e4lteres Kind</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Kinderkrankengeld</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Gr\u00fcndungszuschuss</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (statusdatenabrufEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>StatusDatenabruf</nameLang>\n                   \n    <nameKurz>StatusDatenabruf</nameKurz>\n                   \n    <nameTechnisch>statusdatenabruf</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:statusdatenabruf</kennung>\n                   \n    <beschreibung>Beschreibt die m\u00f6glichen Statuswerte eines Datenabrufs.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (statusdatenabrufEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>erfolgreich</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (statusdatenabrufEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>fehlgeschlagen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (steuerlicheIdentifikationsnummerTypeEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Steuerliche Identifikationsnummer</title>\n           \n"
		   });
		addAnnotation
		  (tatsachenbehauptungEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Tatsachenbehauptung</nameLang>\n                   \n    <nameKurz>Tatsachenbehauptung</nameKurz>\n                   \n    <nameTechnisch>tatsachenbehauptung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:tatsachenbehauptung</kennung>\n                   \n    <beschreibung>Die Liste codiert Tatsachenbehauptung, die eine Person in einem Antrag machen kann.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (tatsachenbehauptungEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ja</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (tatsachenbehauptungEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nein</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (tatsachenbehauptungEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>nicht bekannt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertrauensniveauEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Vertrauensniveau</nameLang>\n                   \n    <nameKurz>Vertrauensniveau</nameKurz>\n                   \n    <nameTechnisch>vertrauensniveau</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:vertrauensniveau</kennung>\n                   \n    <beschreibung>Die Liste codiert das Vertrauensniveau des genutzten Nutzerkontos.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (vertrauensniveauEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Basisregistrierung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertrauensniveauEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>normal</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertrauensniveauEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Substanziell</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertrauensniveauEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Hoch</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertretungEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Vertretung</nameLang>\n                   \n    <nameKurz>Vertretung</nameKurz>\n                   \n    <nameTechnisch>vertretung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:vertretung</kennung>\n                   \n    <beschreibung>Rechtliche Vertretung, Verm\u00f6gens- oder Personensorge einer Person.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (vertretungEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Beistand</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertretungEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vormund</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertretungEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Amtspfleger</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertretungEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Betreuer</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertretungEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Rechtsanwalt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertretungEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>keine Vertretung dieser Art</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (vertretungEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>nicht bekannt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (wohnsitzEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Wohnsitz</nameLang>\n                   \n    <nameKurz>Wohnsitz</nameKurz>\n                   \n    <nameTechnisch>wohnsitz</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:wohnsitz</kennung>\n                   \n    <beschreibung>Die Liste codiert die verschiedenen m\u00f6glichen Wohnsitze der Eltern.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (wohnsitzEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>in Deutschland (von Geburt an)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (wohnsitzEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>in Deutschland</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (wohnsitzEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>im Ausland (befristet)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (wohnsitzEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>im Ausland (unbefristet)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (zusatzparametergruppeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>AnwendungsspezifischeErweiterung</title>\n           \n"
		   });
		addAnnotation
		  (zuschuesseEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Zuschuesse</nameLang>\n                   \n    <nameKurz>Zuschuesse</nameKurz>\n                   \n    <nameTechnisch>zuschuesse</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:zuschuesse</kennung>\n                   \n    <beschreibung>Die Codeliste gibt an, ob es Zusch\u00fcsse gibt oder nicht.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2023-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (zuschuesseEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>keine Zusch\u00fcsse</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (zuschuesseEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Zusch\u00fcsse</beschreibung>\n                 \n"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (allgemeinerNameTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeinerNameType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeinerNameType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeinerNameType_NichtVorhanden(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nichtVorhanden",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anredeEEnum,
		   source,
		   new String[] {
			   "name", "anrede"
		   });
		addAnnotation
		  (anredeObjectEDataType,
		   source,
		   new String[] {
			   "name", "anrede:Object",
			   "baseType", "anrede"
		   });
		addAnnotation
		  (antragsnachrichtTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragsnachrichtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragsnachrichtType_ZeitstempelAntragsstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zeitstempelAntragsstellung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragsnachrichtType_Transaktionsid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transaktionsid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (artabrufEEnum,
		   source,
		   new String[] {
			   "name", "artabruf"
		   });
		addAnnotation
		  (artabrufObjectEDataType,
		   source,
		   new String[] {
			   "name", "artabruf:Object",
			   "baseType", "artabruf"
		   });
		addAnnotation
		  (artnachweisEEnum,
		   source,
		   new String[] {
			   "name", "artnachweis"
		   });
		addAnnotation
		  (artnachweisObjectEDataType,
		   source,
		   new String[] {
			   "name", "artnachweis:Object",
			   "baseType", "artnachweis"
		   });
		addAnnotation
		  (aufenthaltsstatusEEnum,
		   source,
		   new String[] {
			   "name", "aufenthaltsstatus"
		   });
		addAnnotation
		  (aufenthaltsstatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "aufenthaltsstatus:Object",
			   "baseType", "aufenthaltsstatus"
		   });
		addAnnotation
		  (aufenthaltstitelNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "Aufenthaltstitel.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAufenthaltstitelNachweisbezugType_Dokumenttyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dokumenttyp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAufenthaltstitelNachweisbezugType_Nebenbestimmungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nebenbestimmungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAufenthaltstitelNachweisbezugType_Ablaufdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ablaufdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAufenthaltstitelNachweisbezugType_Nachweisbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisbezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (auslandsanschriftTypeEClass,
		   source,
		   new String[] {
			   "name", "AuslandsanschriftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuslandsanschriftType_Staat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuslandsanschriftType_Anschriftszeile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftszeile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bankverbindungIBANOptionalTypeEClass,
		   source,
		   new String[] {
			   "name", "BankverbindungIBANOptionalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBankverbindungIBANOptionalType_Inhaber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inhaber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungIBANOptionalType_Iban(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "iban",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungIBANOptionalType_Bic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungIBANOptionalType_Institut(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "institut",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bankverbindungInhaberOptionalTypeEClass,
		   source,
		   new String[] {
			   "name", "BankverbindungInhaberOptionalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBankverbindungInhaberOptionalType_Inhaber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inhaber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungInhaberOptionalType_Iban(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "iban",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungInhaberOptionalType_Bic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungInhaberOptionalType_Institut(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "institut",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bankverbindungTypeEClass,
		   source,
		   new String[] {
			   "name", "BankverbindungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBankverbindungType_Inhaber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inhaber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungType_Iban(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "iban",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungType_Bic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBankverbindungType_Institut(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "institut",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (behoerdenkennungTypeEClass,
		   source,
		   new String[] {
			   "name", "BehoerdenkennungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBehoerdenkennungType_Praefix(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "praefix",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehoerdenkennungType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codeAnredeTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.AnredeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeArtAbrufTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.ArtAbrufType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeAufenthaltsstatusTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.AufenthaltsstatusType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeBundeslandTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.BundeslandType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeEigenschaftTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.EigenschaftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeEinkommensartenTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.EinkommensartenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeErreichbarkeitTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.ErreichbarkeitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeFamilienstandTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.FamilienstandType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeGemeindeVZAmtlicherGemeindeschluesselTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.GemeindeVZ.AmtlicherGemeindeschluesselType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeGemeindeVZRegionalschluesselTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.GemeindeVZ.RegionalschluesselType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeGeschlechtTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.GeschlechtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeKindschaftsbeziehungTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.KindschaftsbeziehungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeKindWohnhaftBeiTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.KindWohnhaftBeiType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeLeistungserhaltTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.LeistungserhaltType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeLeistungsgewaehrungTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.LeistungsgewaehrungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeNachrichtentypTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.NachrichtentypType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codePersonensorgerechtTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.PersonensorgerechtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codePraefixTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.PraefixType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeSonderstatusTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.SonderstatusType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeSonstigeLeistungenTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.SonstigeLeistungenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeStaatsangehoerigkeitTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.StaatsangehoerigkeitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeStaatTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.StaatType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeStandesamtnummernTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.StandesamtnummernType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeStatusDatenabrufTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.StatusDatenabrufType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeTatsachenbehauptungTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.TatsachenbehauptungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeVermoegensartTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.VermoegensartType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeVertrauensniveauTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.VertrauensniveauType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeVertretungTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.VertretungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeWohnsitzTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.WohnsitzType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeZuschuesseTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.ZuschuesseType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (datenabrufTypeEClass,
		   source,
		   new String[] {
			   "name", "DatenabrufType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatenabrufType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatenabrufType_Zeitstempel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zeitstempel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatenabrufType_Quelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatenabrufType_ArtDesAbrufs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artDesAbrufs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatenabrufType_AbgerufenFuer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abgerufenFuer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatenabrufType_StatusDatenabruf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "statusDatenabruf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (datenschutzerklaerungenTypeEClass,
		   source,
		   new String[] {
			   "name", "DatenschutzerklaerungenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatenschutzerklaerungenType_DsgvoBetreiber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvoBetreiber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatenschutzerklaerungenType_DsgvoNachnutzer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvoNachnutzer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (eigenschaftEEnum,
		   source,
		   new String[] {
			   "name", "eigenschaft"
		   });
		addAnnotation
		  (eigenschaftObjectEDataType,
		   source,
		   new String[] {
			   "name", "eigenschaft:Object",
			   "baseType", "eigenschaft"
		   });
		addAnnotation
		  (einkommensartenEEnum,
		   source,
		   new String[] {
			   "name", "einkommensarten"
		   });
		addAnnotation
		  (einkommensartenObjectEDataType,
		   source,
		   new String[] {
			   "name", "einkommensarten:Object",
			   "baseType", "einkommensarten"
		   });
		addAnnotation
		  (entgeltdatenArbeitgeberDsrvTypeEClass,
		   source,
		   new String[] {
			   "name", "EntgeltdatenArbeitgeber.DsrvType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntgeltdatenArbeitgeberDsrvType_AbfrageID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abfrageID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntgeltdatenArbeitgeberDsrvType_IfdNrArbeitgeber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifdNrArbeitgeber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntgeltdatenArbeitgeberDsrvType_AbrufergebnisDrv(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abrufergebnis.drv",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (entgeltdatenDsrvNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "Entgeltdaten.Dsrv.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntgeltdatenDsrvNachweisbezugType_Nachweisbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisbezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntgeltdatenDsrvNachweisbezugType_ZeitraumVon(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zeitraumVon",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntgeltdatenDsrvNachweisbezugType_ZeitraumBis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zeitraumBis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntgeltdatenDsrvNachweisbezugType_EntgeltdatenArbeitgeber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entgeltdaten.arbeitgeber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (erreichbarkeitTypeEClass,
		   source,
		   new String[] {
			   "name", "ErreichbarkeitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErreichbarkeitType_Kanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErreichbarkeitType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErreichbarkeitType_Zusatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (familiennameUnstrukturiertTypeEClass,
		   source,
		   new String[] {
			   "name", "FamiliennameUnstrukturiertType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFamiliennameUnstrukturiertType_Nachname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFamiliennameUnstrukturiertType_Nachnamepass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachnamepass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (familienstandEEnum,
		   source,
		   new String[] {
			   "name", "familienstand"
		   });
		addAnnotation
		  (familienstandNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "Familienstand.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFamilienstandNachweisbezugType_Nachweisbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisbezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (familienstandObjectEDataType,
		   source,
		   new String[] {
			   "name", "familienstand:Object",
			   "baseType", "familienstand"
		   });
		addAnnotation
		  (familienstandTypeEClass,
		   source,
		   new String[] {
			   "name", "FamilienstandType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFamilienstandType_Seit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "seit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFamilienstandType_Familienstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienstand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (feldgruppeTypeEClass,
		   source,
		   new String[] {
			   "name", "FeldgruppeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeldgruppeType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldgruppeType_Feld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldgruppeType_Feldgruppe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feldgruppe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldgruppeType_LaufendeNummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "laufendeNummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (feldTypeEClass,
		   source,
		   new String[] {
			   "name", "FeldType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeldType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldType_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldType_LaufendeNummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "laufendeNummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geburtGeburtsortOptionalTypeEClass,
		   source,
		   new String[] {
			   "name", "GeburtGeburtsortOptionalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeburtGeburtsortOptionalType_Geburtsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtGeburtsortOptionalType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsortStaat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtGeburtsortOptionalType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geburtNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "Geburt.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeburtNachweisbezugType_Nachweisbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisbezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geburtOptionalTypeEClass,
		   source,
		   new String[] {
			   "name", "GeburtOptionalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeburtOptionalType_Geburtsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtOptionalType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsortStaat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtOptionalType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geburtTypeEClass,
		   source,
		   new String[] {
			   "name", "GeburtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeburtType_Geburtsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsortStaat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geschlechtEEnum,
		   source,
		   new String[] {
			   "name", "geschlecht"
		   });
		addAnnotation
		  (geschlechtObjectEDataType,
		   source,
		   new String[] {
			   "name", "geschlecht:Object",
			   "baseType", "geschlecht"
		   });
		addAnnotation
		  (hausnummernBisTypeEClass,
		   source,
		   new String[] {
			   "name", "hausnummern.bis_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHausnummernBisType_HausnummerBis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hausnummer.bis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHausnummernBisType_HausnummerbuchstabezusatzzifferBis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hausnummerbuchstabezusatzziffer.bis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHausnummernBisType_TeilnummerderhausnummerBis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "teilnummerderhausnummer.bis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifikationNachrichtTypeEClass,
		   source,
		   new String[] {
			   "name", "Identifikation.NachrichtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_NachrichtenUUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenUUID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_Nachrichtentyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtentyp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_Erstellungszeitpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erstellungszeitpunkt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (jahrMonatTypeEDataType,
		   source,
		   new String[] {
			   "name", "JahrMonatType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#gYearMonth",
			   "pattern", "[0-9]{4}-[0-9]{2}"
		   });
		addAnnotation
		  (jahrTypeEDataType,
		   source,
		   new String[] {
			   "name", "JahrType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#gYear",
			   "pattern", "[0-9]{4}"
		   });
		addAnnotation
		  (kindschaftsbeziehungEEnum,
		   source,
		   new String[] {
			   "name", "kindschaftsbeziehung"
		   });
		addAnnotation
		  (kindschaftsbeziehungObjectEDataType,
		   source,
		   new String[] {
			   "name", "kindschaftsbeziehung:Object",
			   "baseType", "kindschaftsbeziehung"
		   });
		addAnnotation
		  (kindwohnhaftbeiEEnum,
		   source,
		   new String[] {
			   "name", "kindwohnhaftbei"
		   });
		addAnnotation
		  (kindwohnhaftbeiObjectEDataType,
		   source,
		   new String[] {
			   "name", "kindwohnhaftbei:Object",
			   "baseType", "kindwohnhaftbei"
		   });
		addAnnotation
		  (kommunikationspartnerErreichbarTypeEClass,
		   source,
		   new String[] {
			   "name", "Kommunikationspartner.ErreichbarType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (kommunikationspartnerTypeEClass,
		   source,
		   new String[] {
			   "name", "KommunikationspartnerType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKommunikationspartnerType_Behoerdenkennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "behoerdenkennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKommunikationspartnerType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKommunikationspartnerType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKommunikationspartnerType_Behoerdenname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "behoerdenname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (krankenversichertennummerTypeEDataType,
		   source,
		   new String[] {
			   "name", "KrankenversichertennummerType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (leistungserhaltEEnum,
		   source,
		   new String[] {
			   "name", "leistungserhalt"
		   });
		addAnnotation
		  (leistungserhaltObjectEDataType,
		   source,
		   new String[] {
			   "name", "leistungserhalt:Object",
			   "baseType", "leistungserhalt"
		   });
		addAnnotation
		  (leistungsgewaehrungEEnum,
		   source,
		   new String[] {
			   "name", "leistungsgewaehrung"
		   });
		addAnnotation
		  (leistungsgewaehrungObjectEDataType,
		   source,
		   new String[] {
			   "name", "leistungsgewaehrung:Object",
			   "baseType", "leistungsgewaehrung"
		   });
		addAnnotation
		  (meldeanschriftHausnummerBuchstabeZusatzzifferTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.HausnummerBuchstabeZusatzzifferType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftHausnummerTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.HausnummerType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftPostleitzahlTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.PostleitzahlType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftStockwerkswohnungsnummerTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.StockwerkswohnungsnummerType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftStrasseTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.StrasseType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftTeilnummerDerHausnummerTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.TeilnummerDerHausnummerType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftTypeEClass,
		   source,
		   new String[] {
			   "name", "MeldeanschriftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeldeanschriftType_Gemeindeschluessel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gemeindeschluessel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Hausnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hausnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_HausnummerBuchstabeZusatzziffer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hausnummerBuchstabeZusatzziffer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Postleitzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postleitzahl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Stockwerkswohnungsnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stockwerkswohnungsnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Strasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_TeilnummerDerHausnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "teilnummerDerHausnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Wohnort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_WohnortFruehererGemeindename(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnortFruehererGemeindename",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Wohnungsinhaber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnungsinhaber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Zusatzangaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatzangaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeldeanschriftType_Regionalschluessel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "regionalschluessel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (meldeanschriftWohnortFruehererGemeindenameTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.WohnortFruehererGemeindenameType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftWohnortTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.WohnortType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftWohnungsinhaberTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.WohnungsinhaberType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (meldeanschriftZusatzangabenTypeEDataType,
		   source,
		   new String[] {
			   "name", "Meldeanschrift.ZusatzangabenType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (nachrichtenkopfTypeEClass,
		   source,
		   new String[] {
			   "name", "NachrichtenkopfType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtenkopfType_IdentifikationNachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifikation.nachricht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_Leser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "leser",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_Autor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "autor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_PostkorbHandle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postkorbHandle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachrichtentypEEnum,
		   source,
		   new String[] {
			   "name", "nachrichtentyp"
		   });
		addAnnotation
		  (nachrichtentypObjectEDataType,
		   source,
		   new String[] {
			   "name", "nachrichtentyp:Object",
			   "baseType", "nachrichtentyp"
		   });
		addAnnotation
		  (nachrichtTypeEClass,
		   source,
		   new String[] {
			   "name", "NachrichtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtType_Nachrichtenkopf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenkopf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtType_Zusatzparametergruppe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatzparametergruppe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtType_Produkt(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkt"
		   });
		addAnnotation
		  (getNachrichtType_Produkthersteller(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkthersteller"
		   });
		addAnnotation
		  (getNachrichtType_Produktversion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produktversion"
		   });
		addAnnotation
		  (getNachrichtType_Standard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "standard"
		   });
		addAnnotation
		  (getNachrichtType_Test(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "test"
		   });
		addAnnotation
		  (getNachrichtType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (nachweisbezugEEnum,
		   source,
		   new String[] {
			   "name", "nachweisbezug"
		   });
		addAnnotation
		  (nachweisbezugObjectEDataType,
		   source,
		   new String[] {
			   "name", "nachweisbezug:Object",
			   "baseType", "nachweisbezug"
		   });
		addAnnotation
		  (nachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweisbezugType_DatenabrufBezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenabruf.bezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweisbezugType_DatenabrufId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenabruf.id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweisdokumentTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweisdokumentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweisdokumentType_Dokumentid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dokumentid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweisdokumentType_Dateiname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateiname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweisdokumentType_Mimetype(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mimetype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweisdokumentType_Kategorie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kategorie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nameNatuerlichePersonNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "NameNatuerlichePerson.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameNatuerlichePersonNachweisbezugType_Nachweisbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisbezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nameNatuerlichePersonOhneGeburtsnameTypeEClass,
		   source,
		   new String[] {
			   "name", "NameNatuerlichePersonOhneGeburtsnameType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameNatuerlichePersonOhneGeburtsnameType_FamiliennameUnstrukturiert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienname.unstrukturiert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonOhneGeburtsnameType_Vornamen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vornamen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nameNatuerlichePersonTypeEClass,
		   source,
		   new String[] {
			   "name", "NameNatuerlichePersonType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameNatuerlichePersonType_FamiliennameUnstrukturiert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienname.unstrukturiert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonType_GeburtsnameUnstrukturiert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsname.unstrukturiert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonType_Vornamen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vornamen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nameNatuerlichePersonVornameVerpflichtendTypeEClass,
		   source,
		   new String[] {
			   "name", "NameNatuerlichePersonVornameVerpflichtendType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameNatuerlichePersonVornameVerpflichtendType_FamiliennameUnstrukturiert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienname.unstrukturiert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonVornameVerpflichtendType_GeburtsnameUnstrukturiert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsname.unstrukturiert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonVornameVerpflichtendType_Vornamen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vornamen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nutzerkontoTypeEClass,
		   source,
		   new String[] {
			   "name", "NutzerkontoType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNutzerkontoType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNutzerkontoType_Vertrauensniveau(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vertrauensniveau",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNutzerkontoType_NachweisNutzerkonto(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisNutzerkonto",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (personensorgerechtEEnum,
		   source,
		   new String[] {
			   "name", "personensorgerecht"
		   });
		addAnnotation
		  (personensorgerechtObjectEDataType,
		   source,
		   new String[] {
			   "name", "personensorgerecht:Object",
			   "baseType", "personensorgerecht"
		   });
		addAnnotation
		  (postalischeInlandsanschriftBasisTypeEClass,
		   source,
		   new String[] {
			   "name", "PostalischeInlandsanschrift.BasisType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_Hausnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hausnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_HausnummerBuchstabeZusatzziffer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hausnummerBuchstabeZusatzziffer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_Postleitzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postleitzahl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_Stockwerkswohnungsnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stockwerkswohnungsnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_Strasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_TeilnummerDerHausnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "teilnummerDerHausnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_Wohnort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_WohnortFruehererGemeindename(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnortFruehererGemeindename",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_Wohnungsinhaber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnungsinhaber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftBasisType_Zusatzangaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatzangaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (postalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "PostalischeInlandsanschrift.Gebaeudeanschrift.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType_Nachweisbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisbezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (postalischeInlandsanschriftGebaeudeanschriftTypeEClass,
		   source,
		   new String[] {
			   "name", "PostalischeInlandsanschrift.GebaeudeanschriftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftGebaeudeanschriftType_HausnummernBis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hausnummern.bis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (postalischeInlandsanschriftPostfachanschriftTypeEClass,
		   source,
		   new String[] {
			   "name", "PostalischeInlandsanschrift.PostfachanschriftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftPostfachanschriftType_Postfach(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postfach",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftPostfachanschriftType_Wohnort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftPostfachanschriftType_Postleitzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postleitzahl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftPostfachanschriftType_Zusatzangaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatzangaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (postalischeInlandsanschriftTypeEClass,
		   source,
		   new String[] {
			   "name", "PostalischeInlandsanschriftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftType_Postfach(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postfach",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostalischeInlandsanschriftType_Gebaeude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gebaeude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (postkorbHandleTypeEClass,
		   source,
		   new String[] {
			   "name", "PostkorbHandleType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPostkorbHandleType_PostkorbHandle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postkorbHandle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPostkorbHandleType_ZustimmungElektronischerBescheid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zustimmungElektronischerBescheid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sonderstatusEEnum,
		   source,
		   new String[] {
			   "name", "sonderstatus"
		   });
		addAnnotation
		  (sonderstatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "sonderstatus:Object",
			   "baseType", "sonderstatus"
		   });
		addAnnotation
		  (sonstigeleistungenEEnum,
		   source,
		   new String[] {
			   "name", "sonstigeleistungen"
		   });
		addAnnotation
		  (sonstigeleistungenObjectEDataType,
		   source,
		   new String[] {
			   "name", "sonstigeleistungen:Object",
			   "baseType", "sonstigeleistungen"
		   });
		addAnnotation
		  (staatsangehoerigkeitenNachweisbezugTypeEClass,
		   source,
		   new String[] {
			   "name", "Staatsangehoerigkeiten.NachweisbezugType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStaatsangehoerigkeitenNachweisbezugType_Staatsangehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staatsangehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStaatsangehoerigkeitenNachweisbezugType_Nachweisbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisbezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (statusdatenabrufEEnum,
		   source,
		   new String[] {
			   "name", "statusdatenabruf"
		   });
		addAnnotation
		  (statusdatenabrufObjectEDataType,
		   source,
		   new String[] {
			   "name", "statusdatenabruf:Object",
			   "baseType", "statusdatenabruf"
		   });
		addAnnotation
		  (statusDatenabrufTypeEClass,
		   source,
		   new String[] {
			   "name", "StatusDatenabrufType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStatusDatenabrufType_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatusDatenabrufType_Hinweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hinweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (steuerlicheIdentifikationsnummerTypeEDataType,
		   source,
		   new String[] {
			   "name", "SteuerlicheIdentifikationsnummerType",
			   "baseType", "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC"
		   });
		addAnnotation
		  (tagesdatumTypeEDataType,
		   source,
		   new String[] {
			   "name", "TagesdatumType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#date",
			   "pattern", "[0-9]{4}-[0-9]{2}-[0-9]{2}"
		   });
		addAnnotation
		  (tatsacheMitFreitextTypeEClass,
		   source,
		   new String[] {
			   "name", "TatsacheMitFreitextType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTatsacheMitFreitextType_LiegtVor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "liegtVor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTatsacheMitFreitextType_Freitext(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "freitext",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tatsacheMitNachweisTypeEClass,
		   source,
		   new String[] {
			   "name", "TatsacheMitNachweisType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTatsacheMitNachweisType_LiegtVor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "liegtVor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTatsacheMitNachweisType_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tatsacheMitZeitraumTypeEClass,
		   source,
		   new String[] {
			   "name", "TatsacheMitZeitraumType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTatsacheMitZeitraumType_LiegtVor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "liegtVor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTatsacheMitZeitraumType_Zeitraum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zeitraum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tatsachenbehauptungEEnum,
		   source,
		   new String[] {
			   "name", "tatsachenbehauptung"
		   });
		addAnnotation
		  (tatsachenbehauptungObjectEDataType,
		   source,
		   new String[] {
			   "name", "tatsachenbehauptung:Object",
			   "baseType", "tatsachenbehauptung"
		   });
		addAnnotation
		  (teilbekanntesDatumTypeEClass,
		   source,
		   new String[] {
			   "name", "TeilbekanntesDatumType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTeilbekanntesDatumType_JahrMonatTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jahrMonatTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTeilbekanntesDatumType_JahrMonat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jahrMonat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTeilbekanntesDatumType_Jahr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jahr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (terminwunschTypeEClass,
		   source,
		   new String[] {
			   "name", "TerminwunschType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTerminwunschType_Wochentag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wochentag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTerminwunschType_Uhrzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "uhrzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (uuidTypeEDataType,
		   source,
		   new String[] {
			   "name", "UUIDType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString"
		   });
		addAnnotation
		  (vertrauensniveauEEnum,
		   source,
		   new String[] {
			   "name", "vertrauensniveau"
		   });
		addAnnotation
		  (vertrauensniveauObjectEDataType,
		   source,
		   new String[] {
			   "name", "vertrauensniveau:Object",
			   "baseType", "vertrauensniveau"
		   });
		addAnnotation
		  (vertretungEEnum,
		   source,
		   new String[] {
			   "name", "vertretung"
		   });
		addAnnotation
		  (vertretungObjectEDataType,
		   source,
		   new String[] {
			   "name", "vertretung:Object",
			   "baseType", "vertretung"
		   });
		addAnnotation
		  (wohnsitzEEnum,
		   source,
		   new String[] {
			   "name", "wohnsitz"
		   });
		addAnnotation
		  (wohnsitzObjectEDataType,
		   source,
		   new String[] {
			   "name", "wohnsitz:Object",
			   "baseType", "wohnsitz"
		   });
		addAnnotation
		  (zeitraumTypeEClass,
		   source,
		   new String[] {
			   "name", "ZeitraumType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZeitraumType_Beginn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beginn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZeitraumType_Ende(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ende",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zusatzparametergruppeTypeEClass,
		   source,
		   new String[] {
			   "name", "ZusatzparametergruppeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZusatzparametergruppeType_Feld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusatzparametergruppeType_Feldgruppe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feldgruppe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusatzparametergruppeType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusatzparametergruppeType_FassungHandlungsanweisung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fassungHandlungsanweisung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zuschuesseEEnum,
		   source,
		   new String[] {
			   "name", "zuschuesse"
		   });
		addAnnotation
		  (zuschuesseObjectEDataType,
		   source,
		   new String[] {
			   "name", "zuschuesse:Object",
			   "baseType", "zuschuesse"
		   });
		addAnnotation
		  (zustimmungAbrufOderWeitergabeTypeEClass,
		   source,
		   new String[] {
			   "name", "ZustimmungAbrufOderWeitergabeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZustimmungAbrufOderWeitergabeType_ArtDesAbrufsOderWeitergabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artDesAbrufsOderWeitergabe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZustimmungAbrufOderWeitergabeType_ZustimmungAbrufOderWeitergabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zustimmungAbrufOderWeitergabe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZustimmungAbrufOderWeitergabeType_InhalteDesAbrufs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inhalteDesAbrufs",
			   "namespace", "##targetNamespace"
		   });
	}

} //BaukastenPackageImpl
