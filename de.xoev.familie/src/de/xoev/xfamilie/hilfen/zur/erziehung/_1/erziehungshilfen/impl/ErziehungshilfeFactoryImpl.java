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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.*;

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
public class ErziehungshilfeFactoryImpl extends EFactoryImpl implements ErziehungshilfeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErziehungshilfeFactory init() {
		try {
			ErziehungshilfeFactory theErziehungshilfeFactory = (ErziehungshilfeFactory)EPackage.Registry.INSTANCE.getEFactory(ErziehungshilfePackage.eNS_URI);
			if (theErziehungshilfeFactory != null) {
				return theErziehungshilfeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErziehungshilfeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErziehungshilfeFactoryImpl() {
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
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE: return createAngabenElternteilEingliederungType();
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_HJV_TYPE: return createAngabenElternteilHJVType();
			case ErziehungshilfePackage.ANGABEN_ET_TYPE: return createAngabenETType();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE: return createAngabenKindEingliederungType();
			case ErziehungshilfePackage.ANGABEN_KIND_HJV_TYPE: return createAngabenKindHJVType();
			case ErziehungshilfePackage.ANGABEN_KIND_HZE_TYPE: return createAngabenKindHZEType();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE: return createAngabenZuJugendlichHZEType();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE: return createAngabenZuJugendlichKontaktformularType();
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE: return createAnliegensklaerungAnfrageType();
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_TYPE: return createAnliegensklaerungType();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE: return createAntragstellenderETType();
			case ErziehungshilfePackage.AUSWAHL_BESCHEIDART_TYPE: return createAuswahlBescheidartType();
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE: return createBegruendungDesHilfebedarfsType();
			case ErziehungshilfePackage.CODE_AUFENTHALT_TYPE: return createCodeAufenthaltType();
			case ErziehungshilfePackage.CODE_AUSWAHL_DER_HILFE_HZ_ETYPE: return createCodeAuswahlDerHilfeHzEType();
			case ErziehungshilfePackage.CODE_HZE_ICH_BIN_TYPE: return createCodeHZEIchBinType();
			case ErziehungshilfePackage.CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE: return createCodeVerhaeltnisJugendlichHZEType();
			case ErziehungshilfePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ErziehungshilfePackage.ERREICHBARKEIT_HZE_TYPE: return createErreichbarkeitHZEType();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE: return createHilfenZurErziehungAnfrageHJV0702Type();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE: return createHilfenZurErziehungAntrag0701Type();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE: return createHilfenZurErziehungEingliederungshilfe0703Type();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE: return createHilfenZurErziehungNachweisnachricht0711Type();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE: return createHilfenZurErziehungWiderspruch0704Type();
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE: return createNachweiseDatenschutzType();
			case ErziehungshilfePackage.NACHWEISE_HZE_TYPE: return createNachweiseHZEType();
			case ErziehungshilfePackage.NACHWEIS_TYPE: return createNachweisType();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE: return createPersoenlicheAngabenEingliederungType();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE: return createPersoenlicheAngabenHJVType();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HZE_TYPE: return createPersoenlicheAngabenHZEType();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE: return createPersoenlicheAngabenKontaktformularType();
			case ErziehungshilfePackage.PERSON_IDENTIFIKATION_TYPE: return createPersonIdentifikationType();
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
			case ErziehungshilfePackage.AUFENTHALTSORT:
				return createAufenthaltsortFromString(eDataType, initialValue);
			case ErziehungshilfePackage.AUSWAHL_BESCHEIDART_HZE:
				return createAuswahlBescheidartHZEFromString(eDataType, initialValue);
			case ErziehungshilfePackage.AUSWAHLDERHILFEHZE:
				return createAuswahlderhilfehzeFromString(eDataType, initialValue);
			case ErziehungshilfePackage.VERHAELTNISJUGENDLICHHZE:
				return createVerhaeltnisjugendlichhzeFromString(eDataType, initialValue);
			case ErziehungshilfePackage.AUFENTHALTSORT_OBJECT:
				return createAufenthaltsortObjectFromString(eDataType, initialValue);
			case ErziehungshilfePackage.AUSWAHL_BESCHEIDART_HZE_OBJECT:
				return createAuswahlBescheidartHZEObjectFromString(eDataType, initialValue);
			case ErziehungshilfePackage.AUSWAHLDERHILFEHZE_OBJECT:
				return createAuswahlderhilfehzeObjectFromString(eDataType, initialValue);
			case ErziehungshilfePackage.VERHAELTNISJUGENDLICHHZE_OBJECT:
				return createVerhaeltnisjugendlichhzeObjectFromString(eDataType, initialValue);
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
			case ErziehungshilfePackage.AUFENTHALTSORT:
				return convertAufenthaltsortToString(eDataType, instanceValue);
			case ErziehungshilfePackage.AUSWAHL_BESCHEIDART_HZE:
				return convertAuswahlBescheidartHZEToString(eDataType, instanceValue);
			case ErziehungshilfePackage.AUSWAHLDERHILFEHZE:
				return convertAuswahlderhilfehzeToString(eDataType, instanceValue);
			case ErziehungshilfePackage.VERHAELTNISJUGENDLICHHZE:
				return convertVerhaeltnisjugendlichhzeToString(eDataType, instanceValue);
			case ErziehungshilfePackage.AUFENTHALTSORT_OBJECT:
				return convertAufenthaltsortObjectToString(eDataType, instanceValue);
			case ErziehungshilfePackage.AUSWAHL_BESCHEIDART_HZE_OBJECT:
				return convertAuswahlBescheidartHZEObjectToString(eDataType, instanceValue);
			case ErziehungshilfePackage.AUSWAHLDERHILFEHZE_OBJECT:
				return convertAuswahlderhilfehzeObjectToString(eDataType, instanceValue);
			case ErziehungshilfePackage.VERHAELTNISJUGENDLICHHZE_OBJECT:
				return convertVerhaeltnisjugendlichhzeObjectToString(eDataType, instanceValue);
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
	public AngabenElternteilEingliederungType createAngabenElternteilEingliederungType() {
		AngabenElternteilEingliederungTypeImpl angabenElternteilEingliederungType = new AngabenElternteilEingliederungTypeImpl();
		return angabenElternteilEingliederungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenElternteilHJVType createAngabenElternteilHJVType() {
		AngabenElternteilHJVTypeImpl angabenElternteilHJVType = new AngabenElternteilHJVTypeImpl();
		return angabenElternteilHJVType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenETType createAngabenETType() {
		AngabenETTypeImpl angabenETType = new AngabenETTypeImpl();
		return angabenETType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindEingliederungType createAngabenKindEingliederungType() {
		AngabenKindEingliederungTypeImpl angabenKindEingliederungType = new AngabenKindEingliederungTypeImpl();
		return angabenKindEingliederungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindHJVType createAngabenKindHJVType() {
		AngabenKindHJVTypeImpl angabenKindHJVType = new AngabenKindHJVTypeImpl();
		return angabenKindHJVType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindHZEType createAngabenKindHZEType() {
		AngabenKindHZETypeImpl angabenKindHZEType = new AngabenKindHZETypeImpl();
		return angabenKindHZEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZuJugendlichHZEType createAngabenZuJugendlichHZEType() {
		AngabenZuJugendlichHZETypeImpl angabenZuJugendlichHZEType = new AngabenZuJugendlichHZETypeImpl();
		return angabenZuJugendlichHZEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZuJugendlichKontaktformularType createAngabenZuJugendlichKontaktformularType() {
		AngabenZuJugendlichKontaktformularTypeImpl angabenZuJugendlichKontaktformularType = new AngabenZuJugendlichKontaktformularTypeImpl();
		return angabenZuJugendlichKontaktformularType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegensklaerungAnfrageType createAnliegensklaerungAnfrageType() {
		AnliegensklaerungAnfrageTypeImpl anliegensklaerungAnfrageType = new AnliegensklaerungAnfrageTypeImpl();
		return anliegensklaerungAnfrageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegensklaerungType createAnliegensklaerungType() {
		AnliegensklaerungTypeImpl anliegensklaerungType = new AnliegensklaerungTypeImpl();
		return anliegensklaerungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderETType createAntragstellenderETType() {
		AntragstellenderETTypeImpl antragstellenderETType = new AntragstellenderETTypeImpl();
		return antragstellenderETType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuswahlBescheidartType createAuswahlBescheidartType() {
		AuswahlBescheidartTypeImpl auswahlBescheidartType = new AuswahlBescheidartTypeImpl();
		return auswahlBescheidartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BegruendungDesHilfebedarfsType createBegruendungDesHilfebedarfsType() {
		BegruendungDesHilfebedarfsTypeImpl begruendungDesHilfebedarfsType = new BegruendungDesHilfebedarfsTypeImpl();
		return begruendungDesHilfebedarfsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAufenthaltType createCodeAufenthaltType() {
		CodeAufenthaltTypeImpl codeAufenthaltType = new CodeAufenthaltTypeImpl();
		return codeAufenthaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAuswahlDerHilfeHzEType createCodeAuswahlDerHilfeHzEType() {
		CodeAuswahlDerHilfeHzETypeImpl codeAuswahlDerHilfeHzEType = new CodeAuswahlDerHilfeHzETypeImpl();
		return codeAuswahlDerHilfeHzEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeHZEIchBinType createCodeHZEIchBinType() {
		CodeHZEIchBinTypeImpl codeHZEIchBinType = new CodeHZEIchBinTypeImpl();
		return codeHZEIchBinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVerhaeltnisJugendlichHZEType createCodeVerhaeltnisJugendlichHZEType() {
		CodeVerhaeltnisJugendlichHZETypeImpl codeVerhaeltnisJugendlichHZEType = new CodeVerhaeltnisJugendlichHZETypeImpl();
		return codeVerhaeltnisJugendlichHZEType;
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
	public ErreichbarkeitHZEType createErreichbarkeitHZEType() {
		ErreichbarkeitHZETypeImpl erreichbarkeitHZEType = new ErreichbarkeitHZETypeImpl();
		return erreichbarkeitHZEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungAnfrageHJV0702Type createHilfenZurErziehungAnfrageHJV0702Type() {
		HilfenZurErziehungAnfrageHJV0702TypeImpl hilfenZurErziehungAnfrageHJV0702Type = new HilfenZurErziehungAnfrageHJV0702TypeImpl();
		return hilfenZurErziehungAnfrageHJV0702Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungAntrag0701Type createHilfenZurErziehungAntrag0701Type() {
		HilfenZurErziehungAntrag0701TypeImpl hilfenZurErziehungAntrag0701Type = new HilfenZurErziehungAntrag0701TypeImpl();
		return hilfenZurErziehungAntrag0701Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungEingliederungshilfe0703Type createHilfenZurErziehungEingliederungshilfe0703Type() {
		HilfenZurErziehungEingliederungshilfe0703TypeImpl hilfenZurErziehungEingliederungshilfe0703Type = new HilfenZurErziehungEingliederungshilfe0703TypeImpl();
		return hilfenZurErziehungEingliederungshilfe0703Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungNachweisnachricht0711Type createHilfenZurErziehungNachweisnachricht0711Type() {
		HilfenZurErziehungNachweisnachricht0711TypeImpl hilfenZurErziehungNachweisnachricht0711Type = new HilfenZurErziehungNachweisnachricht0711TypeImpl();
		return hilfenZurErziehungNachweisnachricht0711Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungWiderspruch0704Type createHilfenZurErziehungWiderspruch0704Type() {
		HilfenZurErziehungWiderspruch0704TypeImpl hilfenZurErziehungWiderspruch0704Type = new HilfenZurErziehungWiderspruch0704TypeImpl();
		return hilfenZurErziehungWiderspruch0704Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseDatenschutzType createNachweiseDatenschutzType() {
		NachweiseDatenschutzTypeImpl nachweiseDatenschutzType = new NachweiseDatenschutzTypeImpl();
		return nachweiseDatenschutzType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseHZEType createNachweiseHZEType() {
		NachweiseHZETypeImpl nachweiseHZEType = new NachweiseHZETypeImpl();
		return nachweiseHZEType;
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
	public PersoenlicheAngabenEingliederungType createPersoenlicheAngabenEingliederungType() {
		PersoenlicheAngabenEingliederungTypeImpl persoenlicheAngabenEingliederungType = new PersoenlicheAngabenEingliederungTypeImpl();
		return persoenlicheAngabenEingliederungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenHJVType createPersoenlicheAngabenHJVType() {
		PersoenlicheAngabenHJVTypeImpl persoenlicheAngabenHJVType = new PersoenlicheAngabenHJVTypeImpl();
		return persoenlicheAngabenHJVType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenHZEType createPersoenlicheAngabenHZEType() {
		PersoenlicheAngabenHZETypeImpl persoenlicheAngabenHZEType = new PersoenlicheAngabenHZETypeImpl();
		return persoenlicheAngabenHZEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenKontaktformularType createPersoenlicheAngabenKontaktformularType() {
		PersoenlicheAngabenKontaktformularTypeImpl persoenlicheAngabenKontaktformularType = new PersoenlicheAngabenKontaktformularTypeImpl();
		return persoenlicheAngabenKontaktformularType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonIdentifikationType createPersonIdentifikationType() {
		PersonIdentifikationTypeImpl personIdentifikationType = new PersonIdentifikationTypeImpl();
		return personIdentifikationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aufenthaltsort createAufenthaltsortFromString(EDataType eDataType, String initialValue) {
		Aufenthaltsort result = Aufenthaltsort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAufenthaltsortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuswahlBescheidartHZE createAuswahlBescheidartHZEFromString(EDataType eDataType, String initialValue) {
		AuswahlBescheidartHZE result = AuswahlBescheidartHZE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuswahlBescheidartHZEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auswahlderhilfehze createAuswahlderhilfehzeFromString(EDataType eDataType, String initialValue) {
		Auswahlderhilfehze result = Auswahlderhilfehze.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuswahlderhilfehzeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verhaeltnisjugendlichhze createVerhaeltnisjugendlichhzeFromString(EDataType eDataType, String initialValue) {
		Verhaeltnisjugendlichhze result = Verhaeltnisjugendlichhze.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerhaeltnisjugendlichhzeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aufenthaltsort createAufenthaltsortObjectFromString(EDataType eDataType, String initialValue) {
		return createAufenthaltsortFromString(ErziehungshilfePackage.Literals.AUFENTHALTSORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAufenthaltsortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAufenthaltsortToString(ErziehungshilfePackage.Literals.AUFENTHALTSORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuswahlBescheidartHZE createAuswahlBescheidartHZEObjectFromString(EDataType eDataType, String initialValue) {
		return createAuswahlBescheidartHZEFromString(ErziehungshilfePackage.Literals.AUSWAHL_BESCHEIDART_HZE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuswahlBescheidartHZEObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuswahlBescheidartHZEToString(ErziehungshilfePackage.Literals.AUSWAHL_BESCHEIDART_HZE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auswahlderhilfehze createAuswahlderhilfehzeObjectFromString(EDataType eDataType, String initialValue) {
		return createAuswahlderhilfehzeFromString(ErziehungshilfePackage.Literals.AUSWAHLDERHILFEHZE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuswahlderhilfehzeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuswahlderhilfehzeToString(ErziehungshilfePackage.Literals.AUSWAHLDERHILFEHZE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verhaeltnisjugendlichhze createVerhaeltnisjugendlichhzeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerhaeltnisjugendlichhzeFromString(ErziehungshilfePackage.Literals.VERHAELTNISJUGENDLICHHZE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerhaeltnisjugendlichhzeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerhaeltnisjugendlichhzeToString(ErziehungshilfePackage.Literals.VERHAELTNISJUGENDLICHHZE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErziehungshilfePackage getErziehungshilfePackage() {
		return (ErziehungshilfePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErziehungshilfePackage getPackage() {
		return ErziehungshilfePackage.eINSTANCE;
	}

} //ErziehungshilfeFactoryImpl
