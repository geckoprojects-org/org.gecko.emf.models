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
package net.opengis.ogc.impl;

import javax.xml.namespace.QName;

import net.opengis.gml.GMLPackage;

import net.opengis.gml.impl.GMLPackageImpl;

import net.opengis.ogc.AbstractIdType;
import net.opengis.ogc.ArithmeticOperatorsType;
import net.opengis.ogc.BBOXType;
import net.opengis.ogc.BinaryComparisonOpType;
import net.opengis.ogc.BinaryLogicOpType;
import net.opengis.ogc.BinaryOperatorType;
import net.opengis.ogc.BinarySpatialOpType;
import net.opengis.ogc.ComparisonOperatorType;
import net.opengis.ogc.ComparisonOperatorsType;
import net.opengis.ogc.ComparisonOpsType;
import net.opengis.ogc.DistanceBufferType;
import net.opengis.ogc.DistanceType;
import net.opengis.ogc.DocumentRoot;
import net.opengis.ogc.EIDType;
import net.opengis.ogc.ExpressionType;
import net.opengis.ogc.FIDType;
import net.opengis.ogc.FeatureIdType;
import net.opengis.ogc.FilterCapabilitiesType;
import net.opengis.ogc.FilterType;
import net.opengis.ogc.FunctionNameType;
import net.opengis.ogc.FunctionNamesType;
import net.opengis.ogc.FunctionType;
import net.opengis.ogc.FunctionsType;
import net.opengis.ogc.GeometryOperandsType;
import net.opengis.ogc.GmlObjectIdType;
import net.opengis.ogc.IdCapabilitiesType;
import net.opengis.ogc.LiteralType;
import net.opengis.ogc.LogicOpsType;
import net.opengis.ogc.LogicalOperatorsType;
import net.opengis.ogc.LowerBoundaryType;
import net.opengis.ogc.OGCFactory;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.PropertyIsBetweenType;
import net.opengis.ogc.PropertyIsLikeType;
import net.opengis.ogc.PropertyIsNullType;
import net.opengis.ogc.PropertyNameType;
import net.opengis.ogc.ScalarCapabilitiesType;
import net.opengis.ogc.SimpleArithmeticType;
import net.opengis.ogc.SortByType;
import net.opengis.ogc.SortOrderType;
import net.opengis.ogc.SortPropertyType;
import net.opengis.ogc.SpatialCapabilitiesType;
import net.opengis.ogc.SpatialOperatorNameType;
import net.opengis.ogc.SpatialOperatorType;
import net.opengis.ogc.SpatialOperatorsType;
import net.opengis.ogc.SpatialOpsType;
import net.opengis.ogc.UnaryLogicOpType;
import net.opengis.ogc.UpperBoundaryType;

import net.opengis.ogc.util.OGCValidator;

import net.opengis.ows.OWSPackage;

import net.opengis.ows.impl.OWSPackageImpl;

import net.opengis.wfs.WFSPackage;

import net.opengis.wfs.impl.WFSPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1999.xlink.XlinkPackage;

import org.w3._2001.smil20.Smil20Package;

