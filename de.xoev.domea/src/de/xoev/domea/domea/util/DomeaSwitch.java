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
package de.xoev.domea.domea.util;

import code.Code;

import de.xoev.domea.domea.*;

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
 * @see de.xoev.domea.domea.DomeaPackage
 * @generated
 */
public class DomeaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomeaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomeaSwitch() {
		if (modelPackage == null) {
			modelPackage = DomeaPackage.eINSTANCE;
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
			case DomeaPackage.AKTENINHALT_TYPE: {
				AkteninhaltType akteninhaltType = (AkteninhaltType)theEObject;
				T result = caseAkteninhaltType(akteninhaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE: {
				AktenplaneinheitAktenplanType aktenplaneinheitAktenplanType = (AktenplaneinheitAktenplanType)theEObject;
				T result = caseAktenplaneinheitAktenplanType(aktenplaneinheitAktenplanType);
				if (result == null) result = caseAktenplaneinheitType(aktenplaneinheitAktenplanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AKTENPLANEINHEIT_TYPE: {
				AktenplaneinheitType aktenplaneinheitType = (AktenplaneinheitType)theEObject;
				T result = caseAktenplaneinheitType(aktenplaneinheitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AKTENPLAN_TYPE: {
				AktenplanType aktenplanType = (AktenplanType)theEObject;
				T result = caseAktenplanType(aktenplanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AKTE_TYPE: {
				AkteType akteType = (AkteType)theEObject;
				T result = caseAkteType(akteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE: {
				AllgemeineMetadatenType allgemeineMetadatenType = (AllgemeineMetadatenType)theEObject;
				T result = caseAllgemeineMetadatenType(allgemeineMetadatenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ALLGEMEINER_NAME_TYPE: {
				AllgemeinerNameType allgemeinerNameType = (AllgemeinerNameType)theEObject;
				T result = caseAllgemeinerNameType(allgemeinerNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ALLGEMEINE_RUECKMELDUNG_CODE_TYPE: {
				AllgemeineRueckmeldungCodeType allgemeineRueckmeldungCodeType = (AllgemeineRueckmeldungCodeType)theEObject;
				T result = caseAllgemeineRueckmeldungCodeType(allgemeineRueckmeldungCodeType);
				if (result == null) result = caseCode(allgemeineRueckmeldungCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ANLAGE_DOKUMENT_TYPE: {
				AnlageDokumentType anlageDokumentType = (AnlageDokumentType)theEObject;
				T result = caseAnlageDokumentType(anlageDokumentType);
				if (result == null) result = caseDokumentOderDokumentMitSchriftstueckType(anlageDokumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ANSCHRIFTSTYP_CODE_TYPE: {
				AnschriftstypCodeType anschriftstypCodeType = (AnschriftstypCodeType)theEObject;
				T result = caseAnschriftstypCodeType(anschriftstypCodeType);
				if (result == null) result = caseCode(anschriftstypCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ANSCHRIFT_TYPE: {
				AnschriftType anschriftType = (AnschriftType)theEObject;
				T result = caseAnschriftType(anschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE: {
				AnwendungsspezifischeErweiterungType anwendungsspezifischeErweiterungType = (AnwendungsspezifischeErweiterungType)theEObject;
				T result = caseAnwendungsspezifischeErweiterungType(anwendungsspezifischeErweiterungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE: {
				AnwendungsspezifischeErweiterungXMLType anwendungsspezifischeErweiterungXMLType = (AnwendungsspezifischeErweiterungXMLType)theEObject;
				T result = caseAnwendungsspezifischeErweiterungXMLType(anwendungsspezifischeErweiterungXMLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE: {
				AufbewahrungsdauerType aufbewahrungsdauerType = (AufbewahrungsdauerType)theEObject;
				T result = caseAufbewahrungsdauerType(aufbewahrungsdauerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AUSSONDERUNGSART_CODE_TYPE: {
				AussonderungsartCodeType aussonderungsartCodeType = (AussonderungsartCodeType)theEObject;
				T result = caseAussonderungsartCodeType(aussonderungsartCodeType);
				if (result == null) result = caseCode(aussonderungsartCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AUSSONDERUNGSART_TYPE: {
				AussonderungsartType aussonderungsartType = (AussonderungsartType)theEObject;
				T result = caseAussonderungsartType(aussonderungsartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE: {
				AussonderungsmetadatenType aussonderungsmetadatenType = (AussonderungsmetadatenType)theEObject;
				T result = caseAussonderungsmetadatenType(aussonderungsmetadatenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.BEARBEITUNG_TYPE: {
				BearbeitungType bearbeitungType = (BearbeitungType)theEObject;
				T result = caseBearbeitungType(bearbeitungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.BEHOERDE_TYPE: {
				BehoerdeType behoerdeType = (BehoerdeType)theEObject;
				T result = caseBehoerdeType(behoerdeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE: {
				BeteiligungsschrittType beteiligungsschrittType = (BeteiligungsschrittType)theEObject;
				T result = caseBeteiligungsschrittType(beteiligungsschrittType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.BETEILIGUNGSSTATUS_CODE_TYPE: {
				BeteiligungsstatusCodeType beteiligungsstatusCodeType = (BeteiligungsstatusCodeType)theEObject;
				T result = caseBeteiligungsstatusCodeType(beteiligungsstatusCodeType);
				if (result == null) result = caseCode(beteiligungsstatusCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.BEWERTUNGSVORSCHLAG_CODE_TYPE: {
				BewertungsvorschlagCodeType bewertungsvorschlagCodeType = (BewertungsvorschlagCodeType)theEObject;
				T result = caseBewertungsvorschlagCodeType(bewertungsvorschlagCodeType);
				if (result == null) result = caseCode(bewertungsvorschlagCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DATEIFORMAT_CODE_TYPE: {
				DateiformatCodeType dateiformatCodeType = (DateiformatCodeType)theEObject;
				T result = caseDateiformatCodeType(dateiformatCodeType);
				if (result == null) result = caseCode(dateiformatCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DATENAUSTAUSCHART_CODE_TYPE: {
				DatenaustauschartCodeType datenaustauschartCodeType = (DatenaustauschartCodeType)theEObject;
				T result = caseDatenaustauschartCodeType(datenaustauschartCodeType);
				if (result == null) result = caseCode(datenaustauschartCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DATENSCHUTZSTUFE_CODE_TYPE: {
				DatenschutzstufeCodeType datenschutzstufeCodeType = (DatenschutzstufeCodeType)theEObject;
				T result = caseDatenschutzstufeCodeType(datenschutzstufeCodeType);
				if (result == null) result = caseCode(datenschutzstufeCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DATENTYP_CODE_TYPE: {
				DatentypCodeType datentypCodeType = (DatentypCodeType)theEObject;
				T result = caseDatentypCodeType(datentypCodeType);
				if (result == null) result = caseCode(datentypCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE: {
				DokumentMitSchriftstueckType dokumentMitSchriftstueckType = (DokumentMitSchriftstueckType)theEObject;
				T result = caseDokumentMitSchriftstueckType(dokumentMitSchriftstueckType);
				if (result == null) result = caseDokumentSchriftstueckBasisType(dokumentMitSchriftstueckType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE: {
				DokumentOderDokumentMitSchriftstueckType dokumentOderDokumentMitSchriftstueckType = (DokumentOderDokumentMitSchriftstueckType)theEObject;
				T result = caseDokumentOderDokumentMitSchriftstueckType(dokumentOderDokumentMitSchriftstueckType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE: {
				DokumentSchriftstueckBasisType dokumentSchriftstueckBasisType = (DokumentSchriftstueckBasisType)theEObject;
				T result = caseDokumentSchriftstueckBasisType(dokumentSchriftstueckBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.DOKUMENT_TYPE: {
				DokumentType dokumentType = (DokumentType)theEObject;
				T result = caseDokumentType(dokumentType);
				if (result == null) result = caseDokumentSchriftstueckBasisType(dokumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE: {
				ErfolgOderMisserfolgImportType erfolgOderMisserfolgImportType = (ErfolgOderMisserfolgImportType)theEObject;
				T result = caseErfolgOderMisserfolgImportType(erfolgOderMisserfolgImportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.FELDGRUPPE_TYPE: {
				FeldgruppeType feldgruppeType = (FeldgruppeType)theEObject;
				T result = caseFeldgruppeType(feldgruppeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.FELD_TYPE: {
				FeldType feldType = (FeldType)theEObject;
				T result = caseFeldType(feldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.FORMAT_TYPE: {
				FormatType formatType = (FormatType)theEObject;
				T result = caseFormatType(formatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.GEBURT_TYPE: {
				GeburtType geburtType = (GeburtType)theEObject;
				T result = caseGeburtType(geburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.GEHEIMHALTUNGSGRAD_CODE_TYPE: {
				GeheimhaltungsgradCodeType geheimhaltungsgradCodeType = (GeheimhaltungsgradCodeType)theEObject;
				T result = caseGeheimhaltungsgradCodeType(geheimhaltungsgradCodeType);
				if (result == null) result = caseCode(geheimhaltungsgradCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.GEHEIMHALTUNG_TYPE: {
				GeheimhaltungType geheimhaltungType = (GeheimhaltungType)theEObject;
				T result = caseGeheimhaltungType(geheimhaltungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.GESCHAEFTSGANG_TYPE: {
				GeschaeftsgangType geschaeftsgangType = (GeschaeftsgangType)theEObject;
				T result = caseGeschaeftsgangType(geschaeftsgangType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.HASH_TYPE: {
				HashType hashType = (HashType)theEObject;
				T result = caseHashType(hashType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE: {
				HistorienProtokollInformationType historienProtokollInformationType = (HistorienProtokollInformationType)theEObject;
				T result = caseHistorienProtokollInformationType(historienProtokollInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.IDENTIFIKATION_NACHRICHT_TYPE: {
				IdentifikationNachrichtType identifikationNachrichtType = (IdentifikationNachrichtType)theEObject;
				T result = caseIdentifikationNachrichtType(identifikationNachrichtType);
				if (result == null) result = caseBasisnachricht_IdentifikationNachrichtType(identifikationNachrichtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE: {
				IdentifikationObjektType identifikationObjektType = (IdentifikationObjektType)theEObject;
				T result = caseIdentifikationObjektType(identifikationObjektType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.KOMMUNIKATION_TYPE: {
				KommunikationType kommunikationType = (KommunikationType)theEObject;
				T result = caseKommunikationType(kommunikationType);
				if (result == null) result = caseBasisnachricht_KommunikationType(kommunikationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.KOMPRESSIONSVERFAHREN_CODE_TYPE: {
				KompressionsverfahrenCodeType kompressionsverfahrenCodeType = (KompressionsverfahrenCodeType)theEObject;
				T result = caseKompressionsverfahrenCodeType(kompressionsverfahrenCodeType);
				if (result == null) result = caseCode(kompressionsverfahrenCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.KONFIGURATIONSPARAMETER_CODE_TYPE: {
				KonfigurationsparameterCodeType konfigurationsparameterCodeType = (KonfigurationsparameterCodeType)theEObject;
				T result = caseKonfigurationsparameterCodeType(konfigurationsparameterCodeType);
				if (result == null) result = caseCode(konfigurationsparameterCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE: {
				KonfigurationsparameterGruppeCodeType konfigurationsparameterGruppeCodeType = (KonfigurationsparameterGruppeCodeType)theEObject;
				T result = caseKonfigurationsparameterGruppeCodeType(konfigurationsparameterGruppeCodeType);
				if (result == null) result = caseCode(konfigurationsparameterGruppeCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.KONTAKT_TYPE: {
				KontaktType kontaktType = (KontaktType)theEObject;
				T result = caseKontaktType(kontaktType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE: {
				KryptographischeAlgorithmenCodeType kryptographischeAlgorithmenCodeType = (KryptographischeAlgorithmenCodeType)theEObject;
				T result = caseKryptographischeAlgorithmenCodeType(kryptographischeAlgorithmenCodeType);
				if (result == null) result = caseCode(kryptographischeAlgorithmenCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.MEDIUM_CODE_TYPE: {
				MediumCodeType mediumCodeType = (MediumCodeType)theEObject;
				T result = caseMediumCodeType(mediumCodeType);
				if (result == null) result = caseCode(mediumCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NACHRICHTENKOPF_TYPE: {
				NachrichtenkopfType nachrichtenkopfType = (NachrichtenkopfType)theEObject;
				T result = caseNachrichtenkopfType(nachrichtenkopfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NACHRICHTENTYP_CODE_TYPE: {
				NachrichtentypCodeType nachrichtentypCodeType = (NachrichtentypCodeType)theEObject;
				T result = caseNachrichtentypCodeType(nachrichtentypCodeType);
				if (result == null) result = caseCode(nachrichtentypCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NACHRICHT_TYPE: {
				NachrichtType nachrichtType = (NachrichtType)theEObject;
				T result = caseNachrichtType(nachrichtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE: {
				NameNatuerlichePersonType nameNatuerlichePersonType = (NameNatuerlichePersonType)theEObject;
				T result = caseNameNatuerlichePersonType(nameNatuerlichePersonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NAME_ORGANISATION_TYPE: {
				NameOrganisationType nameOrganisationType = (NameOrganisationType)theEObject;
				T result = caseNameOrganisationType(nameOrganisationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NK_FV_DATEN_TYPE: {
				NkFVDatenType nkFVDatenType = (NkFVDatenType)theEObject;
				T result = caseNkFVDatenType(nkFVDatenType);
				if (result == null) result = caseNachrichtType(nkFVDatenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE: {
				NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType nkNichtFVDatenEinLeserMitEmpfangsbestaetigungType = (NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType)theEObject;
				T result = caseNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType(nkNichtFVDatenEinLeserMitEmpfangsbestaetigungType);
				if (result == null) result = caseNachrichtType(nkNichtFVDatenEinLeserMitEmpfangsbestaetigungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE: {
				NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType = (NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType)theEObject;
				T result = caseNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType(nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType);
				if (result == null) result = caseNkNichtFVDatenWeitereLeserType(nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType);
				if (result == null) result = caseNachrichtType(nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE: {
				NkNichtFVDatenWeitereLeserType nkNichtFVDatenWeitereLeserType = (NkNichtFVDatenWeitereLeserType)theEObject;
				T result = caseNkNichtFVDatenWeitereLeserType(nkNichtFVDatenWeitereLeserType);
				if (result == null) result = caseNachrichtType(nkNichtFVDatenWeitereLeserType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ORGANISATIONSEINHEIT_TYPE: {
				OrganisationseinheitType organisationseinheitType = (OrganisationseinheitType)theEObject;
				T result = caseOrganisationseinheitType(organisationseinheitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.PFADELEMENT_TYPE: {
				PfadelementType pfadelementType = (PfadelementType)theEObject;
				T result = casePfadelementType(pfadelementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.PRIMAERDOKUMENT_TYPE: {
				PrimaerdokumentType primaerdokumentType = (PrimaerdokumentType)theEObject;
				T result = casePrimaerdokumentType(primaerdokumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ROLLE_CODE_TYPE: {
				RolleCodeType rolleCodeType = (RolleCodeType)theEObject;
				T result = caseRolleCodeType(rolleCodeType);
				if (result == null) result = caseCode(rolleCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SCHRIFTGUTOBJEKTTYP_CODE_TYPE: {
				SchriftgutobjekttypCodeType schriftgutobjekttypCodeType = (SchriftgutobjekttypCodeType)theEObject;
				T result = caseSchriftgutobjekttypCodeType(schriftgutobjekttypCodeType);
				if (result == null) result = caseCode(schriftgutobjekttypCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE: {
				SignaturSiegelType signaturSiegelType = (SignaturSiegelType)theEObject;
				T result = caseSignaturSiegelType(signaturSiegelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SONSTIGE_FEHLERMELDUNG_CODE_TYPE: {
				SonstigeFehlermeldungCodeType sonstigeFehlermeldungCodeType = (SonstigeFehlermeldungCodeType)theEObject;
				T result = caseSonstigeFehlermeldungCodeType(sonstigeFehlermeldungCodeType);
				if (result == null) result = caseCode(sonstigeFehlermeldungCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE: {
				SpezifischeFehlermeldung0601CodeType spezifischeFehlermeldung0601CodeType = (SpezifischeFehlermeldung0601CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0601CodeType(spezifischeFehlermeldung0601CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0601CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE: {
				SpezifischeFehlermeldung0602CodeType spezifischeFehlermeldung0602CodeType = (SpezifischeFehlermeldung0602CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0602CodeType(spezifischeFehlermeldung0602CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0602CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE: {
				SpezifischeFehlermeldung0603CodeType spezifischeFehlermeldung0603CodeType = (SpezifischeFehlermeldung0603CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0603CodeType(spezifischeFehlermeldung0603CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0603CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE: {
				SpezifischeFehlermeldung0604CodeType spezifischeFehlermeldung0604CodeType = (SpezifischeFehlermeldung0604CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0604CodeType(spezifischeFehlermeldung0604CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0604CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE: {
				SpezifischeFehlermeldung0605CodeType spezifischeFehlermeldung0605CodeType = (SpezifischeFehlermeldung0605CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0605CodeType(spezifischeFehlermeldung0605CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0605CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE: {
				SpezifischeFehlermeldung0606CodeType spezifischeFehlermeldung0606CodeType = (SpezifischeFehlermeldung0606CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0606CodeType(spezifischeFehlermeldung0606CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0606CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE: {
				SpezifischeFehlermeldung0607CodeType spezifischeFehlermeldung0607CodeType = (SpezifischeFehlermeldung0607CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0607CodeType(spezifischeFehlermeldung0607CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0607CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE: {
				SpezifischeFehlermeldung0608CodeType spezifischeFehlermeldung0608CodeType = (SpezifischeFehlermeldung0608CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0608CodeType(spezifischeFehlermeldung0608CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0608CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE: {
				SpezifischeFehlermeldung0609CodeType spezifischeFehlermeldung0609CodeType = (SpezifischeFehlermeldung0609CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0609CodeType(spezifischeFehlermeldung0609CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0609CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE: {
				SpezifischeFehlermeldung0610CodeType spezifischeFehlermeldung0610CodeType = (SpezifischeFehlermeldung0610CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0610CodeType(spezifischeFehlermeldung0610CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0610CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE: {
				SpezifischeFehlermeldung0611CodeType spezifischeFehlermeldung0611CodeType = (SpezifischeFehlermeldung0611CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0611CodeType(spezifischeFehlermeldung0611CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0611CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE: {
				SpezifischeFehlermeldung0612CodeType spezifischeFehlermeldung0612CodeType = (SpezifischeFehlermeldung0612CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0612CodeType(spezifischeFehlermeldung0612CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0612CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE: {
				SpezifischeFehlermeldung0613CodeType spezifischeFehlermeldung0613CodeType = (SpezifischeFehlermeldung0613CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0613CodeType(spezifischeFehlermeldung0613CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0613CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE: {
				SpezifischeFehlermeldung0614CodeType spezifischeFehlermeldung0614CodeType = (SpezifischeFehlermeldung0614CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0614CodeType(spezifischeFehlermeldung0614CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0614CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE: {
				SpezifischeFehlermeldung0615CodeType spezifischeFehlermeldung0615CodeType = (SpezifischeFehlermeldung0615CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0615CodeType(spezifischeFehlermeldung0615CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0615CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE: {
				SpezifischeFehlermeldung0616CodeType spezifischeFehlermeldung0616CodeType = (SpezifischeFehlermeldung0616CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0616CodeType(spezifischeFehlermeldung0616CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0616CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE: {
				SpezifischeFehlermeldung0617CodeType spezifischeFehlermeldung0617CodeType = (SpezifischeFehlermeldung0617CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0617CodeType(spezifischeFehlermeldung0617CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0617CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE: {
				SpezifischeFehlermeldung0618CodeType spezifischeFehlermeldung0618CodeType = (SpezifischeFehlermeldung0618CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0618CodeType(spezifischeFehlermeldung0618CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0618CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE: {
				SpezifischeFehlermeldung0619CodeType spezifischeFehlermeldung0619CodeType = (SpezifischeFehlermeldung0619CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0619CodeType(spezifischeFehlermeldung0619CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0619CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE: {
				SpezifischeFehlermeldung0620CodeType spezifischeFehlermeldung0620CodeType = (SpezifischeFehlermeldung0620CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0620CodeType(spezifischeFehlermeldung0620CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0620CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE: {
				SpezifischeFehlermeldung0621CodeType spezifischeFehlermeldung0621CodeType = (SpezifischeFehlermeldung0621CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0621CodeType(spezifischeFehlermeldung0621CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0621CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE: {
				SpezifischeFehlermeldung0622CodeType spezifischeFehlermeldung0622CodeType = (SpezifischeFehlermeldung0622CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0622CodeType(spezifischeFehlermeldung0622CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0622CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE: {
				SpezifischeFehlermeldung0623CodeType spezifischeFehlermeldung0623CodeType = (SpezifischeFehlermeldung0623CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0623CodeType(spezifischeFehlermeldung0623CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0623CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE: {
				SpezifischeFehlermeldung0624CodeType spezifischeFehlermeldung0624CodeType = (SpezifischeFehlermeldung0624CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0624CodeType(spezifischeFehlermeldung0624CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0624CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE: {
				SpezifischeFehlermeldung0625CodeType spezifischeFehlermeldung0625CodeType = (SpezifischeFehlermeldung0625CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0625CodeType(spezifischeFehlermeldung0625CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0625CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE: {
				SpezifischeFehlermeldung0626CodeType spezifischeFehlermeldung0626CodeType = (SpezifischeFehlermeldung0626CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0626CodeType(spezifischeFehlermeldung0626CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0626CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE: {
				SpezifischeFehlermeldung0627CodeType spezifischeFehlermeldung0627CodeType = (SpezifischeFehlermeldung0627CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0627CodeType(spezifischeFehlermeldung0627CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0627CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE: {
				SpezifischeFehlermeldung0628CodeType spezifischeFehlermeldung0628CodeType = (SpezifischeFehlermeldung0628CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0628CodeType(spezifischeFehlermeldung0628CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0628CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE: {
				SpezifischeFehlermeldung0631CodeType spezifischeFehlermeldung0631CodeType = (SpezifischeFehlermeldung0631CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0631CodeType(spezifischeFehlermeldung0631CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0631CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE: {
				SpezifischeFehlermeldung0632CodeType spezifischeFehlermeldung0632CodeType = (SpezifischeFehlermeldung0632CodeType)theEObject;
				T result = caseSpezifischeFehlermeldung0632CodeType(spezifischeFehlermeldung0632CodeType);
				if (result == null) result = caseCode(spezifischeFehlermeldung0632CodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.STAAT_CODE_TYPE: {
				StaatCodeType staatCodeType = (StaatCodeType)theEObject;
				T result = caseStaatCodeType(staatCodeType);
				if (result == null) result = caseCode(staatCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.STAAT_TYPE: {
				StaatType staatType = (StaatType)theEObject;
				T result = caseStaatType(staatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.STRUKTURELEMENT_TYP_CODE_TYPE: {
				StrukturelementTypCodeType strukturelementTypCodeType = (StrukturelementTypCodeType)theEObject;
				T result = caseStrukturelementTypCodeType(strukturelementTypCodeType);
				if (result == null) result = caseCode(strukturelementTypCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.STRUKTURPFAD_TYPE: {
				StrukturpfadType strukturpfadType = (StrukturpfadType)theEObject;
				T result = caseStrukturpfadType(strukturpfadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T result = caseSystemType(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.TRANSPORTWEG_CODE_TYPE: {
				TransportwegCodeType transportwegCodeType = (TransportwegCodeType)theEObject;
				T result = caseTransportwegCodeType(transportwegCodeType);
				if (result == null) result = caseCode(transportwegCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE: {
				UnstrukturierteAnschriftType unstrukturierteAnschriftType = (UnstrukturierteAnschriftType)theEObject;
				T result = caseUnstrukturierteAnschriftType(unstrukturierteAnschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.VERFUEGUNG_TYPE: {
				VerfuegungType verfuegungType = (VerfuegungType)theEObject;
				T result = caseVerfuegungType(verfuegungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.VERSION_TYPE: {
				VersionType versionType = (VersionType)theEObject;
				T result = caseVersionType(versionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.VERWEIS_TYPE: {
				VerweisType verweisType = (VerweisType)theEObject;
				T result = caseVerweisType(verweisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.VORGANG_TYPE: {
				VorgangType vorgangType = (VorgangType)theEObject;
				T result = caseVorgangType(vorgangType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomeaPackage.ZEITRAUM_TYPE: {
				ZeitraumType zeitraumType = (ZeitraumType)theEObject;
				T result = caseZeitraumType(zeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akteninhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akteninhalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkteninhaltType(AkteninhaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aktenplaneinheit Aktenplan Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aktenplaneinheit Aktenplan Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAktenplaneinheitAktenplanType(AktenplaneinheitAktenplanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aktenplaneinheit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aktenplaneinheit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAktenplaneinheitType(AktenplaneinheitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aktenplan Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aktenplan Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAktenplanType(AktenplanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akte Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akte Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkteType(AkteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeine Metadaten Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeine Metadaten Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeineMetadatenType(AllgemeineMetadatenType object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeine Rueckmeldung Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeine Rueckmeldung Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeineRueckmeldungCodeType(AllgemeineRueckmeldungCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anlage Dokument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anlage Dokument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnlageDokumentType(AnlageDokumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anschriftstyp Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anschriftstyp Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnschriftstypCodeType(AnschriftstypCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnschriftType(AnschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anwendungsspezifische Erweiterung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anwendungsspezifische Erweiterung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnwendungsspezifischeErweiterungType(AnwendungsspezifischeErweiterungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anwendungsspezifische Erweiterung XML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anwendungsspezifische Erweiterung XML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnwendungsspezifischeErweiterungXMLType(AnwendungsspezifischeErweiterungXMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufbewahrungsdauer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufbewahrungsdauer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufbewahrungsdauerType(AufbewahrungsdauerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aussonderungsart Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aussonderungsart Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAussonderungsartCodeType(AussonderungsartCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aussonderungsart Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aussonderungsart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAussonderungsartType(AussonderungsartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aussonderungsmetadaten Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aussonderungsmetadaten Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAussonderungsmetadatenType(AussonderungsmetadatenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearbeitung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearbeitung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearbeitungType(BearbeitungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behoerde Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behoerde Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehoerdeType(BehoerdeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beteiligungsschritt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beteiligungsschritt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeteiligungsschrittType(BeteiligungsschrittType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beteiligungsstatus Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beteiligungsstatus Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeteiligungsstatusCodeType(BeteiligungsstatusCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bewertungsvorschlag Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bewertungsvorschlag Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBewertungsvorschlagCodeType(BewertungsvorschlagCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateiformat Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateiformat Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateiformatCodeType(DateiformatCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenaustauschart Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenaustauschart Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenaustauschartCodeType(DatenaustauschartCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenschutzstufe Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenschutzstufe Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenschutzstufeCodeType(DatenschutzstufeCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datentyp Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datentyp Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatentypCodeType(DatentypCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dokument Mit Schriftstueck Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dokument Mit Schriftstueck Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDokumentMitSchriftstueckType(DokumentMitSchriftstueckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dokument Oder Dokument Mit Schriftstueck Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dokument Oder Dokument Mit Schriftstueck Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDokumentOderDokumentMitSchriftstueckType(DokumentOderDokumentMitSchriftstueckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dokument Schriftstueck Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dokument Schriftstueck Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDokumentSchriftstueckBasisType(DokumentSchriftstueckBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dokument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dokument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDokumentType(DokumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erfolg Oder Misserfolg Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erfolg Oder Misserfolg Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErfolgOderMisserfolgImportType(ErfolgOderMisserfolgImportType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Format Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormatType(FormatType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Geheimhaltungsgrad Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geheimhaltungsgrad Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeheimhaltungsgradCodeType(GeheimhaltungsgradCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geheimhaltung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geheimhaltung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeheimhaltungType(GeheimhaltungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschaeftsgang Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschaeftsgang Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschaeftsgangType(GeschaeftsgangType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashType(HashType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historien Protokoll Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historien Protokoll Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistorienProtokollInformationType(HistorienProtokollInformationType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Identifikation Objekt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifikation Objekt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifikationObjektType(IdentifikationObjektType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kommunikation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kommunikation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKommunikationType(KommunikationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kompressionsverfahren Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kompressionsverfahren Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKompressionsverfahrenCodeType(KompressionsverfahrenCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Konfigurationsparameter Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Konfigurationsparameter Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKonfigurationsparameterCodeType(KonfigurationsparameterCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Konfigurationsparameter Gruppe Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Konfigurationsparameter Gruppe Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKonfigurationsparameterGruppeCodeType(KonfigurationsparameterGruppeCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kontakt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kontakt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKontaktType(KontaktType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kryptographische Algorithmen Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kryptographische Algorithmen Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKryptographischeAlgorithmenCodeType(KryptographischeAlgorithmenCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediumCodeType(MediumCodeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Nachrichtentyp Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachrichtentyp Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtentypCodeType(NachrichtentypCodeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Name Organisation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Organisation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameOrganisationType(NameOrganisationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nk FV Daten Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nk FV Daten Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNkFVDatenType(NkFVDatenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType(NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType(NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nk Nicht FV Daten Weitere Leser Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nk Nicht FV Daten Weitere Leser Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNkNichtFVDatenWeitereLeserType(NkNichtFVDatenWeitereLeserType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisationseinheit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisationseinheit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationseinheitType(OrganisationseinheitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pfadelement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pfadelement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePfadelementType(PfadelementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primaerdokument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primaerdokument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaerdokumentType(PrimaerdokumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rolle Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rolle Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolleCodeType(RolleCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schriftgutobjekttyp Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schriftgutobjekttyp Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchriftgutobjekttypCodeType(SchriftgutobjekttypCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signatur Siegel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signatur Siegel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignaturSiegelType(SignaturSiegelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Fehlermeldung Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Fehlermeldung Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstigeFehlermeldungCodeType(SonstigeFehlermeldungCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0601 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0601 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0601CodeType(SpezifischeFehlermeldung0601CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0602 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0602 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0602CodeType(SpezifischeFehlermeldung0602CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0603 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0603 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0603CodeType(SpezifischeFehlermeldung0603CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0604 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0604 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0604CodeType(SpezifischeFehlermeldung0604CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0605 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0605 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0605CodeType(SpezifischeFehlermeldung0605CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0606 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0606 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0606CodeType(SpezifischeFehlermeldung0606CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0607 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0607 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0607CodeType(SpezifischeFehlermeldung0607CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0608 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0608 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0608CodeType(SpezifischeFehlermeldung0608CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0609 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0609 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0609CodeType(SpezifischeFehlermeldung0609CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0610 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0610 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0610CodeType(SpezifischeFehlermeldung0610CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0611 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0611 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0611CodeType(SpezifischeFehlermeldung0611CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0612 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0612 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0612CodeType(SpezifischeFehlermeldung0612CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0613 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0613 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0613CodeType(SpezifischeFehlermeldung0613CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0614 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0614 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0614CodeType(SpezifischeFehlermeldung0614CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0615 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0615 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0615CodeType(SpezifischeFehlermeldung0615CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0616 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0616 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0616CodeType(SpezifischeFehlermeldung0616CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0617 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0617 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0617CodeType(SpezifischeFehlermeldung0617CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0618 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0618 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0618CodeType(SpezifischeFehlermeldung0618CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0619 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0619 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0619CodeType(SpezifischeFehlermeldung0619CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0620 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0620 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0620CodeType(SpezifischeFehlermeldung0620CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0621 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0621 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0621CodeType(SpezifischeFehlermeldung0621CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0622 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0622 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0622CodeType(SpezifischeFehlermeldung0622CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0623 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0623 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0623CodeType(SpezifischeFehlermeldung0623CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0624 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0624 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0624CodeType(SpezifischeFehlermeldung0624CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0625 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0625 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0625CodeType(SpezifischeFehlermeldung0625CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0626 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0626 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0626CodeType(SpezifischeFehlermeldung0626CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0627 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0627 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0627CodeType(SpezifischeFehlermeldung0627CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0628 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0628 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0628CodeType(SpezifischeFehlermeldung0628CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0631 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0631 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0631CodeType(SpezifischeFehlermeldung0631CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0632 Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spezifische Fehlermeldung0632 Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpezifischeFehlermeldung0632CodeType(SpezifischeFehlermeldung0632CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staat Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staat Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaatCodeType(StaatCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staat Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staat Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaatType(StaatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strukturelement Typ Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strukturelement Typ Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrukturelementTypCodeType(StrukturelementTypCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strukturpfad Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strukturpfad Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrukturpfadType(StrukturpfadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportweg Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportweg Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportwegCodeType(TransportwegCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstrukturierte Anschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstrukturierte Anschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstrukturierteAnschriftType(UnstrukturierteAnschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verfuegung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verfuegung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerfuegungType(VerfuegungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionType(VersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verweis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verweis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerweisType(VerweisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vorgang Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vorgang Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVorgangType(VorgangType object) {
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
	public T caseBasisnachricht_IdentifikationNachrichtType(basisnachricht.IdentifikationNachrichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kommunikation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kommunikation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasisnachricht_KommunikationType(basisnachricht.KommunikationType object) {
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

} //DomeaSwitch
