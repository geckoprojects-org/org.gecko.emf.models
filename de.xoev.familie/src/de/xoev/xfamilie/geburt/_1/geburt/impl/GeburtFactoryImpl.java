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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.geburt._1.geburt.*;

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
public class GeburtFactoryImpl extends EFactoryImpl implements GeburtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeburtFactory init() {
		try {
			GeburtFactory theGeburtFactory = (GeburtFactory)EPackage.Registry.INSTANCE.getEFactory(GeburtPackage.eNS_URI);
			if (theGeburtFactory != null) {
				return theGeburtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeburtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeburtFactoryImpl() {
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
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE: return createAngabenGesetzlicherVertreterElternteilType();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL1_TYPE: return createAngabenZumElternteil1Type();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE: return createAngabenZumElternteil2Type();
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE: return createAngabenZumKindType();
			case GeburtPackage.CODE_ALLEINSORGE_EINTRAGUNG_TYPE: return createCodeAlleinsorgeEintragungType();
			case GeburtPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE: return createEintragungNachweisregisterType();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE: return createNachgeburtlicheAngabenZumKindType();
			case GeburtPackage.SORGE_ALLEINSORGE_ANTRAG0801_TYPE: return createSorgeAlleinsorgeAntrag0801Type();
			case GeburtPackage.SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE: return createSorgeAlleinsorgeAuskunft0803Type();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE: return createSorgeErklaerungVorbeitung0802Type();
			case GeburtPackage.SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE: return createSorgeNachweisregisterEintragung0804Type();
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE: return createSorgeNachweisregisterKorrektur0805Type();
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE: return createSorgeNachweisregisterLoeschung0806Type();
			case GeburtPackage.ZUSATZANGABEN_TYPE: return createZusatzangabenType();
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
			case GeburtPackage.ALLEINSORGE_EINTRAGUNG:
				return createAlleinsorgeEintragungFromString(eDataType, initialValue);
			case GeburtPackage.ALLEINSORGE_EINTRAGUNG_OBJECT:
				return createAlleinsorgeEintragungObjectFromString(eDataType, initialValue);
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
			case GeburtPackage.ALLEINSORGE_EINTRAGUNG:
				return convertAlleinsorgeEintragungToString(eDataType, instanceValue);
			case GeburtPackage.ALLEINSORGE_EINTRAGUNG_OBJECT:
				return convertAlleinsorgeEintragungObjectToString(eDataType, instanceValue);
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
	public AngabenGesetzlicherVertreterElternteilType createAngabenGesetzlicherVertreterElternteilType() {
		AngabenGesetzlicherVertreterElternteilTypeImpl angabenGesetzlicherVertreterElternteilType = new AngabenGesetzlicherVertreterElternteilTypeImpl();
		return angabenGesetzlicherVertreterElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumElternteil1Type createAngabenZumElternteil1Type() {
		AngabenZumElternteil1TypeImpl angabenZumElternteil1Type = new AngabenZumElternteil1TypeImpl();
		return angabenZumElternteil1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumElternteil2Type createAngabenZumElternteil2Type() {
		AngabenZumElternteil2TypeImpl angabenZumElternteil2Type = new AngabenZumElternteil2TypeImpl();
		return angabenZumElternteil2Type;
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
	public CodeAlleinsorgeEintragungType createCodeAlleinsorgeEintragungType() {
		CodeAlleinsorgeEintragungTypeImpl codeAlleinsorgeEintragungType = new CodeAlleinsorgeEintragungTypeImpl();
		return codeAlleinsorgeEintragungType;
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
	public EintragungNachweisregisterType createEintragungNachweisregisterType() {
		EintragungNachweisregisterTypeImpl eintragungNachweisregisterType = new EintragungNachweisregisterTypeImpl();
		return eintragungNachweisregisterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachgeburtlicheAngabenZumKindType createNachgeburtlicheAngabenZumKindType() {
		NachgeburtlicheAngabenZumKindTypeImpl nachgeburtlicheAngabenZumKindType = new NachgeburtlicheAngabenZumKindTypeImpl();
		return nachgeburtlicheAngabenZumKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeAlleinsorgeAntrag0801Type createSorgeAlleinsorgeAntrag0801Type() {
		SorgeAlleinsorgeAntrag0801TypeImpl sorgeAlleinsorgeAntrag0801Type = new SorgeAlleinsorgeAntrag0801TypeImpl();
		return sorgeAlleinsorgeAntrag0801Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeAlleinsorgeAuskunft0803Type createSorgeAlleinsorgeAuskunft0803Type() {
		SorgeAlleinsorgeAuskunft0803TypeImpl sorgeAlleinsorgeAuskunft0803Type = new SorgeAlleinsorgeAuskunft0803TypeImpl();
		return sorgeAlleinsorgeAuskunft0803Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeErklaerungVorbeitung0802Type createSorgeErklaerungVorbeitung0802Type() {
		SorgeErklaerungVorbeitung0802TypeImpl sorgeErklaerungVorbeitung0802Type = new SorgeErklaerungVorbeitung0802TypeImpl();
		return sorgeErklaerungVorbeitung0802Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeNachweisregisterEintragung0804Type createSorgeNachweisregisterEintragung0804Type() {
		SorgeNachweisregisterEintragung0804TypeImpl sorgeNachweisregisterEintragung0804Type = new SorgeNachweisregisterEintragung0804TypeImpl();
		return sorgeNachweisregisterEintragung0804Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeNachweisregisterKorrektur0805Type createSorgeNachweisregisterKorrektur0805Type() {
		SorgeNachweisregisterKorrektur0805TypeImpl sorgeNachweisregisterKorrektur0805Type = new SorgeNachweisregisterKorrektur0805TypeImpl();
		return sorgeNachweisregisterKorrektur0805Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeNachweisregisterLoeschung0806Type createSorgeNachweisregisterLoeschung0806Type() {
		SorgeNachweisregisterLoeschung0806TypeImpl sorgeNachweisregisterLoeschung0806Type = new SorgeNachweisregisterLoeschung0806TypeImpl();
		return sorgeNachweisregisterLoeschung0806Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZusatzangabenType createZusatzangabenType() {
		ZusatzangabenTypeImpl zusatzangabenType = new ZusatzangabenTypeImpl();
		return zusatzangabenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlleinsorgeEintragung createAlleinsorgeEintragungFromString(EDataType eDataType, String initialValue) {
		AlleinsorgeEintragung result = AlleinsorgeEintragung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlleinsorgeEintragungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlleinsorgeEintragung createAlleinsorgeEintragungObjectFromString(EDataType eDataType, String initialValue) {
		return createAlleinsorgeEintragungFromString(GeburtPackage.Literals.ALLEINSORGE_EINTRAGUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlleinsorgeEintragungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlleinsorgeEintragungToString(GeburtPackage.Literals.ALLEINSORGE_EINTRAGUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtPackage getGeburtPackage() {
		return (GeburtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeburtPackage getPackage() {
		return GeburtPackage.eINSTANCE;
	}

} //GeburtFactoryImpl
