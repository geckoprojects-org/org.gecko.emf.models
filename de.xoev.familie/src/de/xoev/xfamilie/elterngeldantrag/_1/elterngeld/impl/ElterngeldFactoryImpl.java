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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElterngeldFactoryImpl extends EFactoryImpl implements ElterngeldFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElterngeldFactory init() {
		try {
			ElterngeldFactory theElterngeldFactory = (ElterngeldFactory)EPackage.Registry.INSTANCE.getEFactory(ElterngeldPackage.eNS_URI);
			if (theElterngeldFactory != null) {
				return theElterngeldFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ElterngeldFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElterngeldFactoryImpl() {
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
			case ElterngeldPackage.ADOPTION_TYPE: return createAdoptionType();
			case ElterngeldPackage.ALGI_TYPE: return createALGIType();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE: return createAlleinerziehendenanspruchType();
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE: return createAndereLeistungenType();
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE: return createAngabenSozialversicherungType();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE: return createAngabenWeiteresKindType();
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE: return createAnschriftKindOptionalType();
			case ElterngeldPackage.ANSCHRIFT_TYPE: return createAnschriftType();
			case ElterngeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE: return createAntragstellenderElternteilVorabmeldungType();
			case ElterngeldPackage.ARBEITSZEIT_TYPE: return createArbeitszeitType();
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE: return createAuslaendischesArbeitsverhaeltnisType();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE: return createAuslandsaufenthaltBefrType();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE: return createAuslandsaufenthaltType();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE: return createBeantragungElterngeldType();
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE: return createBehinderungKindType();
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE: return createBerufsausbildungType();
			case ElterngeldPackage.BERUFSBILDUNG_TYPE: return createBerufsbildungType();
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE: return createBesondersFruehGeborenesKindType();
			case ElterngeldPackage.BUERGERGELD_TYPE: return createBuergergeldType();
			case ElterngeldPackage.CODE_ABBRUCHGRUND_TYPE: return createCodeAbbruchgrundType();
			case ElterngeldPackage.CODE_ANFRAGEGRUND_TYPE: return createCodeAnfragegrundType();
			case ElterngeldPackage.CODE_ELTERNGELDANTRAG_TYPE: return createCodeElterngeldantragType();
			case ElterngeldPackage.CODE_FEHLERFALL_TYPE: return createCodeFehlerfallType();
			case ElterngeldPackage.CODE_GESAMTEINKOMMEN_TYPE: return createCodeGesamteinkommenType();
			case ElterngeldPackage.CODE_KINDSCHAFTSVERHAELTNIS_TYPE: return createCodeKindschaftsverhaeltnisType();
			case ElterngeldPackage.CODE_LEISTUNGSHOEHE_TYPE: return createCodeLeistungshoeheType();
			case ElterngeldPackage.CODE_VERSANDWEG_TYPE: return createCodeVersandwegType();
			case ElterngeldPackage.CODE_VERSICHERUNGSART_TYPE: return createCodeVersicherungsartType();
			case ElterngeldPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE: return createEGAelteresKindType();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE: return createEinkommensersatzleistungenBezugszeitraumType();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE: return createEinkommensersatzleistungenVorGeburtType();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE: return createEinkommenVorGeburtType();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE: return createEinkommenWaehrendBezugszeitraumType();
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE: return createEinkuenfteBeantragterZeitraumType();
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE: return createEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType();
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE: return createElterngeldantragAbbruch0206Type();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE: return createElterngeldantragAnfrage0204Type();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE: return createElterngeldantragAnfrageabschluss0205Type();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE: return createElterngeldantragAntrag0201Type();
			case ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE: return createElterngeldantragStandesamtsmeldung0203Type();
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE: return createElterngeldantragVorabmeldung0202Type();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE: return createElternteilEinsElterngeldantragType();
			case ElterngeldPackage.ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE: return createElternteilZweiElterngeldantragType();
			case ElterngeldPackage.ELTERNZEIT_TYPE: return createElternzeitType();
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE: return createErwerbstaetigkeitBezugszeitraumType();
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE: return createFreiwilligendienstType();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE: return createGeringesEinkommenCovid19Type();
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE: return createGesamteinkommenType();
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE: return createGesetzlicheVertretungType();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE: return createGewoehnlicherAufenthaltType();
			case ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE: return createHaushaltszugehoerigkeitDesKindesType();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE: return createKindElterngeldType();
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE: return createKindschaftsverhaeltnisType();
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE: return createKindVorabmeldungType();
			case ElterngeldPackage.KRANKENGELD_TYPE: return createKrankengeldType();
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE: return createKrankentagegeldType();
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE: return createKrankenversicherungType();
			case ElterngeldPackage.LEBENSSITUATION_TYPE: return createLebenssituationType();
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE: return createMehrlingsgeburtType();
			case ElterngeldPackage.MIDIJOB_TYPE: return createMidijobType();
			case ElterngeldPackage.MINIJOB_TYPE: return createMinijobType();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE: return createMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE: return createNichtselbststaendigeBeschaeftigungVorGeburtType();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE: return createNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE: return createNichtselbststaendigkeitAusklammerungstatbestaendeType();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE: return createPersoenlicheAngabenETType();
			case ElterngeldPackage.RENTEN_TYPE: return createRentenType();
			case ElterngeldPackage.RESTURLAUB_TYPE: return createResturlaubType();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE: return createSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE: return createSelbststaendigkeitVerschiebetatbestaendeType();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE: return createSonstigeLeistungenBezugszeitraumType();
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE: return createStaatsangehoerigkeitType();
			case ElterngeldPackage.TAGESPFLEGE_TYPE: return createTagespflegeType();
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE: return createTeilzeittaetigkeitType();
			case ElterngeldPackage.WEITERE_KINDER_TYPE: return createWeitereKinderType();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE: return createZustimmungDatenabrufeType();
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
			case ElterngeldPackage.ABBRUCHGRUND:
				return createAbbruchgrundFromString(eDataType, initialValue);
			case ElterngeldPackage.ANFRAGEGRUND:
				return createAnfragegrundFromString(eDataType, initialValue);
			case ElterngeldPackage.ELTERNGELDANTRAG:
				return createElterngeldantragFromString(eDataType, initialValue);
			case ElterngeldPackage.FEHLERFALL:
				return createFehlerfallFromString(eDataType, initialValue);
			case ElterngeldPackage.GESAMTEINKOMMEN:
				return createGesamteinkommenFromString(eDataType, initialValue);
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS:
				return createKindschaftsverhaeltnisFromString(eDataType, initialValue);
			case ElterngeldPackage.LEISTUNGSHOEHE:
				return createLeistungshoeheFromString(eDataType, initialValue);
			case ElterngeldPackage.VERSANDWEG:
				return createVersandwegFromString(eDataType, initialValue);
			case ElterngeldPackage.VERSICHERUNGSART:
				return createVersicherungsartFromString(eDataType, initialValue);
			case ElterngeldPackage.ABBRUCHGRUND_OBJECT:
				return createAbbruchgrundObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.ANFRAGEGRUND_OBJECT:
				return createAnfragegrundObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.ELTERNGELDANTRAG_OBJECT:
				return createElterngeldantragObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.FEHLERFALL_OBJECT:
				return createFehlerfallObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.GESAMTEINKOMMEN_OBJECT:
				return createGesamteinkommenObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_OBJECT:
				return createKindschaftsverhaeltnisObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.LEISTUNGSHOEHE_OBJECT:
				return createLeistungshoeheObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.VERSANDWEG_OBJECT:
				return createVersandwegObjectFromString(eDataType, initialValue);
			case ElterngeldPackage.VERSICHERUNGSART_OBJECT:
				return createVersicherungsartObjectFromString(eDataType, initialValue);
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
			case ElterngeldPackage.ABBRUCHGRUND:
				return convertAbbruchgrundToString(eDataType, instanceValue);
			case ElterngeldPackage.ANFRAGEGRUND:
				return convertAnfragegrundToString(eDataType, instanceValue);
			case ElterngeldPackage.ELTERNGELDANTRAG:
				return convertElterngeldantragToString(eDataType, instanceValue);
			case ElterngeldPackage.FEHLERFALL:
				return convertFehlerfallToString(eDataType, instanceValue);
			case ElterngeldPackage.GESAMTEINKOMMEN:
				return convertGesamteinkommenToString(eDataType, instanceValue);
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS:
				return convertKindschaftsverhaeltnisToString(eDataType, instanceValue);
			case ElterngeldPackage.LEISTUNGSHOEHE:
				return convertLeistungshoeheToString(eDataType, instanceValue);
			case ElterngeldPackage.VERSANDWEG:
				return convertVersandwegToString(eDataType, instanceValue);
			case ElterngeldPackage.VERSICHERUNGSART:
				return convertVersicherungsartToString(eDataType, instanceValue);
			case ElterngeldPackage.ABBRUCHGRUND_OBJECT:
				return convertAbbruchgrundObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.ANFRAGEGRUND_OBJECT:
				return convertAnfragegrundObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.ELTERNGELDANTRAG_OBJECT:
				return convertElterngeldantragObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.FEHLERFALL_OBJECT:
				return convertFehlerfallObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.GESAMTEINKOMMEN_OBJECT:
				return convertGesamteinkommenObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_OBJECT:
				return convertKindschaftsverhaeltnisObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.LEISTUNGSHOEHE_OBJECT:
				return convertLeistungshoeheObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.VERSANDWEG_OBJECT:
				return convertVersandwegObjectToString(eDataType, instanceValue);
			case ElterngeldPackage.VERSICHERUNGSART_OBJECT:
				return convertVersicherungsartObjectToString(eDataType, instanceValue);
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
	public AdoptionType createAdoptionType() {
		AdoptionTypeImpl adoptionType = new AdoptionTypeImpl();
		return adoptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ALGIType createALGIType() {
		ALGITypeImpl algiType = new ALGITypeImpl();
		return algiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlleinerziehendenanspruchType createAlleinerziehendenanspruchType() {
		AlleinerziehendenanspruchTypeImpl alleinerziehendenanspruchType = new AlleinerziehendenanspruchTypeImpl();
		return alleinerziehendenanspruchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndereLeistungenType createAndereLeistungenType() {
		AndereLeistungenTypeImpl andereLeistungenType = new AndereLeistungenTypeImpl();
		return andereLeistungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenSozialversicherungType createAngabenSozialversicherungType() {
		AngabenSozialversicherungTypeImpl angabenSozialversicherungType = new AngabenSozialversicherungTypeImpl();
		return angabenSozialversicherungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenWeiteresKindType createAngabenWeiteresKindType() {
		AngabenWeiteresKindTypeImpl angabenWeiteresKindType = new AngabenWeiteresKindTypeImpl();
		return angabenWeiteresKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftKindOptionalType createAnschriftKindOptionalType() {
		AnschriftKindOptionalTypeImpl anschriftKindOptionalType = new AnschriftKindOptionalTypeImpl();
		return anschriftKindOptionalType;
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
	public AntragstellenderElternteilVorabmeldungType createAntragstellenderElternteilVorabmeldungType() {
		AntragstellenderElternteilVorabmeldungTypeImpl antragstellenderElternteilVorabmeldungType = new AntragstellenderElternteilVorabmeldungTypeImpl();
		return antragstellenderElternteilVorabmeldungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArbeitszeitType createArbeitszeitType() {
		ArbeitszeitTypeImpl arbeitszeitType = new ArbeitszeitTypeImpl();
		return arbeitszeitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslaendischesArbeitsverhaeltnisType createAuslaendischesArbeitsverhaeltnisType() {
		AuslaendischesArbeitsverhaeltnisTypeImpl auslaendischesArbeitsverhaeltnisType = new AuslaendischesArbeitsverhaeltnisTypeImpl();
		return auslaendischesArbeitsverhaeltnisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsaufenthaltBefrType createAuslandsaufenthaltBefrType() {
		AuslandsaufenthaltBefrTypeImpl auslandsaufenthaltBefrType = new AuslandsaufenthaltBefrTypeImpl();
		return auslandsaufenthaltBefrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsaufenthaltType createAuslandsaufenthaltType() {
		AuslandsaufenthaltTypeImpl auslandsaufenthaltType = new AuslandsaufenthaltTypeImpl();
		return auslandsaufenthaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeantragungElterngeldType createBeantragungElterngeldType() {
		BeantragungElterngeldTypeImpl beantragungElterngeldType = new BeantragungElterngeldTypeImpl();
		return beantragungElterngeldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehinderungKindType createBehinderungKindType() {
		BehinderungKindTypeImpl behinderungKindType = new BehinderungKindTypeImpl();
		return behinderungKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BerufsausbildungType createBerufsausbildungType() {
		BerufsausbildungTypeImpl berufsausbildungType = new BerufsausbildungTypeImpl();
		return berufsausbildungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BerufsbildungType createBerufsbildungType() {
		BerufsbildungTypeImpl berufsbildungType = new BerufsbildungTypeImpl();
		return berufsbildungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BesondersFruehGeborenesKindType createBesondersFruehGeborenesKindType() {
		BesondersFruehGeborenesKindTypeImpl besondersFruehGeborenesKindType = new BesondersFruehGeborenesKindTypeImpl();
		return besondersFruehGeborenesKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuergergeldType createBuergergeldType() {
		BuergergeldTypeImpl buergergeldType = new BuergergeldTypeImpl();
		return buergergeldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAbbruchgrundType createCodeAbbruchgrundType() {
		CodeAbbruchgrundTypeImpl codeAbbruchgrundType = new CodeAbbruchgrundTypeImpl();
		return codeAbbruchgrundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAnfragegrundType createCodeAnfragegrundType() {
		CodeAnfragegrundTypeImpl codeAnfragegrundType = new CodeAnfragegrundTypeImpl();
		return codeAnfragegrundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeElterngeldantragType createCodeElterngeldantragType() {
		CodeElterngeldantragTypeImpl codeElterngeldantragType = new CodeElterngeldantragTypeImpl();
		return codeElterngeldantragType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeFehlerfallType createCodeFehlerfallType() {
		CodeFehlerfallTypeImpl codeFehlerfallType = new CodeFehlerfallTypeImpl();
		return codeFehlerfallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGesamteinkommenType createCodeGesamteinkommenType() {
		CodeGesamteinkommenTypeImpl codeGesamteinkommenType = new CodeGesamteinkommenTypeImpl();
		return codeGesamteinkommenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsverhaeltnisType createCodeKindschaftsverhaeltnisType() {
		CodeKindschaftsverhaeltnisTypeImpl codeKindschaftsverhaeltnisType = new CodeKindschaftsverhaeltnisTypeImpl();
		return codeKindschaftsverhaeltnisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLeistungshoeheType createCodeLeistungshoeheType() {
		CodeLeistungshoeheTypeImpl codeLeistungshoeheType = new CodeLeistungshoeheTypeImpl();
		return codeLeistungshoeheType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVersandwegType createCodeVersandwegType() {
		CodeVersandwegTypeImpl codeVersandwegType = new CodeVersandwegTypeImpl();
		return codeVersandwegType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVersicherungsartType createCodeVersicherungsartType() {
		CodeVersicherungsartTypeImpl codeVersicherungsartType = new CodeVersicherungsartTypeImpl();
		return codeVersicherungsartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGAelteresKindType createEGAelteresKindType() {
		EGAelteresKindTypeImpl egAelteresKindType = new EGAelteresKindTypeImpl();
		return egAelteresKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommensersatzleistungenBezugszeitraumType createEinkommensersatzleistungenBezugszeitraumType() {
		EinkommensersatzleistungenBezugszeitraumTypeImpl einkommensersatzleistungenBezugszeitraumType = new EinkommensersatzleistungenBezugszeitraumTypeImpl();
		return einkommensersatzleistungenBezugszeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommensersatzleistungenVorGeburtType createEinkommensersatzleistungenVorGeburtType() {
		EinkommensersatzleistungenVorGeburtTypeImpl einkommensersatzleistungenVorGeburtType = new EinkommensersatzleistungenVorGeburtTypeImpl();
		return einkommensersatzleistungenVorGeburtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenVorGeburtType createEinkommenVorGeburtType() {
		EinkommenVorGeburtTypeImpl einkommenVorGeburtType = new EinkommenVorGeburtTypeImpl();
		return einkommenVorGeburtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenWaehrendBezugszeitraumType createEinkommenWaehrendBezugszeitraumType() {
		EinkommenWaehrendBezugszeitraumTypeImpl einkommenWaehrendBezugszeitraumType = new EinkommenWaehrendBezugszeitraumTypeImpl();
		return einkommenWaehrendBezugszeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkuenfteBeantragterZeitraumType createEinkuenfteBeantragterZeitraumType() {
		EinkuenfteBeantragterZeitraumTypeImpl einkuenfteBeantragterZeitraumType = new EinkuenfteBeantragterZeitraumTypeImpl();
		return einkuenfteBeantragterZeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType createEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType() {
		EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType = new EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl();
		return einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAbbruch0206Type createElterngeldantragAbbruch0206Type() {
		ElterngeldantragAbbruch0206TypeImpl elterngeldantragAbbruch0206Type = new ElterngeldantragAbbruch0206TypeImpl();
		return elterngeldantragAbbruch0206Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAnfrage0204Type createElterngeldantragAnfrage0204Type() {
		ElterngeldantragAnfrage0204TypeImpl elterngeldantragAnfrage0204Type = new ElterngeldantragAnfrage0204TypeImpl();
		return elterngeldantragAnfrage0204Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAnfrageabschluss0205Type createElterngeldantragAnfrageabschluss0205Type() {
		ElterngeldantragAnfrageabschluss0205TypeImpl elterngeldantragAnfrageabschluss0205Type = new ElterngeldantragAnfrageabschluss0205TypeImpl();
		return elterngeldantragAnfrageabschluss0205Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAntrag0201Type createElterngeldantragAntrag0201Type() {
		ElterngeldantragAntrag0201TypeImpl elterngeldantragAntrag0201Type = new ElterngeldantragAntrag0201TypeImpl();
		return elterngeldantragAntrag0201Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragStandesamtsmeldung0203Type createElterngeldantragStandesamtsmeldung0203Type() {
		ElterngeldantragStandesamtsmeldung0203TypeImpl elterngeldantragStandesamtsmeldung0203Type = new ElterngeldantragStandesamtsmeldung0203TypeImpl();
		return elterngeldantragStandesamtsmeldung0203Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragVorabmeldung0202Type createElterngeldantragVorabmeldung0202Type() {
		ElterngeldantragVorabmeldung0202TypeImpl elterngeldantragVorabmeldung0202Type = new ElterngeldantragVorabmeldung0202TypeImpl();
		return elterngeldantragVorabmeldung0202Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElternteilEinsElterngeldantragType createElternteilEinsElterngeldantragType() {
		ElternteilEinsElterngeldantragTypeImpl elternteilEinsElterngeldantragType = new ElternteilEinsElterngeldantragTypeImpl();
		return elternteilEinsElterngeldantragType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElternteilZweiElterngeldantragType createElternteilZweiElterngeldantragType() {
		ElternteilZweiElterngeldantragTypeImpl elternteilZweiElterngeldantragType = new ElternteilZweiElterngeldantragTypeImpl();
		return elternteilZweiElterngeldantragType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElternzeitType createElternzeitType() {
		ElternzeitTypeImpl elternzeitType = new ElternzeitTypeImpl();
		return elternzeitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErwerbstaetigkeitBezugszeitraumType createErwerbstaetigkeitBezugszeitraumType() {
		ErwerbstaetigkeitBezugszeitraumTypeImpl erwerbstaetigkeitBezugszeitraumType = new ErwerbstaetigkeitBezugszeitraumTypeImpl();
		return erwerbstaetigkeitBezugszeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreiwilligendienstType createFreiwilligendienstType() {
		FreiwilligendienstTypeImpl freiwilligendienstType = new FreiwilligendienstTypeImpl();
		return freiwilligendienstType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeringesEinkommenCovid19Type createGeringesEinkommenCovid19Type() {
		GeringesEinkommenCovid19TypeImpl geringesEinkommenCovid19Type = new GeringesEinkommenCovid19TypeImpl();
		return geringesEinkommenCovid19Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GesamteinkommenType createGesamteinkommenType() {
		GesamteinkommenTypeImpl gesamteinkommenType = new GesamteinkommenTypeImpl();
		return gesamteinkommenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GesetzlicheVertretungType createGesetzlicheVertretungType() {
		GesetzlicheVertretungTypeImpl gesetzlicheVertretungType = new GesetzlicheVertretungTypeImpl();
		return gesetzlicheVertretungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GewoehnlicherAufenthaltType createGewoehnlicherAufenthaltType() {
		GewoehnlicherAufenthaltTypeImpl gewoehnlicherAufenthaltType = new GewoehnlicherAufenthaltTypeImpl();
		return gewoehnlicherAufenthaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaushaltszugehoerigkeitDesKindesType createHaushaltszugehoerigkeitDesKindesType() {
		HaushaltszugehoerigkeitDesKindesTypeImpl haushaltszugehoerigkeitDesKindesType = new HaushaltszugehoerigkeitDesKindesTypeImpl();
		return haushaltszugehoerigkeitDesKindesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KindElterngeldType createKindElterngeldType() {
		KindElterngeldTypeImpl kindElterngeldType = new KindElterngeldTypeImpl();
		return kindElterngeldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KindschaftsverhaeltnisType createKindschaftsverhaeltnisType() {
		KindschaftsverhaeltnisTypeImpl kindschaftsverhaeltnisType = new KindschaftsverhaeltnisTypeImpl();
		return kindschaftsverhaeltnisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KindVorabmeldungType createKindVorabmeldungType() {
		KindVorabmeldungTypeImpl kindVorabmeldungType = new KindVorabmeldungTypeImpl();
		return kindVorabmeldungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankengeldType createKrankengeldType() {
		KrankengeldTypeImpl krankengeldType = new KrankengeldTypeImpl();
		return krankengeldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankentagegeldType createKrankentagegeldType() {
		KrankentagegeldTypeImpl krankentagegeldType = new KrankentagegeldTypeImpl();
		return krankentagegeldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankenversicherungType createKrankenversicherungType() {
		KrankenversicherungTypeImpl krankenversicherungType = new KrankenversicherungTypeImpl();
		return krankenversicherungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenssituationType createLebenssituationType() {
		LebenssituationTypeImpl lebenssituationType = new LebenssituationTypeImpl();
		return lebenssituationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MehrlingsgeburtType createMehrlingsgeburtType() {
		MehrlingsgeburtTypeImpl mehrlingsgeburtType = new MehrlingsgeburtTypeImpl();
		return mehrlingsgeburtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MidijobType createMidijobType() {
		MidijobTypeImpl midijobType = new MidijobTypeImpl();
		return midijobType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinijobType createMinijobType() {
		MinijobTypeImpl minijobType = new MinijobTypeImpl();
		return minijobType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType createMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType() {
		MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType = new MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl();
		return mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NichtselbststaendigeBeschaeftigungVorGeburtType createNichtselbststaendigeBeschaeftigungVorGeburtType() {
		NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl nichtselbststaendigeBeschaeftigungVorGeburtType = new NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl();
		return nichtselbststaendigeBeschaeftigungVorGeburtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType createNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType() {
		NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType = new NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl();
		return nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NichtselbststaendigkeitAusklammerungstatbestaendeType createNichtselbststaendigkeitAusklammerungstatbestaendeType() {
		NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl nichtselbststaendigkeitAusklammerungstatbestaendeType = new NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl();
		return nichtselbststaendigkeitAusklammerungstatbestaendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenETType createPersoenlicheAngabenETType() {
		PersoenlicheAngabenETTypeImpl persoenlicheAngabenETType = new PersoenlicheAngabenETTypeImpl();
		return persoenlicheAngabenETType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RentenType createRentenType() {
		RentenTypeImpl rentenType = new RentenTypeImpl();
		return rentenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResturlaubType createResturlaubType() {
		ResturlaubTypeImpl resturlaubType = new ResturlaubTypeImpl();
		return resturlaubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType createSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType() {
		SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType = new SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl();
		return selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelbststaendigkeitVerschiebetatbestaendeType createSelbststaendigkeitVerschiebetatbestaendeType() {
		SelbststaendigkeitVerschiebetatbestaendeTypeImpl selbststaendigkeitVerschiebetatbestaendeType = new SelbststaendigkeitVerschiebetatbestaendeTypeImpl();
		return selbststaendigkeitVerschiebetatbestaendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeLeistungenBezugszeitraumType createSonstigeLeistungenBezugszeitraumType() {
		SonstigeLeistungenBezugszeitraumTypeImpl sonstigeLeistungenBezugszeitraumType = new SonstigeLeistungenBezugszeitraumTypeImpl();
		return sonstigeLeistungenBezugszeitraumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitType createStaatsangehoerigkeitType() {
		StaatsangehoerigkeitTypeImpl staatsangehoerigkeitType = new StaatsangehoerigkeitTypeImpl();
		return staatsangehoerigkeitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagespflegeType createTagespflegeType() {
		TagespflegeTypeImpl tagespflegeType = new TagespflegeTypeImpl();
		return tagespflegeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilzeittaetigkeitType createTeilzeittaetigkeitType() {
		TeilzeittaetigkeitTypeImpl teilzeittaetigkeitType = new TeilzeittaetigkeitTypeImpl();
		return teilzeittaetigkeitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeitereKinderType createWeitereKinderType() {
		WeitereKinderTypeImpl weitereKinderType = new WeitereKinderTypeImpl();
		return weitereKinderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZustimmungDatenabrufeType createZustimmungDatenabrufeType() {
		ZustimmungDatenabrufeTypeImpl zustimmungDatenabrufeType = new ZustimmungDatenabrufeTypeImpl();
		return zustimmungDatenabrufeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abbruchgrund createAbbruchgrundFromString(EDataType eDataType, String initialValue) {
		Abbruchgrund result = Abbruchgrund.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbbruchgrundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anfragegrund createAnfragegrundFromString(EDataType eDataType, String initialValue) {
		Anfragegrund result = Anfragegrund.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnfragegrundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elterngeldantrag createElterngeldantragFromString(EDataType eDataType, String initialValue) {
		Elterngeldantrag result = Elterngeldantrag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElterngeldantragToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fehlerfall createFehlerfallFromString(EDataType eDataType, String initialValue) {
		Fehlerfall result = Fehlerfall.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFehlerfallToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gesamteinkommen createGesamteinkommenFromString(EDataType eDataType, String initialValue) {
		Gesamteinkommen result = Gesamteinkommen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGesamteinkommenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kindschaftsverhaeltnis createKindschaftsverhaeltnisFromString(EDataType eDataType, String initialValue) {
		Kindschaftsverhaeltnis result = Kindschaftsverhaeltnis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindschaftsverhaeltnisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leistungshoehe createLeistungshoeheFromString(EDataType eDataType, String initialValue) {
		Leistungshoehe result = Leistungshoehe.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeistungshoeheToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Versandweg createVersandwegFromString(EDataType eDataType, String initialValue) {
		Versandweg result = Versandweg.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersandwegToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Versicherungsart createVersicherungsartFromString(EDataType eDataType, String initialValue) {
		Versicherungsart result = Versicherungsart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersicherungsartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abbruchgrund createAbbruchgrundObjectFromString(EDataType eDataType, String initialValue) {
		return createAbbruchgrundFromString(ElterngeldPackage.eINSTANCE.getAbbruchgrund(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbbruchgrundObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAbbruchgrundToString(ElterngeldPackage.eINSTANCE.getAbbruchgrund(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anfragegrund createAnfragegrundObjectFromString(EDataType eDataType, String initialValue) {
		return createAnfragegrundFromString(ElterngeldPackage.eINSTANCE.getAnfragegrund(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnfragegrundObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnfragegrundToString(ElterngeldPackage.eINSTANCE.getAnfragegrund(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elterngeldantrag createElterngeldantragObjectFromString(EDataType eDataType, String initialValue) {
		return createElterngeldantragFromString(ElterngeldPackage.eINSTANCE.getElterngeldantrag(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElterngeldantragObjectToString(EDataType eDataType, Object instanceValue) {
		return convertElterngeldantragToString(ElterngeldPackage.eINSTANCE.getElterngeldantrag(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fehlerfall createFehlerfallObjectFromString(EDataType eDataType, String initialValue) {
		return createFehlerfallFromString(ElterngeldPackage.eINSTANCE.getFehlerfall(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFehlerfallObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFehlerfallToString(ElterngeldPackage.eINSTANCE.getFehlerfall(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gesamteinkommen createGesamteinkommenObjectFromString(EDataType eDataType, String initialValue) {
		return createGesamteinkommenFromString(ElterngeldPackage.eINSTANCE.getGesamteinkommen(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGesamteinkommenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGesamteinkommenToString(ElterngeldPackage.eINSTANCE.getGesamteinkommen(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kindschaftsverhaeltnis createKindschaftsverhaeltnisObjectFromString(EDataType eDataType, String initialValue) {
		return createKindschaftsverhaeltnisFromString(ElterngeldPackage.eINSTANCE.getKindschaftsverhaeltnis(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindschaftsverhaeltnisObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindschaftsverhaeltnisToString(ElterngeldPackage.eINSTANCE.getKindschaftsverhaeltnis(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leistungshoehe createLeistungshoeheObjectFromString(EDataType eDataType, String initialValue) {
		return createLeistungshoeheFromString(ElterngeldPackage.eINSTANCE.getLeistungshoehe(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeistungshoeheObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLeistungshoeheToString(ElterngeldPackage.eINSTANCE.getLeistungshoehe(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Versandweg createVersandwegObjectFromString(EDataType eDataType, String initialValue) {
		return createVersandwegFromString(ElterngeldPackage.eINSTANCE.getVersandweg(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersandwegObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVersandwegToString(ElterngeldPackage.eINSTANCE.getVersandweg(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Versicherungsart createVersicherungsartObjectFromString(EDataType eDataType, String initialValue) {
		return createVersicherungsartFromString(ElterngeldPackage.eINSTANCE.getVersicherungsart(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersicherungsartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVersicherungsartToString(ElterngeldPackage.eINSTANCE.getVersicherungsart(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldPackage getElterngeldPackage() {
		return (ElterngeldPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ElterngeldPackage getPackage() {
		return ElterngeldPackage.eINSTANCE;
	}

} //ElterngeldFactoryImpl
