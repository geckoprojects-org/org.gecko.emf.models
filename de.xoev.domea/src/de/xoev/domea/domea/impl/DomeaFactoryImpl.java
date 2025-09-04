/**
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.*;

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
public class DomeaFactoryImpl extends EFactoryImpl implements DomeaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomeaFactory init() {
		try {
			DomeaFactory theDomeaFactory = (DomeaFactory)EPackage.Registry.INSTANCE.getEFactory(DomeaPackage.eNS_URI);
			if (theDomeaFactory != null) {
				return theDomeaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomeaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomeaFactoryImpl() {
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
			case DomeaPackage.AKTENINHALT_TYPE: return createAkteninhaltType();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE: return createAktenplaneinheitAktenplanType();
			case DomeaPackage.AKTENPLANEINHEIT_TYPE: return createAktenplaneinheitType();
			case DomeaPackage.AKTENPLAN_TYPE: return createAktenplanType();
			case DomeaPackage.AKTE_TYPE: return createAkteType();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE: return createAllgemeineMetadatenType();
			case DomeaPackage.ALLGEMEINER_NAME_TYPE: return createAllgemeinerNameType();
			case DomeaPackage.ALLGEMEINE_RUECKMELDUNG_CODE_TYPE: return createAllgemeineRueckmeldungCodeType();
			case DomeaPackage.ANLAGE_DOKUMENT_TYPE: return createAnlageDokumentType();
			case DomeaPackage.ANSCHRIFTSTYP_CODE_TYPE: return createAnschriftstypCodeType();
			case DomeaPackage.ANSCHRIFT_TYPE: return createAnschriftType();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE: return createAnwendungsspezifischeErweiterungType();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE: return createAnwendungsspezifischeErweiterungXMLType();
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE: return createAufbewahrungsdauerType();
			case DomeaPackage.AUSSONDERUNGSART_CODE_TYPE: return createAussonderungsartCodeType();
			case DomeaPackage.AUSSONDERUNGSART_TYPE: return createAussonderungsartType();
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE: return createAussonderungsmetadatenType();
			case DomeaPackage.BEARBEITUNG_TYPE: return createBearbeitungType();
			case DomeaPackage.BEHOERDE_TYPE: return createBehoerdeType();
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE: return createBeteiligungsschrittType();
			case DomeaPackage.BETEILIGUNGSSTATUS_CODE_TYPE: return createBeteiligungsstatusCodeType();
			case DomeaPackage.BEWERTUNGSVORSCHLAG_CODE_TYPE: return createBewertungsvorschlagCodeType();
			case DomeaPackage.DATEIFORMAT_CODE_TYPE: return createDateiformatCodeType();
			case DomeaPackage.DATENAUSTAUSCHART_CODE_TYPE: return createDatenaustauschartCodeType();
			case DomeaPackage.DATENSCHUTZSTUFE_CODE_TYPE: return createDatenschutzstufeCodeType();
			case DomeaPackage.DATENTYP_CODE_TYPE: return createDatentypCodeType();
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE: return createDokumentMitSchriftstueckType();
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE: return createDokumentOderDokumentMitSchriftstueckType();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE: return createDokumentSchriftstueckBasisType();
			case DomeaPackage.DOKUMENT_TYPE: return createDokumentType();
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE: return createErfolgOderMisserfolgImportType();
			case DomeaPackage.FELDGRUPPE_TYPE: return createFeldgruppeType();
			case DomeaPackage.FELD_TYPE: return createFeldType();
			case DomeaPackage.FORMAT_TYPE: return createFormatType();
			case DomeaPackage.GEBURT_TYPE: return createGeburtType();
			case DomeaPackage.GEHEIMHALTUNGSGRAD_CODE_TYPE: return createGeheimhaltungsgradCodeType();
			case DomeaPackage.GEHEIMHALTUNG_TYPE: return createGeheimhaltungType();
			case DomeaPackage.GESCHAEFTSGANG_TYPE: return createGeschaeftsgangType();
			case DomeaPackage.HASH_TYPE: return createHashType();
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE: return createHistorienProtokollInformationType();
			case DomeaPackage.IDENTIFIKATION_NACHRICHT_TYPE: return createIdentifikationNachrichtType();
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE: return createIdentifikationObjektType();
			case DomeaPackage.KOMMUNIKATION_TYPE: return createKommunikationType();
			case DomeaPackage.KOMPRESSIONSVERFAHREN_CODE_TYPE: return createKompressionsverfahrenCodeType();
			case DomeaPackage.KONFIGURATIONSPARAMETER_CODE_TYPE: return createKonfigurationsparameterCodeType();
			case DomeaPackage.KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE: return createKonfigurationsparameterGruppeCodeType();
			case DomeaPackage.KONTAKT_TYPE: return createKontaktType();
			case DomeaPackage.KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE: return createKryptographischeAlgorithmenCodeType();
			case DomeaPackage.MEDIUM_CODE_TYPE: return createMediumCodeType();
			case DomeaPackage.NACHRICHTENKOPF_TYPE: return createNachrichtenkopfType();
			case DomeaPackage.NACHRICHTENTYP_CODE_TYPE: return createNachrichtentypCodeType();
			case DomeaPackage.NACHRICHT_TYPE: return createNachrichtType();
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE: return createNameNatuerlichePersonType();
			case DomeaPackage.NAME_ORGANISATION_TYPE: return createNameOrganisationType();
			case DomeaPackage.NK_FV_DATEN_TYPE: return createNkFVDatenType();
			case DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE: return createNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType();
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE: return createNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType();
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE: return createNkNichtFVDatenWeitereLeserType();
			case DomeaPackage.ORGANISATIONSEINHEIT_TYPE: return createOrganisationseinheitType();
			case DomeaPackage.PFADELEMENT_TYPE: return createPfadelementType();
			case DomeaPackage.PRIMAERDOKUMENT_TYPE: return createPrimaerdokumentType();
			case DomeaPackage.ROLLE_CODE_TYPE: return createRolleCodeType();
			case DomeaPackage.SCHRIFTGUTOBJEKTTYP_CODE_TYPE: return createSchriftgutobjekttypCodeType();
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE: return createSignaturSiegelType();
			case DomeaPackage.SONSTIGE_FEHLERMELDUNG_CODE_TYPE: return createSonstigeFehlermeldungCodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE: return createSpezifischeFehlermeldung0601CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE: return createSpezifischeFehlermeldung0602CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE: return createSpezifischeFehlermeldung0603CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE: return createSpezifischeFehlermeldung0604CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE: return createSpezifischeFehlermeldung0605CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE: return createSpezifischeFehlermeldung0606CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE: return createSpezifischeFehlermeldung0607CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE: return createSpezifischeFehlermeldung0608CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE: return createSpezifischeFehlermeldung0609CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE: return createSpezifischeFehlermeldung0610CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE: return createSpezifischeFehlermeldung0611CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE: return createSpezifischeFehlermeldung0612CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE: return createSpezifischeFehlermeldung0613CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE: return createSpezifischeFehlermeldung0614CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE: return createSpezifischeFehlermeldung0615CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE: return createSpezifischeFehlermeldung0616CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE: return createSpezifischeFehlermeldung0617CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE: return createSpezifischeFehlermeldung0618CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE: return createSpezifischeFehlermeldung0619CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE: return createSpezifischeFehlermeldung0620CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE: return createSpezifischeFehlermeldung0621CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE: return createSpezifischeFehlermeldung0622CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE: return createSpezifischeFehlermeldung0623CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE: return createSpezifischeFehlermeldung0624CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE: return createSpezifischeFehlermeldung0625CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE: return createSpezifischeFehlermeldung0626CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE: return createSpezifischeFehlermeldung0627CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE: return createSpezifischeFehlermeldung0628CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE: return createSpezifischeFehlermeldung0631CodeType();
			case DomeaPackage.SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE: return createSpezifischeFehlermeldung0632CodeType();
			case DomeaPackage.STAAT_CODE_TYPE: return createStaatCodeType();
			case DomeaPackage.STAAT_TYPE: return createStaatType();
			case DomeaPackage.STRUKTURELEMENT_TYP_CODE_TYPE: return createStrukturelementTypCodeType();
			case DomeaPackage.STRUKTURPFAD_TYPE: return createStrukturpfadType();
			case DomeaPackage.SYSTEM_TYPE: return createSystemType();
			case DomeaPackage.TRANSPORTWEG_CODE_TYPE: return createTransportwegCodeType();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE: return createUnstrukturierteAnschriftType();
			case DomeaPackage.VERFUEGUNG_TYPE: return createVerfuegungType();
			case DomeaPackage.VERSION_TYPE: return createVersionType();
			case DomeaPackage.VERWEIS_TYPE: return createVerweisType();
			case DomeaPackage.VORGANG_TYPE: return createVorgangType();
			case DomeaPackage.ZEITRAUM_TYPE: return createZeitraumType();
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
			case DomeaPackage.STRING_DATEINAME_TYPE:
				return createStringDateinameTypeFromString(eDataType, initialValue);
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
			case DomeaPackage.STRING_DATEINAME_TYPE:
				return convertStringDateinameTypeToString(eDataType, instanceValue);
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
	public AkteninhaltType createAkteninhaltType() {
		AkteninhaltTypeImpl akteninhaltType = new AkteninhaltTypeImpl();
		return akteninhaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AktenplaneinheitAktenplanType createAktenplaneinheitAktenplanType() {
		AktenplaneinheitAktenplanTypeImpl aktenplaneinheitAktenplanType = new AktenplaneinheitAktenplanTypeImpl();
		return aktenplaneinheitAktenplanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AktenplaneinheitType createAktenplaneinheitType() {
		AktenplaneinheitTypeImpl aktenplaneinheitType = new AktenplaneinheitTypeImpl();
		return aktenplaneinheitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AktenplanType createAktenplanType() {
		AktenplanTypeImpl aktenplanType = new AktenplanTypeImpl();
		return aktenplanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AkteType createAkteType() {
		AkteTypeImpl akteType = new AkteTypeImpl();
		return akteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineMetadatenType createAllgemeineMetadatenType() {
		AllgemeineMetadatenTypeImpl allgemeineMetadatenType = new AllgemeineMetadatenTypeImpl();
		return allgemeineMetadatenType;
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
	public AllgemeineRueckmeldungCodeType createAllgemeineRueckmeldungCodeType() {
		AllgemeineRueckmeldungCodeTypeImpl allgemeineRueckmeldungCodeType = new AllgemeineRueckmeldungCodeTypeImpl();
		return allgemeineRueckmeldungCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnlageDokumentType createAnlageDokumentType() {
		AnlageDokumentTypeImpl anlageDokumentType = new AnlageDokumentTypeImpl();
		return anlageDokumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftstypCodeType createAnschriftstypCodeType() {
		AnschriftstypCodeTypeImpl anschriftstypCodeType = new AnschriftstypCodeTypeImpl();
		return anschriftstypCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftType createAnschriftType() {
		AnschriftTypeImpl anschriftType = new AnschriftTypeImpl();
		return anschriftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnwendungsspezifischeErweiterungType createAnwendungsspezifischeErweiterungType() {
		AnwendungsspezifischeErweiterungTypeImpl anwendungsspezifischeErweiterungType = new AnwendungsspezifischeErweiterungTypeImpl();
		return anwendungsspezifischeErweiterungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnwendungsspezifischeErweiterungXMLType createAnwendungsspezifischeErweiterungXMLType() {
		AnwendungsspezifischeErweiterungXMLTypeImpl anwendungsspezifischeErweiterungXMLType = new AnwendungsspezifischeErweiterungXMLTypeImpl();
		return anwendungsspezifischeErweiterungXMLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufbewahrungsdauerType createAufbewahrungsdauerType() {
		AufbewahrungsdauerTypeImpl aufbewahrungsdauerType = new AufbewahrungsdauerTypeImpl();
		return aufbewahrungsdauerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AussonderungsartCodeType createAussonderungsartCodeType() {
		AussonderungsartCodeTypeImpl aussonderungsartCodeType = new AussonderungsartCodeTypeImpl();
		return aussonderungsartCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AussonderungsartType createAussonderungsartType() {
		AussonderungsartTypeImpl aussonderungsartType = new AussonderungsartTypeImpl();
		return aussonderungsartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AussonderungsmetadatenType createAussonderungsmetadatenType() {
		AussonderungsmetadatenTypeImpl aussonderungsmetadatenType = new AussonderungsmetadatenTypeImpl();
		return aussonderungsmetadatenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BearbeitungType createBearbeitungType() {
		BearbeitungTypeImpl bearbeitungType = new BearbeitungTypeImpl();
		return bearbeitungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType createBehoerdeType() {
		BehoerdeTypeImpl behoerdeType = new BehoerdeTypeImpl();
		return behoerdeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeteiligungsschrittType createBeteiligungsschrittType() {
		BeteiligungsschrittTypeImpl beteiligungsschrittType = new BeteiligungsschrittTypeImpl();
		return beteiligungsschrittType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeteiligungsstatusCodeType createBeteiligungsstatusCodeType() {
		BeteiligungsstatusCodeTypeImpl beteiligungsstatusCodeType = new BeteiligungsstatusCodeTypeImpl();
		return beteiligungsstatusCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BewertungsvorschlagCodeType createBewertungsvorschlagCodeType() {
		BewertungsvorschlagCodeTypeImpl bewertungsvorschlagCodeType = new BewertungsvorschlagCodeTypeImpl();
		return bewertungsvorschlagCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateiformatCodeType createDateiformatCodeType() {
		DateiformatCodeTypeImpl dateiformatCodeType = new DateiformatCodeTypeImpl();
		return dateiformatCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenaustauschartCodeType createDatenaustauschartCodeType() {
		DatenaustauschartCodeTypeImpl datenaustauschartCodeType = new DatenaustauschartCodeTypeImpl();
		return datenaustauschartCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzstufeCodeType createDatenschutzstufeCodeType() {
		DatenschutzstufeCodeTypeImpl datenschutzstufeCodeType = new DatenschutzstufeCodeTypeImpl();
		return datenschutzstufeCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatentypCodeType createDatentypCodeType() {
		DatentypCodeTypeImpl datentypCodeType = new DatentypCodeTypeImpl();
		return datentypCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DokumentMitSchriftstueckType createDokumentMitSchriftstueckType() {
		DokumentMitSchriftstueckTypeImpl dokumentMitSchriftstueckType = new DokumentMitSchriftstueckTypeImpl();
		return dokumentMitSchriftstueckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DokumentOderDokumentMitSchriftstueckType createDokumentOderDokumentMitSchriftstueckType() {
		DokumentOderDokumentMitSchriftstueckTypeImpl dokumentOderDokumentMitSchriftstueckType = new DokumentOderDokumentMitSchriftstueckTypeImpl();
		return dokumentOderDokumentMitSchriftstueckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DokumentSchriftstueckBasisType createDokumentSchriftstueckBasisType() {
		DokumentSchriftstueckBasisTypeImpl dokumentSchriftstueckBasisType = new DokumentSchriftstueckBasisTypeImpl();
		return dokumentSchriftstueckBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DokumentType createDokumentType() {
		DokumentTypeImpl dokumentType = new DokumentTypeImpl();
		return dokumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErfolgOderMisserfolgImportType createErfolgOderMisserfolgImportType() {
		ErfolgOderMisserfolgImportTypeImpl erfolgOderMisserfolgImportType = new ErfolgOderMisserfolgImportTypeImpl();
		return erfolgOderMisserfolgImportType;
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
	public FormatType createFormatType() {
		FormatTypeImpl formatType = new FormatTypeImpl();
		return formatType;
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
	public GeheimhaltungsgradCodeType createGeheimhaltungsgradCodeType() {
		GeheimhaltungsgradCodeTypeImpl geheimhaltungsgradCodeType = new GeheimhaltungsgradCodeTypeImpl();
		return geheimhaltungsgradCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeheimhaltungType createGeheimhaltungType() {
		GeheimhaltungTypeImpl geheimhaltungType = new GeheimhaltungTypeImpl();
		return geheimhaltungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeschaeftsgangType createGeschaeftsgangType() {
		GeschaeftsgangTypeImpl geschaeftsgangType = new GeschaeftsgangTypeImpl();
		return geschaeftsgangType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashType createHashType() {
		HashTypeImpl hashType = new HashTypeImpl();
		return hashType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistorienProtokollInformationType createHistorienProtokollInformationType() {
		HistorienProtokollInformationTypeImpl historienProtokollInformationType = new HistorienProtokollInformationTypeImpl();
		return historienProtokollInformationType;
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
	public IdentifikationObjektType createIdentifikationObjektType() {
		IdentifikationObjektTypeImpl identifikationObjektType = new IdentifikationObjektTypeImpl();
		return identifikationObjektType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KommunikationType createKommunikationType() {
		KommunikationTypeImpl kommunikationType = new KommunikationTypeImpl();
		return kommunikationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KompressionsverfahrenCodeType createKompressionsverfahrenCodeType() {
		KompressionsverfahrenCodeTypeImpl kompressionsverfahrenCodeType = new KompressionsverfahrenCodeTypeImpl();
		return kompressionsverfahrenCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KonfigurationsparameterCodeType createKonfigurationsparameterCodeType() {
		KonfigurationsparameterCodeTypeImpl konfigurationsparameterCodeType = new KonfigurationsparameterCodeTypeImpl();
		return konfigurationsparameterCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KonfigurationsparameterGruppeCodeType createKonfigurationsparameterGruppeCodeType() {
		KonfigurationsparameterGruppeCodeTypeImpl konfigurationsparameterGruppeCodeType = new KonfigurationsparameterGruppeCodeTypeImpl();
		return konfigurationsparameterGruppeCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontaktType createKontaktType() {
		KontaktTypeImpl kontaktType = new KontaktTypeImpl();
		return kontaktType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KryptographischeAlgorithmenCodeType createKryptographischeAlgorithmenCodeType() {
		KryptographischeAlgorithmenCodeTypeImpl kryptographischeAlgorithmenCodeType = new KryptographischeAlgorithmenCodeTypeImpl();
		return kryptographischeAlgorithmenCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediumCodeType createMediumCodeType() {
		MediumCodeTypeImpl mediumCodeType = new MediumCodeTypeImpl();
		return mediumCodeType;
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
	public NachrichtentypCodeType createNachrichtentypCodeType() {
		NachrichtentypCodeTypeImpl nachrichtentypCodeType = new NachrichtentypCodeTypeImpl();
		return nachrichtentypCodeType;
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
	public NameOrganisationType createNameOrganisationType() {
		NameOrganisationTypeImpl nameOrganisationType = new NameOrganisationTypeImpl();
		return nameOrganisationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NkFVDatenType createNkFVDatenType() {
		NkFVDatenTypeImpl nkFVDatenType = new NkFVDatenTypeImpl();
		return nkFVDatenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType createNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType() {
		NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl nkNichtFVDatenEinLeserMitEmpfangsbestaetigungType = new NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl();
		return nkNichtFVDatenEinLeserMitEmpfangsbestaetigungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType createNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType() {
		NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeImpl nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType = new NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeImpl();
		return nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NkNichtFVDatenWeitereLeserType createNkNichtFVDatenWeitereLeserType() {
		NkNichtFVDatenWeitereLeserTypeImpl nkNichtFVDatenWeitereLeserType = new NkNichtFVDatenWeitereLeserTypeImpl();
		return nkNichtFVDatenWeitereLeserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganisationseinheitType createOrganisationseinheitType() {
		OrganisationseinheitTypeImpl organisationseinheitType = new OrganisationseinheitTypeImpl();
		return organisationseinheitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PfadelementType createPfadelementType() {
		PfadelementTypeImpl pfadelementType = new PfadelementTypeImpl();
		return pfadelementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaerdokumentType createPrimaerdokumentType() {
		PrimaerdokumentTypeImpl primaerdokumentType = new PrimaerdokumentTypeImpl();
		return primaerdokumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RolleCodeType createRolleCodeType() {
		RolleCodeTypeImpl rolleCodeType = new RolleCodeTypeImpl();
		return rolleCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchriftgutobjekttypCodeType createSchriftgutobjekttypCodeType() {
		SchriftgutobjekttypCodeTypeImpl schriftgutobjekttypCodeType = new SchriftgutobjekttypCodeTypeImpl();
		return schriftgutobjekttypCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturSiegelType createSignaturSiegelType() {
		SignaturSiegelTypeImpl signaturSiegelType = new SignaturSiegelTypeImpl();
		return signaturSiegelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeFehlermeldungCodeType createSonstigeFehlermeldungCodeType() {
		SonstigeFehlermeldungCodeTypeImpl sonstigeFehlermeldungCodeType = new SonstigeFehlermeldungCodeTypeImpl();
		return sonstigeFehlermeldungCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0601CodeType createSpezifischeFehlermeldung0601CodeType() {
		SpezifischeFehlermeldung0601CodeTypeImpl spezifischeFehlermeldung0601CodeType = new SpezifischeFehlermeldung0601CodeTypeImpl();
		return spezifischeFehlermeldung0601CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0602CodeType createSpezifischeFehlermeldung0602CodeType() {
		SpezifischeFehlermeldung0602CodeTypeImpl spezifischeFehlermeldung0602CodeType = new SpezifischeFehlermeldung0602CodeTypeImpl();
		return spezifischeFehlermeldung0602CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0603CodeType createSpezifischeFehlermeldung0603CodeType() {
		SpezifischeFehlermeldung0603CodeTypeImpl spezifischeFehlermeldung0603CodeType = new SpezifischeFehlermeldung0603CodeTypeImpl();
		return spezifischeFehlermeldung0603CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0604CodeType createSpezifischeFehlermeldung0604CodeType() {
		SpezifischeFehlermeldung0604CodeTypeImpl spezifischeFehlermeldung0604CodeType = new SpezifischeFehlermeldung0604CodeTypeImpl();
		return spezifischeFehlermeldung0604CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0605CodeType createSpezifischeFehlermeldung0605CodeType() {
		SpezifischeFehlermeldung0605CodeTypeImpl spezifischeFehlermeldung0605CodeType = new SpezifischeFehlermeldung0605CodeTypeImpl();
		return spezifischeFehlermeldung0605CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0606CodeType createSpezifischeFehlermeldung0606CodeType() {
		SpezifischeFehlermeldung0606CodeTypeImpl spezifischeFehlermeldung0606CodeType = new SpezifischeFehlermeldung0606CodeTypeImpl();
		return spezifischeFehlermeldung0606CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0607CodeType createSpezifischeFehlermeldung0607CodeType() {
		SpezifischeFehlermeldung0607CodeTypeImpl spezifischeFehlermeldung0607CodeType = new SpezifischeFehlermeldung0607CodeTypeImpl();
		return spezifischeFehlermeldung0607CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0608CodeType createSpezifischeFehlermeldung0608CodeType() {
		SpezifischeFehlermeldung0608CodeTypeImpl spezifischeFehlermeldung0608CodeType = new SpezifischeFehlermeldung0608CodeTypeImpl();
		return spezifischeFehlermeldung0608CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0609CodeType createSpezifischeFehlermeldung0609CodeType() {
		SpezifischeFehlermeldung0609CodeTypeImpl spezifischeFehlermeldung0609CodeType = new SpezifischeFehlermeldung0609CodeTypeImpl();
		return spezifischeFehlermeldung0609CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0610CodeType createSpezifischeFehlermeldung0610CodeType() {
		SpezifischeFehlermeldung0610CodeTypeImpl spezifischeFehlermeldung0610CodeType = new SpezifischeFehlermeldung0610CodeTypeImpl();
		return spezifischeFehlermeldung0610CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0611CodeType createSpezifischeFehlermeldung0611CodeType() {
		SpezifischeFehlermeldung0611CodeTypeImpl spezifischeFehlermeldung0611CodeType = new SpezifischeFehlermeldung0611CodeTypeImpl();
		return spezifischeFehlermeldung0611CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0612CodeType createSpezifischeFehlermeldung0612CodeType() {
		SpezifischeFehlermeldung0612CodeTypeImpl spezifischeFehlermeldung0612CodeType = new SpezifischeFehlermeldung0612CodeTypeImpl();
		return spezifischeFehlermeldung0612CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0613CodeType createSpezifischeFehlermeldung0613CodeType() {
		SpezifischeFehlermeldung0613CodeTypeImpl spezifischeFehlermeldung0613CodeType = new SpezifischeFehlermeldung0613CodeTypeImpl();
		return spezifischeFehlermeldung0613CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0614CodeType createSpezifischeFehlermeldung0614CodeType() {
		SpezifischeFehlermeldung0614CodeTypeImpl spezifischeFehlermeldung0614CodeType = new SpezifischeFehlermeldung0614CodeTypeImpl();
		return spezifischeFehlermeldung0614CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0615CodeType createSpezifischeFehlermeldung0615CodeType() {
		SpezifischeFehlermeldung0615CodeTypeImpl spezifischeFehlermeldung0615CodeType = new SpezifischeFehlermeldung0615CodeTypeImpl();
		return spezifischeFehlermeldung0615CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0616CodeType createSpezifischeFehlermeldung0616CodeType() {
		SpezifischeFehlermeldung0616CodeTypeImpl spezifischeFehlermeldung0616CodeType = new SpezifischeFehlermeldung0616CodeTypeImpl();
		return spezifischeFehlermeldung0616CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0617CodeType createSpezifischeFehlermeldung0617CodeType() {
		SpezifischeFehlermeldung0617CodeTypeImpl spezifischeFehlermeldung0617CodeType = new SpezifischeFehlermeldung0617CodeTypeImpl();
		return spezifischeFehlermeldung0617CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0618CodeType createSpezifischeFehlermeldung0618CodeType() {
		SpezifischeFehlermeldung0618CodeTypeImpl spezifischeFehlermeldung0618CodeType = new SpezifischeFehlermeldung0618CodeTypeImpl();
		return spezifischeFehlermeldung0618CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0619CodeType createSpezifischeFehlermeldung0619CodeType() {
		SpezifischeFehlermeldung0619CodeTypeImpl spezifischeFehlermeldung0619CodeType = new SpezifischeFehlermeldung0619CodeTypeImpl();
		return spezifischeFehlermeldung0619CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0620CodeType createSpezifischeFehlermeldung0620CodeType() {
		SpezifischeFehlermeldung0620CodeTypeImpl spezifischeFehlermeldung0620CodeType = new SpezifischeFehlermeldung0620CodeTypeImpl();
		return spezifischeFehlermeldung0620CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0621CodeType createSpezifischeFehlermeldung0621CodeType() {
		SpezifischeFehlermeldung0621CodeTypeImpl spezifischeFehlermeldung0621CodeType = new SpezifischeFehlermeldung0621CodeTypeImpl();
		return spezifischeFehlermeldung0621CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0622CodeType createSpezifischeFehlermeldung0622CodeType() {
		SpezifischeFehlermeldung0622CodeTypeImpl spezifischeFehlermeldung0622CodeType = new SpezifischeFehlermeldung0622CodeTypeImpl();
		return spezifischeFehlermeldung0622CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0623CodeType createSpezifischeFehlermeldung0623CodeType() {
		SpezifischeFehlermeldung0623CodeTypeImpl spezifischeFehlermeldung0623CodeType = new SpezifischeFehlermeldung0623CodeTypeImpl();
		return spezifischeFehlermeldung0623CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0624CodeType createSpezifischeFehlermeldung0624CodeType() {
		SpezifischeFehlermeldung0624CodeTypeImpl spezifischeFehlermeldung0624CodeType = new SpezifischeFehlermeldung0624CodeTypeImpl();
		return spezifischeFehlermeldung0624CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0625CodeType createSpezifischeFehlermeldung0625CodeType() {
		SpezifischeFehlermeldung0625CodeTypeImpl spezifischeFehlermeldung0625CodeType = new SpezifischeFehlermeldung0625CodeTypeImpl();
		return spezifischeFehlermeldung0625CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0626CodeType createSpezifischeFehlermeldung0626CodeType() {
		SpezifischeFehlermeldung0626CodeTypeImpl spezifischeFehlermeldung0626CodeType = new SpezifischeFehlermeldung0626CodeTypeImpl();
		return spezifischeFehlermeldung0626CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0627CodeType createSpezifischeFehlermeldung0627CodeType() {
		SpezifischeFehlermeldung0627CodeTypeImpl spezifischeFehlermeldung0627CodeType = new SpezifischeFehlermeldung0627CodeTypeImpl();
		return spezifischeFehlermeldung0627CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0628CodeType createSpezifischeFehlermeldung0628CodeType() {
		SpezifischeFehlermeldung0628CodeTypeImpl spezifischeFehlermeldung0628CodeType = new SpezifischeFehlermeldung0628CodeTypeImpl();
		return spezifischeFehlermeldung0628CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0631CodeType createSpezifischeFehlermeldung0631CodeType() {
		SpezifischeFehlermeldung0631CodeTypeImpl spezifischeFehlermeldung0631CodeType = new SpezifischeFehlermeldung0631CodeTypeImpl();
		return spezifischeFehlermeldung0631CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpezifischeFehlermeldung0632CodeType createSpezifischeFehlermeldung0632CodeType() {
		SpezifischeFehlermeldung0632CodeTypeImpl spezifischeFehlermeldung0632CodeType = new SpezifischeFehlermeldung0632CodeTypeImpl();
		return spezifischeFehlermeldung0632CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatCodeType createStaatCodeType() {
		StaatCodeTypeImpl staatCodeType = new StaatCodeTypeImpl();
		return staatCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatType createStaatType() {
		StaatTypeImpl staatType = new StaatTypeImpl();
		return staatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrukturelementTypCodeType createStrukturelementTypCodeType() {
		StrukturelementTypCodeTypeImpl strukturelementTypCodeType = new StrukturelementTypCodeTypeImpl();
		return strukturelementTypCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrukturpfadType createStrukturpfadType() {
		StrukturpfadTypeImpl strukturpfadType = new StrukturpfadTypeImpl();
		return strukturpfadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportwegCodeType createTransportwegCodeType() {
		TransportwegCodeTypeImpl transportwegCodeType = new TransportwegCodeTypeImpl();
		return transportwegCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstrukturierteAnschriftType createUnstrukturierteAnschriftType() {
		UnstrukturierteAnschriftTypeImpl unstrukturierteAnschriftType = new UnstrukturierteAnschriftTypeImpl();
		return unstrukturierteAnschriftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerfuegungType createVerfuegungType() {
		VerfuegungTypeImpl verfuegungType = new VerfuegungTypeImpl();
		return verfuegungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionType createVersionType() {
		VersionTypeImpl versionType = new VersionTypeImpl();
		return versionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerweisType createVerweisType() {
		VerweisTypeImpl verweisType = new VerweisTypeImpl();
		return verweisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VorgangType createVorgangType() {
		VorgangTypeImpl vorgangType = new VorgangTypeImpl();
		return vorgangType;
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
	public String createStringDateinameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringDateinameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomeaPackage getDomeaPackage() {
		return (DomeaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomeaPackage getPackage() {
		return DomeaPackage.eINSTANCE;
	}

} //DomeaFactoryImpl