import org.w3._2001.smil20.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OGCPackageImpl extends EPackageImpl implements OGCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticOperatorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bboxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryComparisonOpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryLogicOpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binarySpatialOpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonOperatorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonOpsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceBufferTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionNamesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryOperandsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlObjectIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicOpsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerBoundaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyIsBetweenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyIsLikeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyIsNullTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleArithmeticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortByTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialOperatorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialOperatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialOpsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryLogicOpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperBoundaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spatialOperatorNameTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comparisonOperatorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geometryOperandTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortOrderTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spatialOperatorNameTypeObjectEDataType = null;

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
	 * @see net.opengis.ogc.OGCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OGCPackageImpl() {
		super(eNS_URI, OGCFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OGCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OGCPackage init() {
		if (isInited) return (OGCPackage)EPackage.Registry.INSTANCE.getEPackage(OGCPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOGCPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OGCPackageImpl theOGCPackage = registeredOGCPackage instanceof OGCPackageImpl ? (OGCPackageImpl)registeredOGCPackage : new OGCPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Smil20Package.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		GMLPackageImpl theGMLPackage = (GMLPackageImpl)(registeredPackage instanceof GMLPackageImpl ? registeredPackage : GMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OWSPackage.eNS_URI);
		OWSPackageImpl theOWSPackage = (OWSPackageImpl)(registeredPackage instanceof OWSPackageImpl ? registeredPackage : OWSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WFSPackage.eNS_URI);
		WFSPackageImpl theWFSPackage = (WFSPackageImpl)(registeredPackage instanceof WFSPackageImpl ? registeredPackage : WFSPackage.eINSTANCE);

		// Load packages
		theGMLPackage.loadPackage();

		// Create package meta-data objects
		theOGCPackage.createPackageContents();
		theOWSPackage.createPackageContents();
		theWFSPackage.createPackageContents();

		// Initialize created meta-data
		theOGCPackage.initializePackageContents();
		theOWSPackage.initializePackageContents();
		theWFSPackage.initializePackageContents();

		// Fix loaded packages
		theGMLPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOGCPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OGCValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOGCPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OGCPackage.eNS_URI, theOGCPackage);
		return theOGCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractIdType() {
		return abstractIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArithmeticOperatorsType() {
		return arithmeticOperatorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArithmeticOperatorsType_Group() {
		return (EAttribute)arithmeticOperatorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticOperatorsType_SimpleArithmetic() {
		return (EReference)arithmeticOperatorsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticOperatorsType_Functions() {
		return (EReference)arithmeticOperatorsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBBOXType() {
		return bboxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBBOXType_PropertyName() {
		return (EReference)bboxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBBOXType_EnvelopeGroup() {
		return (EAttribute)bboxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBBOXType_Envelope() {
		return (EReference)bboxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryComparisonOpType() {
		return binaryComparisonOpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryComparisonOpType_ExpressionGroup() {
		return (EAttribute)binaryComparisonOpTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryComparisonOpType_Expression() {
		return (EReference)binaryComparisonOpTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryComparisonOpType_MatchCase() {
		return (EAttribute)binaryComparisonOpTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryLogicOpType() {
		return binaryLogicOpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryLogicOpType_Group() {
		return (EAttribute)binaryLogicOpTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryLogicOpType_ComparisonOpsGroup() {
		return (EAttribute)binaryLogicOpTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryLogicOpType_ComparisonOps() {
		return (EReference)binaryLogicOpTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryLogicOpType_SpatialOpsGroup() {
		return (EAttribute)binaryLogicOpTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryLogicOpType_SpatialOps() {
		return (EReference)binaryLogicOpTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryLogicOpType_LogicOpsGroup() {
		return (EAttribute)binaryLogicOpTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryLogicOpType_LogicOps() {
		return (EReference)binaryLogicOpTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryLogicOpType_Function() {
		return (EReference)binaryLogicOpTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryOperatorType() {
		return binaryOperatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryOperatorType_ExpressionGroup() {
		return (EAttribute)binaryOperatorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryOperatorType_Expression() {
		return (EReference)binaryOperatorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinarySpatialOpType() {
		return binarySpatialOpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinarySpatialOpType_PropertyName() {
		return (EReference)binarySpatialOpTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinarySpatialOpType_PropertyName1() {
		return (EReference)binarySpatialOpTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinarySpatialOpType_GeometryGroup() {
		return (EAttribute)binarySpatialOpTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinarySpatialOpType_Geometry() {
		return (EReference)binarySpatialOpTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinarySpatialOpType_EnvelopeGroup() {
		return (EAttribute)binarySpatialOpTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinarySpatialOpType_Envelope() {
		return (EReference)binarySpatialOpTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparisonOperatorsType() {
		return comparisonOperatorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonOperatorsType_Group() {
		return (EAttribute)comparisonOperatorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonOperatorsType_ComparisonOperator() {
		return (EAttribute)comparisonOperatorsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparisonOpsType() {
		return comparisonOpsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistanceBufferType() {
		return distanceBufferTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistanceBufferType_PropertyName() {
		return (EReference)distanceBufferTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistanceBufferType_GeometryGroup() {
		return (EAttribute)distanceBufferTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistanceBufferType_Geometry() {
		return (EReference)distanceBufferTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistanceBufferType_Distance() {
		return (EReference)distanceBufferTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistanceType() {
		return distanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistanceType_Value() {
		return (EAttribute)distanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistanceType_Units() {
		return (EAttribute)distanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Id() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Add() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Expression() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_And() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LogicOps() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BBOX() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SpatialOps() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Beyond() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ComparisonOps() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Contains() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Crosses() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Disjoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Div() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DWithin() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EID() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Equals() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FeatureId() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FID() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Filter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FilterCapabilities() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Function() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GmlObjectId() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Intersects() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Literal() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LogicalOperators() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Mul() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Not() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Or() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Overlaps() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsBetween() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsEqualTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsGreaterThan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsGreaterThanOrEqualTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsLessThan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsLessThanOrEqualTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsLike() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsNotEqualTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyIsNull() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PropertyName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SimpleArithmetic() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SortBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sub() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Touches() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Within() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEIDType() {
		return eidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionType() {
		return expressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureIdType() {
		return featureIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureIdType_Fid() {
		return (EAttribute)featureIdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFIDType() {
		return fidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterCapabilitiesType() {
		return filterCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterCapabilitiesType_SpatialCapabilities() {
		return (EReference)filterCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterCapabilitiesType_ScalarCapabilities() {
		return (EReference)filterCapabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterCapabilitiesType_IdCapabilities() {
		return (EReference)filterCapabilitiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterType() {
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_SpatialOpsGroup() {
		return (EAttribute)filterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_SpatialOps() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_ComparisonOpsGroup() {
		return (EAttribute)filterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_ComparisonOps() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_LogicOpsGroup() {
		return (EAttribute)filterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_LogicOps() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_IdGroup() {
		return (EAttribute)filterTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_Id() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionNamesType() {
		return functionNamesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionNamesType_Group() {
		return (EAttribute)functionNamesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionNamesType_FunctionName() {
		return (EReference)functionNamesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionNameType() {
		return functionNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionNameType_Value() {
		return (EAttribute)functionNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionNameType_NArgs() {
		return (EAttribute)functionNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionsType() {
		return functionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionsType_FunctionNames() {
		return (EReference)functionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionType_ExpressionGroup() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionType_Expression() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionType_Name() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometryOperandsType() {
		return geometryOperandsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeometryOperandsType_GeometryOperand() {
		return (EAttribute)geometryOperandsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGmlObjectIdType() {
		return gmlObjectIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGmlObjectIdType_Id() {
		return (EAttribute)gmlObjectIdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdCapabilitiesType() {
		return idCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdCapabilitiesType_Group() {
		return (EAttribute)idCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdCapabilitiesType_EID() {
		return (EReference)idCapabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdCapabilitiesType_FID() {
		return (EReference)idCapabilitiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralType() {
		return literalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralType_Mixed() {
		return (EAttribute)literalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralType_Any() {
		return (EAttribute)literalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalOperatorsType() {
		return logicalOperatorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicOpsType() {
		return logicOpsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLowerBoundaryType() {
		return lowerBoundaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLowerBoundaryType_ExpressionGroup() {
		return (EAttribute)lowerBoundaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLowerBoundaryType_Expression() {
		return (EReference)lowerBoundaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyIsBetweenType() {
		return propertyIsBetweenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyIsBetweenType_ExpressionGroup() {
		return (EAttribute)propertyIsBetweenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyIsBetweenType_Expression() {
		return (EReference)propertyIsBetweenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyIsBetweenType_LowerBoundary() {
		return (EReference)propertyIsBetweenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyIsBetweenType_UpperBoundary() {
		return (EReference)propertyIsBetweenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyIsLikeType() {
		return propertyIsLikeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyIsLikeType_PropertyName() {
		return (EReference)propertyIsLikeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyIsLikeType_Literal() {
		return (EReference)propertyIsLikeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyIsLikeType_EscapeChar() {
		return (EAttribute)propertyIsLikeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyIsLikeType_MatchCase() {
		return (EAttribute)propertyIsLikeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyIsLikeType_SingleChar() {
		return (EAttribute)propertyIsLikeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyIsLikeType_WildCard() {
		return (EAttribute)propertyIsLikeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyIsNullType() {
		return propertyIsNullTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyIsNullType_PropertyName() {
		return (EReference)propertyIsNullTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyNameType() {
		return propertyNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyNameType_Mixed() {
		return (EAttribute)propertyNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalarCapabilitiesType() {
		return scalarCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalarCapabilitiesType_LogicalOperators() {
		return (EReference)scalarCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalarCapabilitiesType_ComparisonOperators() {
		return (EReference)scalarCapabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalarCapabilitiesType_ArithmeticOperators() {
		return (EReference)scalarCapabilitiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleArithmeticType() {
		return simpleArithmeticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSortByType() {
		return sortByTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSortByType_SortProperty() {
		return (EReference)sortByTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSortPropertyType() {
		return sortPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSortPropertyType_PropertyName() {
		return (EReference)sortPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSortPropertyType_SortOrder() {
		return (EAttribute)sortPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialCapabilitiesType() {
		return spatialCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpatialCapabilitiesType_GeometryOperands() {
		return (EReference)spatialCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpatialCapabilitiesType_SpatialOperators() {
		return (EReference)spatialCapabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialOperatorsType() {
		return spatialOperatorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpatialOperatorsType_SpatialOperator() {
		return (EReference)spatialOperatorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialOperatorType() {
		return spatialOperatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpatialOperatorType_GeometryOperands() {
		return (EReference)spatialOperatorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialOperatorType_Name() {
		return (EAttribute)spatialOperatorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialOpsType() {
		return spatialOpsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryLogicOpType() {
		return unaryLogicOpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaryLogicOpType_ComparisonOpsGroup() {
		return (EAttribute)unaryLogicOpTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryLogicOpType_ComparisonOps() {
		return (EReference)unaryLogicOpTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaryLogicOpType_SpatialOpsGroup() {
		return (EAttribute)unaryLogicOpTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryLogicOpType_SpatialOps() {
		return (EReference)unaryLogicOpTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaryLogicOpType_LogicOpsGroup() {
		return (EAttribute)unaryLogicOpTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryLogicOpType_LogicOps() {
		return (EReference)unaryLogicOpTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryLogicOpType_Function() {
		return (EReference)unaryLogicOpTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpperBoundaryType() {
		return upperBoundaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpperBoundaryType_ExpressionGroup() {
		return (EAttribute)upperBoundaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpperBoundaryType_Expression() {
		return (EReference)upperBoundaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparisonOperatorType() {
		return comparisonOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSortOrderType() {
		return sortOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpatialOperatorNameType() {
		return spatialOperatorNameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComparisonOperatorTypeObject() {
		return comparisonOperatorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeometryOperandType() {
		return geometryOperandTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSortOrderTypeObject() {
		return sortOrderTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSpatialOperatorNameTypeObject() {
		return spatialOperatorNameTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OGCFactory getOGCFactory() {
		return (OGCFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractIdTypeEClass = createEClass(ABSTRACT_ID_TYPE);

		arithmeticOperatorsTypeEClass = createEClass(ARITHMETIC_OPERATORS_TYPE);
		createEAttribute(arithmeticOperatorsTypeEClass, ARITHMETIC_OPERATORS_TYPE__GROUP);
		createEReference(arithmeticOperatorsTypeEClass, ARITHMETIC_OPERATORS_TYPE__SIMPLE_ARITHMETIC);
		createEReference(arithmeticOperatorsTypeEClass, ARITHMETIC_OPERATORS_TYPE__FUNCTIONS);

		bboxTypeEClass = createEClass(BBOX_TYPE);
		createEReference(bboxTypeEClass, BBOX_TYPE__PROPERTY_NAME);
		createEAttribute(bboxTypeEClass, BBOX_TYPE__ENVELOPE_GROUP);
		createEReference(bboxTypeEClass, BBOX_TYPE__ENVELOPE);

		binaryComparisonOpTypeEClass = createEClass(BINARY_COMPARISON_OP_TYPE);
		createEAttribute(binaryComparisonOpTypeEClass, BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP);
		createEReference(binaryComparisonOpTypeEClass, BINARY_COMPARISON_OP_TYPE__EXPRESSION);
		createEAttribute(binaryComparisonOpTypeEClass, BINARY_COMPARISON_OP_TYPE__MATCH_CASE);

		binaryLogicOpTypeEClass = createEClass(BINARY_LOGIC_OP_TYPE);
		createEAttribute(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__GROUP);
		createEAttribute(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP);
		createEReference(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__COMPARISON_OPS);
		createEAttribute(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP);
		createEReference(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__SPATIAL_OPS);
		createEAttribute(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP);
		createEReference(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__LOGIC_OPS);
		createEReference(binaryLogicOpTypeEClass, BINARY_LOGIC_OP_TYPE__FUNCTION);

		binaryOperatorTypeEClass = createEClass(BINARY_OPERATOR_TYPE);
		createEAttribute(binaryOperatorTypeEClass, BINARY_OPERATOR_TYPE__EXPRESSION_GROUP);
		createEReference(binaryOperatorTypeEClass, BINARY_OPERATOR_TYPE__EXPRESSION);

		binarySpatialOpTypeEClass = createEClass(BINARY_SPATIAL_OP_TYPE);
		createEReference(binarySpatialOpTypeEClass, BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME);
		createEReference(binarySpatialOpTypeEClass, BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1);
		createEAttribute(binarySpatialOpTypeEClass, BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP);
		createEReference(binarySpatialOpTypeEClass, BINARY_SPATIAL_OP_TYPE__GEOMETRY);
		createEAttribute(binarySpatialOpTypeEClass, BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP);
		createEReference(binarySpatialOpTypeEClass, BINARY_SPATIAL_OP_TYPE__ENVELOPE);

		comparisonOperatorsTypeEClass = createEClass(COMPARISON_OPERATORS_TYPE);
		createEAttribute(comparisonOperatorsTypeEClass, COMPARISON_OPERATORS_TYPE__GROUP);
		createEAttribute(comparisonOperatorsTypeEClass, COMPARISON_OPERATORS_TYPE__COMPARISON_OPERATOR);

		comparisonOpsTypeEClass = createEClass(COMPARISON_OPS_TYPE);

		distanceBufferTypeEClass = createEClass(DISTANCE_BUFFER_TYPE);
		createEReference(distanceBufferTypeEClass, DISTANCE_BUFFER_TYPE__PROPERTY_NAME);
		createEAttribute(distanceBufferTypeEClass, DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP);
		createEReference(distanceBufferTypeEClass, DISTANCE_BUFFER_TYPE__GEOMETRY);
		createEReference(distanceBufferTypeEClass, DISTANCE_BUFFER_TYPE__DISTANCE);

		distanceTypeEClass = createEClass(DISTANCE_TYPE);
		createEAttribute(distanceTypeEClass, DISTANCE_TYPE__VALUE);
		createEAttribute(distanceTypeEClass, DISTANCE_TYPE__UNITS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXPRESSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AND);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOGIC_OPS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BBOX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPATIAL_OPS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BEYOND);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPARISON_OPS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTAINS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CROSSES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DISJOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIV);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DWITHIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EQUALS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILTER_CAPABILITIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FUNCTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GML_OBJECT_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERSECTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LITERAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOGICAL_OPERATORS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OVERLAPS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_BETWEEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_LIKE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_IS_NULL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_ARITHMETIC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORT_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUB);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TOUCHES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WITHIN);

		eidTypeEClass = createEClass(EID_TYPE);

		expressionTypeEClass = createEClass(EXPRESSION_TYPE);

		featureIdTypeEClass = createEClass(FEATURE_ID_TYPE);
		createEAttribute(featureIdTypeEClass, FEATURE_ID_TYPE__FID);

		fidTypeEClass = createEClass(FID_TYPE);

		filterCapabilitiesTypeEClass = createEClass(FILTER_CAPABILITIES_TYPE);
		createEReference(filterCapabilitiesTypeEClass, FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES);
		createEReference(filterCapabilitiesTypeEClass, FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES);
		createEReference(filterCapabilitiesTypeEClass, FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES);

		filterTypeEClass = createEClass(FILTER_TYPE);
		createEAttribute(filterTypeEClass, FILTER_TYPE__SPATIAL_OPS_GROUP);
		createEReference(filterTypeEClass, FILTER_TYPE__SPATIAL_OPS);
		createEAttribute(filterTypeEClass, FILTER_TYPE__COMPARISON_OPS_GROUP);
		createEReference(filterTypeEClass, FILTER_TYPE__COMPARISON_OPS);
		createEAttribute(filterTypeEClass, FILTER_TYPE__LOGIC_OPS_GROUP);
		createEReference(filterTypeEClass, FILTER_TYPE__LOGIC_OPS);
		createEAttribute(filterTypeEClass, FILTER_TYPE__ID_GROUP);
		createEReference(filterTypeEClass, FILTER_TYPE__ID);

		functionNamesTypeEClass = createEClass(FUNCTION_NAMES_TYPE);
		createEAttribute(functionNamesTypeEClass, FUNCTION_NAMES_TYPE__GROUP);
		createEReference(functionNamesTypeEClass, FUNCTION_NAMES_TYPE__FUNCTION_NAME);

		functionNameTypeEClass = createEClass(FUNCTION_NAME_TYPE);
		createEAttribute(functionNameTypeEClass, FUNCTION_NAME_TYPE__VALUE);
		createEAttribute(functionNameTypeEClass, FUNCTION_NAME_TYPE__NARGS);

		functionsTypeEClass = createEClass(FUNCTIONS_TYPE);
		createEReference(functionsTypeEClass, FUNCTIONS_TYPE__FUNCTION_NAMES);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__EXPRESSION_GROUP);
		createEReference(functionTypeEClass, FUNCTION_TYPE__EXPRESSION);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__NAME);

		geometryOperandsTypeEClass = createEClass(GEOMETRY_OPERANDS_TYPE);
		createEAttribute(geometryOperandsTypeEClass, GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND);

		gmlObjectIdTypeEClass = createEClass(GML_OBJECT_ID_TYPE);
		createEAttribute(gmlObjectIdTypeEClass, GML_OBJECT_ID_TYPE__ID);

		idCapabilitiesTypeEClass = createEClass(ID_CAPABILITIES_TYPE);
		createEAttribute(idCapabilitiesTypeEClass, ID_CAPABILITIES_TYPE__GROUP);
		createEReference(idCapabilitiesTypeEClass, ID_CAPABILITIES_TYPE__EID);
		createEReference(idCapabilitiesTypeEClass, ID_CAPABILITIES_TYPE__FID);

		literalTypeEClass = createEClass(LITERAL_TYPE);
		createEAttribute(literalTypeEClass, LITERAL_TYPE__MIXED);
		createEAttribute(literalTypeEClass, LITERAL_TYPE__ANY);

		logicalOperatorsTypeEClass = createEClass(LOGICAL_OPERATORS_TYPE);

		logicOpsTypeEClass = createEClass(LOGIC_OPS_TYPE);

		lowerBoundaryTypeEClass = createEClass(LOWER_BOUNDARY_TYPE);
		createEAttribute(lowerBoundaryTypeEClass, LOWER_BOUNDARY_TYPE__EXPRESSION_GROUP);
		createEReference(lowerBoundaryTypeEClass, LOWER_BOUNDARY_TYPE__EXPRESSION);

		propertyIsBetweenTypeEClass = createEClass(PROPERTY_IS_BETWEEN_TYPE);
		createEAttribute(propertyIsBetweenTypeEClass, PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP);
		createEReference(propertyIsBetweenTypeEClass, PROPERTY_IS_BETWEEN_TYPE__EXPRESSION);
		createEReference(propertyIsBetweenTypeEClass, PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY);
		createEReference(propertyIsBetweenTypeEClass, PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY);

		propertyIsLikeTypeEClass = createEClass(PROPERTY_IS_LIKE_TYPE);
		createEReference(propertyIsLikeTypeEClass, PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME);
		createEReference(propertyIsLikeTypeEClass, PROPERTY_IS_LIKE_TYPE__LITERAL);
		createEAttribute(propertyIsLikeTypeEClass, PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR);
		createEAttribute(propertyIsLikeTypeEClass, PROPERTY_IS_LIKE_TYPE__MATCH_CASE);
		createEAttribute(propertyIsLikeTypeEClass, PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR);
		createEAttribute(propertyIsLikeTypeEClass, PROPERTY_IS_LIKE_TYPE__WILD_CARD);

		propertyIsNullTypeEClass = createEClass(PROPERTY_IS_NULL_TYPE);
		createEReference(propertyIsNullTypeEClass, PROPERTY_IS_NULL_TYPE__PROPERTY_NAME);

		propertyNameTypeEClass = createEClass(PROPERTY_NAME_TYPE);
		createEAttribute(propertyNameTypeEClass, PROPERTY_NAME_TYPE__MIXED);

		scalarCapabilitiesTypeEClass = createEClass(SCALAR_CAPABILITIES_TYPE);
		createEReference(scalarCapabilitiesTypeEClass, SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS);
		createEReference(scalarCapabilitiesTypeEClass, SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS);
		createEReference(scalarCapabilitiesTypeEClass, SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS);

		simpleArithmeticTypeEClass = createEClass(SIMPLE_ARITHMETIC_TYPE);

		sortByTypeEClass = createEClass(SORT_BY_TYPE);
		createEReference(sortByTypeEClass, SORT_BY_TYPE__SORT_PROPERTY);

		sortPropertyTypeEClass = createEClass(SORT_PROPERTY_TYPE);
		createEReference(sortPropertyTypeEClass, SORT_PROPERTY_TYPE__PROPERTY_NAME);
		createEAttribute(sortPropertyTypeEClass, SORT_PROPERTY_TYPE__SORT_ORDER);

		spatialCapabilitiesTypeEClass = createEClass(SPATIAL_CAPABILITIES_TYPE);
		createEReference(spatialCapabilitiesTypeEClass, SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS);
		createEReference(spatialCapabilitiesTypeEClass, SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS);

		spatialOperatorsTypeEClass = createEClass(SPATIAL_OPERATORS_TYPE);
		createEReference(spatialOperatorsTypeEClass, SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR);

		spatialOperatorTypeEClass = createEClass(SPATIAL_OPERATOR_TYPE);
		createEReference(spatialOperatorTypeEClass, SPATIAL_OPERATOR_TYPE__GEOMETRY_OPERANDS);
		createEAttribute(spatialOperatorTypeEClass, SPATIAL_OPERATOR_TYPE__NAME);

		spatialOpsTypeEClass = createEClass(SPATIAL_OPS_TYPE);

		unaryLogicOpTypeEClass = createEClass(UNARY_LOGIC_OP_TYPE);
		createEAttribute(unaryLogicOpTypeEClass, UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP);
		createEReference(unaryLogicOpTypeEClass, UNARY_LOGIC_OP_TYPE__COMPARISON_OPS);
		createEAttribute(unaryLogicOpTypeEClass, UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP);
		createEReference(unaryLogicOpTypeEClass, UNARY_LOGIC_OP_TYPE__SPATIAL_OPS);
		createEAttribute(unaryLogicOpTypeEClass, UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP);
		createEReference(unaryLogicOpTypeEClass, UNARY_LOGIC_OP_TYPE__LOGIC_OPS);
		createEReference(unaryLogicOpTypeEClass, UNARY_LOGIC_OP_TYPE__FUNCTION);

		upperBoundaryTypeEClass = createEClass(UPPER_BOUNDARY_TYPE);
		createEAttribute(upperBoundaryTypeEClass, UPPER_BOUNDARY_TYPE__EXPRESSION_GROUP);
		createEReference(upperBoundaryTypeEClass, UPPER_BOUNDARY_TYPE__EXPRESSION);

		// Create enums
		comparisonOperatorTypeEEnum = createEEnum(COMPARISON_OPERATOR_TYPE);
		sortOrderTypeEEnum = createEEnum(SORT_ORDER_TYPE);
		spatialOperatorNameTypeEEnum = createEEnum(SPATIAL_OPERATOR_NAME_TYPE);

		// Create data types
		comparisonOperatorTypeObjectEDataType = createEDataType(COMPARISON_OPERATOR_TYPE_OBJECT);
		geometryOperandTypeEDataType = createEDataType(GEOMETRY_OPERAND_TYPE);
		sortOrderTypeObjectEDataType = createEDataType(SORT_ORDER_TYPE_OBJECT);
		spatialOperatorNameTypeObjectEDataType = createEDataType(SPATIAL_OPERATOR_NAME_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GMLPackage theGMLPackage = (GMLPackage)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bboxTypeEClass.getESuperTypes().add(this.getSpatialOpsType());
		binaryComparisonOpTypeEClass.getESuperTypes().add(this.getComparisonOpsType());
		binaryLogicOpTypeEClass.getESuperTypes().add(this.getLogicOpsType());
		binaryOperatorTypeEClass.getESuperTypes().add(this.getExpressionType());
		binarySpatialOpTypeEClass.getESuperTypes().add(this.getSpatialOpsType());
		distanceBufferTypeEClass.getESuperTypes().add(this.getSpatialOpsType());
		featureIdTypeEClass.getESuperTypes().add(this.getAbstractIdType());
		functionTypeEClass.getESuperTypes().add(this.getExpressionType());
		gmlObjectIdTypeEClass.getESuperTypes().add(this.getAbstractIdType());
		literalTypeEClass.getESuperTypes().add(this.getExpressionType());
		propertyIsBetweenTypeEClass.getESuperTypes().add(this.getComparisonOpsType());
		propertyIsLikeTypeEClass.getESuperTypes().add(this.getComparisonOpsType());
		propertyIsNullTypeEClass.getESuperTypes().add(this.getComparisonOpsType());
		propertyNameTypeEClass.getESuperTypes().add(this.getExpressionType());
		unaryLogicOpTypeEClass.getESuperTypes().add(this.getLogicOpsType());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractIdTypeEClass, AbstractIdType.class, "AbstractIdType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticOperatorsTypeEClass, ArithmeticOperatorsType.class, "ArithmeticOperatorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmeticOperatorsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ArithmeticOperatorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticOperatorsType_SimpleArithmetic(), this.getSimpleArithmeticType(), null, "simpleArithmetic", null, 0, -1, ArithmeticOperatorsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticOperatorsType_Functions(), this.getFunctionsType(), null, "functions", null, 0, -1, ArithmeticOperatorsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(bboxTypeEClass, BBOXType.class, "BBOXType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBBOXType_PropertyName(), this.getPropertyNameType(), null, "propertyName", null, 0, 1, BBOXType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBBOXType_EnvelopeGroup(), ecorePackage.getEFeatureMapEntry(), "envelopeGroup", null, 1, 1, BBOXType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBBOXType_Envelope(), theGMLPackage.getEnvelopeType(), null, "envelope", null, 1, 1, BBOXType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(binaryComparisonOpTypeEClass, BinaryComparisonOpType.class, "BinaryComparisonOpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryComparisonOpType_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 2, 2, BinaryComparisonOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryComparisonOpType_Expression(), this.getExpressionType(), null, "expression", null, 2, 2, BinaryComparisonOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryComparisonOpType_MatchCase(), theXMLTypePackage.getBoolean(), "matchCase", "true", 0, 1, BinaryComparisonOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryLogicOpTypeEClass, BinaryLogicOpType.class, "BinaryLogicOpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryLogicOpType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, BinaryLogicOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryLogicOpType_ComparisonOpsGroup(), ecorePackage.getEFeatureMapEntry(), "comparisonOpsGroup", null, 0, -1, BinaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryLogicOpType_ComparisonOps(), this.getComparisonOpsType(), null, "comparisonOps", null, 0, -1, BinaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryLogicOpType_SpatialOpsGroup(), ecorePackage.getEFeatureMapEntry(), "spatialOpsGroup", null, 0, -1, BinaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryLogicOpType_SpatialOps(), this.getSpatialOpsType(), null, "spatialOps", null, 0, -1, BinaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryLogicOpType_LogicOpsGroup(), ecorePackage.getEFeatureMapEntry(), "logicOpsGroup", null, 0, -1, BinaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryLogicOpType_LogicOps(), this.getLogicOpsType(), null, "logicOps", null, 0, -1, BinaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryLogicOpType_Function(), this.getFunctionType(), null, "function", null, 0, -1, BinaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(binaryOperatorTypeEClass, BinaryOperatorType.class, "BinaryOperatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryOperatorType_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 2, 2, BinaryOperatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperatorType_Expression(), this.getExpressionType(), null, "expression", null, 2, 2, BinaryOperatorType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(binarySpatialOpTypeEClass, BinarySpatialOpType.class, "BinarySpatialOpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinarySpatialOpType_PropertyName(), this.getPropertyNameType(), null, "propertyName", null, 1, 1, BinarySpatialOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinarySpatialOpType_PropertyName1(), this.getPropertyNameType(), null, "propertyName1", null, 0, 1, BinarySpatialOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinarySpatialOpType_GeometryGroup(), ecorePackage.getEFeatureMapEntry(), "geometryGroup", null, 0, 1, BinarySpatialOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinarySpatialOpType_Geometry(), theGMLPackage.getAbstractGeometryType(), null, "geometry", null, 0, 1, BinarySpatialOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinarySpatialOpType_EnvelopeGroup(), ecorePackage.getEFeatureMapEntry(), "envelopeGroup", null, 0, 1, BinarySpatialOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinarySpatialOpType_Envelope(), theGMLPackage.getEnvelopeType(), null, "envelope", null, 0, 1, BinarySpatialOpType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(comparisonOperatorsTypeEClass, ComparisonOperatorsType.class, "ComparisonOperatorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonOperatorsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ComparisonOperatorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonOperatorsType_ComparisonOperator(), this.getComparisonOperatorType(), "comparisonOperator", null, 1, -1, ComparisonOperatorsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(comparisonOpsTypeEClass, ComparisonOpsType.class, "ComparisonOpsType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distanceBufferTypeEClass, DistanceBufferType.class, "DistanceBufferType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistanceBufferType_PropertyName(), this.getPropertyNameType(), null, "propertyName", null, 1, 1, DistanceBufferType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceBufferType_GeometryGroup(), ecorePackage.getEFeatureMapEntry(), "geometryGroup", null, 1, 1, DistanceBufferType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistanceBufferType_Geometry(), theGMLPackage.getAbstractGeometryType(), null, "geometry", null, 1, 1, DistanceBufferType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDistanceBufferType_Distance(), this.getDistanceType(), null, "distance", null, 1, 1, DistanceBufferType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distanceTypeEClass, DistanceType.class, "DistanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceType_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, DistanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceType_Units(), theXMLTypePackage.getAnyURI(), "units", null, 1, 1, DistanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Id(), this.getAbstractIdType(), null, "id", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Add(), this.getBinaryOperatorType(), null, "add", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Expression(), this.getExpressionType(), null, "expression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_And(), this.getBinaryLogicOpType(), null, "and", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LogicOps(), this.getLogicOpsType(), null, "logicOps", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BBOX(), this.getBBOXType(), null, "bBOX", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpatialOps(), this.getSpatialOpsType(), null, "spatialOps", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Beyond(), this.getDistanceBufferType(), null, "beyond", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComparisonOps(), this.getComparisonOpsType(), null, "comparisonOps", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Contains(), this.getBinarySpatialOpType(), null, "contains", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Crosses(), this.getBinarySpatialOpType(), null, "crosses", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Disjoint(), this.getBinarySpatialOpType(), null, "disjoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Div(), this.getBinaryOperatorType(), null, "div", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DWithin(), this.getDistanceBufferType(), null, "dWithin", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EID(), this.getEIDType(), null, "eID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Equals(), this.getBinarySpatialOpType(), null, "equals", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureId(), this.getFeatureIdType(), null, "featureId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FID(), this.getFIDType(), null, "fID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Filter(), this.getFilterType(), null, "filter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FilterCapabilities(), this.getFilterCapabilitiesType(), null, "filterCapabilities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Function(), this.getFunctionType(), null, "function", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GmlObjectId(), this.getGmlObjectIdType(), null, "gmlObjectId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Intersects(), this.getBinarySpatialOpType(), null, "intersects", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Literal(), this.getLiteralType(), null, "literal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LogicalOperators(), this.getLogicalOperatorsType(), null, "logicalOperators", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mul(), this.getBinaryOperatorType(), null, "mul", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Not(), this.getUnaryLogicOpType(), null, "not", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Or(), this.getBinaryLogicOpType(), null, "or", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Overlaps(), this.getBinarySpatialOpType(), null, "overlaps", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsBetween(), this.getPropertyIsBetweenType(), null, "propertyIsBetween", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsEqualTo(), this.getBinaryComparisonOpType(), null, "propertyIsEqualTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsGreaterThan(), this.getBinaryComparisonOpType(), null, "propertyIsGreaterThan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsGreaterThanOrEqualTo(), this.getBinaryComparisonOpType(), null, "propertyIsGreaterThanOrEqualTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsLessThan(), this.getBinaryComparisonOpType(), null, "propertyIsLessThan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsLessThanOrEqualTo(), this.getBinaryComparisonOpType(), null, "propertyIsLessThanOrEqualTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsLike(), this.getPropertyIsLikeType(), null, "propertyIsLike", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsNotEqualTo(), this.getBinaryComparisonOpType(), null, "propertyIsNotEqualTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyIsNull(), this.getPropertyIsNullType(), null, "propertyIsNull", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyName(), this.getPropertyNameType(), null, "propertyName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SimpleArithmetic(), this.getSimpleArithmeticType(), null, "simpleArithmetic", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SortBy(), this.getSortByType(), null, "sortBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sub(), this.getBinaryOperatorType(), null, "sub", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Touches(), this.getBinarySpatialOpType(), null, "touches", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Within(), this.getBinarySpatialOpType(), null, "within", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eidTypeEClass, EIDType.class, "EIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionTypeEClass, ExpressionType.class, "ExpressionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureIdTypeEClass, FeatureIdType.class, "FeatureIdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureIdType_Fid(), theXMLTypePackage.getID(), "fid", null, 1, 1, FeatureIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fidTypeEClass, FIDType.class, "FIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterCapabilitiesTypeEClass, FilterCapabilitiesType.class, "FilterCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterCapabilitiesType_SpatialCapabilities(), this.getSpatialCapabilitiesType(), null, "spatialCapabilities", null, 1, 1, FilterCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterCapabilitiesType_ScalarCapabilities(), this.getScalarCapabilitiesType(), null, "scalarCapabilities", null, 1, 1, FilterCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterCapabilitiesType_IdCapabilities(), this.getIdCapabilitiesType(), null, "idCapabilities", null, 1, 1, FilterCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterTypeEClass, FilterType.class, "FilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterType_SpatialOpsGroup(), ecorePackage.getEFeatureMapEntry(), "spatialOpsGroup", null, 0, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterType_SpatialOps(), this.getSpatialOpsType(), null, "spatialOps", null, 0, 1, FilterType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterType_ComparisonOpsGroup(), ecorePackage.getEFeatureMapEntry(), "comparisonOpsGroup", null, 0, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterType_ComparisonOps(), this.getComparisonOpsType(), null, "comparisonOps", null, 0, 1, FilterType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterType_LogicOpsGroup(), ecorePackage.getEFeatureMapEntry(), "logicOpsGroup", null, 0, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterType_LogicOps(), this.getLogicOpsType(), null, "logicOps", null, 0, 1, FilterType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterType_IdGroup(), ecorePackage.getEFeatureMapEntry(), "idGroup", null, 0, -1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterType_Id(), this.getAbstractIdType(), null, "id", null, 0, -1, FilterType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionNamesTypeEClass, FunctionNamesType.class, "FunctionNamesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionNamesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FunctionNamesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionNamesType_FunctionName(), this.getFunctionNameType(), null, "functionName", null, 1, -1, FunctionNamesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionNameTypeEClass, FunctionNameType.class, "FunctionNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionNameType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, FunctionNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionNameType_NArgs(), theXMLTypePackage.getString(), "nArgs", null, 1, 1, FunctionNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionsTypeEClass, FunctionsType.class, "FunctionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionsType_FunctionNames(), this.getFunctionNamesType(), null, "functionNames", null, 1, 1, FunctionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionType_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, -1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Expression(), this.getExpressionType(), null, "expression", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryOperandsTypeEClass, GeometryOperandsType.class, "GeometryOperandsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeometryOperandsType_GeometryOperand(), this.getGeometryOperandType(), "geometryOperand", null, 1, -1, GeometryOperandsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gmlObjectIdTypeEClass, GmlObjectIdType.class, "GmlObjectIdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGmlObjectIdType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, GmlObjectIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idCapabilitiesTypeEClass, IdCapabilitiesType.class, "IdCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdCapabilitiesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, IdCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdCapabilitiesType_EID(), this.getEIDType(), null, "eID", null, 0, -1, IdCapabilitiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIdCapabilitiesType_FID(), this.getFIDType(), null, "fID", null, 0, -1, IdCapabilitiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(literalTypeEClass, LiteralType.class, "LiteralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, LiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteralType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, LiteralType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(logicalOperatorsTypeEClass, LogicalOperatorsType.class, "LogicalOperatorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicOpsTypeEClass, LogicOpsType.class, "LogicOpsType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerBoundaryTypeEClass, LowerBoundaryType.class, "LowerBoundaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLowerBoundaryType_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, 1, LowerBoundaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLowerBoundaryType_Expression(), this.getExpressionType(), null, "expression", null, 0, 1, LowerBoundaryType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertyIsBetweenTypeEClass, PropertyIsBetweenType.class, "PropertyIsBetweenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyIsBetweenType_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 1, 1, PropertyIsBetweenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyIsBetweenType_Expression(), this.getExpressionType(), null, "expression", null, 1, 1, PropertyIsBetweenType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyIsBetweenType_LowerBoundary(), this.getLowerBoundaryType(), null, "lowerBoundary", null, 1, 1, PropertyIsBetweenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyIsBetweenType_UpperBoundary(), this.getUpperBoundaryType(), null, "upperBoundary", null, 1, 1, PropertyIsBetweenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyIsLikeTypeEClass, PropertyIsLikeType.class, "PropertyIsLikeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyIsLikeType_PropertyName(), this.getPropertyNameType(), null, "propertyName", null, 1, 1, PropertyIsLikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyIsLikeType_Literal(), this.getLiteralType(), null, "literal", null, 1, 1, PropertyIsLikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyIsLikeType_EscapeChar(), theXMLTypePackage.getString(), "escapeChar", null, 1, 1, PropertyIsLikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyIsLikeType_MatchCase(), theXMLTypePackage.getBoolean(), "matchCase", "true", 0, 1, PropertyIsLikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyIsLikeType_SingleChar(), theXMLTypePackage.getString(), "singleChar", null, 1, 1, PropertyIsLikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyIsLikeType_WildCard(), theXMLTypePackage.getString(), "wildCard", null, 1, 1, PropertyIsLikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyIsNullTypeEClass, PropertyIsNullType.class, "PropertyIsNullType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyIsNullType_PropertyName(), this.getPropertyNameType(), null, "propertyName", null, 1, 1, PropertyIsNullType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyNameTypeEClass, PropertyNameType.class, "PropertyNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, PropertyNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalarCapabilitiesTypeEClass, ScalarCapabilitiesType.class, "ScalarCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalarCapabilitiesType_LogicalOperators(), this.getLogicalOperatorsType(), null, "logicalOperators", null, 0, 1, ScalarCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalarCapabilitiesType_ComparisonOperators(), this.getComparisonOperatorsType(), null, "comparisonOperators", null, 0, 1, ScalarCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalarCapabilitiesType_ArithmeticOperators(), this.getArithmeticOperatorsType(), null, "arithmeticOperators", null, 0, 1, ScalarCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleArithmeticTypeEClass, SimpleArithmeticType.class, "SimpleArithmeticType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortByTypeEClass, SortByType.class, "SortByType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortByType_SortProperty(), this.getSortPropertyType(), null, "sortProperty", null, 1, -1, SortByType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortPropertyTypeEClass, SortPropertyType.class, "SortPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortPropertyType_PropertyName(), this.getPropertyNameType(), null, "propertyName", null, 1, 1, SortPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortPropertyType_SortOrder(), this.getSortOrderType(), "sortOrder", null, 0, 1, SortPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialCapabilitiesTypeEClass, SpatialCapabilitiesType.class, "SpatialCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpatialCapabilitiesType_GeometryOperands(), this.getGeometryOperandsType(), null, "geometryOperands", null, 1, 1, SpatialCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpatialCapabilitiesType_SpatialOperators(), this.getSpatialOperatorsType(), null, "spatialOperators", null, 1, 1, SpatialCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialOperatorsTypeEClass, SpatialOperatorsType.class, "SpatialOperatorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpatialOperatorsType_SpatialOperator(), this.getSpatialOperatorType(), null, "spatialOperator", null, 1, -1, SpatialOperatorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialOperatorTypeEClass, SpatialOperatorType.class, "SpatialOperatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpatialOperatorType_GeometryOperands(), this.getGeometryOperandsType(), null, "geometryOperands", null, 0, 1, SpatialOperatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialOperatorType_Name(), this.getSpatialOperatorNameType(), "name", null, 0, 1, SpatialOperatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialOpsTypeEClass, SpatialOpsType.class, "SpatialOpsType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryLogicOpTypeEClass, UnaryLogicOpType.class, "UnaryLogicOpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryLogicOpType_ComparisonOpsGroup(), ecorePackage.getEFeatureMapEntry(), "comparisonOpsGroup", null, 0, 1, UnaryLogicOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryLogicOpType_ComparisonOps(), this.getComparisonOpsType(), null, "comparisonOps", null, 0, 1, UnaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryLogicOpType_SpatialOpsGroup(), ecorePackage.getEFeatureMapEntry(), "spatialOpsGroup", null, 0, 1, UnaryLogicOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryLogicOpType_SpatialOps(), this.getSpatialOpsType(), null, "spatialOps", null, 0, 1, UnaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryLogicOpType_LogicOpsGroup(), ecorePackage.getEFeatureMapEntry(), "logicOpsGroup", null, 0, 1, UnaryLogicOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryLogicOpType_LogicOps(), this.getLogicOpsType(), null, "logicOps", null, 0, 1, UnaryLogicOpType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryLogicOpType_Function(), this.getFunctionType(), null, "function", null, 0, 1, UnaryLogicOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upperBoundaryTypeEClass, UpperBoundaryType.class, "UpperBoundaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpperBoundaryType_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 1, 1, UpperBoundaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpperBoundaryType_Expression(), this.getExpressionType(), null, "expression", null, 1, 1, UpperBoundaryType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonOperatorTypeEEnum, ComparisonOperatorType.class, "ComparisonOperatorType");
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.LESS_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.GREATER_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.LESS_THAN_EQUAL_TO);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.GREATER_THAN_EQUAL_TO);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.EQUAL_TO);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.NOT_EQUAL_TO);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.LIKE);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.BETWEEN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.NULL_CHECK);

		initEEnum(sortOrderTypeEEnum, SortOrderType.class, "SortOrderType");
		addEEnumLiteral(sortOrderTypeEEnum, SortOrderType.DESC);
		addEEnumLiteral(sortOrderTypeEEnum, SortOrderType.ASC);

		initEEnum(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.class, "SpatialOperatorNameType");
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.BBOX);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.EQUALS);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.DISJOINT);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.INTERSECTS);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.TOUCHES);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.CROSSES);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.WITHIN);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.CONTAINS);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.OVERLAPS);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.BEYOND);
		addEEnumLiteral(spatialOperatorNameTypeEEnum, SpatialOperatorNameType.DWITHIN);

		// Initialize data types
		initEDataType(comparisonOperatorTypeObjectEDataType, ComparisonOperatorType.class, "ComparisonOperatorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geometryOperandTypeEDataType, QName.class, "GeometryOperandType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortOrderTypeObjectEDataType, SortOrderType.class, "SortOrderTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(spatialOperatorNameTypeObjectEDataType, SpatialOperatorNameType.class, "SpatialOperatorNameTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryAggregates3Annotations();
		// urn:opengis:specification:gml:schema-xsd:gml:3.1.1
		createUrnopengisspecificationgmlschemaxsdgml3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1
		createUrnopengisspecificationgmlschemaxsddynamicFeature3Annotations();
		// urn:opengis:specification:gml:schema-xsd:topology:3.1.1
		createUrnopengisspecificationgmlschemaxsdtopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coverage:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoverage3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:observation:3.1.1
		createUrnopengisspecificationgmlschemaxsdobservation3Annotations();
		// urn:opengis:specification:gml:schema-defaultStyle:v3.1.0
		createUrnopengisspecificationgmlschemadefaultStylev3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporalReferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryPrimitives3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryBasic2d3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryBasic0d1dv3Annotations();
		// urn:opengis:specification:gml:schema-measures:3.1.1
		createUrnopengisspecificationgmlschemameasures3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporalTopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1
		createUrnopengisspecificationgmlschemaxsddictionary3Annotations();
		// urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1
		createUrnopengisspecificationgmlschemaxsdgmlBase3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporal:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporal3Annotations();
		// urn:opengis:specification:gml:schema-units:3.1.1
		createUrnopengisspecificationgmlschemaunits3Annotations();
		// urn:opengis:specification:gml:schema-xsd:feature:v3.1.1
		createUrnopengisspecificationgmlschemaxsdfeaturev3Annotations();
		// urn:opengis:specification:gml:schema-xsd:direction:3.1.1
		createUrnopengisspecificationgmlschemaxsddirection3Annotations();
		// urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1
		createUrnopengisspecificationgmlschemaxsdvalueObjects3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:datums:3.1.1
		createUrnopengisspecificationgmlschemaxsddatums3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateOperations3Annotations();
		// urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdreferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1
		createUrnopengisspecificationgmlschemaxsddataQuality3Annotations();
		// urn:opengis:specification:gml:schema-xsd:grids:3.1.1
		createUrnopengisspecificationgmlschemaxsdgrids3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryComplexesv3Annotations();
		// urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1
		createUrnopengisspecificationgmlschemaxsdbasicTypes3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryAggregates3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryAggregates.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:gml:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgml3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:gml:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "gml.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddynamicFeature3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:topology:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtopology3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:topology:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "topology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coverage:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoverage3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coverage:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coverage.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:observation:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdobservation3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:observation:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "observation.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-defaultStyle:v3.1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemadefaultStylev3Annotations() {
		String source = "urn:opengis:specification:gml:schema-defaultStyle:v3.1.0";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "defaultStyle.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporalReferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryPrimitives3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryPrimitives.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryBasic2d3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic2d.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryBasic0d1dv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic0d1d.xsd\n\n  \t\t\t\n  <sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n  \t\t\t\n  <sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\n    <sch:rule abstract=\"true\" id=\"CRSLabels\">\n      \t\t\t\t\t\n      <sch:report test=\"not(@srsDimension) or @srsName\">The presence of a dimension attribute implies the presence of the srsName attribute.</sch:report>\n      \t\t\t\t\t\n      <sch:report test=\"not(@axisLabels) or @srsName\">The presence of an axisLabels attribute implies the presence of the srsName attribute.</sch:report>\n      \t\t\t\t\t\n      <sch:report test=\"not(@uomLabels) or @srsName\">The presence of an uomLabels attribute implies the presence of the srsName attribute.</sch:report>\n      \t\t\t\t\t\n      <sch:report test=\"(not(@uomLabels) and not(@axisLabels)) or (@uomLabels and @axisLabels)\">The presence of an uomLabels attribute implies the presence of the axisLabels attribute and vice versa.</sch:report>\n      \t\t\t\t\n    </sch:rule>\n    \t\t\t\n  </sch:pattern>\n  \t\t\t\n  <sch:pattern name=\"Check Dimension\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\n    <sch:rule abstract=\"true\" id=\"Count\">\n      \t\t\t\t\t\n      <sch:report test=\"not(@count) or @srsDimension\">The presence of a count attribute implies the presence of the dimension attribute.</sch:report>\n      \t\t\t\t\n    </sch:rule>\n    \t\t\t\n  </sch:pattern>\n  \t\t\n"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-measures:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemameasures3Annotations() {
		String source = "urn:opengis:specification:gml:schema-measures:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporalTopology3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddictionary3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgmlBase3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n  \t\t\t\n  <sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n  \t\t\t\n  <sch:ns prefix=\"gml\" uri=\"http://www.opengis.net/gml\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n  \t\t\t\n  <sch:ns prefix=\"xlink\" uri=\"http://www.w3.org/1999/xlink\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n  \t\t\t\n  <sch:pattern name=\"Check either href or content not both\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\n    <sch:rule abstract=\"true\" id=\"hrefOrContent\">\n      \t\t\t\t\t\n      <sch:report test=\"@xlink:href and (*|text())\">Property element may not carry both a reference to an object and contain an object.</sch:report>\n      \t\t\t\t\t\n      <sch:assert test=\"@xlink:href | (*|text())\">Property element must either carry a reference to an object or contain an object.</sch:assert>\n      \t\t\t\t\n    </sch:rule>\n    \t\t\t\n  </sch:pattern>\n  \t\t\n"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporal:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporal3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporal:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-units:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaunits3Annotations() {
		String source = "urn:opengis:specification:gml:schema-units:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:feature:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdfeaturev3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:feature:v3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:direction:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddirection3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:direction:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "direction.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdvalueObjects3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "valueObjects.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:datums:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddatums3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:datums:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateOperations3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdreferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddataQuality3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:grids:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgrids3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:grids:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "grids.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryComplexesv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryComplexes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdbasicTypes3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "basicTypes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (abstractIdTypeEClass,
		   source,
		   new String[] {
			   "name", "AbstractIdType",
			   "kind", "empty"
		   });
		addAnnotation
		  (arithmeticOperatorsTypeEClass,
		   source,
		   new String[] {
			   "name", "ArithmeticOperatorsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getArithmeticOperatorsType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getArithmeticOperatorsType_SimpleArithmetic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SimpleArithmetic",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getArithmeticOperatorsType_Functions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Functions",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (bboxTypeEClass,
		   source,
		   new String[] {
			   "name", "BBOXType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBBOXType_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBBOXType_EnvelopeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "Envelope:group",
			   "namespace", "http://www.opengis.net/gml"
		   });
		addAnnotation
		  (getBBOXType_Envelope(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Envelope",
			   "namespace", "http://www.opengis.net/gml",
			   "group", "http://www.opengis.net/gml#Envelope:group"
		   });
		addAnnotation
		  (binaryComparisonOpTypeEClass,
		   source,
		   new String[] {
			   "name", "BinaryComparisonOpType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinaryComparisonOpType_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBinaryComparisonOpType_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (getBinaryComparisonOpType_MatchCase(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "matchCase"
		   });
		addAnnotation
		  (binaryLogicOpTypeEClass,
		   source,
		   new String[] {
			   "name", "BinaryLogicOpType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinaryLogicOpType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getBinaryLogicOpType_ComparisonOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "comparisonOps:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBinaryLogicOpType_ComparisonOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comparisonOps",
			   "namespace", "##targetNamespace",
			   "group", "comparisonOps:group"
		   });
		addAnnotation
		  (getBinaryLogicOpType_SpatialOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "spatialOps:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBinaryLogicOpType_SpatialOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialOps",
			   "namespace", "##targetNamespace",
			   "group", "spatialOps:group"
		   });
		addAnnotation
		  (getBinaryLogicOpType_LogicOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "logicOps:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBinaryLogicOpType_LogicOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicOps",
			   "namespace", "##targetNamespace",
			   "group", "logicOps:group"
		   });
		addAnnotation
		  (getBinaryLogicOpType_Function(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Function",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (binaryOperatorTypeEClass,
		   source,
		   new String[] {
			   "name", "BinaryOperatorType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinaryOperatorType_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBinaryOperatorType_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (binarySpatialOpTypeEClass,
		   source,
		   new String[] {
			   "name", "BinarySpatialOpType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinarySpatialOpType_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBinarySpatialOpType_PropertyName1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBinarySpatialOpType_GeometryGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "_Geometry:group",
			   "namespace", "http://www.opengis.net/gml"
		   });
		addAnnotation
		  (getBinarySpatialOpType_Geometry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_Geometry",
			   "namespace", "http://www.opengis.net/gml",
			   "group", "http://www.opengis.net/gml#_Geometry:group"
		   });
		addAnnotation
		  (getBinarySpatialOpType_EnvelopeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "Envelope:group",
			   "namespace", "http://www.opengis.net/gml"
		   });
		addAnnotation
		  (getBinarySpatialOpType_Envelope(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Envelope",
			   "namespace", "http://www.opengis.net/gml",
			   "group", "http://www.opengis.net/gml#Envelope:group"
		   });
		addAnnotation
		  (comparisonOperatorsTypeEClass,
		   source,
		   new String[] {
			   "name", "ComparisonOperatorsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComparisonOperatorsType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getComparisonOperatorsType_ComparisonOperator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComparisonOperator",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (comparisonOperatorTypeEEnum,
		   source,
		   new String[] {
			   "name", "ComparisonOperatorType"
		   });
		addAnnotation
		  (comparisonOperatorTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ComparisonOperatorType:Object",
			   "baseType", "ComparisonOperatorType"
		   });
		addAnnotation
		  (comparisonOpsTypeEClass,
		   source,
		   new String[] {
			   "name", "ComparisonOpsType",
			   "kind", "empty"
		   });
		addAnnotation
		  (distanceBufferTypeEClass,
		   source,
		   new String[] {
			   "name", "DistanceBufferType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDistanceBufferType_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistanceBufferType_GeometryGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "_Geometry:group",
			   "namespace", "http://www.opengis.net/gml"
		   });
		addAnnotation
		  (getDistanceBufferType_Geometry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_Geometry",
			   "namespace", "http://www.opengis.net/gml",
			   "group", "http://www.opengis.net/gml#_Geometry:group"
		   });
		addAnnotation
		  (getDistanceBufferType_Distance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Distance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (distanceTypeEClass,
		   source,
		   new String[] {
			   "name", "DistanceType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDistanceType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDistanceType_Units(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "units"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_Id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Add(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Add",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDocumentRoot_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_And(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "And",
			   "namespace", "##targetNamespace",
			   "affiliation", "logicOps"
		   });
		addAnnotation
		  (getDocumentRoot_LogicOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicOps",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_BBOX(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BBOX",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_SpatialOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialOps",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Beyond(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beyond",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_ComparisonOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comparisonOps",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Contains(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Contains",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_Crosses(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Crosses",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_Disjoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Disjoint",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_Div(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Div",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDocumentRoot_DWithin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DWithin",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_EID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Equals(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Equals",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_FeatureId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureId",
			   "namespace", "##targetNamespace",
			   "affiliation", "_Id"
		   });
		addAnnotation
		  (getDocumentRoot_FID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Filter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FilterCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filter_Capabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Function(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Function",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDocumentRoot_GmlObjectId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GmlObjectId",
			   "namespace", "##targetNamespace",
			   "affiliation", "_Id"
		   });
		addAnnotation
		  (getDocumentRoot_Intersects(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Intersects",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_Literal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Literal",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDocumentRoot_LogicalOperators(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LogicalOperators",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Mul(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Mul",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDocumentRoot_Not(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Not",
			   "namespace", "##targetNamespace",
			   "affiliation", "logicOps"
		   });
		addAnnotation
		  (getDocumentRoot_Or(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Or",
			   "namespace", "##targetNamespace",
			   "affiliation", "logicOps"
		   });
		addAnnotation
		  (getDocumentRoot_Overlaps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Overlaps",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsBetween(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsBetween",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsEqualTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsEqualTo",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsGreaterThan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsGreaterThan",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsGreaterThanOrEqualTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsGreaterThanOrEqualTo",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsLessThan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsLessThan",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsLessThanOrEqualTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsLessThanOrEqualTo",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsLike(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsLike",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsNotEqualTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsNotEqualTo",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyIsNull(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyIsNull",
			   "namespace", "##targetNamespace",
			   "affiliation", "comparisonOps"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDocumentRoot_SimpleArithmetic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SimpleArithmetic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SortBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sub",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDocumentRoot_Touches(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Touches",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (getDocumentRoot_Within(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Within",
			   "namespace", "##targetNamespace",
			   "affiliation", "spatialOps"
		   });
		addAnnotation
		  (eidTypeEClass,
		   source,
		   new String[] {
			   "name", "EID_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (expressionTypeEClass,
		   source,
		   new String[] {
			   "name", "ExpressionType",
			   "kind", "empty"
		   });
		addAnnotation
		  (featureIdTypeEClass,
		   source,
		   new String[] {
			   "name", "FeatureIdType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getFeatureIdType_Fid(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fid"
		   });
		addAnnotation
		  (fidTypeEClass,
		   source,
		   new String[] {
			   "name", "FID_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (filterCapabilitiesTypeEClass,
		   source,
		   new String[] {
			   "name", "Filter_Capabilities_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFilterCapabilitiesType_SpatialCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Spatial_Capabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFilterCapabilitiesType_ScalarCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Scalar_Capabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFilterCapabilitiesType_IdCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Id_Capabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (filterTypeEClass,
		   source,
		   new String[] {
			   "name", "FilterType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFilterType_SpatialOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "spatialOps:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFilterType_SpatialOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialOps",
			   "namespace", "##targetNamespace",
			   "group", "spatialOps:group"
		   });
		addAnnotation
		  (getFilterType_ComparisonOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "comparisonOps:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFilterType_ComparisonOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comparisonOps",
			   "namespace", "##targetNamespace",
			   "group", "comparisonOps:group"
		   });
		addAnnotation
		  (getFilterType_LogicOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "logicOps:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFilterType_LogicOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicOps",
			   "namespace", "##targetNamespace",
			   "group", "logicOps:group"
		   });
		addAnnotation
		  (getFilterType_IdGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "_Id:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFilterType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_Id",
			   "namespace", "##targetNamespace",
			   "group", "_Id:group"
		   });
		addAnnotation
		  (functionNamesTypeEClass,
		   source,
		   new String[] {
			   "name", "FunctionNamesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionNamesType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getFunctionNamesType_FunctionName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FunctionName",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (functionNameTypeEClass,
		   source,
		   new String[] {
			   "name", "FunctionNameType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getFunctionNameType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getFunctionNameType_NArgs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nArgs"
		   });
		addAnnotation
		  (functionsTypeEClass,
		   source,
		   new String[] {
			   "name", "FunctionsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionsType_FunctionNames(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FunctionNames",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (functionTypeEClass,
		   source,
		   new String[] {
			   "name", "FunctionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionType_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFunctionType_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (getFunctionType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (geometryOperandsTypeEClass,
		   source,
		   new String[] {
			   "name", "GeometryOperandsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeometryOperandsType_GeometryOperand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GeometryOperand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geometryOperandTypeEDataType,
		   source,
		   new String[] {
			   "name", "GeometryOperandType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#QName",
			   "enumeration", "{http://www.opengis.net/gml}Envelope {http://www.opengis.net/gml}Point {http://www.opengis.net/gml}LineString {http://www.opengis.net/gml}Polygon {http://www.opengis.net/gml}ArcByCenterPoint {http://www.opengis.net/gml}CircleByCenterPoint {http://www.opengis.net/gml}Arc {http://www.opengis.net/gml}Circle {http://www.opengis.net/gml}ArcByBulge {http://www.opengis.net/gml}Bezier {http://www.opengis.net/gml}Clothoid {http://www.opengis.net/gml}CubicSpline {http://www.opengis.net/gml}Geodesic {http://www.opengis.net/gml}OffsetCurve {http://www.opengis.net/gml}Triangle {http://www.opengis.net/gml}PolyhedralSurface {http://www.opengis.net/gml}TriangulatedSurface {http://www.opengis.net/gml}Tin {http://www.opengis.net/gml}Solid"
		   });
		addAnnotation
		  (gmlObjectIdTypeEClass,
		   source,
		   new String[] {
			   "name", "GmlObjectIdType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getGmlObjectIdType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "http://www.opengis.net/gml"
		   });
		addAnnotation
		  (idCapabilitiesTypeEClass,
		   source,
		   new String[] {
			   "name", "Id_CapabilitiesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdCapabilitiesType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getIdCapabilitiesType_EID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EID",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getIdCapabilitiesType_FID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FID",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (literalTypeEClass,
		   source,
		   new String[] {
			   "name", "LiteralType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getLiteralType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getLiteralType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":1",
			   "processing", "strict"
		   });
		addAnnotation
		  (logicalOperatorsTypeEClass,
		   source,
		   new String[] {
			   "name", "LogicalOperators_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (logicOpsTypeEClass,
		   source,
		   new String[] {
			   "name", "LogicOpsType",
			   "kind", "empty"
		   });
		addAnnotation
		  (lowerBoundaryTypeEClass,
		   source,
		   new String[] {
			   "name", "LowerBoundaryType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLowerBoundaryType_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLowerBoundaryType_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (propertyIsBetweenTypeEClass,
		   source,
		   new String[] {
			   "name", "PropertyIsBetweenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertyIsBetweenType_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPropertyIsBetweenType_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (getPropertyIsBetweenType_LowerBoundary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LowerBoundary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPropertyIsBetweenType_UpperBoundary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpperBoundary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (propertyIsLikeTypeEClass,
		   source,
		   new String[] {
			   "name", "PropertyIsLikeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertyIsLikeType_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPropertyIsLikeType_Literal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Literal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPropertyIsLikeType_EscapeChar(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "escapeChar"
		   });
		addAnnotation
		  (getPropertyIsLikeType_MatchCase(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "matchCase"
		   });
		addAnnotation
		  (getPropertyIsLikeType_SingleChar(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "singleChar"
		   });
		addAnnotation
		  (getPropertyIsLikeType_WildCard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "wildCard"
		   });
		addAnnotation
		  (propertyIsNullTypeEClass,
		   source,
		   new String[] {
			   "name", "PropertyIsNullType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertyIsNullType_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (propertyNameTypeEClass,
		   source,
		   new String[] {
			   "name", "PropertyNameType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getPropertyNameType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (scalarCapabilitiesTypeEClass,
		   source,
		   new String[] {
			   "name", "Scalar_CapabilitiesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScalarCapabilitiesType_LogicalOperators(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LogicalOperators",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScalarCapabilitiesType_ComparisonOperators(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComparisonOperators",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScalarCapabilitiesType_ArithmeticOperators(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArithmeticOperators",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (simpleArithmeticTypeEClass,
		   source,
		   new String[] {
			   "name", "SimpleArithmetic_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (sortByTypeEClass,
		   source,
		   new String[] {
			   "name", "SortByType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSortByType_SortProperty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortProperty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sortOrderTypeEEnum,
		   source,
		   new String[] {
			   "name", "SortOrderType"
		   });
		addAnnotation
		  (sortOrderTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SortOrderType:Object",
			   "baseType", "SortOrderType"
		   });
		addAnnotation
		  (sortPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "SortPropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSortPropertyType_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSortPropertyType_SortOrder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortOrder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (spatialCapabilitiesTypeEClass,
		   source,
		   new String[] {
			   "name", "Spatial_CapabilitiesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpatialCapabilitiesType_GeometryOperands(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GeometryOperands",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpatialCapabilitiesType_SpatialOperators(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpatialOperators",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (spatialOperatorNameTypeEEnum,
		   source,
		   new String[] {
			   "name", "SpatialOperatorNameType"
		   });
		addAnnotation
		  (spatialOperatorNameTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SpatialOperatorNameType:Object",
			   "baseType", "SpatialOperatorNameType"
		   });
		addAnnotation
		  (spatialOperatorsTypeEClass,
		   source,
		   new String[] {
			   "name", "SpatialOperatorsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpatialOperatorsType_SpatialOperator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpatialOperator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (spatialOperatorTypeEClass,
		   source,
		   new String[] {
			   "name", "SpatialOperatorType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpatialOperatorType_GeometryOperands(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GeometryOperands",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpatialOperatorType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (spatialOpsTypeEClass,
		   source,
		   new String[] {
			   "name", "SpatialOpsType",
			   "kind", "empty"
		   });
		addAnnotation
		  (unaryLogicOpTypeEClass,
		   source,
		   new String[] {
			   "name", "UnaryLogicOpType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnaryLogicOpType_ComparisonOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "comparisonOps:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnaryLogicOpType_ComparisonOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comparisonOps",
			   "namespace", "##targetNamespace",
			   "group", "comparisonOps:group"
		   });
		addAnnotation
		  (getUnaryLogicOpType_SpatialOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "spatialOps:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnaryLogicOpType_SpatialOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialOps",
			   "namespace", "##targetNamespace",
			   "group", "spatialOps:group"
		   });
		addAnnotation
		  (getUnaryLogicOpType_LogicOpsGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "logicOps:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnaryLogicOpType_LogicOps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicOps",
			   "namespace", "##targetNamespace",
			   "group", "logicOps:group"
		   });
		addAnnotation
		  (getUnaryLogicOpType_Function(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Function",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (upperBoundaryTypeEClass,
		   source,
		   new String[] {
			   "name", "UpperBoundaryType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpperBoundaryType_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpperBoundaryType_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (getBinarySpatialOpType_GeometryGroup(),
		   source,
		   new String[] {
			   "appinfo", "\n  \t\t\t\t\n  <sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\t\n    <sch:rule context=\"gml:_Geometry\">\n      \t\t\t\t\t\t\n      <sch:extends rule=\"CRSLabels\"/>\n      \t\t\t\t\t\n    </sch:rule>\n    \t\t\t\t\n  </sch:pattern>\n  \t\t\t\n"
		   });
		addAnnotation
		  (getBinarySpatialOpType_Geometry(),
		   source,
		   new String[] {
			   "appinfo", "\n  \t\t\t\t\n  <sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\t\n    <sch:rule context=\"gml:_Geometry\">\n      \t\t\t\t\t\t\n      <sch:extends rule=\"CRSLabels\"/>\n      \t\t\t\t\t\n    </sch:rule>\n    \t\t\t\t\n  </sch:pattern>\n  \t\t\t\n"
		   });
		addAnnotation
		  (getDistanceBufferType_GeometryGroup(),
		   source,
		   new String[] {
			   "appinfo", "\n  \t\t\t\t\n  <sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\t\n    <sch:rule context=\"gml:_Geometry\">\n      \t\t\t\t\t\t\n      <sch:extends rule=\"CRSLabels\"/>\n      \t\t\t\t\t\n    </sch:rule>\n    \t\t\t\t\n  </sch:pattern>\n  \t\t\t\n"
		   });
		addAnnotation
		  (getDistanceBufferType_Geometry(),
		   source,
		   new String[] {
			   "appinfo", "\n  \t\t\t\t\n  <sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\t\n    <sch:rule context=\"gml:_Geometry\">\n      \t\t\t\t\t\t\n      <sch:extends rule=\"CRSLabels\"/>\n      \t\t\t\t\t\n    </sch:rule>\n    \t\t\t\t\n  </sch:pattern>\n  \t\t\t\n"
		   });
	}

} //OGCPackageImpl
