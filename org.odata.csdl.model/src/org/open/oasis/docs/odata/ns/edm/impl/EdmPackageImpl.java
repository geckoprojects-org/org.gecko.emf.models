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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.odata.ns.edm.EdmFactory;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;

import org.open.oasis.docs.odata.ns.edm.util.EdmValidator;

import org.open.oasis.docs.odata.ns.edmx.EdmxPackage;

import org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdmPackageImpl extends EPackageImpl implements EdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "edm.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edmRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tActionFunctionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tActionFunctionReturnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tActionImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tApplyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBinaryConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBoolConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCastOrIsOfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCollectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDateConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDateTimeOffsetConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecimalConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDurationConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntityKeyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntitySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEnumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEnumTypeMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFloatConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFunctionImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tGuidConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tIfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tIntConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLabeledElementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLabeledElementReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNavigationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNavigationPropertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNullExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tOnDeleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tOneChildExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPropertyRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRecordExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tReferentialConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSingletonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tStringConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTimeOfDayConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTwoChildrenExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tAbstractTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tAppliesToElementsItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tClientFunctionMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tFloatingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tMaxEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tOnDeleteActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPrimitiveTypeMember0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tVariableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType binaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeStampEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dayTimeDurationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAbstractTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAppliesToEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAppliesToElementsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAppliesToElementsItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tClientFunctionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tClientFunctionMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDecimalLiteralEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tEnumMemberListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tFloatingObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tGuidLiteralEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tInstancePathEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tMaxLengthFacetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tMaxObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tModelPathEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tNamespaceNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tOnDeleteActionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPathEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPrecisionFacetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPrimitiveTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPrimitiveTypeMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPrimitiveTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tQualifiedNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tScaleFacetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tSimpleIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tSridFacetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTargetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTypeNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTypeNameMember3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tUnicodeFacetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tUnicodeFacetObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tVariableObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdmPackageImpl() {
		super(eNS_URI, EdmFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static EdmPackage init() {
		if (isInited) return (EdmPackage)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdmPackageImpl theEdmPackage = registeredEdmPackage instanceof EdmPackageImpl ? (EdmPackageImpl)registeredEdmPackage : new EdmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdmxPackage.eNS_URI);
		EdmxPackageImpl theEdmxPackage = (EdmxPackageImpl)(registeredPackage instanceof EdmxPackageImpl ? registeredPackage : EdmxPackage.eINSTANCE);

		// Load packages
		theEdmPackage.loadPackage();

		// Create package meta-data objects
		theEdmxPackage.createPackageContents();

		// Initialize created meta-data
		theEdmxPackage.initializePackageContents();

		// Fix loaded packages
		theEdmPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEdmPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return EdmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEdmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdmPackage.eNS_URI, theEdmPackage);
		return theEdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationType() {
		if (annotationTypeEClass == null) {
			annotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(0);
		}
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Group() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Annotation() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Binary() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Bool() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Date() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_DateTimeOffset() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Decimal() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Duration() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_EnumMember() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Float() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Guid() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Int() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_String() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_TimeOfDay() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_AnnotationPath() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Apply() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Cast() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Collection() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_If() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Eq() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Ne() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Ge() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Gt() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Le() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Lt() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_And() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Or() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Not() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Has() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_In() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Add() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Sub() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Neg() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Mul() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Div() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_DivBy() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Mod() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_IsOf() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_LabeledElement() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_LabeledElementReference() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Null() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_ModelElementPath() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_NavigationPropertyPath() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Path() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_PropertyPath() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Record() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_UrlRef() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_AnnotationPath1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Binary1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Bool1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Date1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_DateTimeOffset1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Decimal1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Duration1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_EnumMember1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Float1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Guid1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Int1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_ModelElementPath1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_NavigationPropertyPath1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Path1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_PropertyPath1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Qualifier() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_String1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Term() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_TimeOfDay1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_UrlRef1() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdmRoot() {
		if (edmRootEClass == null) {
			edmRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(7);
		}
		return edmRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdmRoot_Mixed() {
        return (EAttribute)getEdmRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmRoot_XMLNSPrefixMap() {
        return (EReference)getEdmRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmRoot_XSISchemaLocation() {
        return (EReference)getEdmRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmRoot_Annotation() {
        return (EReference)getEdmRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmRoot_Annotations() {
        return (EReference)getEdmRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmRoot_Schema() {
        return (EReference)getEdmRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaType() {
		if (schemaTypeEClass == null) {
			schemaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(8);
		}
		return schemaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaType_Group() {
        return (EAttribute)getSchemaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_ComplexType() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_EntityType() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_TypeDefinition() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_EnumType() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_Action() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_Function() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_Term() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_Annotations() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_EntityContainer() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaType_Annotation() {
        return (EReference)getSchemaType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaType_Alias() {
        return (EAttribute)getSchemaType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaType_Namespace() {
        return (EAttribute)getSchemaType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAction() {
		if (tActionEClass == null) {
			tActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(11);
		}
		return tActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAction_Group() {
        return (EAttribute)getTAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAction_Parameter() {
        return (EReference)getTAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAction_Annotation() {
        return (EReference)getTAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAction_ReturnType() {
        return (EReference)getTAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAction_EntitySetPath() {
        return (EAttribute)getTAction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAction_IsBound() {
        return (EAttribute)getTAction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAction_Name() {
        return (EAttribute)getTAction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTActionFunctionParameter() {
		if (tActionFunctionParameterEClass == null) {
			tActionFunctionParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(12);
		}
		return tActionFunctionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTActionFunctionParameter_Annotation() {
        return (EReference)getTActionFunctionParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_MaxLength() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_Name() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_Nullable() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_Precision() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_Scale() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_SRID() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_Type() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionParameter_Unicode() {
        return (EAttribute)getTActionFunctionParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTActionFunctionReturnType() {
		if (tActionFunctionReturnTypeEClass == null) {
			tActionFunctionReturnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(13);
		}
		return tActionFunctionReturnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTActionFunctionReturnType_Annotation() {
        return (EReference)getTActionFunctionReturnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionReturnType_MaxLength() {
        return (EAttribute)getTActionFunctionReturnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionReturnType_Nullable() {
        return (EAttribute)getTActionFunctionReturnType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionReturnType_Precision() {
        return (EAttribute)getTActionFunctionReturnType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionReturnType_Scale() {
        return (EAttribute)getTActionFunctionReturnType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionReturnType_SRID() {
        return (EAttribute)getTActionFunctionReturnType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionReturnType_Type() {
        return (EAttribute)getTActionFunctionReturnType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionFunctionReturnType_Unicode() {
        return (EAttribute)getTActionFunctionReturnType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTActionImport() {
		if (tActionImportEClass == null) {
			tActionImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(14);
		}
		return tActionImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTActionImport_Annotation() {
        return (EReference)getTActionImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionImport_Action() {
        return (EAttribute)getTActionImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionImport_EntitySet() {
        return (EAttribute)getTActionImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTActionImport_Name() {
        return (EAttribute)getTActionImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAnnotations() {
		if (tAnnotationsEClass == null) {
			tAnnotationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(15);
		}
		return tAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotations_Annotation() {
        return (EReference)getTAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAnnotations_Qualifier() {
        return (EAttribute)getTAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAnnotations_Target() {
        return (EAttribute)getTAnnotations().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTApplyExpression() {
		if (tApplyExpressionEClass == null) {
			tApplyExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(20);
		}
		return tApplyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_Group() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Annotation() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Binary() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Bool() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Date() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_DateTimeOffset() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Decimal() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Duration() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_EnumMember() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Float() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Guid() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Int() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_String() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_TimeOfDay() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_AnnotationPath() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Apply() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Cast() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Collection() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_If() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Eq() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Ne() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Ge() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Gt() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Le() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Lt() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_And() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Or() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Not() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Has() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_In() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Add() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Sub() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Neg() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Mul() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Div() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_DivBy() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Mod() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_IsOf() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_LabeledElement() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_LabeledElementReference() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Null() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_ModelElementPath() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_NavigationPropertyPath() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_Path() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_PropertyPath() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_Record() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplyExpression_UrlRef() {
        return (EReference)getTApplyExpression().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplyExpression_Function() {
        return (EAttribute)getTApplyExpression().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBinaryConstantExpression() {
		if (tBinaryConstantExpressionEClass == null) {
			tBinaryConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(21);
		}
		return tBinaryConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBinaryConstantExpression_Value() {
        return (EAttribute)getTBinaryConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBoolConstantExpression() {
		if (tBoolConstantExpressionEClass == null) {
			tBoolConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(22);
		}
		return tBoolConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBoolConstantExpression_Value() {
        return (EAttribute)getTBoolConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCastOrIsOfExpression() {
		if (tCastOrIsOfExpressionEClass == null) {
			tCastOrIsOfExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(23);
		}
		return tCastOrIsOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Annotation() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Binary() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Bool() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Date() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_DateTimeOffset() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Decimal() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Duration() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_EnumMember() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Float() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Guid() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Int() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_String() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_TimeOfDay() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_AnnotationPath() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Apply() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Cast() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Collection() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_If() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Eq() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Ne() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Ge() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Gt() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Le() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Lt() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_And() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Or() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Not() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Has() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_In() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Add() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Sub() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Neg() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Mul() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Div() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_DivBy() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Mod() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_IsOf() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_LabeledElement() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_LabeledElementReference() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Null() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_ModelElementPath() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_NavigationPropertyPath() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_Path() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_PropertyPath() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Record() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_UrlRef() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCastOrIsOfExpression_Annotation1() {
        return (EReference)getTCastOrIsOfExpression().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_MaxLength() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_Precision() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_Scale() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_SRID() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_Type() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCastOrIsOfExpression_Unicode() {
        return (EAttribute)getTCastOrIsOfExpression().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCollectionExpression() {
		if (tCollectionExpressionEClass == null) {
			tCollectionExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(27);
		}
		return tCollectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCollectionExpression_GExpression() {
        return (EAttribute)getTCollectionExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Binary() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Bool() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Date() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_DateTimeOffset() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Decimal() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Duration() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCollectionExpression_EnumMember() {
        return (EAttribute)getTCollectionExpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Float() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Guid() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Int() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_String() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_TimeOfDay() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCollectionExpression_AnnotationPath() {
        return (EAttribute)getTCollectionExpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Apply() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Cast() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Collection() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_If() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Eq() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Ne() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Ge() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Gt() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Le() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Lt() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_And() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Or() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Not() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Has() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_In() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Add() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Sub() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Neg() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Mul() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Div() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_DivBy() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Mod() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_IsOf() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_LabeledElement() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_LabeledElementReference() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Null() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCollectionExpression_ModelElementPath() {
        return (EAttribute)getTCollectionExpression().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCollectionExpression_NavigationPropertyPath() {
        return (EAttribute)getTCollectionExpression().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCollectionExpression_Path() {
        return (EAttribute)getTCollectionExpression().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCollectionExpression_PropertyPath() {
        return (EAttribute)getTCollectionExpression().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_Record() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCollectionExpression_UrlRef() {
        return (EReference)getTCollectionExpression().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTComplexType() {
		if (tComplexTypeEClass == null) {
			tComplexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(28);
		}
		return tComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTComplexType_Group() {
        return (EAttribute)getTComplexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTComplexType_Property() {
        return (EReference)getTComplexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTComplexType_NavigationProperty() {
        return (EReference)getTComplexType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTComplexType_Annotation() {
        return (EReference)getTComplexType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTComplexType_Abstract() {
        return (EAttribute)getTComplexType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTComplexType_BaseType() {
        return (EAttribute)getTComplexType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTComplexType_Name() {
        return (EAttribute)getTComplexType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTComplexType_OpenType() {
        return (EAttribute)getTComplexType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDateConstantExpression() {
		if (tDateConstantExpressionEClass == null) {
			tDateConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(29);
		}
		return tDateConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDateConstantExpression_Value() {
        return (EAttribute)getTDateConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDateTimeOffsetConstantExpression() {
		if (tDateTimeOffsetConstantExpressionEClass == null) {
			tDateTimeOffsetConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(30);
		}
		return tDateTimeOffsetConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDateTimeOffsetConstantExpression_Value() {
        return (EAttribute)getTDateTimeOffsetConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecimalConstantExpression() {
		if (tDecimalConstantExpressionEClass == null) {
			tDecimalConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(31);
		}
		return tDecimalConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecimalConstantExpression_Value() {
        return (EAttribute)getTDecimalConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDurationConstantExpression() {
		if (tDurationConstantExpressionEClass == null) {
			tDurationConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(33);
		}
		return tDurationConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDurationConstantExpression_Value() {
        return (EAttribute)getTDurationConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEntityContainer() {
		if (tEntityContainerEClass == null) {
			tEntityContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(34);
		}
		return tEntityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityContainer_Group() {
        return (EAttribute)getTEntityContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityContainer_EntitySet() {
        return (EReference)getTEntityContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityContainer_ActionImport() {
        return (EReference)getTEntityContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityContainer_FunctionImport() {
        return (EReference)getTEntityContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityContainer_Singleton() {
        return (EReference)getTEntityContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityContainer_Annotation() {
        return (EReference)getTEntityContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityContainer_Extends() {
        return (EAttribute)getTEntityContainer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityContainer_Name() {
        return (EAttribute)getTEntityContainer().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEntityKeyElement() {
		if (tEntityKeyElementEClass == null) {
			tEntityKeyElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(35);
		}
		return tEntityKeyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityKeyElement_PropertyRef() {
        return (EReference)getTEntityKeyElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEntitySet() {
		if (tEntitySetEClass == null) {
			tEntitySetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(36);
		}
		return tEntitySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntitySet_Group() {
        return (EAttribute)getTEntitySet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntitySet_NavigationPropertyBinding() {
        return (EReference)getTEntitySet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntitySet_Annotation() {
        return (EReference)getTEntitySet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntitySet_EntityType() {
        return (EAttribute)getTEntitySet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntitySet_IncludeInServiceDocument() {
        return (EAttribute)getTEntitySet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntitySet_Name() {
        return (EAttribute)getTEntitySet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEntityType() {
		if (tEntityTypeEClass == null) {
			tEntityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(37);
		}
		return tEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityType_Group() {
        return (EAttribute)getTEntityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityType_Key() {
        return (EReference)getTEntityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityType_Property() {
        return (EReference)getTEntityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityType_NavigationProperty() {
        return (EReference)getTEntityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEntityType_Annotation() {
        return (EReference)getTEntityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityType_Abstract() {
        return (EAttribute)getTEntityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityType_BaseType() {
        return (EAttribute)getTEntityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityType_HasStream() {
        return (EAttribute)getTEntityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityType_Name() {
        return (EAttribute)getTEntityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEntityType_OpenType() {
        return (EAttribute)getTEntityType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEnumType() {
		if (tEnumTypeEClass == null) {
			tEnumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(39);
		}
		return tEnumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEnumType_Group() {
        return (EAttribute)getTEnumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEnumType_Member() {
        return (EReference)getTEnumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEnumType_Annotation() {
        return (EReference)getTEnumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEnumType_IsFlags() {
        return (EAttribute)getTEnumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEnumType_Name() {
        return (EAttribute)getTEnumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEnumType_UnderlyingType() {
        return (EAttribute)getTEnumType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEnumTypeMember() {
		if (tEnumTypeMemberEClass == null) {
			tEnumTypeMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(40);
		}
		return tEnumTypeMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEnumTypeMember_Annotation() {
        return (EReference)getTEnumTypeMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEnumTypeMember_Name() {
        return (EAttribute)getTEnumTypeMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEnumTypeMember_Value() {
        return (EAttribute)getTEnumTypeMember().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFloatConstantExpression() {
		if (tFloatConstantExpressionEClass == null) {
			tFloatConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(41);
		}
		return tFloatConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFloatConstantExpression_Value() {
        return (EAttribute)getTFloatConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFunction() {
		if (tFunctionEClass == null) {
			tFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(44);
		}
		return tFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunction_Group() {
        return (EAttribute)getTFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunction_Parameter() {
        return (EReference)getTFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunction_Annotation() {
        return (EReference)getTFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunction_ReturnType() {
        return (EReference)getTFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunction_Group1() {
        return (EAttribute)getTFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunction_Annotation1() {
        return (EReference)getTFunction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunction_EntitySetPath() {
        return (EAttribute)getTFunction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunction_IsBound() {
        return (EAttribute)getTFunction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunction_IsComposable() {
        return (EAttribute)getTFunction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunction_Name() {
        return (EAttribute)getTFunction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFunctionImport() {
		if (tFunctionImportEClass == null) {
			tFunctionImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(45);
		}
		return tFunctionImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunctionImport_Annotation() {
        return (EReference)getTFunctionImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunctionImport_EntitySet() {
        return (EAttribute)getTFunctionImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunctionImport_Function() {
        return (EAttribute)getTFunctionImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunctionImport_IncludeInServiceDocument() {
        return (EAttribute)getTFunctionImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunctionImport_Name() {
        return (EAttribute)getTFunctionImport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTGuidConstantExpression() {
		if (tGuidConstantExpressionEClass == null) {
			tGuidConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(46);
		}
		return tGuidConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTGuidConstantExpression_Value() {
        return (EAttribute)getTGuidConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTIfExpression() {
		if (tIfExpressionEClass == null) {
			tIfExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(48);
		}
		return tIfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Annotation() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfExpression_GExpression() {
        return (EAttribute)getTIfExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Binary() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Bool() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Date() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_DateTimeOffset() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Decimal() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Duration() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfExpression_EnumMember() {
        return (EAttribute)getTIfExpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Float() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Guid() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Int() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_String() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_TimeOfDay() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfExpression_AnnotationPath() {
        return (EAttribute)getTIfExpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Apply() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Cast() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Collection() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_If() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Eq() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Ne() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Ge() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Gt() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Le() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Lt() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_And() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Or() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Not() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Has() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_In() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Add() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Sub() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Neg() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Mul() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Div() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_DivBy() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Mod() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_IsOf() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_LabeledElement() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_LabeledElementReference() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Null() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfExpression_ModelElementPath() {
        return (EAttribute)getTIfExpression().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfExpression_NavigationPropertyPath() {
        return (EAttribute)getTIfExpression().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfExpression_Path() {
        return (EAttribute)getTIfExpression().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfExpression_PropertyPath() {
        return (EAttribute)getTIfExpression().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Record() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_UrlRef() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfExpression_Annotation1() {
        return (EReference)getTIfExpression().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTIntConstantExpression() {
		if (tIntConstantExpressionEClass == null) {
			tIntConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(51);
		}
		return tIntConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIntConstantExpression_Value() {
        return (EAttribute)getTIntConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLabeledElementExpression() {
		if (tLabeledElementExpressionEClass == null) {
			tLabeledElementExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(52);
		}
		return tLabeledElementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Group() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Annotation() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Binary() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Bool() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Date() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_DateTimeOffset() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Decimal() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Duration() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_EnumMember() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Float() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Guid() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Int() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_String() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_TimeOfDay() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_AnnotationPath() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Apply() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Cast() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Collection() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_If() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Eq() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Ne() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Ge() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Gt() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Le() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Lt() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_And() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Or() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Not() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Has() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_In() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Add() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Sub() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Neg() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Mul() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Div() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_DivBy() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Mod() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_IsOf() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_LabeledElement() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_LabeledElementReference() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Null() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_ModelElementPath() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_NavigationPropertyPath() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Path() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_PropertyPath() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_Record() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLabeledElementExpression_UrlRef() {
        return (EReference)getTLabeledElementExpression().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_AnnotationPath1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Binary1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Bool1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Date1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_DateTimeOffset1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Decimal1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Duration1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_EnumMember1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Float1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Guid1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Int1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_ModelElementPath1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Name() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_NavigationPropertyPath1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_Path1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_PropertyPath1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_String1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_TimeOfDay1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementExpression_UrlRef1() {
        return (EAttribute)getTLabeledElementExpression().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLabeledElementReferenceExpression() {
		if (tLabeledElementReferenceExpressionEClass == null) {
			tLabeledElementReferenceExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(53);
		}
		return tLabeledElementReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLabeledElementReferenceExpression_Value() {
        return (EAttribute)getTLabeledElementReferenceExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTNavigationProperty() {
		if (tNavigationPropertyEClass == null) {
			tNavigationPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(59);
		}
		return tNavigationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationProperty_Group() {
        return (EAttribute)getTNavigationProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTNavigationProperty_ReferentialConstraint() {
        return (EReference)getTNavigationProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTNavigationProperty_OnDelete() {
        return (EReference)getTNavigationProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTNavigationProperty_Annotation() {
        return (EReference)getTNavigationProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationProperty_ContainsTarget() {
        return (EAttribute)getTNavigationProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationProperty_Name() {
        return (EAttribute)getTNavigationProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationProperty_Nullable() {
        return (EAttribute)getTNavigationProperty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationProperty_Partner() {
        return (EAttribute)getTNavigationProperty().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationProperty_Type() {
        return (EAttribute)getTNavigationProperty().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTNavigationPropertyBinding() {
		if (tNavigationPropertyBindingEClass == null) {
			tNavigationPropertyBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(60);
		}
		return tNavigationPropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationPropertyBinding_Path() {
        return (EAttribute)getTNavigationPropertyBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNavigationPropertyBinding_Target() {
        return (EAttribute)getTNavigationPropertyBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTNullExpression() {
		if (tNullExpressionEClass == null) {
			tNullExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(61);
		}
		return tNullExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTNullExpression_Annotation() {
        return (EReference)getTNullExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOnDelete() {
		if (tOnDeleteEClass == null) {
			tOnDeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(62);
		}
		return tOnDeleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOnDelete_Annotation() {
        return (EReference)getTOnDelete().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOnDelete_Action() {
        return (EAttribute)getTOnDelete().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOneChildExpression() {
		if (tOneChildExpressionEClass == null) {
			tOneChildExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(65);
		}
		return tOneChildExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Annotation() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Binary() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Bool() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Date() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_DateTimeOffset() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Decimal() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Duration() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOneChildExpression_EnumMember() {
        return (EAttribute)getTOneChildExpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Float() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Guid() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Int() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_String() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_TimeOfDay() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOneChildExpression_AnnotationPath() {
        return (EAttribute)getTOneChildExpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Apply() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Cast() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Collection() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_If() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Eq() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Ne() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Ge() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Gt() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Le() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Lt() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_And() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Or() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Not() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Has() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_In() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Add() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Sub() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Neg() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Mul() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Div() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_DivBy() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Mod() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_IsOf() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_LabeledElement() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_LabeledElementReference() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Null() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOneChildExpression_ModelElementPath() {
        return (EAttribute)getTOneChildExpression().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOneChildExpression_NavigationPropertyPath() {
        return (EAttribute)getTOneChildExpression().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOneChildExpression_Path() {
        return (EAttribute)getTOneChildExpression().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOneChildExpression_PropertyPath() {
        return (EAttribute)getTOneChildExpression().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Record() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_UrlRef() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOneChildExpression_Annotation1() {
        return (EReference)getTOneChildExpression().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTProperty() {
		if (tPropertyEClass == null) {
			tPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(72);
		}
		return tPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTProperty_Annotation() {
        return (EReference)getTProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_DefaultValue() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_MaxLength() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Name() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Nullable() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Precision() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Scale() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_SRID() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Type() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Unicode() {
        return (EAttribute)getTProperty().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPropertyRef() {
		if (tPropertyRefEClass == null) {
			tPropertyRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(73);
		}
		return tPropertyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyRef_Alias() {
        return (EAttribute)getTPropertyRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyRef_Name() {
        return (EAttribute)getTPropertyRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPropertyValue() {
		if (tPropertyValueEClass == null) {
			tPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(74);
		}
		return tPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Group() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Annotation() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Binary() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Bool() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Date() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_DateTimeOffset() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Decimal() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Duration() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_EnumMember() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Float() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Guid() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Int() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_String() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_TimeOfDay() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_AnnotationPath() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Apply() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Cast() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Collection() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_If() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Eq() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Ne() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Ge() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Gt() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Le() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Lt() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_And() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Or() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Not() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Has() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_In() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Add() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Sub() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Neg() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Mul() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Div() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_DivBy() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Mod() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_IsOf() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_LabeledElement() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_LabeledElementReference() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Null() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_ModelElementPath() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_NavigationPropertyPath() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Path() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_PropertyPath() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_Record() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPropertyValue_UrlRef() {
        return (EReference)getTPropertyValue().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_AnnotationPath1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Binary1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Bool1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Date1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_DateTimeOffset1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Decimal1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Duration1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_EnumMember1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Float1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Guid1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Int1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_ModelElementPath1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_NavigationPropertyPath1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Path1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_Property() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_PropertyPath1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_String1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_TimeOfDay1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPropertyValue_UrlRef1() {
        return (EAttribute)getTPropertyValue().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRecordExpression() {
		if (tRecordExpressionEClass == null) {
			tRecordExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(76);
		}
		return tRecordExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRecordExpression_Group() {
        return (EAttribute)getTRecordExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTRecordExpression_PropertyValue() {
        return (EReference)getTRecordExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTRecordExpression_Annotation() {
        return (EReference)getTRecordExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRecordExpression_Type() {
        return (EAttribute)getTRecordExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTReferentialConstraint() {
		if (tReferentialConstraintEClass == null) {
			tReferentialConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(77);
		}
		return tReferentialConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTReferentialConstraint_Annotation() {
        return (EReference)getTReferentialConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTReferentialConstraint_Property() {
        return (EAttribute)getTReferentialConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTReferentialConstraint_ReferencedProperty() {
        return (EAttribute)getTReferentialConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSingleton() {
		if (tSingletonEClass == null) {
			tSingletonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(80);
		}
		return tSingletonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSingleton_Group() {
        return (EAttribute)getTSingleton().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSingleton_NavigationPropertyBinding() {
        return (EReference)getTSingleton().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSingleton_Annotation() {
        return (EReference)getTSingleton().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSingleton_Name() {
        return (EAttribute)getTSingleton().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSingleton_Nullable() {
        return (EAttribute)getTSingleton().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSingleton_Type() {
        return (EAttribute)getTSingleton().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTStringConstantExpression() {
		if (tStringConstantExpressionEClass == null) {
			tStringConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(82);
		}
		return tStringConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTStringConstantExpression_Value() {
        return (EAttribute)getTStringConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTerm() {
		if (tTermEClass == null) {
			tTermEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(84);
		}
		return tTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTerm_Annotation() {
        return (EReference)getTTerm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_AppliesTo() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_BaseTerm() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_DefaultValue() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_MaxLength() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_Name() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_Nullable() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_Precision() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_Scale() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_SRID() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_Type() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTerm_Unicode() {
        return (EAttribute)getTTerm().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTimeOfDayConstantExpression() {
		if (tTimeOfDayConstantExpressionEClass == null) {
			tTimeOfDayConstantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(85);
		}
		return tTimeOfDayConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTimeOfDayConstantExpression_Value() {
        return (EAttribute)getTTimeOfDayConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTwoChildrenExpression() {
		if (tTwoChildrenExpressionEClass == null) {
			tTwoChildrenExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(86);
		}
		return tTwoChildrenExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Annotation() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTwoChildrenExpression_GExpression() {
        return (EAttribute)getTTwoChildrenExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Binary() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Bool() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Date() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_DateTimeOffset() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Decimal() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Duration() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTwoChildrenExpression_EnumMember() {
        return (EAttribute)getTTwoChildrenExpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Float() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Guid() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Int() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_String() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_TimeOfDay() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTwoChildrenExpression_AnnotationPath() {
        return (EAttribute)getTTwoChildrenExpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Apply() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Cast() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Collection() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_If() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Eq() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Ne() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Ge() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Gt() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Le() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Lt() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_And() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Or() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Not() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Has() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_In() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Add() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Sub() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Neg() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Mul() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Div() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_DivBy() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Mod() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_IsOf() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_LabeledElement() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_LabeledElementReference() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Null() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTwoChildrenExpression_ModelElementPath() {
        return (EAttribute)getTTwoChildrenExpression().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTwoChildrenExpression_NavigationPropertyPath() {
        return (EAttribute)getTTwoChildrenExpression().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTwoChildrenExpression_Path() {
        return (EAttribute)getTTwoChildrenExpression().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTwoChildrenExpression_PropertyPath() {
        return (EAttribute)getTTwoChildrenExpression().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Record() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_UrlRef() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTwoChildrenExpression_Annotation1() {
        return (EReference)getTTwoChildrenExpression().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTypeDefinition() {
		if (tTypeDefinitionEClass == null) {
			tTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(87);
		}
		return tTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTypeDefinition_Annotation() {
        return (EReference)getTTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypeDefinition_MaxLength() {
        return (EAttribute)getTTypeDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypeDefinition_Name() {
        return (EAttribute)getTTypeDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypeDefinition_Precision() {
        return (EAttribute)getTTypeDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypeDefinition_Scale() {
        return (EAttribute)getTTypeDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypeDefinition_SRID() {
        return (EAttribute)getTTypeDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypeDefinition_UnderlyingType() {
        return (EAttribute)getTTypeDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypeDefinition_Unicode() {
        return (EAttribute)getTTypeDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTAbstractType() {
		if (tAbstractTypeEEnum == null) {
			tAbstractTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(9);
		}
		return tAbstractTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTAppliesToElementsItem() {
		if (tAppliesToElementsItemEEnum == null) {
			tAppliesToElementsItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(18);
		}
		return tAppliesToElementsItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTClientFunctionMember1() {
		if (tClientFunctionMember1EEnum == null) {
			tClientFunctionMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(25);
		}
		return tClientFunctionMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTFloating() {
		if (tFloatingEEnum == null) {
			tFloatingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(42);
		}
		return tFloatingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTMax() {
		if (tMaxEEnum == null) {
			tMaxEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(54);
		}
		return tMaxEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTOnDeleteAction() {
		if (tOnDeleteActionEEnum == null) {
			tOnDeleteActionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(63);
		}
		return tOnDeleteActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTPrimitiveTypeMember0() {
		if (tPrimitiveTypeMember0EEnum == null) {
			tPrimitiveTypeMember0EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(69);
		}
		return tPrimitiveTypeMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTVariable() {
		if (tVariableEEnum == null) {
			tVariableEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(92);
		}
		return tVariableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBinary() {
		if (binaryEDataType == null) {
			binaryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(1);
		}
		return binaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBoolean() {
		if (booleanEDataType == null) {
			booleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(2);
		}
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBooleanObject() {
		if (booleanObjectEDataType == null) {
			booleanObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(3);
		}
		return booleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDate() {
		if (dateEDataType == null) {
			dateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(4);
		}
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTimeStamp() {
		if (dateTimeStampEDataType == null) {
			dateTimeStampEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(5);
		}
		return dateTimeStampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDayTimeDuration() {
		if (dayTimeDurationEDataType == null) {
			dayTimeDurationEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(6);
		}
		return dayTimeDurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTAbstractTypeObject() {
		if (tAbstractTypeObjectEDataType == null) {
			tAbstractTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(10);
		}
		return tAbstractTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTAppliesTo() {
		if (tAppliesToEDataType == null) {
			tAppliesToEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(16);
		}
		return tAppliesToEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTAppliesToElements() {
		if (tAppliesToElementsEDataType == null) {
			tAppliesToElementsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(17);
		}
		return tAppliesToElementsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTAppliesToElementsItemObject() {
		if (tAppliesToElementsItemObjectEDataType == null) {
			tAppliesToElementsItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(19);
		}
		return tAppliesToElementsItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTClientFunction() {
		if (tClientFunctionEDataType == null) {
			tClientFunctionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(24);
		}
		return tClientFunctionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTClientFunctionMember1Object() {
		if (tClientFunctionMember1ObjectEDataType == null) {
			tClientFunctionMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(26);
		}
		return tClientFunctionMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTDecimalLiteral() {
		if (tDecimalLiteralEDataType == null) {
			tDecimalLiteralEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(32);
		}
		return tDecimalLiteralEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTEnumMemberList() {
		if (tEnumMemberListEDataType == null) {
			tEnumMemberListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(38);
		}
		return tEnumMemberListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTFloatingObject() {
		if (tFloatingObjectEDataType == null) {
			tFloatingObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(43);
		}
		return tFloatingObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTGuidLiteral() {
		if (tGuidLiteralEDataType == null) {
			tGuidLiteralEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(47);
		}
		return tGuidLiteralEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTime() {
		if (timeEDataType == null) {
			timeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(49);
		}
		return timeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTInstancePath() {
		if (tInstancePathEDataType == null) {
			tInstancePathEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(50);
		}
		return tInstancePathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTMaxLengthFacet() {
		if (tMaxLengthFacetEDataType == null) {
			tMaxLengthFacetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(55);
		}
		return tMaxLengthFacetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTMaxObject() {
		if (tMaxObjectEDataType == null) {
			tMaxObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(56);
		}
		return tMaxObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTModelPath() {
		if (tModelPathEDataType == null) {
			tModelPathEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(57);
		}
		return tModelPathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTNamespaceName() {
		if (tNamespaceNameEDataType == null) {
			tNamespaceNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(58);
		}
		return tNamespaceNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTOnDeleteActionObject() {
		if (tOnDeleteActionObjectEDataType == null) {
			tOnDeleteActionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(64);
		}
		return tOnDeleteActionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTPath() {
		if (tPathEDataType == null) {
			tPathEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(66);
		}
		return tPathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTPrecisionFacet() {
		if (tPrecisionFacetEDataType == null) {
			tPrecisionFacetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(67);
		}
		return tPrecisionFacetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTPrimitiveType() {
		if (tPrimitiveTypeEDataType == null) {
			tPrimitiveTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(68);
		}
		return tPrimitiveTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTPrimitiveTypeMember0Object() {
		if (tPrimitiveTypeMember0ObjectEDataType == null) {
			tPrimitiveTypeMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(70);
		}
		return tPrimitiveTypeMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTPrimitiveTypeMember1() {
		if (tPrimitiveTypeMember1EDataType == null) {
			tPrimitiveTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(71);
		}
		return tPrimitiveTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTQualifiedName() {
		if (tQualifiedNameEDataType == null) {
			tQualifiedNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(75);
		}
		return tQualifiedNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTScaleFacet() {
		if (tScaleFacetEDataType == null) {
			tScaleFacetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(78);
		}
		return tScaleFacetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTSimpleIdentifier() {
		if (tSimpleIdentifierEDataType == null) {
			tSimpleIdentifierEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(79);
		}
		return tSimpleIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTSridFacet() {
		if (tSridFacetEDataType == null) {
			tSridFacetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(81);
		}
		return tSridFacetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTTarget() {
		if (tTargetEDataType == null) {
			tTargetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(83);
		}
		return tTargetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTTypeName() {
		if (tTypeNameEDataType == null) {
			tTypeNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(88);
		}
		return tTypeNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTTypeNameMember3() {
		if (tTypeNameMember3EDataType == null) {
			tTypeNameMember3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(89);
		}
		return tTypeNameMember3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTUnicodeFacet() {
		if (tUnicodeFacetEDataType == null) {
			tUnicodeFacetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(90);
		}
		return tUnicodeFacetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTUnicodeFacetObject() {
		if (tUnicodeFacetObjectEDataType == null) {
			tUnicodeFacetObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(91);
		}
		return tUnicodeFacetObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTVariableObject() {
		if (tVariableObjectEDataType == null) {
			tVariableObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI).getEClassifiers().get(93);
		}
		return tVariableObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdmFactory getEdmFactory() {
		return (EdmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.open.oasis.docs.odata.ns.edm." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //EdmPackageImpl
