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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.*;

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
public class MutterschaftsgeldFactoryImpl extends EFactoryImpl implements MutterschaftsgeldFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MutterschaftsgeldFactory init() {
		try {
			MutterschaftsgeldFactory theMutterschaftsgeldFactory = (MutterschaftsgeldFactory)EPackage.Registry.INSTANCE.getEFactory(MutterschaftsgeldPackage.eNS_URI);
			if (theMutterschaftsgeldFactory != null) {
				return theMutterschaftsgeldFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MutterschaftsgeldFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutterschaftsgeldFactoryImpl() {
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
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE: return createAngabenEntbindungType();
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE: return createAngabenMutterschaftsgeldType();
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE: return createAntragstellenderElternteilMutterschaftsgeldmeldungRueckType();
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE: return createAntragstellenderElternteilMutterschaftsgeldmeldungType();
			case MutterschaftsgeldPackage.CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE: return createCodeKennzeichenMutterschaftsgeldType();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE: return createMutterschaftsgeldmeldungAnforderung0501Type();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE: return createMutterschaftsgeldmeldungRueckmeldung0502Type();
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE: return createStornierungType();
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE1: return createStornierungType1();
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
			case MutterschaftsgeldPackage.KENNZEICHENMUTTERSCHAFTSGELD:
				return createKennzeichenmutterschaftsgeldFromString(eDataType, initialValue);
			case MutterschaftsgeldPackage.KENNZEICHENMUTTERSCHAFTSGELD_OBJECT:
				return createKennzeichenmutterschaftsgeldObjectFromString(eDataType, initialValue);
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
			case MutterschaftsgeldPackage.KENNZEICHENMUTTERSCHAFTSGELD:
				return convertKennzeichenmutterschaftsgeldToString(eDataType, instanceValue);
			case MutterschaftsgeldPackage.KENNZEICHENMUTTERSCHAFTSGELD_OBJECT:
				return convertKennzeichenmutterschaftsgeldObjectToString(eDataType, instanceValue);
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
	public AngabenEntbindungType createAngabenEntbindungType() {
		AngabenEntbindungTypeImpl angabenEntbindungType = new AngabenEntbindungTypeImpl();
		return angabenEntbindungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenMutterschaftsgeldType createAngabenMutterschaftsgeldType() {
		AngabenMutterschaftsgeldTypeImpl angabenMutterschaftsgeldType = new AngabenMutterschaftsgeldTypeImpl();
		return angabenMutterschaftsgeldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilMutterschaftsgeldmeldungRueckType createAntragstellenderElternteilMutterschaftsgeldmeldungRueckType() {
		AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl antragstellenderElternteilMutterschaftsgeldmeldungRueckType = new AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl();
		return antragstellenderElternteilMutterschaftsgeldmeldungRueckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilMutterschaftsgeldmeldungType createAntragstellenderElternteilMutterschaftsgeldmeldungType() {
		AntragstellenderElternteilMutterschaftsgeldmeldungTypeImpl antragstellenderElternteilMutterschaftsgeldmeldungType = new AntragstellenderElternteilMutterschaftsgeldmeldungTypeImpl();
		return antragstellenderElternteilMutterschaftsgeldmeldungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKennzeichenMutterschaftsgeldType createCodeKennzeichenMutterschaftsgeldType() {
		CodeKennzeichenMutterschaftsgeldTypeImpl codeKennzeichenMutterschaftsgeldType = new CodeKennzeichenMutterschaftsgeldTypeImpl();
		return codeKennzeichenMutterschaftsgeldType;
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
	public MutterschaftsgeldmeldungAnforderung0501Type createMutterschaftsgeldmeldungAnforderung0501Type() {
		MutterschaftsgeldmeldungAnforderung0501TypeImpl mutterschaftsgeldmeldungAnforderung0501Type = new MutterschaftsgeldmeldungAnforderung0501TypeImpl();
		return mutterschaftsgeldmeldungAnforderung0501Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutterschaftsgeldmeldungRueckmeldung0502Type createMutterschaftsgeldmeldungRueckmeldung0502Type() {
		MutterschaftsgeldmeldungRueckmeldung0502TypeImpl mutterschaftsgeldmeldungRueckmeldung0502Type = new MutterschaftsgeldmeldungRueckmeldung0502TypeImpl();
		return mutterschaftsgeldmeldungRueckmeldung0502Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StornierungType createStornierungType() {
		StornierungTypeImpl stornierungType = new StornierungTypeImpl();
		return stornierungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StornierungType1 createStornierungType1() {
		StornierungType1Impl stornierungType1 = new StornierungType1Impl();
		return stornierungType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kennzeichenmutterschaftsgeld createKennzeichenmutterschaftsgeldFromString(EDataType eDataType, String initialValue) {
		Kennzeichenmutterschaftsgeld result = Kennzeichenmutterschaftsgeld.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKennzeichenmutterschaftsgeldToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kennzeichenmutterschaftsgeld createKennzeichenmutterschaftsgeldObjectFromString(EDataType eDataType, String initialValue) {
		return createKennzeichenmutterschaftsgeldFromString(MutterschaftsgeldPackage.Literals.KENNZEICHENMUTTERSCHAFTSGELD, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKennzeichenmutterschaftsgeldObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKennzeichenmutterschaftsgeldToString(MutterschaftsgeldPackage.Literals.KENNZEICHENMUTTERSCHAFTSGELD, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutterschaftsgeldPackage getMutterschaftsgeldPackage() {
		return (MutterschaftsgeldPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MutterschaftsgeldPackage getPackage() {
		return MutterschaftsgeldPackage.eINSTANCE;
	}

} //MutterschaftsgeldFactoryImpl
