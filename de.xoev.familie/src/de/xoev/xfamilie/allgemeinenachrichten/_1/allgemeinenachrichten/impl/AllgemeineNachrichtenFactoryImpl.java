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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.*;

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
public class AllgemeineNachrichtenFactoryImpl extends EFactoryImpl implements AllgemeineNachrichtenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllgemeineNachrichtenFactory init() {
		try {
			AllgemeineNachrichtenFactory theAllgemeineNachrichtenFactory = (AllgemeineNachrichtenFactory)EPackage.Registry.INSTANCE.getEFactory(AllgemeineNachrichtenPackage.eNS_URI);
			if (theAllgemeineNachrichtenFactory != null) {
				return theAllgemeineNachrichtenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AllgemeineNachrichtenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllgemeineNachrichtenFactoryImpl() {
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE: return createAllgemeinenachrichtenQuittung0011Type();
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE: return createAllgemeinenachrichtenRueckweisung0001Type();
			case AllgemeineNachrichtenPackage.CODE_RUECKWEISUNGSGRUND_TYPE: return createCodeRueckweisungsgrundType();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE: return createRueckweisendeStelleType();
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE: return createRueckweisungsgrundSpezifischType();
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE: return createRueckweisungsgrundType();
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE: return createTransportinformationenType();
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUENDE:
				return createRueckweisungsgruendeFromString(eDataType, initialValue);
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUENDE_OBJECT:
				return createRueckweisungsgruendeObjectFromString(eDataType, initialValue);
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUENDE:
				return convertRueckweisungsgruendeToString(eDataType, instanceValue);
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUENDE_OBJECT:
				return convertRueckweisungsgruendeObjectToString(eDataType, instanceValue);
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
	public AllgemeinenachrichtenQuittung0011Type createAllgemeinenachrichtenQuittung0011Type() {
		AllgemeinenachrichtenQuittung0011TypeImpl allgemeinenachrichtenQuittung0011Type = new AllgemeinenachrichtenQuittung0011TypeImpl();
		return allgemeinenachrichtenQuittung0011Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinenachrichtenRueckweisung0001Type createAllgemeinenachrichtenRueckweisung0001Type() {
		AllgemeinenachrichtenRueckweisung0001TypeImpl allgemeinenachrichtenRueckweisung0001Type = new AllgemeinenachrichtenRueckweisung0001TypeImpl();
		return allgemeinenachrichtenRueckweisung0001Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeRueckweisungsgrundType createCodeRueckweisungsgrundType() {
		CodeRueckweisungsgrundTypeImpl codeRueckweisungsgrundType = new CodeRueckweisungsgrundTypeImpl();
		return codeRueckweisungsgrundType;
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
	public RueckweisendeStelleType createRueckweisendeStelleType() {
		RueckweisendeStelleTypeImpl rueckweisendeStelleType = new RueckweisendeStelleTypeImpl();
		return rueckweisendeStelleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RueckweisungsgrundSpezifischType createRueckweisungsgrundSpezifischType() {
		RueckweisungsgrundSpezifischTypeImpl rueckweisungsgrundSpezifischType = new RueckweisungsgrundSpezifischTypeImpl();
		return rueckweisungsgrundSpezifischType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RueckweisungsgrundType createRueckweisungsgrundType() {
		RueckweisungsgrundTypeImpl rueckweisungsgrundType = new RueckweisungsgrundTypeImpl();
		return rueckweisungsgrundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportinformationenType createTransportinformationenType() {
		TransportinformationenTypeImpl transportinformationenType = new TransportinformationenTypeImpl();
		return transportinformationenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rueckweisungsgruende createRueckweisungsgruendeFromString(EDataType eDataType, String initialValue) {
		Rueckweisungsgruende result = Rueckweisungsgruende.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRueckweisungsgruendeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rueckweisungsgruende createRueckweisungsgruendeObjectFromString(EDataType eDataType, String initialValue) {
		return createRueckweisungsgruendeFromString(AllgemeineNachrichtenPackage.Literals.RUECKWEISUNGSGRUENDE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRueckweisungsgruendeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRueckweisungsgruendeToString(AllgemeineNachrichtenPackage.Literals.RUECKWEISUNGSGRUENDE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineNachrichtenPackage getAllgemeineNachrichtenPackage() {
		return (AllgemeineNachrichtenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AllgemeineNachrichtenPackage getPackage() {
		return AllgemeineNachrichtenPackage.eINSTANCE;
	}

} //AllgemeineNachrichtenFactoryImpl
