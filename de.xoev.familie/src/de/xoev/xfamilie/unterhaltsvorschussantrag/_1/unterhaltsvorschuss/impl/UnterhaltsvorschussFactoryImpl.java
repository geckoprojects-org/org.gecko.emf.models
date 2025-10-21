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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.*;

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
public class UnterhaltsvorschussFactoryImpl extends EFactoryImpl implements UnterhaltsvorschussFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnterhaltsvorschussFactory init() {
		try {
			UnterhaltsvorschussFactory theUnterhaltsvorschussFactory = (UnterhaltsvorschussFactory)EPackage.Registry.INSTANCE.getEFactory(UnterhaltsvorschussPackage.eNS_URI);
			if (theUnterhaltsvorschussFactory != null) {
				return theUnterhaltsvorschussFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnterhaltsvorschussFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnterhaltsvorschussFactoryImpl() {
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
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE: return createAmtspflegendeType();
			case UnterhaltsvorschussPackage.ANDERE_PERSON_TYPE: return createAnderePersonType();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE: return createAndererElternteilBasisType();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_TYPE: return createAndererElternteilType();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE: return createAndererElternteilUeberpruefungType();
			case UnterhaltsvorschussPackage.ANGABEN_KIND_NACHREICHEN_TYPE: return createAngabenKindNachreichenType();
			case UnterhaltsvorschussPackage.ANSCHRIFT_OPTIONAL_TYPE: return createAnschriftOptionalType();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE: return createAntragskindBasisType();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_TYPE: return createAntragskindType();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_UEBERPRUEFUNG_TYPE: return createAntragskindUeberpruefungType();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE: return createAntragstellenderElternteilBasisType();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_TYPE: return createAntragstellenderElternteilType();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE: return createAntragstellenderElternteilUeberpruefungType();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE: return createAufenthaltKindBasisType();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_TYPE: return createAufenthaltKindType();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE: return createAufenthaltKindUeberpruefungType();
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE: return createAusbildungAndererElternteilType();
			case UnterhaltsvorschussPackage.BEISTAND_TYPE: return createBeistandType();
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE: return createBemuehungenUnterhaltType();
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE: return createBestaetigungAngabenType();
			case UnterhaltsvorschussPackage.BETREUER_TYPE: return createBetreuerType();
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE: return createBezugUvKindType();
			case UnterhaltsvorschussPackage.CODE_AUSBILDUNG_TYPE: return createCodeAusbildungType();
			case UnterhaltsvorschussPackage.CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE: return createCodeEinkuenfteAndererElternteilType();
			case UnterhaltsvorschussPackage.CODE_EINKUENFTE_KIND_TYPE: return createCodeEinkuenfteKindType();
			case UnterhaltsvorschussPackage.CODE_SONSTIGE_LEISTUNGEN_UV_TYPE: return createCodeSonstigeLeistungenUVType();
			case UnterhaltsvorschussPackage.CODE_STAATSANGEHOERIGKEIT_UV_TYPE: return createCodeStaatsangehoerigkeitUVType();
			case UnterhaltsvorschussPackage.CODE_STEUERKLASSE_TYPE: return createCodeSteuerklasseType();
			case UnterhaltsvorschussPackage.CODE_UNTERHALTSBEMUEHUNGEN_TYPE: return createCodeUnterhaltsbemuehungenType();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE: return createEinkuenfteAndererElternteilType();
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE: return createEinkuenfteKindType();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE: return createElternschaftType();
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE: return createFamilienstandBasisType();
			case UnterhaltsvorschussPackage.FAMILIENSTAND_TYPE: return createFamilienstandType();
			case UnterhaltsvorschussPackage.FAMILIENSTAND_UEBERPRUEFUNG_TYPE: return createFamilienstandUeberpruefungType();
			case UnterhaltsvorschussPackage.GEBURT_GEBURTSORT_PFLICHT_TYPE: return createGeburtGeburtsortPflichtType();
			case UnterhaltsvorschussPackage.GEBURT_NUR_GEBURTSDATUM_TYPE: return createGeburtNurGeburtsdatumType();
			case UnterhaltsvorschussPackage.GEBURT_TYPE: return createGeburtType();
			case UnterhaltsvorschussPackage.GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE: return createGeschiedenAntragstellendeBasisType();
			case UnterhaltsvorschussPackage.GESCHIEDEN_ANTRAGSTELLENDE_TYPE: return createGeschiedenAntragstellendeType();
			case UnterhaltsvorschussPackage.GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: return createGeschiedenAntragstellendeUeberpruefungType();
			case UnterhaltsvorschussPackage.INSTITUTION_UNTERHALTSTITEL_TYPE: return createInstitutionUnterhaltstitelType();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE: return createLebenspartnerschaftAntragstellendeBasisType();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE: return createLebenspartnerschaftAntragstellendeType();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: return createLebenspartnerschaftAntragstellendeUeberpruefungType();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE: return createLebenspartnerschaftAufgehobenAntragstellendeBasisType();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE: return createLebenspartnerschaftAufgehobenAntragstellendeType();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: return createLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType();
			case UnterhaltsvorschussPackage.LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE: return createLebenspartnerVerstorbenAntragstellendeBasisType();
			case UnterhaltsvorschussPackage.LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE: return createLebenspartnerVerstorbenAntragstellendeType();
			case UnterhaltsvorschussPackage.LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: return createLebenspartnerVerstorbenAntragstellendeUeberpruefungType();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE: return createLebenssituationBasisType();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_TYPE: return createLebenssituationType();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_UEBERPRUEFUNG_TYPE: return createLebenssituationUeberpruefungType();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE: return createLedigAntragstellendeBasisType();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_TYPE: return createLedigAntragstellendeType();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: return createLedigAntragstellendeUeberpruefungType();
			case UnterhaltsvorschussPackage.LEISTUNGSERHALT_TYPE: return createLeistungserhaltType();
			case UnterhaltsvorschussPackage.LEISTUNGSGEWAEHRUNG_TYPE: return createLeistungsgewaehrungType();
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE: return createLohnsteuerklasseType();
			case UnterhaltsvorschussPackage.NAME_MIT_GEBURTSNAME_TYPE: return createNameMitGeburtsnameType();
			case UnterhaltsvorschussPackage.NAME_OHNE_GEBURTSNAME_TYPE: return createNameOhneGeburtsnameType();
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE: return createNameOptionalType();
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE: return createRechtsanwaltType();
			case UnterhaltsvorschussPackage.SCHULE_TYPE: return createSchuleType();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE: return createSonstigeLeistungAndererElternteilType();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE: return createSonstigeLeistungKindType();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE: return createSonstigeLeistungKindUeberpruefungType();
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE: return createStaatsangehoerigkeitAndererElternteilType();
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE: return createStaatsangehoerigkeitType();
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE: return createTraegerKrankenversicherungType();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE: return createUnterhaltBasisType();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE: return createUnterhaltstitelType();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE: return createUnterhaltstitelUeberpruefungType();
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE: return createUnterhaltsvorauszahlungenType();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE: return createUnterhaltsvorschussantragAntrag0301Type();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE: return createUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE: return createUnterhaltsvorschussantragNachreichen0303Type();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE: return createUnterhaltsvorschussantragNachweisnachricht0311Type();
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE: return createUnterhaltszahlungenType();
			case UnterhaltsvorschussPackage.UNTERHALT_TYPE: return createUnterhaltType();
			case UnterhaltsvorschussPackage.UNTERHALT_UEBERPRUEFUNG_TYPE: return createUnterhaltUeberpruefungType();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE: return createVerheiratetAntragstellendeBasisType();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_TYPE: return createVerheiratetAntragstellendeType();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: return createVerheiratetAntragstellendeUeberpruefungType();
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE: return createVermoegenAndererElternteilType();
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE: return createVertretungType();
			case UnterhaltsvorschussPackage.VERTRETUNG_UEBERPRUEFUNG_TYPE: return createVertretungUeberpruefungType();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE: return createVerwitwetAntragstellendeBasisType();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_TYPE: return createVerwitwetAntragstellendeType();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: return createVerwitwetAntragstellendeUeberpruefungType();
			case UnterhaltsvorschussPackage.VORMUND_TYPE: return createVormundType();
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE: return createWeitereGemeinsameKinderType();
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE: return createWeitereKinderAndererElternteilType();
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
			case UnterhaltsvorschussPackage.AUSBILDUNG:
				return createAusbildungFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.EINKUENFTEANDERERELTERNTEIL:
				return createEinkuenfteandererelternteilFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.EINKUENFTEKINDUV:
				return createEinkuenftekinduvFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.SONSTIGELEISTUNGENUV:
				return createSonstigeleistungenuvFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEITUV:
				return createStaatsangehoerigkeituvFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.STEUERKLASSE:
				return createSteuerklasseFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.UNTERHALTSBEMUEHUNGEN:
				return createUnterhaltsbemuehungenFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.AUSBILDUNG_OBJECT:
				return createAusbildungObjectFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.EINKUENFTEANDERERELTERNTEIL_OBJECT:
				return createEinkuenfteandererelternteilObjectFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.EINKUENFTEKINDUV_OBJECT:
				return createEinkuenftekinduvObjectFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.SONSTIGELEISTUNGENUV_OBJECT:
				return createSonstigeleistungenuvObjectFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEITUV_OBJECT:
				return createStaatsangehoerigkeituvObjectFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.STEUERKLASSE_OBJECT:
				return createSteuerklasseObjectFromString(eDataType, initialValue);
			case UnterhaltsvorschussPackage.UNTERHALTSBEMUEHUNGEN_OBJECT:
				return createUnterhaltsbemuehungenObjectFromString(eDataType, initialValue);
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
			case UnterhaltsvorschussPackage.AUSBILDUNG:
				return convertAusbildungToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.EINKUENFTEANDERERELTERNTEIL:
				return convertEinkuenfteandererelternteilToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.EINKUENFTEKINDUV:
				return convertEinkuenftekinduvToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.SONSTIGELEISTUNGENUV:
				return convertSonstigeleistungenuvToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEITUV:
				return convertStaatsangehoerigkeituvToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.STEUERKLASSE:
				return convertSteuerklasseToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.UNTERHALTSBEMUEHUNGEN:
				return convertUnterhaltsbemuehungenToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.AUSBILDUNG_OBJECT:
				return convertAusbildungObjectToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.EINKUENFTEANDERERELTERNTEIL_OBJECT:
				return convertEinkuenfteandererelternteilObjectToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.EINKUENFTEKINDUV_OBJECT:
				return convertEinkuenftekinduvObjectToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.SONSTIGELEISTUNGENUV_OBJECT:
				return convertSonstigeleistungenuvObjectToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEITUV_OBJECT:
				return convertStaatsangehoerigkeituvObjectToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.STEUERKLASSE_OBJECT:
				return convertSteuerklasseObjectToString(eDataType, instanceValue);
			case UnterhaltsvorschussPackage.UNTERHALTSBEMUEHUNGEN_OBJECT:
				return convertUnterhaltsbemuehungenObjectToString(eDataType, instanceValue);
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
	public AmtspflegendeType createAmtspflegendeType() {
		AmtspflegendeTypeImpl amtspflegendeType = new AmtspflegendeTypeImpl();
		return amtspflegendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnderePersonType createAnderePersonType() {
		AnderePersonTypeImpl anderePersonType = new AnderePersonTypeImpl();
		return anderePersonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndererElternteilBasisType createAndererElternteilBasisType() {
		AndererElternteilBasisTypeImpl andererElternteilBasisType = new AndererElternteilBasisTypeImpl();
		return andererElternteilBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndererElternteilType createAndererElternteilType() {
		AndererElternteilTypeImpl andererElternteilType = new AndererElternteilTypeImpl();
		return andererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndererElternteilUeberpruefungType createAndererElternteilUeberpruefungType() {
		AndererElternteilUeberpruefungTypeImpl andererElternteilUeberpruefungType = new AndererElternteilUeberpruefungTypeImpl();
		return andererElternteilUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindNachreichenType createAngabenKindNachreichenType() {
		AngabenKindNachreichenTypeImpl angabenKindNachreichenType = new AngabenKindNachreichenTypeImpl();
		return angabenKindNachreichenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftOptionalType createAnschriftOptionalType() {
		AnschriftOptionalTypeImpl anschriftOptionalType = new AnschriftOptionalTypeImpl();
		return anschriftOptionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragskindBasisType createAntragskindBasisType() {
		AntragskindBasisTypeImpl antragskindBasisType = new AntragskindBasisTypeImpl();
		return antragskindBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragskindType createAntragskindType() {
		AntragskindTypeImpl antragskindType = new AntragskindTypeImpl();
		return antragskindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragskindUeberpruefungType createAntragskindUeberpruefungType() {
		AntragskindUeberpruefungTypeImpl antragskindUeberpruefungType = new AntragskindUeberpruefungTypeImpl();
		return antragskindUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilBasisType createAntragstellenderElternteilBasisType() {
		AntragstellenderElternteilBasisTypeImpl antragstellenderElternteilBasisType = new AntragstellenderElternteilBasisTypeImpl();
		return antragstellenderElternteilBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilType createAntragstellenderElternteilType() {
		AntragstellenderElternteilTypeImpl antragstellenderElternteilType = new AntragstellenderElternteilTypeImpl();
		return antragstellenderElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilUeberpruefungType createAntragstellenderElternteilUeberpruefungType() {
		AntragstellenderElternteilUeberpruefungTypeImpl antragstellenderElternteilUeberpruefungType = new AntragstellenderElternteilUeberpruefungTypeImpl();
		return antragstellenderElternteilUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufenthaltKindBasisType createAufenthaltKindBasisType() {
		AufenthaltKindBasisTypeImpl aufenthaltKindBasisType = new AufenthaltKindBasisTypeImpl();
		return aufenthaltKindBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufenthaltKindType createAufenthaltKindType() {
		AufenthaltKindTypeImpl aufenthaltKindType = new AufenthaltKindTypeImpl();
		return aufenthaltKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufenthaltKindUeberpruefungType createAufenthaltKindUeberpruefungType() {
		AufenthaltKindUeberpruefungTypeImpl aufenthaltKindUeberpruefungType = new AufenthaltKindUeberpruefungTypeImpl();
		return aufenthaltKindUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AusbildungAndererElternteilType createAusbildungAndererElternteilType() {
		AusbildungAndererElternteilTypeImpl ausbildungAndererElternteilType = new AusbildungAndererElternteilTypeImpl();
		return ausbildungAndererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeistandType createBeistandType() {
		BeistandTypeImpl beistandType = new BeistandTypeImpl();
		return beistandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BemuehungenUnterhaltType createBemuehungenUnterhaltType() {
		BemuehungenUnterhaltTypeImpl bemuehungenUnterhaltType = new BemuehungenUnterhaltTypeImpl();
		return bemuehungenUnterhaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BestaetigungAngabenType createBestaetigungAngabenType() {
		BestaetigungAngabenTypeImpl bestaetigungAngabenType = new BestaetigungAngabenTypeImpl();
		return bestaetigungAngabenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BetreuerType createBetreuerType() {
		BetreuerTypeImpl betreuerType = new BetreuerTypeImpl();
		return betreuerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BezugUvKindType createBezugUvKindType() {
		BezugUvKindTypeImpl bezugUvKindType = new BezugUvKindTypeImpl();
		return bezugUvKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAusbildungType createCodeAusbildungType() {
		CodeAusbildungTypeImpl codeAusbildungType = new CodeAusbildungTypeImpl();
		return codeAusbildungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEinkuenfteAndererElternteilType createCodeEinkuenfteAndererElternteilType() {
		CodeEinkuenfteAndererElternteilTypeImpl codeEinkuenfteAndererElternteilType = new CodeEinkuenfteAndererElternteilTypeImpl();
		return codeEinkuenfteAndererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEinkuenfteKindType createCodeEinkuenfteKindType() {
		CodeEinkuenfteKindTypeImpl codeEinkuenfteKindType = new CodeEinkuenfteKindTypeImpl();
		return codeEinkuenfteKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSonstigeLeistungenUVType createCodeSonstigeLeistungenUVType() {
		CodeSonstigeLeistungenUVTypeImpl codeSonstigeLeistungenUVType = new CodeSonstigeLeistungenUVTypeImpl();
		return codeSonstigeLeistungenUVType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatsangehoerigkeitUVType createCodeStaatsangehoerigkeitUVType() {
		CodeStaatsangehoerigkeitUVTypeImpl codeStaatsangehoerigkeitUVType = new CodeStaatsangehoerigkeitUVTypeImpl();
		return codeStaatsangehoerigkeitUVType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSteuerklasseType createCodeSteuerklasseType() {
		CodeSteuerklasseTypeImpl codeSteuerklasseType = new CodeSteuerklasseTypeImpl();
		return codeSteuerklasseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeUnterhaltsbemuehungenType createCodeUnterhaltsbemuehungenType() {
		CodeUnterhaltsbemuehungenTypeImpl codeUnterhaltsbemuehungenType = new CodeUnterhaltsbemuehungenTypeImpl();
		return codeUnterhaltsbemuehungenType;
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
	public EinkuenfteAndererElternteilType createEinkuenfteAndererElternteilType() {
		EinkuenfteAndererElternteilTypeImpl einkuenfteAndererElternteilType = new EinkuenfteAndererElternteilTypeImpl();
		return einkuenfteAndererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkuenfteKindType createEinkuenfteKindType() {
		EinkuenfteKindTypeImpl einkuenfteKindType = new EinkuenfteKindTypeImpl();
		return einkuenfteKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElternschaftType createElternschaftType() {
		ElternschaftTypeImpl elternschaftType = new ElternschaftTypeImpl();
		return elternschaftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilienstandBasisType createFamilienstandBasisType() {
		FamilienstandBasisTypeImpl familienstandBasisType = new FamilienstandBasisTypeImpl();
		return familienstandBasisType;
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
	public FamilienstandUeberpruefungType createFamilienstandUeberpruefungType() {
		FamilienstandUeberpruefungTypeImpl familienstandUeberpruefungType = new FamilienstandUeberpruefungTypeImpl();
		return familienstandUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtGeburtsortPflichtType createGeburtGeburtsortPflichtType() {
		GeburtGeburtsortPflichtTypeImpl geburtGeburtsortPflichtType = new GeburtGeburtsortPflichtTypeImpl();
		return geburtGeburtsortPflichtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtNurGeburtsdatumType createGeburtNurGeburtsdatumType() {
		GeburtNurGeburtsdatumTypeImpl geburtNurGeburtsdatumType = new GeburtNurGeburtsdatumTypeImpl();
		return geburtNurGeburtsdatumType;
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
	public GeschiedenAntragstellendeBasisType createGeschiedenAntragstellendeBasisType() {
		GeschiedenAntragstellendeBasisTypeImpl geschiedenAntragstellendeBasisType = new GeschiedenAntragstellendeBasisTypeImpl();
		return geschiedenAntragstellendeBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeschiedenAntragstellendeType createGeschiedenAntragstellendeType() {
		GeschiedenAntragstellendeTypeImpl geschiedenAntragstellendeType = new GeschiedenAntragstellendeTypeImpl();
		return geschiedenAntragstellendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeschiedenAntragstellendeUeberpruefungType createGeschiedenAntragstellendeUeberpruefungType() {
		GeschiedenAntragstellendeUeberpruefungTypeImpl geschiedenAntragstellendeUeberpruefungType = new GeschiedenAntragstellendeUeberpruefungTypeImpl();
		return geschiedenAntragstellendeUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionUnterhaltstitelType createInstitutionUnterhaltstitelType() {
		InstitutionUnterhaltstitelTypeImpl institutionUnterhaltstitelType = new InstitutionUnterhaltstitelTypeImpl();
		return institutionUnterhaltstitelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAntragstellendeBasisType createLebenspartnerschaftAntragstellendeBasisType() {
		LebenspartnerschaftAntragstellendeBasisTypeImpl lebenspartnerschaftAntragstellendeBasisType = new LebenspartnerschaftAntragstellendeBasisTypeImpl();
		return lebenspartnerschaftAntragstellendeBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAntragstellendeType createLebenspartnerschaftAntragstellendeType() {
		LebenspartnerschaftAntragstellendeTypeImpl lebenspartnerschaftAntragstellendeType = new LebenspartnerschaftAntragstellendeTypeImpl();
		return lebenspartnerschaftAntragstellendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAntragstellendeUeberpruefungType createLebenspartnerschaftAntragstellendeUeberpruefungType() {
		LebenspartnerschaftAntragstellendeUeberpruefungTypeImpl lebenspartnerschaftAntragstellendeUeberpruefungType = new LebenspartnerschaftAntragstellendeUeberpruefungTypeImpl();
		return lebenspartnerschaftAntragstellendeUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAufgehobenAntragstellendeBasisType createLebenspartnerschaftAufgehobenAntragstellendeBasisType() {
		LebenspartnerschaftAufgehobenAntragstellendeBasisTypeImpl lebenspartnerschaftAufgehobenAntragstellendeBasisType = new LebenspartnerschaftAufgehobenAntragstellendeBasisTypeImpl();
		return lebenspartnerschaftAufgehobenAntragstellendeBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAufgehobenAntragstellendeType createLebenspartnerschaftAufgehobenAntragstellendeType() {
		LebenspartnerschaftAufgehobenAntragstellendeTypeImpl lebenspartnerschaftAufgehobenAntragstellendeType = new LebenspartnerschaftAufgehobenAntragstellendeTypeImpl();
		return lebenspartnerschaftAufgehobenAntragstellendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType createLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType() {
		LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeImpl lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType = new LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeImpl();
		return lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerVerstorbenAntragstellendeBasisType createLebenspartnerVerstorbenAntragstellendeBasisType() {
		LebenspartnerVerstorbenAntragstellendeBasisTypeImpl lebenspartnerVerstorbenAntragstellendeBasisType = new LebenspartnerVerstorbenAntragstellendeBasisTypeImpl();
		return lebenspartnerVerstorbenAntragstellendeBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerVerstorbenAntragstellendeType createLebenspartnerVerstorbenAntragstellendeType() {
		LebenspartnerVerstorbenAntragstellendeTypeImpl lebenspartnerVerstorbenAntragstellendeType = new LebenspartnerVerstorbenAntragstellendeTypeImpl();
		return lebenspartnerVerstorbenAntragstellendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerVerstorbenAntragstellendeUeberpruefungType createLebenspartnerVerstorbenAntragstellendeUeberpruefungType() {
		LebenspartnerVerstorbenAntragstellendeUeberpruefungTypeImpl lebenspartnerVerstorbenAntragstellendeUeberpruefungType = new LebenspartnerVerstorbenAntragstellendeUeberpruefungTypeImpl();
		return lebenspartnerVerstorbenAntragstellendeUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenssituationBasisType createLebenssituationBasisType() {
		LebenssituationBasisTypeImpl lebenssituationBasisType = new LebenssituationBasisTypeImpl();
		return lebenssituationBasisType;
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
	public LebenssituationUeberpruefungType createLebenssituationUeberpruefungType() {
		LebenssituationUeberpruefungTypeImpl lebenssituationUeberpruefungType = new LebenssituationUeberpruefungTypeImpl();
		return lebenssituationUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LedigAntragstellendeBasisType createLedigAntragstellendeBasisType() {
		LedigAntragstellendeBasisTypeImpl ledigAntragstellendeBasisType = new LedigAntragstellendeBasisTypeImpl();
		return ledigAntragstellendeBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LedigAntragstellendeType createLedigAntragstellendeType() {
		LedigAntragstellendeTypeImpl ledigAntragstellendeType = new LedigAntragstellendeTypeImpl();
		return ledigAntragstellendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LedigAntragstellendeUeberpruefungType createLedigAntragstellendeUeberpruefungType() {
		LedigAntragstellendeUeberpruefungTypeImpl ledigAntragstellendeUeberpruefungType = new LedigAntragstellendeUeberpruefungTypeImpl();
		return ledigAntragstellendeUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeistungserhaltType createLeistungserhaltType() {
		LeistungserhaltTypeImpl leistungserhaltType = new LeistungserhaltTypeImpl();
		return leistungserhaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeistungsgewaehrungType createLeistungsgewaehrungType() {
		LeistungsgewaehrungTypeImpl leistungsgewaehrungType = new LeistungsgewaehrungTypeImpl();
		return leistungsgewaehrungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LohnsteuerklasseType createLohnsteuerklasseType() {
		LohnsteuerklasseTypeImpl lohnsteuerklasseType = new LohnsteuerklasseTypeImpl();
		return lohnsteuerklasseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameMitGeburtsnameType createNameMitGeburtsnameType() {
		NameMitGeburtsnameTypeImpl nameMitGeburtsnameType = new NameMitGeburtsnameTypeImpl();
		return nameMitGeburtsnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOhneGeburtsnameType createNameOhneGeburtsnameType() {
		NameOhneGeburtsnameTypeImpl nameOhneGeburtsnameType = new NameOhneGeburtsnameTypeImpl();
		return nameOhneGeburtsnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOptionalType createNameOptionalType() {
		NameOptionalTypeImpl nameOptionalType = new NameOptionalTypeImpl();
		return nameOptionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RechtsanwaltType createRechtsanwaltType() {
		RechtsanwaltTypeImpl rechtsanwaltType = new RechtsanwaltTypeImpl();
		return rechtsanwaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchuleType createSchuleType() {
		SchuleTypeImpl schuleType = new SchuleTypeImpl();
		return schuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeLeistungAndererElternteilType createSonstigeLeistungAndererElternteilType() {
		SonstigeLeistungAndererElternteilTypeImpl sonstigeLeistungAndererElternteilType = new SonstigeLeistungAndererElternteilTypeImpl();
		return sonstigeLeistungAndererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeLeistungKindType createSonstigeLeistungKindType() {
		SonstigeLeistungKindTypeImpl sonstigeLeistungKindType = new SonstigeLeistungKindTypeImpl();
		return sonstigeLeistungKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeLeistungKindUeberpruefungType createSonstigeLeistungKindUeberpruefungType() {
		SonstigeLeistungKindUeberpruefungTypeImpl sonstigeLeistungKindUeberpruefungType = new SonstigeLeistungKindUeberpruefungTypeImpl();
		return sonstigeLeistungKindUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitAndererElternteilType createStaatsangehoerigkeitAndererElternteilType() {
		StaatsangehoerigkeitAndererElternteilTypeImpl staatsangehoerigkeitAndererElternteilType = new StaatsangehoerigkeitAndererElternteilTypeImpl();
		return staatsangehoerigkeitAndererElternteilType;
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
	public TraegerKrankenversicherungType createTraegerKrankenversicherungType() {
		TraegerKrankenversicherungTypeImpl traegerKrankenversicherungType = new TraegerKrankenversicherungTypeImpl();
		return traegerKrankenversicherungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltBasisType createUnterhaltBasisType() {
		UnterhaltBasisTypeImpl unterhaltBasisType = new UnterhaltBasisTypeImpl();
		return unterhaltBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltstitelType createUnterhaltstitelType() {
		UnterhaltstitelTypeImpl unterhaltstitelType = new UnterhaltstitelTypeImpl();
		return unterhaltstitelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltstitelUeberpruefungType createUnterhaltstitelUeberpruefungType() {
		UnterhaltstitelUeberpruefungTypeImpl unterhaltstitelUeberpruefungType = new UnterhaltstitelUeberpruefungTypeImpl();
		return unterhaltstitelUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorauszahlungenType createUnterhaltsvorauszahlungenType() {
		UnterhaltsvorauszahlungenTypeImpl unterhaltsvorauszahlungenType = new UnterhaltsvorauszahlungenTypeImpl();
		return unterhaltsvorauszahlungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragAntrag0301Type createUnterhaltsvorschussantragAntrag0301Type() {
		UnterhaltsvorschussantragAntrag0301TypeImpl unterhaltsvorschussantragAntrag0301Type = new UnterhaltsvorschussantragAntrag0301TypeImpl();
		return unterhaltsvorschussantragAntrag0301Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type createUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type() {
		UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl unterhaltsvorschussantragJaehrlicheUeberpruefung0302Type = new UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl();
		return unterhaltsvorschussantragJaehrlicheUeberpruefung0302Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragNachreichen0303Type createUnterhaltsvorschussantragNachreichen0303Type() {
		UnterhaltsvorschussantragNachreichen0303TypeImpl unterhaltsvorschussantragNachreichen0303Type = new UnterhaltsvorschussantragNachreichen0303TypeImpl();
		return unterhaltsvorschussantragNachreichen0303Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragNachweisnachricht0311Type createUnterhaltsvorschussantragNachweisnachricht0311Type() {
		UnterhaltsvorschussantragNachweisnachricht0311TypeImpl unterhaltsvorschussantragNachweisnachricht0311Type = new UnterhaltsvorschussantragNachweisnachricht0311TypeImpl();
		return unterhaltsvorschussantragNachweisnachricht0311Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltszahlungenType createUnterhaltszahlungenType() {
		UnterhaltszahlungenTypeImpl unterhaltszahlungenType = new UnterhaltszahlungenTypeImpl();
		return unterhaltszahlungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltType createUnterhaltType() {
		UnterhaltTypeImpl unterhaltType = new UnterhaltTypeImpl();
		return unterhaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltUeberpruefungType createUnterhaltUeberpruefungType() {
		UnterhaltUeberpruefungTypeImpl unterhaltUeberpruefungType = new UnterhaltUeberpruefungTypeImpl();
		return unterhaltUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerheiratetAntragstellendeBasisType createVerheiratetAntragstellendeBasisType() {
		VerheiratetAntragstellendeBasisTypeImpl verheiratetAntragstellendeBasisType = new VerheiratetAntragstellendeBasisTypeImpl();
		return verheiratetAntragstellendeBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerheiratetAntragstellendeType createVerheiratetAntragstellendeType() {
		VerheiratetAntragstellendeTypeImpl verheiratetAntragstellendeType = new VerheiratetAntragstellendeTypeImpl();
		return verheiratetAntragstellendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerheiratetAntragstellendeUeberpruefungType createVerheiratetAntragstellendeUeberpruefungType() {
		VerheiratetAntragstellendeUeberpruefungTypeImpl verheiratetAntragstellendeUeberpruefungType = new VerheiratetAntragstellendeUeberpruefungTypeImpl();
		return verheiratetAntragstellendeUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VermoegenAndererElternteilType createVermoegenAndererElternteilType() {
		VermoegenAndererElternteilTypeImpl vermoegenAndererElternteilType = new VermoegenAndererElternteilTypeImpl();
		return vermoegenAndererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VertretungType createVertretungType() {
		VertretungTypeImpl vertretungType = new VertretungTypeImpl();
		return vertretungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VertretungUeberpruefungType createVertretungUeberpruefungType() {
		VertretungUeberpruefungTypeImpl vertretungUeberpruefungType = new VertretungUeberpruefungTypeImpl();
		return vertretungUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerwitwetAntragstellendeBasisType createVerwitwetAntragstellendeBasisType() {
		VerwitwetAntragstellendeBasisTypeImpl verwitwetAntragstellendeBasisType = new VerwitwetAntragstellendeBasisTypeImpl();
		return verwitwetAntragstellendeBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerwitwetAntragstellendeType createVerwitwetAntragstellendeType() {
		VerwitwetAntragstellendeTypeImpl verwitwetAntragstellendeType = new VerwitwetAntragstellendeTypeImpl();
		return verwitwetAntragstellendeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerwitwetAntragstellendeUeberpruefungType createVerwitwetAntragstellendeUeberpruefungType() {
		VerwitwetAntragstellendeUeberpruefungTypeImpl verwitwetAntragstellendeUeberpruefungType = new VerwitwetAntragstellendeUeberpruefungTypeImpl();
		return verwitwetAntragstellendeUeberpruefungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VormundType createVormundType() {
		VormundTypeImpl vormundType = new VormundTypeImpl();
		return vormundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeitereGemeinsameKinderType createWeitereGemeinsameKinderType() {
		WeitereGemeinsameKinderTypeImpl weitereGemeinsameKinderType = new WeitereGemeinsameKinderTypeImpl();
		return weitereGemeinsameKinderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeitereKinderAndererElternteilType createWeitereKinderAndererElternteilType() {
		WeitereKinderAndererElternteilTypeImpl weitereKinderAndererElternteilType = new WeitereKinderAndererElternteilTypeImpl();
		return weitereKinderAndererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ausbildung createAusbildungFromString(EDataType eDataType, String initialValue) {
		Ausbildung result = Ausbildung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAusbildungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkuenfteandererelternteil createEinkuenfteandererelternteilFromString(EDataType eDataType, String initialValue) {
		Einkuenfteandererelternteil result = Einkuenfteandererelternteil.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkuenfteandererelternteilToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkuenftekinduv createEinkuenftekinduvFromString(EDataType eDataType, String initialValue) {
		Einkuenftekinduv result = Einkuenftekinduv.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkuenftekinduvToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sonstigeleistungenuv createSonstigeleistungenuvFromString(EDataType eDataType, String initialValue) {
		Sonstigeleistungenuv result = Sonstigeleistungenuv.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSonstigeleistungenuvToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staatsangehoerigkeituv createStaatsangehoerigkeituvFromString(EDataType eDataType, String initialValue) {
		Staatsangehoerigkeituv result = Staatsangehoerigkeituv.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaatsangehoerigkeituvToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steuerklasse createSteuerklasseFromString(EDataType eDataType, String initialValue) {
		Steuerklasse result = Steuerklasse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSteuerklasseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterhaltsbemuehungen createUnterhaltsbemuehungenFromString(EDataType eDataType, String initialValue) {
		Unterhaltsbemuehungen result = Unterhaltsbemuehungen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnterhaltsbemuehungenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ausbildung createAusbildungObjectFromString(EDataType eDataType, String initialValue) {
		return createAusbildungFromString(UnterhaltsvorschussPackage.eINSTANCE.getAusbildung(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAusbildungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAusbildungToString(UnterhaltsvorschussPackage.eINSTANCE.getAusbildung(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkuenfteandererelternteil createEinkuenfteandererelternteilObjectFromString(EDataType eDataType, String initialValue) {
		return createEinkuenfteandererelternteilFromString(UnterhaltsvorschussPackage.eINSTANCE.getEinkuenfteandererelternteil(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkuenfteandererelternteilObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEinkuenfteandererelternteilToString(UnterhaltsvorschussPackage.eINSTANCE.getEinkuenfteandererelternteil(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkuenftekinduv createEinkuenftekinduvObjectFromString(EDataType eDataType, String initialValue) {
		return createEinkuenftekinduvFromString(UnterhaltsvorschussPackage.eINSTANCE.getEinkuenftekinduv(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkuenftekinduvObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEinkuenftekinduvToString(UnterhaltsvorschussPackage.eINSTANCE.getEinkuenftekinduv(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sonstigeleistungenuv createSonstigeleistungenuvObjectFromString(EDataType eDataType, String initialValue) {
		return createSonstigeleistungenuvFromString(UnterhaltsvorschussPackage.eINSTANCE.getSonstigeleistungenuv(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSonstigeleistungenuvObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSonstigeleistungenuvToString(UnterhaltsvorschussPackage.eINSTANCE.getSonstigeleistungenuv(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staatsangehoerigkeituv createStaatsangehoerigkeituvObjectFromString(EDataType eDataType, String initialValue) {
		return createStaatsangehoerigkeituvFromString(UnterhaltsvorschussPackage.eINSTANCE.getStaatsangehoerigkeituv(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaatsangehoerigkeituvObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStaatsangehoerigkeituvToString(UnterhaltsvorschussPackage.eINSTANCE.getStaatsangehoerigkeituv(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steuerklasse createSteuerklasseObjectFromString(EDataType eDataType, String initialValue) {
		return createSteuerklasseFromString(UnterhaltsvorschussPackage.eINSTANCE.getSteuerklasse(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSteuerklasseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSteuerklasseToString(UnterhaltsvorschussPackage.eINSTANCE.getSteuerklasse(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterhaltsbemuehungen createUnterhaltsbemuehungenObjectFromString(EDataType eDataType, String initialValue) {
		return createUnterhaltsbemuehungenFromString(UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltsbemuehungen(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnterhaltsbemuehungenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnterhaltsbemuehungenToString(UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltsbemuehungen(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussPackage getUnterhaltsvorschussPackage() {
		return (UnterhaltsvorschussPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnterhaltsvorschussPackage getPackage() {
		return UnterhaltsvorschussPackage.eINSTANCE;
	}

} //UnterhaltsvorschussFactoryImpl
