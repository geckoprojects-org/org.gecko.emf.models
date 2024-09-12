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
package org.isotc211._2005.gco.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.gml.GMLPackage;

import net.opengis.gml.gml.impl.GMLPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.AnglePropertyType;
import org.isotc211._2005.gco.BinaryPropertyType;
import org.isotc211._2005.gco.BinaryType;
import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.CodeListValueType;
import org.isotc211._2005.gco.DatePropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;
import org.isotc211._2005.gco.DecimalPropertyType;
import org.isotc211._2005.gco.DistancePropertyType;
import org.isotc211._2005.gco.DocumentRoot;
import org.isotc211._2005.gco.GCOFactory;
import org.isotc211._2005.gco.GCOPackage;
import org.isotc211._2005.gco.GenericNamePropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.LengthPropertyType;
import org.isotc211._2005.gco.LocalNamePropertyType;
import org.isotc211._2005.gco.MeasurePropertyType;
import org.isotc211._2005.gco.MemberNamePropertyType;
import org.isotc211._2005.gco.MemberNameType;
import org.isotc211._2005.gco.MultiplicityPropertyType;
import org.isotc211._2005.gco.MultiplicityRangePropertyType;
import org.isotc211._2005.gco.MultiplicityRangeType;
import org.isotc211._2005.gco.MultiplicityType;
import org.isotc211._2005.gco.NumberPropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;
import org.isotc211._2005.gco.RealPropertyType;
import org.isotc211._2005.gco.RecordPropertyType;
import org.isotc211._2005.gco.RecordTypePropertyType;
import org.isotc211._2005.gco.RecordTypeType;
import org.isotc211._2005.gco.ScalePropertyType;
import org.isotc211._2005.gco.ScopedNamePropertyType;
import org.isotc211._2005.gco.TypeNamePropertyType;
import org.isotc211._2005.gco.TypeNameType;
import org.isotc211._2005.gco.UnitOfMeasurePropertyType;
import org.isotc211._2005.gco.UnlimitedIntegerPropertyType;
import org.isotc211._2005.gco.UnlimitedIntegerType;
import org.isotc211._2005.gco.UomAnglePropertyType;
import org.isotc211._2005.gco.UomAreaPropertyType;
import org.isotc211._2005.gco.UomLengthPropertyType;
import org.isotc211._2005.gco.UomScalePropertyType;
import org.isotc211._2005.gco.UomTimePropertyType;
import org.isotc211._2005.gco.UomVelocityPropertyType;
import org.isotc211._2005.gco.UomVolumePropertyType;

import org.isotc211._2005.gco.util.GCOValidator;

import org.isotc211._2005.gmd.GMDPackage;

import org.isotc211._2005.gmd.impl.GMDPackageImpl;

import org.isotc211._2005.gsr.GSRPackage;

import org.isotc211._2005.gsr.impl.GSRPackageImpl;

import org.isotc211._2005.gss.GSSPackage;

import org.isotc211._2005.gss.impl.GSSPackageImpl;

import org.isotc211._2005.gts.GTSPackage;

