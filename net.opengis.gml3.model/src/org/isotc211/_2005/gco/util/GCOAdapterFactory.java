/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.isotc211._2005.gco.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.isotc211._2005.gco.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.isotc211._2005.gco.GCOPackage
 * @generated
 */
public class GCOAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GCOPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCOAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GCOPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCOSwitch<Adapter> modelSwitch =
		new GCOSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractObjectType(AbstractObjectType object) {
				return createAbstractObjectTypeAdapter();
			}
			@Override
			public Adapter caseAnglePropertyType(AnglePropertyType object) {
				return createAnglePropertyTypeAdapter();
			}
			@Override
			public Adapter caseBinaryPropertyType(BinaryPropertyType object) {
				return createBinaryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBinaryType(BinaryType object) {
				return createBinaryTypeAdapter();
			}
			@Override
			public Adapter caseBooleanPropertyType(BooleanPropertyType object) {
				return createBooleanPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCharacterStringPropertyType(CharacterStringPropertyType object) {
				return createCharacterStringPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCodeListValueType(CodeListValueType object) {
				return createCodeListValueTypeAdapter();
			}
			@Override
			public Adapter caseDatePropertyType(DatePropertyType object) {
				return createDatePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDateTimePropertyType(DateTimePropertyType object) {
				return createDateTimePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDecimalPropertyType(DecimalPropertyType object) {
				return createDecimalPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDistancePropertyType(DistancePropertyType object) {
				return createDistancePropertyTypeAdapter();
			}
			@Override
			public Adapter caseGenericNamePropertyType(GenericNamePropertyType object) {
				return createGenericNamePropertyTypeAdapter();
			}
			@Override
			public Adapter caseIntegerPropertyType(IntegerPropertyType object) {
				return createIntegerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLengthPropertyType(LengthPropertyType object) {
				return createLengthPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLocalNamePropertyType(LocalNamePropertyType object) {
				return createLocalNamePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiplicityPropertyType(MultiplicityPropertyType object) {
				return createMultiplicityPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiplicityRangePropertyType(MultiplicityRangePropertyType object) {
				return createMultiplicityRangePropertyTypeAdapter();
			}
			@Override
			public Adapter caseObjectReferencePropertyType(ObjectReferencePropertyType object) {
				return createObjectReferencePropertyTypeAdapter();
			}
			@Override
			public Adapter caseRealPropertyType(RealPropertyType object) {
				return createRealPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseMeasurePropertyType(MeasurePropertyType object) {
				return createMeasurePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMemberNamePropertyType(MemberNamePropertyType object) {
				return createMemberNamePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMemberNameType(MemberNameType object) {
				return createMemberNameTypeAdapter();
			}
			@Override
			public Adapter caseMultiplicityRangeType(MultiplicityRangeType object) {
				return createMultiplicityRangeTypeAdapter();
			}
			@Override
			public Adapter caseMultiplicityType(MultiplicityType object) {
				return createMultiplicityTypeAdapter();
			}
			@Override
			public Adapter caseNumberPropertyType(NumberPropertyType object) {
				return createNumberPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRecordPropertyType(RecordPropertyType object) {
				return createRecordPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRecordTypePropertyType(RecordTypePropertyType object) {
				return createRecordTypePropertyTypeAdapter();
			}
			@Override
			public Adapter caseRecordTypeType(RecordTypeType object) {
				return createRecordTypeTypeAdapter();
			}
			@Override
			public Adapter caseScalePropertyType(ScalePropertyType object) {
				return createScalePropertyTypeAdapter();
			}
			@Override
			public Adapter caseScopedNamePropertyType(ScopedNamePropertyType object) {
				return createScopedNamePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTypeNamePropertyType(TypeNamePropertyType object) {
				return createTypeNamePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTypeNameType(TypeNameType object) {
				return createTypeNameTypeAdapter();
			}
			@Override
			public Adapter caseUnitOfMeasurePropertyType(UnitOfMeasurePropertyType object) {
				return createUnitOfMeasurePropertyTypeAdapter();
			}
			@Override
			public Adapter caseUnlimitedIntegerPropertyType(UnlimitedIntegerPropertyType object) {
				return createUnlimitedIntegerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseUnlimitedIntegerType(UnlimitedIntegerType object) {
				return createUnlimitedIntegerTypeAdapter();
			}
			@Override
			public Adapter caseUomAnglePropertyType(UomAnglePropertyType object) {
				return createUomAnglePropertyTypeAdapter();
			}
			@Override
			public Adapter caseUomAreaPropertyType(UomAreaPropertyType object) {
				return createUomAreaPropertyTypeAdapter();
			}
			@Override
			public Adapter caseUomLengthPropertyType(UomLengthPropertyType object) {
				return createUomLengthPropertyTypeAdapter();
			}
			@Override
			public Adapter caseUomScalePropertyType(UomScalePropertyType object) {
				return createUomScalePropertyTypeAdapter();
			}
			@Override
			public Adapter caseUomTimePropertyType(UomTimePropertyType object) {
				return createUomTimePropertyTypeAdapter();
			}
			@Override
			public Adapter caseUomVelocityPropertyType(UomVelocityPropertyType object) {
				return createUomVelocityPropertyTypeAdapter();
			}
			@Override
			public Adapter caseUomVolumePropertyType(UomVolumePropertyType object) {
				return createUomVolumePropertyTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.AbstractObjectType <em>Abstract Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.AbstractObjectType
	 * @generated
	 */
	public Adapter createAbstractObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.AnglePropertyType <em>Angle Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.AnglePropertyType
	 * @generated
	 */
	public Adapter createAnglePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.BinaryPropertyType <em>Binary Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.BinaryPropertyType
	 * @generated
	 */
	public Adapter createBinaryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.BinaryType
	 * @generated
	 */
	public Adapter createBinaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.BooleanPropertyType <em>Boolean Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.BooleanPropertyType
	 * @generated
	 */
	public Adapter createBooleanPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.CharacterStringPropertyType <em>Character String Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.CharacterStringPropertyType
	 * @generated
	 */
	public Adapter createCharacterStringPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.CodeListValueType <em>Code List Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.CodeListValueType
	 * @generated
	 */
	public Adapter createCodeListValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.DatePropertyType <em>Date Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.DatePropertyType
	 * @generated
	 */
	public Adapter createDatePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.DateTimePropertyType <em>Date Time Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.DateTimePropertyType
	 * @generated
	 */
	public Adapter createDateTimePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.DecimalPropertyType <em>Decimal Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.DecimalPropertyType
	 * @generated
	 */
	public Adapter createDecimalPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.DistancePropertyType <em>Distance Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.DistancePropertyType
	 * @generated
	 */
	public Adapter createDistancePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.GenericNamePropertyType <em>Generic Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.GenericNamePropertyType
	 * @generated
	 */
	public Adapter createGenericNamePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.IntegerPropertyType <em>Integer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.IntegerPropertyType
	 * @generated
	 */
	public Adapter createIntegerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.LengthPropertyType <em>Length Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.LengthPropertyType
	 * @generated
	 */
	public Adapter createLengthPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.LocalNamePropertyType <em>Local Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.LocalNamePropertyType
	 * @generated
	 */
	public Adapter createLocalNamePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.MultiplicityPropertyType <em>Multiplicity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType
	 * @generated
	 */
	public Adapter createMultiplicityPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType <em>Multiplicity Range Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType
	 * @generated
	 */
	public Adapter createMultiplicityRangePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.ObjectReferencePropertyType <em>Object Reference Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType
	 * @generated
	 */
	public Adapter createObjectReferencePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.RealPropertyType <em>Real Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.RealPropertyType
	 * @generated
	 */
	public Adapter createRealPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.MeasurePropertyType <em>Measure Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.MeasurePropertyType
	 * @generated
	 */
	public Adapter createMeasurePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.MemberNamePropertyType <em>Member Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType
	 * @generated
	 */
	public Adapter createMemberNamePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.MemberNameType <em>Member Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.MemberNameType
	 * @generated
	 */
	public Adapter createMemberNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.MultiplicityRangeType <em>Multiplicity Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.MultiplicityRangeType
	 * @generated
	 */
	public Adapter createMultiplicityRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.MultiplicityType
	 * @generated
	 */
	public Adapter createMultiplicityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.NumberPropertyType <em>Number Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.NumberPropertyType
	 * @generated
	 */
	public Adapter createNumberPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.RecordPropertyType <em>Record Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.RecordPropertyType
	 * @generated
	 */
	public Adapter createRecordPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.RecordTypePropertyType <em>Record Type Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.RecordTypePropertyType
	 * @generated
	 */
	public Adapter createRecordTypePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.RecordTypeType <em>Record Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.RecordTypeType
	 * @generated
	 */
	public Adapter createRecordTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.ScalePropertyType <em>Scale Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.ScalePropertyType
	 * @generated
	 */
	public Adapter createScalePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.ScopedNamePropertyType <em>Scoped Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.ScopedNamePropertyType
	 * @generated
	 */
	public Adapter createScopedNamePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.TypeNamePropertyType <em>Type Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType
	 * @generated
	 */
	public Adapter createTypeNamePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.TypeNameType <em>Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.TypeNameType
	 * @generated
	 */
	public Adapter createTypeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType <em>Unit Of Measure Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType
	 * @generated
	 */
	public Adapter createUnitOfMeasurePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UnlimitedIntegerPropertyType <em>Unlimited Integer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerPropertyType
	 * @generated
	 */
	public Adapter createUnlimitedIntegerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UnlimitedIntegerType <em>Unlimited Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerType
	 * @generated
	 */
	public Adapter createUnlimitedIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UomAnglePropertyType <em>Uom Angle Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType
	 * @generated
	 */
	public Adapter createUomAnglePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UomAreaPropertyType <em>Uom Area Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType
	 * @generated
	 */
	public Adapter createUomAreaPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UomLengthPropertyType <em>Uom Length Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType
	 * @generated
	 */
	public Adapter createUomLengthPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UomScalePropertyType <em>Uom Scale Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UomScalePropertyType
	 * @generated
	 */
	public Adapter createUomScalePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UomTimePropertyType <em>Uom Time Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UomTimePropertyType
	 * @generated
	 */
	public Adapter createUomTimePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UomVelocityPropertyType <em>Uom Velocity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType
	 * @generated
	 */
	public Adapter createUomVelocityPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.UomVolumePropertyType <em>Uom Volume Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType
	 * @generated
	 */
	public Adapter createUomVolumePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GCOAdapterFactory
