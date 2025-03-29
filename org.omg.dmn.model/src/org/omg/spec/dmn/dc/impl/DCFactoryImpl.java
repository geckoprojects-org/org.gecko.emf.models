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
package org.omg.spec.dmn.dc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.dmn.dc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DCFactoryImpl extends EFactoryImpl implements DCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DCFactory init() {
		try {
			DCFactory theDCFactory = (DCFactory)EPackage.Registry.INSTANCE.getEFactory(DCPackage.eNS_URI);
			if (theDCFactory != null) {
				return theDCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCFactoryImpl() {
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
			case DCPackage.BOUNDS: return createBounds();
			case DCPackage.COLOR: return createColor();
			case DCPackage.DIMENSION: return createDimension();
			case DCPackage.DC_ROOT: return createDCRoot();
			case DCPackage.POINT: return createPoint();
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
			case DCPackage.ALIGNMENT_KIND:
				return createAlignmentKindFromString(eDataType, initialValue);
			case DCPackage.KNOWN_COLOR:
				return createKnownColorFromString(eDataType, initialValue);
			case DCPackage.ALIGNMENT_KIND_OBJECT:
				return createAlignmentKindObjectFromString(eDataType, initialValue);
			case DCPackage.KNOWN_COLOR_OBJECT:
				return createKnownColorObjectFromString(eDataType, initialValue);
			case DCPackage.RGB:
				return createRgbFromString(eDataType, initialValue);
			case DCPackage.RGB_OBJECT:
				return createRgbObjectFromString(eDataType, initialValue);
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
			case DCPackage.ALIGNMENT_KIND:
				return convertAlignmentKindToString(eDataType, instanceValue);
			case DCPackage.KNOWN_COLOR:
				return convertKnownColorToString(eDataType, instanceValue);
			case DCPackage.ALIGNMENT_KIND_OBJECT:
				return convertAlignmentKindObjectToString(eDataType, instanceValue);
			case DCPackage.KNOWN_COLOR_OBJECT:
				return convertKnownColorObjectToString(eDataType, instanceValue);
			case DCPackage.RGB:
				return convertRgbToString(eDataType, instanceValue);
			case DCPackage.RGB_OBJECT:
				return convertRgbObjectToString(eDataType, instanceValue);
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
	public Bounds createBounds() {
		BoundsImpl bounds = new BoundsImpl();
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCRoot createDCRoot() {
		DCRootImpl dcRoot = new DCRootImpl();
		return dcRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentKind createAlignmentKindFromString(EDataType eDataType, String initialValue) {
		AlignmentKind result = AlignmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnownColor createKnownColorFromString(EDataType eDataType, String initialValue) {
		KnownColor result = KnownColor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKnownColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentKind createAlignmentKindObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignmentKindFromString(DCPackage.Literals.ALIGNMENT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentKindToString(DCPackage.Literals.ALIGNMENT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnownColor createKnownColorObjectFromString(EDataType eDataType, String initialValue) {
		return createKnownColorFromString(DCPackage.Literals.KNOWN_COLOR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKnownColorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKnownColorToString(DCPackage.Literals.KNOWN_COLOR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createRgbFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRgbToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createRgbObjectFromString(EDataType eDataType, String initialValue) {
		return createRgbFromString(DCPackage.Literals.RGB, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRgbObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRgbToString(DCPackage.Literals.RGB, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCPackage getDCPackage() {
		return (DCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DCPackage getPackage() {
		return DCPackage.eINSTANCE;
	}

} //DCFactoryImpl