import org.isotc211._2005.gts.impl.GTSPackageImpl;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GCOPackageImpl extends EPackageImpl implements GCOPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anglePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterStringPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeListValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distancePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericNamePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localNamePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityRangePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectReferencePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realPropertyTypeEClass = null;

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
	private EClass measurePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberNamePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedNamePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNamePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitOfMeasurePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlimitedIntegerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlimitedIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomAnglePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomAreaPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomLengthPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomScalePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomTimePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomVelocityPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomVolumePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTypeEDataType = null;

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
	 * @see org.isotc211._2005.gco.GCOPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GCOPackageImpl() {
		super(eNS_URI, GCOFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GCOPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GCOPackage init() {
		if (isInited) return (GCOPackage)EPackage.Registry.INSTANCE.getEPackage(GCOPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGCOPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GCOPackageImpl theGCOPackage = registeredGCOPackage instanceof GCOPackageImpl ? (GCOPackageImpl)registeredGCOPackage : new GCOPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		GMLPackageImpl theGMLPackage = (GMLPackageImpl)(registeredPackage instanceof GMLPackageImpl ? registeredPackage : GMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI);
		GMDPackageImpl theGMDPackage = (GMDPackageImpl)(registeredPackage instanceof GMDPackageImpl ? registeredPackage : GMDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GTSPackage.eNS_URI);
		GTSPackageImpl theGTSPackage = (GTSPackageImpl)(registeredPackage instanceof GTSPackageImpl ? registeredPackage : GTSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI);
		GSRPackageImpl theGSRPackage = (GSRPackageImpl)(registeredPackage instanceof GSRPackageImpl ? registeredPackage : GSRPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(registeredPackage instanceof GSSPackageImpl ? registeredPackage : GSSPackage.eINSTANCE);

		// Load packages
		theGMLPackage.loadPackage();
		theGMDPackage.loadPackage();

		// Create package meta-data objects
		theGCOPackage.createPackageContents();
		theGTSPackage.createPackageContents();
		theGSRPackage.createPackageContents();
		theGSSPackage.createPackageContents();

		// Initialize created meta-data
		theGCOPackage.initializePackageContents();
		theGTSPackage.initializePackageContents();
		theGSRPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();

		// Fix loaded packages
		theGMLPackage.fixPackageContents();
		theGMDPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGCOPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return GCOValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGCOPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GCOPackage.eNS_URI, theGCOPackage);
		return theGCOPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractObjectType() {
		return abstractObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractObjectType_Id() {
		return (EAttribute)abstractObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractObjectType_Uuid() {
		return (EAttribute)abstractObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnglePropertyType() {
		return anglePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnglePropertyType_Angle() {
		return (EReference)anglePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnglePropertyType_NilReason() {
		return (EAttribute)anglePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryPropertyType() {
		return binaryPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryPropertyType_Binary() {
		return (EReference)binaryPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryPropertyType_NilReason() {
		return (EAttribute)binaryPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryType() {
		return binaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryType_Value() {
		return (EAttribute)binaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryType_Src() {
		return (EAttribute)binaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanPropertyType() {
		return booleanPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanPropertyType_Boolean() {
		return (EAttribute)booleanPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanPropertyType_NilReason() {
		return (EAttribute)booleanPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacterStringPropertyType() {
		return characterStringPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterStringPropertyType_CharacterStringGroup() {
		return (EAttribute)characterStringPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterStringPropertyType_CharacterString() {
		return (EAttribute)characterStringPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterStringPropertyType_NilReason() {
		return (EAttribute)characterStringPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeListValueType() {
		return codeListValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeListValueType_Value() {
		return (EAttribute)codeListValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeListValueType_CodeList() {
		return (EAttribute)codeListValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeListValueType_CodeListValue() {
		return (EAttribute)codeListValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeListValueType_CodeSpace() {
		return (EAttribute)codeListValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatePropertyType() {
		return datePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatePropertyType_Date() {
		return (EAttribute)datePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatePropertyType_DateTime() {
		return (EAttribute)datePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatePropertyType_NilReason() {
		return (EAttribute)datePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTimePropertyType() {
		return dateTimePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimePropertyType_DateTime() {
		return (EAttribute)dateTimePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimePropertyType_NilReason() {
		return (EAttribute)dateTimePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalPropertyType() {
		return decimalPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalPropertyType_Decimal() {
		return (EAttribute)decimalPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalPropertyType_NilReason() {
		return (EAttribute)decimalPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistancePropertyType() {
		return distancePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistancePropertyType_Distance() {
		return (EReference)distancePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistancePropertyType_NilReason() {
		return (EAttribute)distancePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericNamePropertyType() {
		return genericNamePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericNamePropertyType_AbstractGenericNameGroup() {
		return (EAttribute)genericNamePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericNamePropertyType_AbstractGenericName() {
		return (EReference)genericNamePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericNamePropertyType_NilReason() {
		return (EAttribute)genericNamePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerPropertyType() {
		return integerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerPropertyType_Integer() {
		return (EAttribute)integerPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerPropertyType_NilReason() {
		return (EAttribute)integerPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLengthPropertyType() {
		return lengthPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLengthPropertyType_LengthGroup() {
		return (EAttribute)lengthPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLengthPropertyType_Length() {
		return (EReference)lengthPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLengthPropertyType_NilReason() {
		return (EAttribute)lengthPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalNamePropertyType() {
		return localNamePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalNamePropertyType_LocalName() {
		return (EReference)localNamePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalNamePropertyType_NilReason() {
		return (EAttribute)localNamePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicityPropertyType() {
		return multiplicityPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityPropertyType_Multiplicity() {
		return (EReference)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Actuate() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Arcrole() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Href() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_NilReason() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Role() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Show() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Title() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Type() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityPropertyType_Uuidref() {
		return (EAttribute)multiplicityPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicityRangePropertyType() {
		return multiplicityRangePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityRangePropertyType_MultiplicityRange() {
		return (EReference)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Actuate() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Arcrole() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Href() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_NilReason() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Role() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Show() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Title() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Type() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangePropertyType_Uuidref() {
		return (EAttribute)multiplicityRangePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectReferencePropertyType() {
		return objectReferencePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Actuate() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Arcrole() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Href() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_NilReason() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Role() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Show() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Title() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Type() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectReferencePropertyType_Uuidref() {
		return (EAttribute)objectReferencePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealPropertyType() {
		return realPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealPropertyType_Real() {
		return (EAttribute)realPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealPropertyType_NilReason() {
		return (EAttribute)realPropertyTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AbstractGenericName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Angle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Measure() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Binary() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Boolean() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CharacterString() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Date() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_DateTime() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Decimal() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Distance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Length() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Integer() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LocalName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MemberName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Multiplicity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MultiplicityRange() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Real() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Record() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RecordType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Scale() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ScopedName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TypeName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnlimitedInteger() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_IsoType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_NilReason() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurePropertyType() {
		return measurePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurePropertyType_MeasureGroup() {
		return (EAttribute)measurePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurePropertyType_Measure() {
		return (EReference)measurePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurePropertyType_NilReason() {
		return (EAttribute)measurePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberNamePropertyType() {
		return memberNamePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberNamePropertyType_MemberName() {
		return (EReference)memberNamePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Actuate() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Arcrole() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Href() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_NilReason() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Role() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Show() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Title() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Type() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberNamePropertyType_Uuidref() {
		return (EAttribute)memberNamePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberNameType() {
		return memberNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberNameType_AName() {
		return (EReference)memberNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberNameType_AttributeType() {
		return (EReference)memberNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicityRangeType() {
		return multiplicityRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityRangeType_Lower() {
		return (EReference)multiplicityRangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityRangeType_Upper() {
		return (EReference)multiplicityRangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicityType() {
		return multiplicityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityType_Range() {
		return (EReference)multiplicityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberPropertyType() {
		return numberPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberPropertyType_Real() {
		return (EAttribute)numberPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberPropertyType_Decimal() {
		return (EAttribute)numberPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberPropertyType_Integer() {
		return (EAttribute)numberPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberPropertyType_NilReason() {
		return (EAttribute)numberPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordPropertyType() {
		return recordPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordPropertyType_Record() {
		return (EReference)recordPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Actuate() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Arcrole() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Href() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_NilReason() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Role() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Show() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Title() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Type() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordPropertyType_Uuidref() {
		return (EAttribute)recordPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordTypePropertyType() {
		return recordTypePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordTypePropertyType_RecordType() {
		return (EReference)recordTypePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypePropertyType_NilReason() {
		return (EAttribute)recordTypePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordTypeType() {
		return recordTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Value() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Actuate() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Arcrole() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Href() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Role() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Show() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Title() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTypeType_Type() {
		return (EAttribute)recordTypeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalePropertyType() {
		return scalePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalePropertyType_Scale() {
		return (EReference)scalePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalePropertyType_NilReason() {
		return (EAttribute)scalePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScopedNamePropertyType() {
		return scopedNamePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScopedNamePropertyType_ScopedName() {
		return (EReference)scopedNamePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScopedNamePropertyType_NilReason() {
		return (EAttribute)scopedNamePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeNamePropertyType() {
		return typeNamePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeNamePropertyType_TypeName() {
		return (EReference)typeNamePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Actuate() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Arcrole() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Href() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_NilReason() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Role() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Show() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Title() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Type() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeNamePropertyType_Uuidref() {
		return (EAttribute)typeNamePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeNameType() {
		return typeNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeNameType_AName() {
		return (EReference)typeNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitOfMeasurePropertyType() {
		return unitOfMeasurePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_UnitDefinitionGroup() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitOfMeasurePropertyType_UnitDefinition() {
		return (EReference)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Actuate() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Arcrole() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Href() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_NilReason() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Role() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Show() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Title() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Type() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfMeasurePropertyType_Uuidref() {
		return (EAttribute)unitOfMeasurePropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnlimitedIntegerPropertyType() {
		return unlimitedIntegerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnlimitedIntegerPropertyType_UnlimitedInteger() {
		return (EReference)unlimitedIntegerPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnlimitedIntegerPropertyType_NilReason() {
		return (EAttribute)unlimitedIntegerPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnlimitedIntegerType() {
		return unlimitedIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnlimitedIntegerType_Value() {
		return (EAttribute)unlimitedIntegerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnlimitedIntegerType_IsInfinite() {
		return (EAttribute)unlimitedIntegerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomAnglePropertyType() {
		return uomAnglePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_UnitDefinitionGroup() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomAnglePropertyType_UnitDefinition() {
		return (EReference)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Actuate() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Arcrole() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Href() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_NilReason() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Role() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Show() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Title() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Type() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAnglePropertyType_Uuidref() {
		return (EAttribute)uomAnglePropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomAreaPropertyType() {
		return uomAreaPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_UnitDefinitionGroup() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomAreaPropertyType_UnitDefinition() {
		return (EReference)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Actuate() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Arcrole() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Href() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_NilReason() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Role() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Show() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Title() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Type() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomAreaPropertyType_Uuidref() {
		return (EAttribute)uomAreaPropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomLengthPropertyType() {
		return uomLengthPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_UnitDefinitionGroup() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomLengthPropertyType_UnitDefinition() {
		return (EReference)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Actuate() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Arcrole() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Href() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_NilReason() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Role() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Show() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Title() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Type() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomLengthPropertyType_Uuidref() {
		return (EAttribute)uomLengthPropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomScalePropertyType() {
		return uomScalePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_UnitDefinitionGroup() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomScalePropertyType_UnitDefinition() {
		return (EReference)uomScalePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Actuate() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Arcrole() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Href() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_NilReason() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Role() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Show() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Title() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Type() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomScalePropertyType_Uuidref() {
		return (EAttribute)uomScalePropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomTimePropertyType() {
		return uomTimePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_UnitDefinitionGroup() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomTimePropertyType_UnitDefinition() {
		return (EReference)uomTimePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Actuate() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Arcrole() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Href() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_NilReason() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Role() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Show() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Title() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Type() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomTimePropertyType_Uuidref() {
		return (EAttribute)uomTimePropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomVelocityPropertyType() {
		return uomVelocityPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_UnitDefinitionGroup() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomVelocityPropertyType_UnitDefinition() {
		return (EReference)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Actuate() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Arcrole() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Href() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_NilReason() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Role() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Show() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Title() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Type() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVelocityPropertyType_Uuidref() {
		return (EAttribute)uomVelocityPropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomVolumePropertyType() {
		return uomVolumePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_UnitDefinitionGroup() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomVolumePropertyType_UnitDefinition() {
		return (EReference)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Actuate() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Arcrole() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Href() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_NilReason() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Role() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Show() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Title() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Type() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomVolumePropertyType_Uuidref() {
		return (EAttribute)uomVolumePropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateType() {
		return dateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GCOFactory getGCOFactory() {
		return (GCOFactory)getEFactoryInstance();
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
		abstractObjectTypeEClass = createEClass(ABSTRACT_OBJECT_TYPE);
		createEAttribute(abstractObjectTypeEClass, ABSTRACT_OBJECT_TYPE__ID);
		createEAttribute(abstractObjectTypeEClass, ABSTRACT_OBJECT_TYPE__UUID);

		anglePropertyTypeEClass = createEClass(ANGLE_PROPERTY_TYPE);
		createEReference(anglePropertyTypeEClass, ANGLE_PROPERTY_TYPE__ANGLE);
		createEAttribute(anglePropertyTypeEClass, ANGLE_PROPERTY_TYPE__NIL_REASON);

		binaryPropertyTypeEClass = createEClass(BINARY_PROPERTY_TYPE);
		createEReference(binaryPropertyTypeEClass, BINARY_PROPERTY_TYPE__BINARY);
		createEAttribute(binaryPropertyTypeEClass, BINARY_PROPERTY_TYPE__NIL_REASON);

		binaryTypeEClass = createEClass(BINARY_TYPE);
		createEAttribute(binaryTypeEClass, BINARY_TYPE__VALUE);
		createEAttribute(binaryTypeEClass, BINARY_TYPE__SRC);

		booleanPropertyTypeEClass = createEClass(BOOLEAN_PROPERTY_TYPE);
		createEAttribute(booleanPropertyTypeEClass, BOOLEAN_PROPERTY_TYPE__BOOLEAN);
		createEAttribute(booleanPropertyTypeEClass, BOOLEAN_PROPERTY_TYPE__NIL_REASON);

		characterStringPropertyTypeEClass = createEClass(CHARACTER_STRING_PROPERTY_TYPE);
		createEAttribute(characterStringPropertyTypeEClass, CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP);
		createEAttribute(characterStringPropertyTypeEClass, CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING);
		createEAttribute(characterStringPropertyTypeEClass, CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON);

		codeListValueTypeEClass = createEClass(CODE_LIST_VALUE_TYPE);
		createEAttribute(codeListValueTypeEClass, CODE_LIST_VALUE_TYPE__VALUE);
		createEAttribute(codeListValueTypeEClass, CODE_LIST_VALUE_TYPE__CODE_LIST);
		createEAttribute(codeListValueTypeEClass, CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE);
		createEAttribute(codeListValueTypeEClass, CODE_LIST_VALUE_TYPE__CODE_SPACE);

		datePropertyTypeEClass = createEClass(DATE_PROPERTY_TYPE);
		createEAttribute(datePropertyTypeEClass, DATE_PROPERTY_TYPE__DATE);
		createEAttribute(datePropertyTypeEClass, DATE_PROPERTY_TYPE__DATE_TIME);
		createEAttribute(datePropertyTypeEClass, DATE_PROPERTY_TYPE__NIL_REASON);

		dateTimePropertyTypeEClass = createEClass(DATE_TIME_PROPERTY_TYPE);
		createEAttribute(dateTimePropertyTypeEClass, DATE_TIME_PROPERTY_TYPE__DATE_TIME);
		createEAttribute(dateTimePropertyTypeEClass, DATE_TIME_PROPERTY_TYPE__NIL_REASON);

		decimalPropertyTypeEClass = createEClass(DECIMAL_PROPERTY_TYPE);
		createEAttribute(decimalPropertyTypeEClass, DECIMAL_PROPERTY_TYPE__DECIMAL);
		createEAttribute(decimalPropertyTypeEClass, DECIMAL_PROPERTY_TYPE__NIL_REASON);

		distancePropertyTypeEClass = createEClass(DISTANCE_PROPERTY_TYPE);
		createEReference(distancePropertyTypeEClass, DISTANCE_PROPERTY_TYPE__DISTANCE);
		createEAttribute(distancePropertyTypeEClass, DISTANCE_PROPERTY_TYPE__NIL_REASON);

		genericNamePropertyTypeEClass = createEClass(GENERIC_NAME_PROPERTY_TYPE);
		createEAttribute(genericNamePropertyTypeEClass, GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP);
		createEReference(genericNamePropertyTypeEClass, GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME);
		createEAttribute(genericNamePropertyTypeEClass, GENERIC_NAME_PROPERTY_TYPE__NIL_REASON);

		integerPropertyTypeEClass = createEClass(INTEGER_PROPERTY_TYPE);
		createEAttribute(integerPropertyTypeEClass, INTEGER_PROPERTY_TYPE__INTEGER);
		createEAttribute(integerPropertyTypeEClass, INTEGER_PROPERTY_TYPE__NIL_REASON);

		lengthPropertyTypeEClass = createEClass(LENGTH_PROPERTY_TYPE);
		createEAttribute(lengthPropertyTypeEClass, LENGTH_PROPERTY_TYPE__LENGTH_GROUP);
		createEReference(lengthPropertyTypeEClass, LENGTH_PROPERTY_TYPE__LENGTH);
		createEAttribute(lengthPropertyTypeEClass, LENGTH_PROPERTY_TYPE__NIL_REASON);

		localNamePropertyTypeEClass = createEClass(LOCAL_NAME_PROPERTY_TYPE);
		createEReference(localNamePropertyTypeEClass, LOCAL_NAME_PROPERTY_TYPE__LOCAL_NAME);
		createEAttribute(localNamePropertyTypeEClass, LOCAL_NAME_PROPERTY_TYPE__NIL_REASON);

		multiplicityPropertyTypeEClass = createEClass(MULTIPLICITY_PROPERTY_TYPE);
		createEReference(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__MULTIPLICITY);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__ACTUATE);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__ARCROLE);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__HREF);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__ROLE);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__SHOW);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__TITLE);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__TYPE);
		createEAttribute(multiplicityPropertyTypeEClass, MULTIPLICITY_PROPERTY_TYPE__UUIDREF);

		multiplicityRangePropertyTypeEClass = createEClass(MULTIPLICITY_RANGE_PROPERTY_TYPE);
		createEReference(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__MULTIPLICITY_RANGE);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__ACTUATE);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__ARCROLE);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__HREF);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__ROLE);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__SHOW);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__TITLE);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__TYPE);
		createEAttribute(multiplicityRangePropertyTypeEClass, MULTIPLICITY_RANGE_PROPERTY_TYPE__UUIDREF);

		objectReferencePropertyTypeEClass = createEClass(OBJECT_REFERENCE_PROPERTY_TYPE);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__ACTUATE);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__ARCROLE);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__HREF);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__ROLE);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__SHOW);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__TITLE);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__TYPE);
		createEAttribute(objectReferencePropertyTypeEClass, OBJECT_REFERENCE_PROPERTY_TYPE__UUIDREF);

		realPropertyTypeEClass = createEClass(REAL_PROPERTY_TYPE);
		createEAttribute(realPropertyTypeEClass, REAL_PROPERTY_TYPE__REAL);
		createEAttribute(realPropertyTypeEClass, REAL_PROPERTY_TYPE__NIL_REASON);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANGLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEASURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BOOLEAN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CHARACTER_STRING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE_TIME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DECIMAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DISTANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LENGTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INTEGER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCAL_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEMBER_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MULTIPLICITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MULTIPLICITY_RANGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RECORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RECORD_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCALE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCOPED_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNLIMITED_INTEGER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ISO_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NIL_REASON);

		measurePropertyTypeEClass = createEClass(MEASURE_PROPERTY_TYPE);
		createEAttribute(measurePropertyTypeEClass, MEASURE_PROPERTY_TYPE__MEASURE_GROUP);
		createEReference(measurePropertyTypeEClass, MEASURE_PROPERTY_TYPE__MEASURE);
		createEAttribute(measurePropertyTypeEClass, MEASURE_PROPERTY_TYPE__NIL_REASON);

		memberNamePropertyTypeEClass = createEClass(MEMBER_NAME_PROPERTY_TYPE);
		createEReference(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__MEMBER_NAME);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__ACTUATE);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__ARCROLE);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__HREF);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__ROLE);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__SHOW);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__TITLE);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__TYPE);
		createEAttribute(memberNamePropertyTypeEClass, MEMBER_NAME_PROPERTY_TYPE__UUIDREF);

		memberNameTypeEClass = createEClass(MEMBER_NAME_TYPE);
		createEReference(memberNameTypeEClass, MEMBER_NAME_TYPE__ANAME);
		createEReference(memberNameTypeEClass, MEMBER_NAME_TYPE__ATTRIBUTE_TYPE);

		multiplicityRangeTypeEClass = createEClass(MULTIPLICITY_RANGE_TYPE);
		createEReference(multiplicityRangeTypeEClass, MULTIPLICITY_RANGE_TYPE__LOWER);
		createEReference(multiplicityRangeTypeEClass, MULTIPLICITY_RANGE_TYPE__UPPER);

		multiplicityTypeEClass = createEClass(MULTIPLICITY_TYPE);
		createEReference(multiplicityTypeEClass, MULTIPLICITY_TYPE__RANGE);

		numberPropertyTypeEClass = createEClass(NUMBER_PROPERTY_TYPE);
		createEAttribute(numberPropertyTypeEClass, NUMBER_PROPERTY_TYPE__REAL);
		createEAttribute(numberPropertyTypeEClass, NUMBER_PROPERTY_TYPE__DECIMAL);
		createEAttribute(numberPropertyTypeEClass, NUMBER_PROPERTY_TYPE__INTEGER);
		createEAttribute(numberPropertyTypeEClass, NUMBER_PROPERTY_TYPE__NIL_REASON);

		recordPropertyTypeEClass = createEClass(RECORD_PROPERTY_TYPE);
		createEReference(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__RECORD);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__ACTUATE);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__ARCROLE);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__HREF);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__ROLE);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__SHOW);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__TITLE);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__TYPE);
		createEAttribute(recordPropertyTypeEClass, RECORD_PROPERTY_TYPE__UUIDREF);

		recordTypePropertyTypeEClass = createEClass(RECORD_TYPE_PROPERTY_TYPE);
		createEReference(recordTypePropertyTypeEClass, RECORD_TYPE_PROPERTY_TYPE__RECORD_TYPE);
		createEAttribute(recordTypePropertyTypeEClass, RECORD_TYPE_PROPERTY_TYPE__NIL_REASON);

		recordTypeTypeEClass = createEClass(RECORD_TYPE_TYPE);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__VALUE);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__ACTUATE);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__ARCROLE);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__HREF);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__ROLE);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__SHOW);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__TITLE);
		createEAttribute(recordTypeTypeEClass, RECORD_TYPE_TYPE__TYPE);

		scalePropertyTypeEClass = createEClass(SCALE_PROPERTY_TYPE);
		createEReference(scalePropertyTypeEClass, SCALE_PROPERTY_TYPE__SCALE);
		createEAttribute(scalePropertyTypeEClass, SCALE_PROPERTY_TYPE__NIL_REASON);

		scopedNamePropertyTypeEClass = createEClass(SCOPED_NAME_PROPERTY_TYPE);
		createEReference(scopedNamePropertyTypeEClass, SCOPED_NAME_PROPERTY_TYPE__SCOPED_NAME);
		createEAttribute(scopedNamePropertyTypeEClass, SCOPED_NAME_PROPERTY_TYPE__NIL_REASON);

		typeNamePropertyTypeEClass = createEClass(TYPE_NAME_PROPERTY_TYPE);
		createEReference(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__TYPE_NAME);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__ACTUATE);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__ARCROLE);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__HREF);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__ROLE);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__SHOW);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__TITLE);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__TYPE);
		createEAttribute(typeNamePropertyTypeEClass, TYPE_NAME_PROPERTY_TYPE__UUIDREF);

		typeNameTypeEClass = createEClass(TYPE_NAME_TYPE);
		createEReference(typeNameTypeEClass, TYPE_NAME_TYPE__ANAME);

		unitOfMeasurePropertyTypeEClass = createEClass(UNIT_OF_MEASURE_PROPERTY_TYPE);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__ACTUATE);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__ARCROLE);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__HREF);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__ROLE);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__SHOW);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__TITLE);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__TYPE);
		createEAttribute(unitOfMeasurePropertyTypeEClass, UNIT_OF_MEASURE_PROPERTY_TYPE__UUIDREF);

		unlimitedIntegerPropertyTypeEClass = createEClass(UNLIMITED_INTEGER_PROPERTY_TYPE);
		createEReference(unlimitedIntegerPropertyTypeEClass, UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER);
		createEAttribute(unlimitedIntegerPropertyTypeEClass, UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON);

		unlimitedIntegerTypeEClass = createEClass(UNLIMITED_INTEGER_TYPE);
		createEAttribute(unlimitedIntegerTypeEClass, UNLIMITED_INTEGER_TYPE__VALUE);
		createEAttribute(unlimitedIntegerTypeEClass, UNLIMITED_INTEGER_TYPE__IS_INFINITE);

		uomAnglePropertyTypeEClass = createEClass(UOM_ANGLE_PROPERTY_TYPE);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__ACTUATE);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__ARCROLE);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__HREF);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__ROLE);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__SHOW);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__TITLE);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__TYPE);
		createEAttribute(uomAnglePropertyTypeEClass, UOM_ANGLE_PROPERTY_TYPE__UUIDREF);

		uomAreaPropertyTypeEClass = createEClass(UOM_AREA_PROPERTY_TYPE);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__ACTUATE);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__ARCROLE);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__HREF);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__ROLE);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__SHOW);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__TITLE);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__TYPE);
		createEAttribute(uomAreaPropertyTypeEClass, UOM_AREA_PROPERTY_TYPE__UUIDREF);

		uomLengthPropertyTypeEClass = createEClass(UOM_LENGTH_PROPERTY_TYPE);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__ACTUATE);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__ARCROLE);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__HREF);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__ROLE);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__SHOW);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__TITLE);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__TYPE);
		createEAttribute(uomLengthPropertyTypeEClass, UOM_LENGTH_PROPERTY_TYPE__UUIDREF);

		uomScalePropertyTypeEClass = createEClass(UOM_SCALE_PROPERTY_TYPE);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__ACTUATE);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__ARCROLE);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__HREF);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__ROLE);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__SHOW);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__TITLE);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__TYPE);
		createEAttribute(uomScalePropertyTypeEClass, UOM_SCALE_PROPERTY_TYPE__UUIDREF);

		uomTimePropertyTypeEClass = createEClass(UOM_TIME_PROPERTY_TYPE);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__ACTUATE);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__ARCROLE);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__HREF);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__ROLE);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__SHOW);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__TITLE);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__TYPE);
		createEAttribute(uomTimePropertyTypeEClass, UOM_TIME_PROPERTY_TYPE__UUIDREF);

		uomVelocityPropertyTypeEClass = createEClass(UOM_VELOCITY_PROPERTY_TYPE);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__ACTUATE);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__ARCROLE);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__HREF);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__ROLE);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__SHOW);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__TITLE);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__TYPE);
		createEAttribute(uomVelocityPropertyTypeEClass, UOM_VELOCITY_PROPERTY_TYPE__UUIDREF);

		uomVolumePropertyTypeEClass = createEClass(UOM_VOLUME_PROPERTY_TYPE);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__UNIT_DEFINITION_GROUP);
		createEReference(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__UNIT_DEFINITION);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__ACTUATE);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__ARCROLE);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__HREF);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__ROLE);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__SHOW);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__TITLE);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__TYPE);
		createEAttribute(uomVolumePropertyTypeEClass, UOM_VOLUME_PROPERTY_TYPE__UUIDREF);

		// Create data types
		dateTypeEDataType = createEDataType(DATE_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		GMLPackage theGMLPackage = (GMLPackage)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		memberNameTypeEClass.getESuperTypes().add(this.getAbstractObjectType());
		multiplicityRangeTypeEClass.getESuperTypes().add(this.getAbstractObjectType());
		multiplicityTypeEClass.getESuperTypes().add(this.getAbstractObjectType());
		typeNameTypeEClass.getESuperTypes().add(this.getAbstractObjectType());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractObjectTypeEClass, AbstractObjectType.class, "AbstractObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractObjectType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AbstractObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractObjectType_Uuid(), theXMLTypePackage.getString(), "uuid", null, 0, 1, AbstractObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anglePropertyTypeEClass, AnglePropertyType.class, "AnglePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnglePropertyType_Angle(), theGMLPackage.getAngleType(), null, "angle", null, 0, 1, AnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnglePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, AnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryPropertyTypeEClass, BinaryPropertyType.class, "BinaryPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryPropertyType_Binary(), this.getBinaryType(), null, "binary", null, 0, 1, BinaryPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, BinaryPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryTypeEClass, BinaryType.class, "BinaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, BinaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryType_Src(), theXMLTypePackage.getAnyURI(), "src", null, 0, 1, BinaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanPropertyTypeEClass, BooleanPropertyType.class, "BooleanPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanPropertyType_Boolean(), theXMLTypePackage.getBoolean(), "boolean", null, 0, 1, BooleanPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, BooleanPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterStringPropertyTypeEClass, CharacterStringPropertyType.class, "CharacterStringPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterStringPropertyType_CharacterStringGroup(), ecorePackage.getEFeatureMapEntry(), "characterStringGroup", null, 0, 1, CharacterStringPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStringPropertyType_CharacterString(), theXMLTypePackage.getString(), "characterString", null, 0, 1, CharacterStringPropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStringPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, CharacterStringPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeListValueTypeEClass, CodeListValueType.class, "CodeListValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeListValueType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, CodeListValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeListValueType_CodeList(), theXMLTypePackage.getAnyURI(), "codeList", null, 1, 1, CodeListValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeListValueType_CodeListValue(), theXMLTypePackage.getAnyURI(), "codeListValue", null, 1, 1, CodeListValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeListValueType_CodeSpace(), theXMLTypePackage.getAnyURI(), "codeSpace", null, 0, 1, CodeListValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datePropertyTypeEClass, DatePropertyType.class, "DatePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatePropertyType_Date(), this.getDateType(), "date", null, 0, 1, DatePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatePropertyType_DateTime(), theXMLTypePackage.getDateTime(), "dateTime", null, 0, 1, DatePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, DatePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimePropertyTypeEClass, DateTimePropertyType.class, "DateTimePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimePropertyType_DateTime(), theXMLTypePackage.getDateTime(), "dateTime", null, 0, 1, DateTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, DateTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalPropertyTypeEClass, DecimalPropertyType.class, "DecimalPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalPropertyType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, DecimalPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, DecimalPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distancePropertyTypeEClass, DistancePropertyType.class, "DistancePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistancePropertyType_Distance(), theGMLPackage.getLengthType(), null, "distance", null, 0, 1, DistancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistancePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, DistancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericNamePropertyTypeEClass, GenericNamePropertyType.class, "GenericNamePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericNamePropertyType_AbstractGenericNameGroup(), ecorePackage.getEFeatureMapEntry(), "abstractGenericNameGroup", null, 0, 1, GenericNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericNamePropertyType_AbstractGenericName(), theGMLPackage.getCodeType(), null, "abstractGenericName", null, 0, 1, GenericNamePropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericNamePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, GenericNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerPropertyTypeEClass, IntegerPropertyType.class, "IntegerPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerPropertyType_Integer(), theXMLTypePackage.getInteger(), "integer", null, 0, 1, IntegerPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, IntegerPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthPropertyTypeEClass, LengthPropertyType.class, "LengthPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLengthPropertyType_LengthGroup(), ecorePackage.getEFeatureMapEntry(), "lengthGroup", null, 0, 1, LengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLengthPropertyType_Length(), theGMLPackage.getLengthType(), null, "length", null, 0, 1, LengthPropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, LengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localNamePropertyTypeEClass, LocalNamePropertyType.class, "LocalNamePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalNamePropertyType_LocalName(), theGMLPackage.getCodeType(), null, "localName", null, 0, 1, LocalNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalNamePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, LocalNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityPropertyTypeEClass, MultiplicityPropertyType.class, "MultiplicityPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityPropertyType_Multiplicity(), this.getMultiplicityType(), null, "multiplicity", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, MultiplicityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityRangePropertyTypeEClass, MultiplicityRangePropertyType.class, "MultiplicityRangePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityRangePropertyType_MultiplicityRange(), this.getMultiplicityRangeType(), null, "multiplicityRange", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, MultiplicityRangePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectReferencePropertyTypeEClass, ObjectReferencePropertyType.class, "ObjectReferencePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectReferencePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectReferencePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, ObjectReferencePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realPropertyTypeEClass, RealPropertyType.class, "RealPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealPropertyType_Real(), theXMLTypePackage.getDouble(), "real", null, 0, 1, RealPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, RealPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AbstractGenericName(), theGMLPackage.getCodeType(), null, "abstractGenericName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AbstractObject(), this.getAbstractObjectType(), null, "abstractObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Angle(), theGMLPackage.getAngleType(), null, "angle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Measure(), theGMLPackage.getMeasureType(), null, "measure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Binary(), this.getBinaryType(), null, "binary", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Boolean(), theXMLTypePackage.getBoolean(), "boolean", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CharacterString(), theXMLTypePackage.getString(), "characterString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Date(), this.getDateType(), "date", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DateTime(), theXMLTypePackage.getDateTime(), "dateTime", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Distance(), theGMLPackage.getLengthType(), null, "distance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Length(), theGMLPackage.getLengthType(), null, "length", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Integer(), theXMLTypePackage.getInteger(), "integer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocalName(), theGMLPackage.getCodeType(), null, "localName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MemberName(), this.getMemberNameType(), null, "memberName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Multiplicity(), this.getMultiplicityType(), null, "multiplicity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MultiplicityRange(), this.getMultiplicityRangeType(), null, "multiplicityRange", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Real(), theXMLTypePackage.getDouble(), "real", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Record(), ecorePackage.getEObject(), null, "record", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RecordType(), this.getRecordTypeType(), null, "recordType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Scale(), theGMLPackage.getScaleType(), null, "scale", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ScopedName(), theGMLPackage.getCodeType(), null, "scopedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeName(), this.getTypeNameType(), null, "typeName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnlimitedInteger(), this.getUnlimitedIntegerType(), null, "unlimitedInteger", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IsoType(), theXMLTypePackage.getString(), "isoType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurePropertyTypeEClass, MeasurePropertyType.class, "MeasurePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurePropertyType_MeasureGroup(), ecorePackage.getEFeatureMapEntry(), "measureGroup", null, 0, 1, MeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurePropertyType_Measure(), theGMLPackage.getMeasureType(), null, "measure", null, 0, 1, MeasurePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, MeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberNamePropertyTypeEClass, MemberNamePropertyType.class, "MemberNamePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberNamePropertyType_MemberName(), this.getMemberNameType(), null, "memberName", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberNamePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, MemberNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberNameTypeEClass, MemberNameType.class, "MemberNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberNameType_AName(), this.getCharacterStringPropertyType(), null, "aName", null, 1, 1, MemberNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberNameType_AttributeType(), this.getTypeNamePropertyType(), null, "attributeType", null, 1, 1, MemberNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityRangeTypeEClass, MultiplicityRangeType.class, "MultiplicityRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityRangeType_Lower(), this.getIntegerPropertyType(), null, "lower", null, 1, 1, MultiplicityRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityRangeType_Upper(), this.getUnlimitedIntegerPropertyType(), null, "upper", null, 1, 1, MultiplicityRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityTypeEClass, MultiplicityType.class, "MultiplicityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityType_Range(), this.getMultiplicityRangePropertyType(), null, "range", null, 1, -1, MultiplicityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberPropertyTypeEClass, NumberPropertyType.class, "NumberPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberPropertyType_Real(), theXMLTypePackage.getDouble(), "real", null, 0, 1, NumberPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberPropertyType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, NumberPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberPropertyType_Integer(), theXMLTypePackage.getInteger(), "integer", null, 0, 1, NumberPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, NumberPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordPropertyTypeEClass, RecordPropertyType.class, "RecordPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordPropertyType_Record(), ecorePackage.getEObject(), null, "record", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, RecordPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordTypePropertyTypeEClass, RecordTypePropertyType.class, "RecordTypePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordTypePropertyType_RecordType(), this.getRecordTypeType(), null, "recordType", null, 0, 1, RecordTypePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, RecordTypePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordTypeTypeEClass, RecordTypeType.class, "RecordTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecordTypeType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypeType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypeType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypeType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypeType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypeType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypeType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTypeType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, RecordTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalePropertyTypeEClass, ScalePropertyType.class, "ScalePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalePropertyType_Scale(), theGMLPackage.getScaleType(), null, "scale", null, 0, 1, ScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, ScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopedNamePropertyTypeEClass, ScopedNamePropertyType.class, "ScopedNamePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopedNamePropertyType_ScopedName(), theGMLPackage.getCodeType(), null, "scopedName", null, 0, 1, ScopedNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopedNamePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, ScopedNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeNamePropertyTypeEClass, TypeNamePropertyType.class, "TypeNamePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeNamePropertyType_TypeName(), this.getTypeNameType(), null, "typeName", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeNamePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, TypeNamePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeNameTypeEClass, TypeNameType.class, "TypeNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeNameType_AName(), this.getCharacterStringPropertyType(), null, "aName", null, 1, 1, TypeNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitOfMeasurePropertyTypeEClass, UnitOfMeasurePropertyType.class, "UnitOfMeasurePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitOfMeasurePropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitOfMeasurePropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UnitOfMeasurePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UnitOfMeasurePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlimitedIntegerPropertyTypeEClass, UnlimitedIntegerPropertyType.class, "UnlimitedIntegerPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnlimitedIntegerPropertyType_UnlimitedInteger(), this.getUnlimitedIntegerType(), null, "unlimitedInteger", null, 0, 1, UnlimitedIntegerPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnlimitedIntegerPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UnlimitedIntegerPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlimitedIntegerTypeEClass, UnlimitedIntegerType.class, "UnlimitedIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnlimitedIntegerType_Value(), theXMLTypePackage.getNonNegativeInteger(), "value", null, 0, 1, UnlimitedIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnlimitedIntegerType_IsInfinite(), theXMLTypePackage.getBoolean(), "isInfinite", null, 0, 1, UnlimitedIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomAnglePropertyTypeEClass, UomAnglePropertyType.class, "UomAnglePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomAnglePropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomAnglePropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UomAnglePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAnglePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UomAnglePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomAreaPropertyTypeEClass, UomAreaPropertyType.class, "UomAreaPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomAreaPropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomAreaPropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UomAreaPropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomAreaPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UomAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomLengthPropertyTypeEClass, UomLengthPropertyType.class, "UomLengthPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomLengthPropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomLengthPropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UomLengthPropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomLengthPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UomLengthPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomScalePropertyTypeEClass, UomScalePropertyType.class, "UomScalePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomScalePropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomScalePropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UomScalePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomScalePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UomScalePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomTimePropertyTypeEClass, UomTimePropertyType.class, "UomTimePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomTimePropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomTimePropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UomTimePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomTimePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UomTimePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomVelocityPropertyTypeEClass, UomVelocityPropertyType.class, "UomVelocityPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomVelocityPropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomVelocityPropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UomVelocityPropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVelocityPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UomVelocityPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomVolumePropertyTypeEClass, UomVolumePropertyType.class, "UomVolumePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomVolumePropertyType_UnitDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "unitDefinitionGroup", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomVolumePropertyType_UnitDefinition(), theGMLPackage.getUnitDefinitionType(), null, "unitDefinition", null, 0, 1, UomVolumePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomVolumePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, UomVolumePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(dateTypeEDataType, XMLGregorianCalendar.class, "DateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:x-ogc:specification:gml:schema-xsd:gml:3.2.2
		createUrnxogcspecificationgmlschemaxsdgml3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.2
		createUrnxogcspecificationgmlschemaxsddynamicFeature3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:topology:3.2.2
		createUrnxogcspecificationgmlschemaxsdtopology3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoverage3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:observation:3.2.2
		createUrnxogcspecificationgmlschemaxsdobservation3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdtemporalReferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.2
		createUrnxogcspecificationgmlschemaxsddeprecatedTypes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.2
		createUrnxogcspecificationgmlschemaxsdtemporalTopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1
		createUrnopengisspecificationgmlschemaxsddictionaryv3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.2
		createUrnxogcspecificationgmlschemaxsdgmlBase3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.2
		createUrnxogcspecificationgmlschemaxsdtemporal3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:feature:3.2.2
		createUrnxogcspecificationgmlschemaxsdfeature3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:direction:3.2.2
		createUrnxogcspecificationgmlschemaxsddirection3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.2
		createUrnxogcspecificationgmlschemaxsdvalueObjects3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryBasic0d1d3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoordinateSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:datums:3.2.2
		createUrnxogcspecificationgmlschemaxsddatums3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoordinateOperations3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdreferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:measures:3.2.2
		createUrnxogcspecificationgmlschemaxsdmeasures3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:units:3.2.2
		createUrnxogcspecificationgmlschemaxsdunits3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:grids:3.2.2
		createUrnxogcspecificationgmlschemaxsdgrids3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryAggregates3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryPrimitives3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryComplexes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.2
		createUrnxogcspecificationgmlschemaxsdbasicTypes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryBasic2d3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:gml:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgml3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:gml:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "gml.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddynamicFeature3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "dynamicFeature.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:topology:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtopology3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:topology:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "topology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoverage3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coverage.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coordinateReferenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:observation:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdobservation3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:observation:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "observation.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporalReferenceSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "temporalReferenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddeprecatedTypes3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "deprecatedTypes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporalTopology3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "temporalTopology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddictionaryv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "dictionary.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgmlBase3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "gmlBase.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporal3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "temporal.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:feature:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdfeature3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:feature:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "feature.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:direction:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddirection3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:direction:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "direction.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdvalueObjects3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "valueObjects.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryBasic0d1d3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic0d1d.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coordinateSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:datums:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddatums3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:datums:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "datums.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateOperations3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coordinateOperations.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdreferenceSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "referenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:measures:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdmeasures3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:measures:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "measures.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:units:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdunits3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:units:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "units.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:grids:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgrids3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:grids:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "grids.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryAggregates3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryAggregates.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryPrimitives3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryPrimitives.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryComplexes3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryComplexes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdbasicTypes3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "basicTypes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryBasic2d3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic2d.xsd"
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
		  (abstractObjectTypeEClass,
		   source,
		   new String[] {
			   "name", "AbstractObject_Type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAbstractObjectType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getAbstractObjectType_Uuid(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuid"
		   });
		addAnnotation
		  (anglePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Angle_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnglePropertyType_Angle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Angle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnglePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (binaryPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Binary_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinaryPropertyType_Binary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Binary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBinaryPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (binaryTypeEClass,
		   source,
		   new String[] {
			   "name", "Binary_Type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getBinaryType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getBinaryType_Src(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "src"
		   });
		addAnnotation
		  (booleanPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Boolean_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBooleanPropertyType_Boolean(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Boolean",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBooleanPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (characterStringPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "CharacterString_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCharacterStringPropertyType_CharacterStringGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "CharacterString:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCharacterStringPropertyType_CharacterString(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CharacterString",
			   "namespace", "##targetNamespace",
			   "group", "CharacterString:group"
		   });
		addAnnotation
		  (getCharacterStringPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codeListValueTypeEClass,
		   source,
		   new String[] {
			   "name", "CodeListValue_Type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getCodeListValueType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getCodeListValueType_CodeList(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "codeList"
		   });
		addAnnotation
		  (getCodeListValueType_CodeListValue(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "codeListValue"
		   });
		addAnnotation
		  (getCodeListValueType_CodeSpace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "codeSpace"
		   });
		addAnnotation
		  (datePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Date_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatePropertyType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatePropertyType_DateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dateTimePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "DateTime_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDateTimePropertyType_DateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDateTimePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dateTypeEDataType,
		   source,
		   new String[] {
			   "name", "Date_Type",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#gYear"
		   });
		addAnnotation
		  (decimalPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Decimal_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDecimalPropertyType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecimalPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (distancePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Distance_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDistancePropertyType_Distance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Distance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistancePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (genericNamePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "GenericName_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGenericNamePropertyType_AbstractGenericNameGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "AbstractGenericName:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGenericNamePropertyType_AbstractGenericName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractGenericName",
			   "namespace", "##targetNamespace",
			   "group", "AbstractGenericName:group"
		   });
		addAnnotation
		  (getGenericNamePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (integerPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Integer_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIntegerPropertyType_Integer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Integer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntegerPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (lengthPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Length_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLengthPropertyType_LengthGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "Length:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLengthPropertyType_Length(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Length",
			   "namespace", "##targetNamespace",
			   "group", "Length:group"
		   });
		addAnnotation
		  (getLengthPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (localNamePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "LocalName_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLocalNamePropertyType_LocalName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LocalName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLocalNamePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (multiplicityPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Multiplicity_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Multiplicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Multiplicity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (multiplicityRangePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "MultiplicityRange_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_MultiplicityRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MultiplicityRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMultiplicityRangePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (objectReferencePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "ObjectReference_PropertyType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getObjectReferencePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (realPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Real_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRealPropertyType_Real(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Real",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRealPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
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
		  (getDocumentRoot_AbstractGenericName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractGenericName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AbstractObject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractObject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Angle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Angle",
			   "namespace", "##targetNamespace",
			   "affiliation", "Measure"
		   });
		addAnnotation
		  (getDocumentRoot_Measure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Measure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Binary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Binary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Boolean(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Boolean",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CharacterString(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CharacterString",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Distance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Distance",
			   "namespace", "##targetNamespace",
			   "affiliation", "Length"
		   });
		addAnnotation
		  (getDocumentRoot_Length(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Length",
			   "namespace", "##targetNamespace",
			   "affiliation", "Measure"
		   });
		addAnnotation
		  (getDocumentRoot_Integer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Integer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LocalName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LocalName",
			   "namespace", "##targetNamespace",
			   "affiliation", "AbstractGenericName"
		   });
		addAnnotation
		  (getDocumentRoot_MemberName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MemberName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Multiplicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Multiplicity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MultiplicityRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MultiplicityRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Real(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Real",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Record(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Record",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RecordType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecordType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Scale(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Scale",
			   "namespace", "##targetNamespace",
			   "affiliation", "Measure"
		   });
		addAnnotation
		  (getDocumentRoot_ScopedName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScopedName",
			   "namespace", "##targetNamespace",
			   "affiliation", "AbstractGenericName"
		   });
		addAnnotation
		  (getDocumentRoot_TypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TypeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnlimitedInteger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnlimitedInteger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsoType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isoType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measurePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Measure_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurePropertyType_MeasureGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "Measure:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurePropertyType_Measure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Measure",
			   "namespace", "##targetNamespace",
			   "group", "Measure:group"
		   });
		addAnnotation
		  (getMeasurePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (memberNamePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "MemberName_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMemberNamePropertyType_MemberName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MemberName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMemberNamePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getMemberNamePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (memberNameTypeEClass,
		   source,
		   new String[] {
			   "name", "MemberName_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMemberNameType_AName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMemberNameType_AttributeType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "attributeType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (multiplicityRangeTypeEClass,
		   source,
		   new String[] {
			   "name", "MultiplicityRange_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMultiplicityRangeType_Lower(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lower",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMultiplicityRangeType_Upper(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "upper",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (multiplicityTypeEClass,
		   source,
		   new String[] {
			   "name", "Multiplicity_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMultiplicityType_Range(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "range",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (numberPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Number_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNumberPropertyType_Real(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Real",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNumberPropertyType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNumberPropertyType_Integer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Integer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNumberPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (recordPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Record_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRecordPropertyType_Record(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Record",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRecordPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRecordPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (recordTypePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "RecordType_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRecordTypePropertyType_RecordType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecordType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRecordTypePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (recordTypeTypeEClass,
		   source,
		   new String[] {
			   "name", "RecordType_Type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRecordTypeType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRecordTypeType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordTypeType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordTypeType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordTypeType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordTypeType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordTypeType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getRecordTypeType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (scalePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "Scale_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScalePropertyType_Scale(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Scale",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScalePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (scopedNamePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "ScopedName_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScopedNamePropertyType_ScopedName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScopedName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScopedNamePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (typeNamePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "TypeName_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTypeNamePropertyType_TypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TypeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getTypeNamePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getTypeNamePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (typeNameTypeEClass,
		   source,
		   new String[] {
			   "name", "TypeName_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTypeNameType_AName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unitOfMeasurePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UnitOfMeasure_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUnitOfMeasurePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (unlimitedIntegerPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UnlimitedInteger_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnlimitedIntegerPropertyType_UnlimitedInteger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnlimitedInteger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnlimitedIntegerPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unlimitedIntegerTypeEClass,
		   source,
		   new String[] {
			   "name", "UnlimitedInteger_Type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getUnlimitedIntegerType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getUnlimitedIntegerType_IsInfinite(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isInfinite"
		   });
		addAnnotation
		  (uomAnglePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UomAngle_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUomAnglePropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUomAnglePropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAnglePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAnglePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (uomAreaPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UomArea_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUomAreaPropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUomAreaPropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAreaPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomAreaPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (uomLengthPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UomLength_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUomLengthPropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUomLengthPropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomLengthPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomLengthPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (uomScalePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UomScale_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUomScalePropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUomScalePropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUomScalePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomScalePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomScalePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomScalePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUomScalePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomScalePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomScalePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomScalePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomScalePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (uomTimePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UomTime_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUomTimePropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUomTimePropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUomTimePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomTimePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomTimePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomTimePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUomTimePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomTimePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomTimePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomTimePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomTimePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (uomVelocityPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UomVelocity_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVelocityPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (uomVolumePropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "UomVolume_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUomVolumePropertyType_UnitDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "UnitDefinition:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getUomVolumePropertyType_UnitDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitDefinition",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#UnitDefinition:group"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVolumePropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getUomVolumePropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
	}

} //GCOPackageImpl
