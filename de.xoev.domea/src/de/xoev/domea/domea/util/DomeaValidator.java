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

import de.xoev.domea.domea.*;

import java.util.Map;

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
 * @see de.xoev.domea.domea.DomeaPackage
 * @generated
 */
public class DomeaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DomeaValidator INSTANCE = new DomeaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.xoev.domea.domea";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomeaValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DomeaPackage.eINSTANCE;
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
			case DomeaPackage.AKTENINHALT_TYPE:
				return validateAkteninhaltType((AkteninhaltType)value, diagnostics, context);
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE:
				return validateAktenplaneinheitAktenplanType((AktenplaneinheitAktenplanType)value, diagnostics, context);
			case DomeaPackage.AKTENPLANEINHEIT_TYPE:
				return validateAktenplaneinheitType((AktenplaneinheitType)value, diagnostics, context);
			case DomeaPackage.AKTENPLAN_TYPE:
				return validateAktenplanType((AktenplanType)value, diagnostics, context);
			case DomeaPackage.AKTE_TYPE:
				return validateAkteType((AkteType)value, diagnostics, context);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE:
				return validateAllgemeineMetadatenType((AllgemeineMetadatenType)value, diagnostics, context);
			case DomeaPackage.ALLGEMEINER_NAME_TYPE:
				return validateAllgemeinerNameType((AllgemeinerNameType)value, diagnostics, context);
			case DomeaPackage.ALLGEMEINE_RUECKMELDUNG_CODE_TYPE:
				return validateAllgemeineRueckmeldungCodeType((AllgemeineRueckmeldungCodeType)value, diagnostics, context);
			case DomeaPackage.ANLAGE_DOKUMENT_TYPE:
				return validateAnlageDokumentType((AnlageDokumentType)value, diagnostics, context);
			case DomeaPackage.ANSCHRIFTSTYP_CODE_TYPE:
				return validateAnschriftstypCodeType((AnschriftstypCodeType)value, diagnostics, context);
			case DomeaPackage.ANSCHRIFT_TYPE:
				return validateAnschriftType((AnschriftType)value, diagnostics, context);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE:
				return validateAnwendungsspezifischeErweiterungType((AnwendungsspezifischeErweiterungType)value, diagnostics, context);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE:
				return validateAnwendungsspezifischeErweiterungXMLType((AnwendungsspezifischeErweiterungXMLType)value, diagnostics, context);
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE:
				return validateAufbewahrungsdauerType((AufbewahrungsdauerType)value, diagnostics, context);
			case DomeaPackage.AUSSONDERUNGSART_CODE_TYPE:
				return validateAussonderungsartCodeType((AussonderungsartCodeType)value, diagnostics, context);
			case DomeaPackage.AUSSONDERUNGSART_TYPE:
				return validateAussonderungsartType((AussonderungsartType)value, diagnostics, context);
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE:
				return validateAussonderungsmetadatenType((AussonderungsmetadatenType)value, diagnostics, context);
			case DomeaPackage.BEARBEITUNG_TYPE:
				return validateBearbeitungType((BearbeitungType)value, diagnostics, context);
			case DomeaPackage.BEHOERDE_TYPE:
				return validateBehoerdeType((BehoerdeType)value, diagnostics, context);
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE:
				return validateBeteiligungsschrittType((BeteiligungsschrittType)value, diagnostics, context);
			case DomeaPackage.BETEILIGUNGSSTATUS_CODE_TYPE:
				return validateBeteiligungsstatusCodeType((BeteiligungsstatusCodeType)value, diagnostics, context);
			case DomeaPackage.BEWERTUNGSVORSCHLAG_CODE_TYPE:
				return validateBewertungsvorschlagCodeType((BewertungsvorschlagCodeType)value, diagnostics, context);
			case DomeaPackage.DATEIFORMAT_CODE_TYPE:
				return validateDateiformatCodeType((DateiformatCodeType)value, diagnostics, context);
			case DomeaPackage.DATENAUSTAUSCHART_CODE_TYPE:
				return validateDatenaustauschartCodeType((DatenaustauschartCodeType)value, diagnostics, context);
			case DomeaPackage.DATENSCHUTZSTUFE_CODE_TYPE:
				return validateDatenschutzstufeCodeType((DatenschutzstufeCodeType)value, diagnostics, context);
			case DomeaPackage.DATENTYP_CODE_TYPE:
				return validateDatentypCodeType((DatentypCodeType)value, diagnostics, context);
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE:
				return validateDokumentMitSchriftstueckType((DokumentMitSchriftstueckType)value, diagnostics, context);
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE:
				return validateDokumentOderDokumentMitSchriftstueckType((DokumentOderDokumentMitSchriftstueckType)value, diagnostics, context);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE:
				return validateDokumentSchriftstueckBasisType((DokumentSchriftstueckBasisType)value, diagnostics, context);
			case DomeaPackage.DOKUMENT_TYPE:
				return validateDokumentType((DokumentType)value, diagnostics, context);
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE:
				return validateErfolgOderMisserfolgImportType((ErfolgOderMisserfolgImportType)value, diagnostics, context);
			case DomeaPackage.FELDGRUPPE_TYPE:
				return validateFeldgruppeType((FeldgruppeType)value, diagnostics, context);
			case DomeaPackage.FELD_TYPE:
				return validateFeldType((FeldType)value, diagnostics, context);
			case DomeaPackage.FORMAT_TYPE:
				return validateFormatType((FormatType)value, diagnostics, context);
			case DomeaPackage.GEBURT_TYPE:
				return validateGeburtType((GeburtType)value, diagnostics, context);
			case DomeaPackage.GEHEIMHALTUNGSGRAD_CODE_TYPE:
				return validateGeheimhaltungsgradCodeType((GeheimhaltungsgradCodeType)value, diagnostics, context);
			case DomeaPackage.GEHEIMHALTUNG_TYPE:
				return validateGeheimhaltungType((GeheimhaltungType)value, diagnostics, context);
			case DomeaPackage.GESCHAEFTSGANG_TYPE:
				return validateGeschaeftsgangType((GeschaeftsgangType)value, diagnostics, context);
			case DomeaPackage.HASH_TYPE:
				return validateHashType((HashType)value, diagnostics, context);
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE:
				return validateHistorienProtokollInformationType((HistorienProtokollInformationType)value, diagnostics, context);
			case DomeaPackage.IDENTIFIKATION_NACHRICHT_TYPE:
				return validateIdentifikationNachrichtType((IdentifikationNachrichtType)value, diagnostics, context);
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE:
				return validateIdentifikationObjektType((IdentifikationObjektType)value, diagnostics, context);
			case DomeaPackage.KOMMUNIKATION_TYPE:
				return validateKommunikationType((KommunikationType)value, diagnostics, context);
			case DomeaPackage.KOMPRESSIONSVERFAHREN_CODE_TYPE:
				return validateKompressionsverfahrenCodeType((KompressionsverfahrenCodeType)value, diagnostics, context);
			case DomeaPackage.KONFIGURATIONSPARAMETER_CODE_TYPE:
				return validateKonfigurationsparameterCodeType((KonfigurationsparameterCodeType)value, diagnostics, context);
			case DomeaPackage.KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE:
				return validateKonfigurationsparameterGruppeCodeType((KonfigurationsparameterGruppeCodeType)value, diagnostics, context);
			case DomeaPackage.KONTAKT_TYPE:
				return validateKontaktType((KontaktType)value, diagnostics, context);
			case DomeaPackage.KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE:
				return validateKryptographischeAlgorithmenCodeType((KryptographischeAlgorithmenCodeType)value, diagnostics, context);
			case DomeaPackage.MEDIUM_CODE_TYPE:
				return validateMediumCodeType((MediumCodeType)value, diagnostics, context);
			case DomeaPackage.NACHRICHTENKOPF_TYPE:
				return validateNachrichtenkopfType((NachrichtenkopfType)value, diagnostics, context);
			case DomeaPackage.NACHRICHTENTYP_CODE_TYPE:
				return validateNachrichtentypCodeType((NachrichtentypCodeType)value, diagnostics, context);
			case DomeaPackage.NACHRICHT_TYPE:
				return validateNachrichtType((NachrichtType)value, diagnostics, context);
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE:
				return validateNameNatuerlichePersonType((NameNatuerlichePersonType)value, diagnostics, context);
			case DomeaPackage.NAME_ORGANISATION_TYPE:
				return validateNameOrganisationType((NameOrganisationType)value, diagnostics, context);
			case DomeaPackage.NK_FV_DATEN_TYPE:
				return validateNkFVDatenType((NkFVDatenType)value, diagnostics, context);
			case DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE:
				return validateNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType((NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType)value, diagnostics, context);
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE:
				return validateNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType((NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType)value, diagnostics, context);
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE:
				return validateNkNichtFVDatenWeitereLeserType((NkNichtFVDatenWeitereLeserType)value, diagnostics, context);
			case DomeaPackage.ORGANISATIONSEINHEIT_TYPE:
				return validateOrganisationseinheitType((OrganisationseinheitType)value, diagnostics, context);
			case DomeaPackage.PFADELEMENT_TYPE:
				return validatePfadelementType((PfadelementType)value, diagnostics, context);
			case DomeaPackage.PRIMAERDOKUMENT_TYPE:
				return validatePrimaerdokumentType((PrimaerdokumentType)value, diagnostics, context);
			case DomeaPackage.ROLLE_CODE_TYPE:
				return validateRolleCodeType((RolleCodeType)value, diagnostics, context);
			case DomeaPackage.SCHRIFTGUTOBJEKTTYP_CODE_TYPE:
				return validateSchriftgutobjekttypCodeType((SchriftgutobjekttypCodeType)value, diagnostics, context);
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE:
				return validateSignaturSiegelType((SignaturSiegelType)value, diagnostics, context);
			case DomeaPackage.SONSTIGE_FEHLERMELDUNG_CODE_TYPE:
				return validateSonstigeFehlermeldungCodeType((SonstigeFehlermeldungCodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE:
				return validateSpezifischeFehlermeldung0601CodeType((SpezifischeFehlermeldung0601CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE:
				return validateSpezifischeFehlermeldung0602CodeType((SpezifischeFehlermeldung0602CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE:
				return validateSpezifischeFehlermeldung0603CodeType((SpezifischeFehlermeldung0603CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE:
				return validateSpezifischeFehlermeldung0604CodeType((SpezifischeFehlermeldung0604CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE:
				return validateSpezifischeFehlermeldung0605CodeType((SpezifischeFehlermeldung0605CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE:
				return validateSpezifischeFehlermeldung0606CodeType((SpezifischeFehlermeldung0606CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE:
				return validateSpezifischeFehlermeldung0607CodeType((SpezifischeFehlermeldung0607CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE:
				return validateSpezifischeFehlermeldung0608CodeType((SpezifischeFehlermeldung0608CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE:
				return validateSpezifischeFehlermeldung0609CodeType((SpezifischeFehlermeldung0609CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE:
				return validateSpezifischeFehlermeldung0610CodeType((SpezifischeFehlermeldung0610CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE:
				return validateSpezifischeFehlermeldung0611CodeType((SpezifischeFehlermeldung0611CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE:
				return validateSpezifischeFehlermeldung0612CodeType((SpezifischeFehlermeldung0612CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE:
				return validateSpezifischeFehlermeldung0613CodeType((SpezifischeFehlermeldung0613CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE:
				return validateSpezifischeFehlermeldung0614CodeType((SpezifischeFehlermeldung0614CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE:
				return validateSpezifischeFehlermeldung0615CodeType((SpezifischeFehlermeldung0615CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE:
				return validateSpezifischeFehlermeldung0616CodeType((SpezifischeFehlermeldung0616CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE:
				return validateSpezifischeFehlermeldung0617CodeType((SpezifischeFehlermeldung0617CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE:
				return validateSpezifischeFehlermeldung0618CodeType((SpezifischeFehlermeldung0618CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE:
				return validateSpezifischeFehlermeldung0619CodeType((SpezifischeFehlermeldung0619CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE:
				return validateSpezifischeFehlermeldung0620CodeType((SpezifischeFehlermeldung0620CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE:
				return validateSpezifischeFehlermeldung0621CodeType((SpezifischeFehlermeldung0621CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE:
				return validateSpezifischeFehlermeldung0622CodeType((SpezifischeFehlermeldung0622CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE:
				return validateSpezifischeFehlermeldung0623CodeType((SpezifischeFehlermeldung0623CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE:
				return validateSpezifischeFehlermeldung0624CodeType((SpezifischeFehlermeldung0624CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE:
				return validateSpezifischeFehlermeldung0625CodeType((SpezifischeFehlermeldung0625CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE:
				return validateSpezifischeFehlermeldung0626CodeType((SpezifischeFehlermeldung0626CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE:
				return validateSpezifischeFehlermeldung0627CodeType((SpezifischeFehlermeldung0627CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE:
				return validateSpezifischeFehlermeldung0628CodeType((SpezifischeFehlermeldung0628CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE:
				return validateSpezifischeFehlermeldung0631CodeType((SpezifischeFehlermeldung0631CodeType)value, diagnostics, context);
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE:
				return validateSpezifischeFehlermeldung0632CodeType((SpezifischeFehlermeldung0632CodeType)value, diagnostics, context);
			case DomeaPackage.STAAT_CODE_TYPE:
				return validateStaatCodeType((StaatCodeType)value, diagnostics, context);
			case DomeaPackage.STAAT_TYPE:
				return validateStaatType((StaatType)value, diagnostics, context);
			case DomeaPackage.STRUKTURELEMENT_TYP_CODE_TYPE:
				return validateStrukturelementTypCodeType((StrukturelementTypCodeType)value, diagnostics, context);
			case DomeaPackage.STRUKTURPFAD_TYPE:
				return validateStrukturpfadType((StrukturpfadType)value, diagnostics, context);
			case DomeaPackage.SYSTEM_TYPE:
				return validateSystemType((SystemType)value, diagnostics, context);
			case DomeaPackage.TRANSPORTWEG_CODE_TYPE:
				return validateTransportwegCodeType((TransportwegCodeType)value, diagnostics, context);
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE:
				return validateUnstrukturierteAnschriftType((UnstrukturierteAnschriftType)value, diagnostics, context);
			case DomeaPackage.VERFUEGUNG_TYPE:
				return validateVerfuegungType((VerfuegungType)value, diagnostics, context);
			case DomeaPackage.VERSION_TYPE:
				return validateVersionType((VersionType)value, diagnostics, context);
			case DomeaPackage.VERWEIS_TYPE:
				return validateVerweisType((VerweisType)value, diagnostics, context);
			case DomeaPackage.VORGANG_TYPE:
				return validateVorgangType((VorgangType)value, diagnostics, context);
			case DomeaPackage.ZEITRAUM_TYPE:
				return validateZeitraumType((ZeitraumType)value, diagnostics, context);
			case DomeaPackage.STRING_DATEINAME_TYPE:
				return validateStringDateinameType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkteninhaltType(AkteninhaltType akteninhaltType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akteninhaltType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAktenplaneinheitAktenplanType(AktenplaneinheitAktenplanType aktenplaneinheitAktenplanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aktenplaneinheitAktenplanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAktenplaneinheitType(AktenplaneinheitType aktenplaneinheitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aktenplaneinheitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAktenplanType(AktenplanType aktenplanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aktenplanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkteType(AkteType akteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllgemeineMetadatenType(AllgemeineMetadatenType allgemeineMetadatenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allgemeineMetadatenType, diagnostics, context);
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
	public boolean validateAllgemeineRueckmeldungCodeType(AllgemeineRueckmeldungCodeType allgemeineRueckmeldungCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allgemeineRueckmeldungCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnlageDokumentType(AnlageDokumentType anlageDokumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anlageDokumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnschriftstypCodeType(AnschriftstypCodeType anschriftstypCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anschriftstypCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnschriftType(AnschriftType anschriftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anschriftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendungsspezifischeErweiterungType(AnwendungsspezifischeErweiterungType anwendungsspezifischeErweiterungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anwendungsspezifischeErweiterungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendungsspezifischeErweiterungXMLType(AnwendungsspezifischeErweiterungXMLType anwendungsspezifischeErweiterungXMLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anwendungsspezifischeErweiterungXMLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufbewahrungsdauerType(AufbewahrungsdauerType aufbewahrungsdauerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aufbewahrungsdauerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAussonderungsartCodeType(AussonderungsartCodeType aussonderungsartCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aussonderungsartCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAussonderungsartType(AussonderungsartType aussonderungsartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aussonderungsartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAussonderungsmetadatenType(AussonderungsmetadatenType aussonderungsmetadatenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aussonderungsmetadatenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBearbeitungType(BearbeitungType bearbeitungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bearbeitungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehoerdeType(BehoerdeType behoerdeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behoerdeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeteiligungsschrittType(BeteiligungsschrittType beteiligungsschrittType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beteiligungsschrittType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeteiligungsstatusCodeType(BeteiligungsstatusCodeType beteiligungsstatusCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beteiligungsstatusCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBewertungsvorschlagCodeType(BewertungsvorschlagCodeType bewertungsvorschlagCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bewertungsvorschlagCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateiformatCodeType(DateiformatCodeType dateiformatCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateiformatCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenaustauschartCodeType(DatenaustauschartCodeType datenaustauschartCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenaustauschartCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenschutzstufeCodeType(DatenschutzstufeCodeType datenschutzstufeCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenschutzstufeCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatentypCodeType(DatentypCodeType datentypCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datentypCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDokumentMitSchriftstueckType(DokumentMitSchriftstueckType dokumentMitSchriftstueckType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dokumentMitSchriftstueckType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDokumentOderDokumentMitSchriftstueckType(DokumentOderDokumentMitSchriftstueckType dokumentOderDokumentMitSchriftstueckType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dokumentOderDokumentMitSchriftstueckType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDokumentSchriftstueckBasisType(DokumentSchriftstueckBasisType dokumentSchriftstueckBasisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dokumentSchriftstueckBasisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDokumentType(DokumentType dokumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dokumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErfolgOderMisserfolgImportType(ErfolgOderMisserfolgImportType erfolgOderMisserfolgImportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(erfolgOderMisserfolgImportType, diagnostics, context);
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
	public boolean validateFormatType(FormatType formatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formatType, diagnostics, context);
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
	public boolean validateGeheimhaltungsgradCodeType(GeheimhaltungsgradCodeType geheimhaltungsgradCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geheimhaltungsgradCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeheimhaltungType(GeheimhaltungType geheimhaltungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geheimhaltungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschaeftsgangType(GeschaeftsgangType geschaeftsgangType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geschaeftsgangType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashType(HashType hashType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hashType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistorienProtokollInformationType(HistorienProtokollInformationType historienProtokollInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(historienProtokollInformationType, diagnostics, context);
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
	public boolean validateIdentifikationObjektType(IdentifikationObjektType identifikationObjektType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifikationObjektType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKommunikationType(KommunikationType kommunikationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kommunikationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKompressionsverfahrenCodeType(KompressionsverfahrenCodeType kompressionsverfahrenCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kompressionsverfahrenCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKonfigurationsparameterCodeType(KonfigurationsparameterCodeType konfigurationsparameterCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(konfigurationsparameterCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKonfigurationsparameterGruppeCodeType(KonfigurationsparameterGruppeCodeType konfigurationsparameterGruppeCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(konfigurationsparameterGruppeCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKontaktType(KontaktType kontaktType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kontaktType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKryptographischeAlgorithmenCodeType(KryptographischeAlgorithmenCodeType kryptographischeAlgorithmenCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kryptographischeAlgorithmenCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediumCodeType(MediumCodeType mediumCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mediumCodeType, diagnostics, context);
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
	public boolean validateNachrichtentypCodeType(NachrichtentypCodeType nachrichtentypCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nachrichtentypCodeType, diagnostics, context);
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
	public boolean validateNameNatuerlichePersonType(NameNatuerlichePersonType nameNatuerlichePersonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameNatuerlichePersonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameOrganisationType(NameOrganisationType nameOrganisationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameOrganisationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNkFVDatenType(NkFVDatenType nkFVDatenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nkFVDatenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType(NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType nkNichtFVDatenEinLeserMitEmpfangsbestaetigungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nkNichtFVDatenEinLeserMitEmpfangsbestaetigungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType(NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNkNichtFVDatenWeitereLeserType(NkNichtFVDatenWeitereLeserType nkNichtFVDatenWeitereLeserType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nkNichtFVDatenWeitereLeserType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisationseinheitType(OrganisationseinheitType organisationseinheitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organisationseinheitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePfadelementType(PfadelementType pfadelementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pfadelementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaerdokumentType(PrimaerdokumentType primaerdokumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaerdokumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolleCodeType(RolleCodeType rolleCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rolleCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchriftgutobjekttypCodeType(SchriftgutobjekttypCodeType schriftgutobjekttypCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schriftgutobjekttypCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturSiegelType(SignaturSiegelType signaturSiegelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signaturSiegelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonstigeFehlermeldungCodeType(SonstigeFehlermeldungCodeType sonstigeFehlermeldungCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sonstigeFehlermeldungCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0601CodeType(SpezifischeFehlermeldung0601CodeType spezifischeFehlermeldung0601CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0601CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0602CodeType(SpezifischeFehlermeldung0602CodeType spezifischeFehlermeldung0602CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0602CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0603CodeType(SpezifischeFehlermeldung0603CodeType spezifischeFehlermeldung0603CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0603CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0604CodeType(SpezifischeFehlermeldung0604CodeType spezifischeFehlermeldung0604CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0604CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0605CodeType(SpezifischeFehlermeldung0605CodeType spezifischeFehlermeldung0605CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0605CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0606CodeType(SpezifischeFehlermeldung0606CodeType spezifischeFehlermeldung0606CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0606CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0607CodeType(SpezifischeFehlermeldung0607CodeType spezifischeFehlermeldung0607CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0607CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0608CodeType(SpezifischeFehlermeldung0608CodeType spezifischeFehlermeldung0608CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0608CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0609CodeType(SpezifischeFehlermeldung0609CodeType spezifischeFehlermeldung0609CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0609CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0610CodeType(SpezifischeFehlermeldung0610CodeType spezifischeFehlermeldung0610CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0610CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0611CodeType(SpezifischeFehlermeldung0611CodeType spezifischeFehlermeldung0611CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0611CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0612CodeType(SpezifischeFehlermeldung0612CodeType spezifischeFehlermeldung0612CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0612CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0613CodeType(SpezifischeFehlermeldung0613CodeType spezifischeFehlermeldung0613CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0613CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0614CodeType(SpezifischeFehlermeldung0614CodeType spezifischeFehlermeldung0614CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0614CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0615CodeType(SpezifischeFehlermeldung0615CodeType spezifischeFehlermeldung0615CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0615CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0616CodeType(SpezifischeFehlermeldung0616CodeType spezifischeFehlermeldung0616CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0616CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0617CodeType(SpezifischeFehlermeldung0617CodeType spezifischeFehlermeldung0617CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0617CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0618CodeType(SpezifischeFehlermeldung0618CodeType spezifischeFehlermeldung0618CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0618CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0619CodeType(SpezifischeFehlermeldung0619CodeType spezifischeFehlermeldung0619CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0619CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0620CodeType(SpezifischeFehlermeldung0620CodeType spezifischeFehlermeldung0620CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0620CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0621CodeType(SpezifischeFehlermeldung0621CodeType spezifischeFehlermeldung0621CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0621CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0622CodeType(SpezifischeFehlermeldung0622CodeType spezifischeFehlermeldung0622CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0622CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0623CodeType(SpezifischeFehlermeldung0623CodeType spezifischeFehlermeldung0623CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0623CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0624CodeType(SpezifischeFehlermeldung0624CodeType spezifischeFehlermeldung0624CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0624CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0625CodeType(SpezifischeFehlermeldung0625CodeType spezifischeFehlermeldung0625CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0625CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0626CodeType(SpezifischeFehlermeldung0626CodeType spezifischeFehlermeldung0626CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0626CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0627CodeType(SpezifischeFehlermeldung0627CodeType spezifischeFehlermeldung0627CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0627CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0628CodeType(SpezifischeFehlermeldung0628CodeType spezifischeFehlermeldung0628CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0628CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0631CodeType(SpezifischeFehlermeldung0631CodeType spezifischeFehlermeldung0631CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0631CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpezifischeFehlermeldung0632CodeType(SpezifischeFehlermeldung0632CodeType spezifischeFehlermeldung0632CodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spezifischeFehlermeldung0632CodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaatCodeType(StaatCodeType staatCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staatCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaatType(StaatType staatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrukturelementTypCodeType(StrukturelementTypCodeType strukturelementTypCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strukturelementTypCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrukturpfadType(StrukturpfadType strukturpfadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strukturpfadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemType(SystemType systemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportwegCodeType(TransportwegCodeType transportwegCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportwegCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstrukturierteAnschriftType(UnstrukturierteAnschriftType unstrukturierteAnschriftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unstrukturierteAnschriftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerfuegungType(VerfuegungType verfuegungType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verfuegungType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(VersionType versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerweisType(VerweisType verweisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verweisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorgangType(VorgangType vorgangType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vorgangType, diagnostics, context);
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
	public boolean validateStringDateinameType(String stringDateinameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDateinameType_Pattern(stringDateinameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStringDateinameType_Pattern
	 */
	public static final  PatternMatcher [][] STRING_DATEINAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9|A-F|a-f]{8}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{12}[_]?.*[\\.]?.*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>String Dateiname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringDateinameType_Pattern(String stringDateinameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DomeaPackage.Literals.STRING_DATEINAME_TYPE, stringDateinameType, STRING_DATEINAME_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //DomeaValidator
