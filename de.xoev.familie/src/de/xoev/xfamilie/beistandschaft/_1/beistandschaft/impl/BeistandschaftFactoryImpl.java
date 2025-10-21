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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.*;

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
public class BeistandschaftFactoryImpl extends EFactoryImpl implements BeistandschaftFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BeistandschaftFactory init() {
		try {
			BeistandschaftFactory theBeistandschaftFactory = (BeistandschaftFactory)EPackage.Registry.INSTANCE.getEFactory(BeistandschaftPackage.eNS_URI);
			if (theBeistandschaftFactory != null) {
				return theBeistandschaftFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BeistandschaftFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeistandschaftFactoryImpl() {
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
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE: return createAndererElternteilType();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE: return createAngabenZumKindBeendigungType();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE: return createAngabenZumKindType();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE: return createAngabenZumUnterhaltType();
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE: return createAnliegensklaerungBSSType();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE: return createAntragstellenderElternteilBeendigungType();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_TYPE: return createAntragstellenderElternteilType();
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE: return createAusbildungUndEinkuenfteType();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE: return createBeistandschaftAntrag0601Type();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE: return createBeistandschaftBeendigung0604Type();
			case BeistandschaftPackage.CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE: return createCodeAnliegenBeistandschaftType();
			case BeistandschaftPackage.CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE: return createCodeBezugOeffentlicherLeistungenType();
			case BeistandschaftPackage.CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE: return createCodeEinkommenAndererElternteilType();
			case BeistandschaftPackage.CODE_INHABER_ELTERLICHE_SORGE_TYPE: return createCodeInhaberElterlicheSorgeType();
			case BeistandschaftPackage.CODE_UNTERHALTSTITEL_BESTEHT_TYPE: return createCodeUnterhaltstitelBestehtType();
			case BeistandschaftPackage.CODE_ZAHLUNGSART_BSS_TYPE: return createCodeZahlungsartBSSType();
			case BeistandschaftPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BeistandschaftPackage.GEBURT_TYPE: return createGeburtType();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE: return createNachweiseBSSType();
			case BeistandschaftPackage.NACHWEIS_TYPE: return createNachweisType();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE: return createWeitereAngabenZumAnderenElternteilType();
			case BeistandschaftPackage.WEITERE_KINDER_TYPE: return createWeitereKinderType();
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
			case BeistandschaftPackage.ANLIEGENBEISTANDSCHAFT:
				return createAnliegenbeistandschaftFromString(eDataType, initialValue);
			case BeistandschaftPackage.BEZUGOEFFENTLICHERLEISTUNGEN:
				return createBezugoeffentlicherleistungenFromString(eDataType, initialValue);
			case BeistandschaftPackage.EINKOMMENANDERERELTERNTEIL:
				return createEinkommenandererelternteilFromString(eDataType, initialValue);
			case BeistandschaftPackage.INHABERELTERLICHESORGE:
				return createInhaberelterlichesorgeFromString(eDataType, initialValue);
			case BeistandschaftPackage.UNTERHALTSTITELBESTEHT:
				return createUnterhaltstitelbestehtFromString(eDataType, initialValue);
			case BeistandschaftPackage.ZAHLUNGSARTBSS:
				return createZahlungsartbssFromString(eDataType, initialValue);
			case BeistandschaftPackage.ANLIEGENBEISTANDSCHAFT_OBJECT:
				return createAnliegenbeistandschaftObjectFromString(eDataType, initialValue);
			case BeistandschaftPackage.BEZUGOEFFENTLICHERLEISTUNGEN_OBJECT:
				return createBezugoeffentlicherleistungenObjectFromString(eDataType, initialValue);
			case BeistandschaftPackage.EINKOMMENANDERERELTERNTEIL_OBJECT:
				return createEinkommenandererelternteilObjectFromString(eDataType, initialValue);
			case BeistandschaftPackage.INHABERELTERLICHESORGE_OBJECT:
				return createInhaberelterlichesorgeObjectFromString(eDataType, initialValue);
			case BeistandschaftPackage.UNTERHALTSTITELBESTEHT_OBJECT:
				return createUnterhaltstitelbestehtObjectFromString(eDataType, initialValue);
			case BeistandschaftPackage.ZAHLUNGSARTBSS_OBJECT:
				return createZahlungsartbssObjectFromString(eDataType, initialValue);
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
			case BeistandschaftPackage.ANLIEGENBEISTANDSCHAFT:
				return convertAnliegenbeistandschaftToString(eDataType, instanceValue);
			case BeistandschaftPackage.BEZUGOEFFENTLICHERLEISTUNGEN:
				return convertBezugoeffentlicherleistungenToString(eDataType, instanceValue);
			case BeistandschaftPackage.EINKOMMENANDERERELTERNTEIL:
				return convertEinkommenandererelternteilToString(eDataType, instanceValue);
			case BeistandschaftPackage.INHABERELTERLICHESORGE:
				return convertInhaberelterlichesorgeToString(eDataType, instanceValue);
			case BeistandschaftPackage.UNTERHALTSTITELBESTEHT:
				return convertUnterhaltstitelbestehtToString(eDataType, instanceValue);
			case BeistandschaftPackage.ZAHLUNGSARTBSS:
				return convertZahlungsartbssToString(eDataType, instanceValue);
			case BeistandschaftPackage.ANLIEGENBEISTANDSCHAFT_OBJECT:
				return convertAnliegenbeistandschaftObjectToString(eDataType, instanceValue);
			case BeistandschaftPackage.BEZUGOEFFENTLICHERLEISTUNGEN_OBJECT:
				return convertBezugoeffentlicherleistungenObjectToString(eDataType, instanceValue);
			case BeistandschaftPackage.EINKOMMENANDERERELTERNTEIL_OBJECT:
				return convertEinkommenandererelternteilObjectToString(eDataType, instanceValue);
			case BeistandschaftPackage.INHABERELTERLICHESORGE_OBJECT:
				return convertInhaberelterlichesorgeObjectToString(eDataType, instanceValue);
			case BeistandschaftPackage.UNTERHALTSTITELBESTEHT_OBJECT:
				return convertUnterhaltstitelbestehtObjectToString(eDataType, instanceValue);
			case BeistandschaftPackage.ZAHLUNGSARTBSS_OBJECT:
				return convertZahlungsartbssObjectToString(eDataType, instanceValue);
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
	public AngabenZumKindBeendigungType createAngabenZumKindBeendigungType() {
		AngabenZumKindBeendigungTypeImpl angabenZumKindBeendigungType = new AngabenZumKindBeendigungTypeImpl();
		return angabenZumKindBeendigungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumKindType createAngabenZumKindType() {
		AngabenZumKindTypeImpl angabenZumKindType = new AngabenZumKindTypeImpl();
		return angabenZumKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumUnterhaltType createAngabenZumUnterhaltType() {
		AngabenZumUnterhaltTypeImpl angabenZumUnterhaltType = new AngabenZumUnterhaltTypeImpl();
		return angabenZumUnterhaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegensklaerungBSSType createAnliegensklaerungBSSType() {
		AnliegensklaerungBSSTypeImpl anliegensklaerungBSSType = new AnliegensklaerungBSSTypeImpl();
		return anliegensklaerungBSSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilBeendigungType createAntragstellenderElternteilBeendigungType() {
		AntragstellenderElternteilBeendigungTypeImpl antragstellenderElternteilBeendigungType = new AntragstellenderElternteilBeendigungTypeImpl();
		return antragstellenderElternteilBeendigungType;
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
	public AusbildungUndEinkuenfteType createAusbildungUndEinkuenfteType() {
		AusbildungUndEinkuenfteTypeImpl ausbildungUndEinkuenfteType = new AusbildungUndEinkuenfteTypeImpl();
		return ausbildungUndEinkuenfteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeistandschaftAntrag0601Type createBeistandschaftAntrag0601Type() {
		BeistandschaftAntrag0601TypeImpl beistandschaftAntrag0601Type = new BeistandschaftAntrag0601TypeImpl();
		return beistandschaftAntrag0601Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeistandschaftBeendigung0604Type createBeistandschaftBeendigung0604Type() {
		BeistandschaftBeendigung0604TypeImpl beistandschaftBeendigung0604Type = new BeistandschaftBeendigung0604TypeImpl();
		return beistandschaftBeendigung0604Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAnliegenBeistandschaftType createCodeAnliegenBeistandschaftType() {
		CodeAnliegenBeistandschaftTypeImpl codeAnliegenBeistandschaftType = new CodeAnliegenBeistandschaftTypeImpl();
		return codeAnliegenBeistandschaftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBezugOeffentlicherLeistungenType createCodeBezugOeffentlicherLeistungenType() {
		CodeBezugOeffentlicherLeistungenTypeImpl codeBezugOeffentlicherLeistungenType = new CodeBezugOeffentlicherLeistungenTypeImpl();
		return codeBezugOeffentlicherLeistungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEinkommenAndererElternteilType createCodeEinkommenAndererElternteilType() {
		CodeEinkommenAndererElternteilTypeImpl codeEinkommenAndererElternteilType = new CodeEinkommenAndererElternteilTypeImpl();
		return codeEinkommenAndererElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeInhaberElterlicheSorgeType createCodeInhaberElterlicheSorgeType() {
		CodeInhaberElterlicheSorgeTypeImpl codeInhaberElterlicheSorgeType = new CodeInhaberElterlicheSorgeTypeImpl();
		return codeInhaberElterlicheSorgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeUnterhaltstitelBestehtType createCodeUnterhaltstitelBestehtType() {
		CodeUnterhaltstitelBestehtTypeImpl codeUnterhaltstitelBestehtType = new CodeUnterhaltstitelBestehtTypeImpl();
		return codeUnterhaltstitelBestehtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeZahlungsartBSSType createCodeZahlungsartBSSType() {
		CodeZahlungsartBSSTypeImpl codeZahlungsartBSSType = new CodeZahlungsartBSSTypeImpl();
		return codeZahlungsartBSSType;
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
	public NachweiseBSSType createNachweiseBSSType() {
		NachweiseBSSTypeImpl nachweiseBSSType = new NachweiseBSSTypeImpl();
		return nachweiseBSSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType createNachweisType() {
		NachweisTypeImpl nachweisType = new NachweisTypeImpl();
		return nachweisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeitereAngabenZumAnderenElternteilType createWeitereAngabenZumAnderenElternteilType() {
		WeitereAngabenZumAnderenElternteilTypeImpl weitereAngabenZumAnderenElternteilType = new WeitereAngabenZumAnderenElternteilTypeImpl();
		return weitereAngabenZumAnderenElternteilType;
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
	public Anliegenbeistandschaft createAnliegenbeistandschaftFromString(EDataType eDataType, String initialValue) {
		Anliegenbeistandschaft result = Anliegenbeistandschaft.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnliegenbeistandschaftToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bezugoeffentlicherleistungen createBezugoeffentlicherleistungenFromString(EDataType eDataType, String initialValue) {
		Bezugoeffentlicherleistungen result = Bezugoeffentlicherleistungen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezugoeffentlicherleistungenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkommenandererelternteil createEinkommenandererelternteilFromString(EDataType eDataType, String initialValue) {
		Einkommenandererelternteil result = Einkommenandererelternteil.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkommenandererelternteilToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhaberelterlichesorge createInhaberelterlichesorgeFromString(EDataType eDataType, String initialValue) {
		Inhaberelterlichesorge result = Inhaberelterlichesorge.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInhaberelterlichesorgeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterhaltstitelbesteht createUnterhaltstitelbestehtFromString(EDataType eDataType, String initialValue) {
		Unterhaltstitelbesteht result = Unterhaltstitelbesteht.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnterhaltstitelbestehtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zahlungsartbss createZahlungsartbssFromString(EDataType eDataType, String initialValue) {
		Zahlungsartbss result = Zahlungsartbss.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZahlungsartbssToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anliegenbeistandschaft createAnliegenbeistandschaftObjectFromString(EDataType eDataType, String initialValue) {
		return createAnliegenbeistandschaftFromString(BeistandschaftPackage.Literals.ANLIEGENBEISTANDSCHAFT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnliegenbeistandschaftObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnliegenbeistandschaftToString(BeistandschaftPackage.Literals.ANLIEGENBEISTANDSCHAFT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bezugoeffentlicherleistungen createBezugoeffentlicherleistungenObjectFromString(EDataType eDataType, String initialValue) {
		return createBezugoeffentlicherleistungenFromString(BeistandschaftPackage.Literals.BEZUGOEFFENTLICHERLEISTUNGEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezugoeffentlicherleistungenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBezugoeffentlicherleistungenToString(BeistandschaftPackage.Literals.BEZUGOEFFENTLICHERLEISTUNGEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Einkommenandererelternteil createEinkommenandererelternteilObjectFromString(EDataType eDataType, String initialValue) {
		return createEinkommenandererelternteilFromString(BeistandschaftPackage.Literals.EINKOMMENANDERERELTERNTEIL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinkommenandererelternteilObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEinkommenandererelternteilToString(BeistandschaftPackage.Literals.EINKOMMENANDERERELTERNTEIL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhaberelterlichesorge createInhaberelterlichesorgeObjectFromString(EDataType eDataType, String initialValue) {
		return createInhaberelterlichesorgeFromString(BeistandschaftPackage.Literals.INHABERELTERLICHESORGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInhaberelterlichesorgeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInhaberelterlichesorgeToString(BeistandschaftPackage.Literals.INHABERELTERLICHESORGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterhaltstitelbesteht createUnterhaltstitelbestehtObjectFromString(EDataType eDataType, String initialValue) {
		return createUnterhaltstitelbestehtFromString(BeistandschaftPackage.Literals.UNTERHALTSTITELBESTEHT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnterhaltstitelbestehtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnterhaltstitelbestehtToString(BeistandschaftPackage.Literals.UNTERHALTSTITELBESTEHT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zahlungsartbss createZahlungsartbssObjectFromString(EDataType eDataType, String initialValue) {
		return createZahlungsartbssFromString(BeistandschaftPackage.Literals.ZAHLUNGSARTBSS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZahlungsartbssObjectToString(EDataType eDataType, Object instanceValue) {
		return convertZahlungsartbssToString(BeistandschaftPackage.Literals.ZAHLUNGSARTBSS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeistandschaftPackage getBeistandschaftPackage() {
		return (BeistandschaftPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BeistandschaftPackage getPackage() {
		return BeistandschaftPackage.eINSTANCE;
	}

} //BeistandschaftFactoryImpl
