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

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.odata.ns.edm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdmFactoryImpl extends EFactoryImpl implements EdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdmFactory init() {
		try {
			EdmFactory theEdmFactory = (EdmFactory)EPackage.Registry.INSTANCE.getEFactory(EdmPackage.eNS_URI);
			if (theEdmFactory != null) {
				return theEdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmFactoryImpl() {
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
			case EdmPackage.ANNOTATION_TYPE: return createAnnotationType();
			case EdmPackage.EDM_ROOT: return createEdmRoot();
			case EdmPackage.SCHEMA_TYPE: return createSchemaType();
			case EdmPackage.TACTION: return createTAction();
			case EdmPackage.TACTION_FUNCTION_PARAMETER: return createTActionFunctionParameter();
			case EdmPackage.TACTION_FUNCTION_RETURN_TYPE: return createTActionFunctionReturnType();
			case EdmPackage.TACTION_IMPORT: return createTActionImport();
			case EdmPackage.TANNOTATIONS: return createTAnnotations();
			case EdmPackage.TAPPLY_EXPRESSION: return createTApplyExpression();
			case EdmPackage.TBINARY_CONSTANT_EXPRESSION: return createTBinaryConstantExpression();
			case EdmPackage.TBOOL_CONSTANT_EXPRESSION: return createTBoolConstantExpression();
			case EdmPackage.TCAST_OR_IS_OF_EXPRESSION: return createTCastOrIsOfExpression();
			case EdmPackage.TCOLLECTION_EXPRESSION: return createTCollectionExpression();
			case EdmPackage.TCOMPLEX_TYPE: return createTComplexType();
			case EdmPackage.TDATE_CONSTANT_EXPRESSION: return createTDateConstantExpression();
			case EdmPackage.TDATE_TIME_OFFSET_CONSTANT_EXPRESSION: return createTDateTimeOffsetConstantExpression();
			case EdmPackage.TDECIMAL_CONSTANT_EXPRESSION: return createTDecimalConstantExpression();
			case EdmPackage.TDURATION_CONSTANT_EXPRESSION: return createTDurationConstantExpression();
			case EdmPackage.TENTITY_CONTAINER: return createTEntityContainer();
			case EdmPackage.TENTITY_KEY_ELEMENT: return createTEntityKeyElement();
			case EdmPackage.TENTITY_SET: return createTEntitySet();
			case EdmPackage.TENTITY_TYPE: return createTEntityType();
			case EdmPackage.TENUM_TYPE: return createTEnumType();
			case EdmPackage.TENUM_TYPE_MEMBER: return createTEnumTypeMember();
			case EdmPackage.TFLOAT_CONSTANT_EXPRESSION: return createTFloatConstantExpression();
			case EdmPackage.TFUNCTION: return createTFunction();
			case EdmPackage.TFUNCTION_IMPORT: return createTFunctionImport();
			case EdmPackage.TGUID_CONSTANT_EXPRESSION: return createTGuidConstantExpression();
			case EdmPackage.TIF_EXPRESSION: return createTIfExpression();
			case EdmPackage.TINT_CONSTANT_EXPRESSION: return createTIntConstantExpression();
			case EdmPackage.TLABELED_ELEMENT_EXPRESSION: return createTLabeledElementExpression();
			case EdmPackage.TLABELED_ELEMENT_REFERENCE_EXPRESSION: return createTLabeledElementReferenceExpression();
			case EdmPackage.TNAVIGATION_PROPERTY: return createTNavigationProperty();
			case EdmPackage.TNAVIGATION_PROPERTY_BINDING: return createTNavigationPropertyBinding();
			case EdmPackage.TNULL_EXPRESSION: return createTNullExpression();
			case EdmPackage.TON_DELETE: return createTOnDelete();
			case EdmPackage.TONE_CHILD_EXPRESSION: return createTOneChildExpression();
			case EdmPackage.TPROPERTY: return createTProperty();
			case EdmPackage.TPROPERTY_REF: return createTPropertyRef();
			case EdmPackage.TPROPERTY_VALUE: return createTPropertyValue();
			case EdmPackage.TRECORD_EXPRESSION: return createTRecordExpression();
			case EdmPackage.TREFERENTIAL_CONSTRAINT: return createTReferentialConstraint();
			case EdmPackage.TSINGLETON: return createTSingleton();
			case EdmPackage.TSTRING_CONSTANT_EXPRESSION: return createTStringConstantExpression();
			case EdmPackage.TTERM: return createTTerm();
			case EdmPackage.TTIME_OF_DAY_CONSTANT_EXPRESSION: return createTTimeOfDayConstantExpression();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION: return createTTwoChildrenExpression();
			case EdmPackage.TTYPE_DEFINITION: return createTTypeDefinition();
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
			case EdmPackage.TABSTRACT_TYPE:
				return createTAbstractTypeFromString(eDataType, initialValue);
			case EdmPackage.TAPPLIES_TO_ELEMENTS_ITEM:
				return createTAppliesToElementsItemFromString(eDataType, initialValue);
			case EdmPackage.TCLIENT_FUNCTION_MEMBER1:
				return createTClientFunctionMember1FromString(eDataType, initialValue);
			case EdmPackage.TFLOATING:
				return createTFloatingFromString(eDataType, initialValue);
			case EdmPackage.TMAX:
				return createTMaxFromString(eDataType, initialValue);
			case EdmPackage.TON_DELETE_ACTION:
				return createTOnDeleteActionFromString(eDataType, initialValue);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER0:
				return createTPrimitiveTypeMember0FromString(eDataType, initialValue);
			case EdmPackage.TVARIABLE:
				return createTVariableFromString(eDataType, initialValue);
			case EdmPackage.BINARY:
				return createBinaryFromString(eDataType, initialValue);
			case EdmPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case EdmPackage.BOOLEAN_OBJECT:
				return createBooleanObjectFromString(eDataType, initialValue);
			case EdmPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case EdmPackage.DATE_TIME_STAMP:
				return createDateTimeStampFromString(eDataType, initialValue);
			case EdmPackage.DAY_TIME_DURATION:
				return createDayTimeDurationFromString(eDataType, initialValue);
			case EdmPackage.TABSTRACT_TYPE_OBJECT:
				return createTAbstractTypeObjectFromString(eDataType, initialValue);
			case EdmPackage.TAPPLIES_TO:
				return createTAppliesToFromString(eDataType, initialValue);
			case EdmPackage.TAPPLIES_TO_ELEMENTS:
				return createTAppliesToElementsFromString(eDataType, initialValue);
			case EdmPackage.TAPPLIES_TO_ELEMENTS_ITEM_OBJECT:
				return createTAppliesToElementsItemObjectFromString(eDataType, initialValue);
			case EdmPackage.TCLIENT_FUNCTION:
				return createTClientFunctionFromString(eDataType, initialValue);
			case EdmPackage.TCLIENT_FUNCTION_MEMBER1_OBJECT:
				return createTClientFunctionMember1ObjectFromString(eDataType, initialValue);
			case EdmPackage.TDECIMAL_LITERAL:
				return createTDecimalLiteralFromString(eDataType, initialValue);
			case EdmPackage.TENUM_MEMBER_LIST:
				return createTEnumMemberListFromString(eDataType, initialValue);
			case EdmPackage.TFLOATING_OBJECT:
				return createTFloatingObjectFromString(eDataType, initialValue);
			case EdmPackage.TGUID_LITERAL:
				return createTGuidLiteralFromString(eDataType, initialValue);
			case EdmPackage.TIME:
				return createTimeFromString(eDataType, initialValue);
			case EdmPackage.TINSTANCE_PATH:
				return createTInstancePathFromString(eDataType, initialValue);
			case EdmPackage.TMAX_LENGTH_FACET:
				return createTMaxLengthFacetFromString(eDataType, initialValue);
			case EdmPackage.TMAX_OBJECT:
				return createTMaxObjectFromString(eDataType, initialValue);
			case EdmPackage.TMODEL_PATH:
				return createTModelPathFromString(eDataType, initialValue);
			case EdmPackage.TNAMESPACE_NAME:
				return createTNamespaceNameFromString(eDataType, initialValue);
			case EdmPackage.TON_DELETE_ACTION_OBJECT:
				return createTOnDeleteActionObjectFromString(eDataType, initialValue);
			case EdmPackage.TPATH:
				return createTPathFromString(eDataType, initialValue);
			case EdmPackage.TPRECISION_FACET:
				return createTPrecisionFacetFromString(eDataType, initialValue);
			case EdmPackage.TPRIMITIVE_TYPE:
				return createTPrimitiveTypeFromString(eDataType, initialValue);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER0_OBJECT:
				return createTPrimitiveTypeMember0ObjectFromString(eDataType, initialValue);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER1:
				return createTPrimitiveTypeMember1FromString(eDataType, initialValue);
			case EdmPackage.TQUALIFIED_NAME:
				return createTQualifiedNameFromString(eDataType, initialValue);
			case EdmPackage.TSCALE_FACET:
				return createTScaleFacetFromString(eDataType, initialValue);
			case EdmPackage.TSIMPLE_IDENTIFIER:
				return createTSimpleIdentifierFromString(eDataType, initialValue);
			case EdmPackage.TSRID_FACET:
				return createTSridFacetFromString(eDataType, initialValue);
			case EdmPackage.TTARGET:
				return createTTargetFromString(eDataType, initialValue);
			case EdmPackage.TTYPE_NAME:
				return createTTypeNameFromString(eDataType, initialValue);
			case EdmPackage.TTYPE_NAME_MEMBER3:
				return createTTypeNameMember3FromString(eDataType, initialValue);
			case EdmPackage.TUNICODE_FACET:
				return createTUnicodeFacetFromString(eDataType, initialValue);
			case EdmPackage.TUNICODE_FACET_OBJECT:
				return createTUnicodeFacetObjectFromString(eDataType, initialValue);
			case EdmPackage.TVARIABLE_OBJECT:
				return createTVariableObjectFromString(eDataType, initialValue);
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
			case EdmPackage.TABSTRACT_TYPE:
				return convertTAbstractTypeToString(eDataType, instanceValue);
			case EdmPackage.TAPPLIES_TO_ELEMENTS_ITEM:
				return convertTAppliesToElementsItemToString(eDataType, instanceValue);
			case EdmPackage.TCLIENT_FUNCTION_MEMBER1:
				return convertTClientFunctionMember1ToString(eDataType, instanceValue);
			case EdmPackage.TFLOATING:
				return convertTFloatingToString(eDataType, instanceValue);
			case EdmPackage.TMAX:
				return convertTMaxToString(eDataType, instanceValue);
			case EdmPackage.TON_DELETE_ACTION:
				return convertTOnDeleteActionToString(eDataType, instanceValue);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER0:
				return convertTPrimitiveTypeMember0ToString(eDataType, instanceValue);
			case EdmPackage.TVARIABLE:
				return convertTVariableToString(eDataType, instanceValue);
			case EdmPackage.BINARY:
				return convertBinaryToString(eDataType, instanceValue);
			case EdmPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case EdmPackage.BOOLEAN_OBJECT:
				return convertBooleanObjectToString(eDataType, instanceValue);
			case EdmPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case EdmPackage.DATE_TIME_STAMP:
				return convertDateTimeStampToString(eDataType, instanceValue);
			case EdmPackage.DAY_TIME_DURATION:
				return convertDayTimeDurationToString(eDataType, instanceValue);
			case EdmPackage.TABSTRACT_TYPE_OBJECT:
				return convertTAbstractTypeObjectToString(eDataType, instanceValue);
			case EdmPackage.TAPPLIES_TO:
				return convertTAppliesToToString(eDataType, instanceValue);
			case EdmPackage.TAPPLIES_TO_ELEMENTS:
				return convertTAppliesToElementsToString(eDataType, instanceValue);
			case EdmPackage.TAPPLIES_TO_ELEMENTS_ITEM_OBJECT:
				return convertTAppliesToElementsItemObjectToString(eDataType, instanceValue);
			case EdmPackage.TCLIENT_FUNCTION:
				return convertTClientFunctionToString(eDataType, instanceValue);
			case EdmPackage.TCLIENT_FUNCTION_MEMBER1_OBJECT:
				return convertTClientFunctionMember1ObjectToString(eDataType, instanceValue);
			case EdmPackage.TDECIMAL_LITERAL:
				return convertTDecimalLiteralToString(eDataType, instanceValue);
			case EdmPackage.TENUM_MEMBER_LIST:
				return convertTEnumMemberListToString(eDataType, instanceValue);
			case EdmPackage.TFLOATING_OBJECT:
				return convertTFloatingObjectToString(eDataType, instanceValue);
			case EdmPackage.TGUID_LITERAL:
				return convertTGuidLiteralToString(eDataType, instanceValue);
			case EdmPackage.TIME:
				return convertTimeToString(eDataType, instanceValue);
			case EdmPackage.TINSTANCE_PATH:
				return convertTInstancePathToString(eDataType, instanceValue);
			case EdmPackage.TMAX_LENGTH_FACET:
				return convertTMaxLengthFacetToString(eDataType, instanceValue);
			case EdmPackage.TMAX_OBJECT:
				return convertTMaxObjectToString(eDataType, instanceValue);
			case EdmPackage.TMODEL_PATH:
				return convertTModelPathToString(eDataType, instanceValue);
			case EdmPackage.TNAMESPACE_NAME:
				return convertTNamespaceNameToString(eDataType, instanceValue);
			case EdmPackage.TON_DELETE_ACTION_OBJECT:
				return convertTOnDeleteActionObjectToString(eDataType, instanceValue);
			case EdmPackage.TPATH:
				return convertTPathToString(eDataType, instanceValue);
			case EdmPackage.TPRECISION_FACET:
				return convertTPrecisionFacetToString(eDataType, instanceValue);
			case EdmPackage.TPRIMITIVE_TYPE:
				return convertTPrimitiveTypeToString(eDataType, instanceValue);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER0_OBJECT:
				return convertTPrimitiveTypeMember0ObjectToString(eDataType, instanceValue);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER1:
				return convertTPrimitiveTypeMember1ToString(eDataType, instanceValue);
			case EdmPackage.TQUALIFIED_NAME:
				return convertTQualifiedNameToString(eDataType, instanceValue);
			case EdmPackage.TSCALE_FACET:
				return convertTScaleFacetToString(eDataType, instanceValue);
			case EdmPackage.TSIMPLE_IDENTIFIER:
				return convertTSimpleIdentifierToString(eDataType, instanceValue);
			case EdmPackage.TSRID_FACET:
				return convertTSridFacetToString(eDataType, instanceValue);
			case EdmPackage.TTARGET:
				return convertTTargetToString(eDataType, instanceValue);
			case EdmPackage.TTYPE_NAME:
				return convertTTypeNameToString(eDataType, instanceValue);
			case EdmPackage.TTYPE_NAME_MEMBER3:
				return convertTTypeNameMember3ToString(eDataType, instanceValue);
			case EdmPackage.TUNICODE_FACET:
				return convertTUnicodeFacetToString(eDataType, instanceValue);
			case EdmPackage.TUNICODE_FACET_OBJECT:
				return convertTUnicodeFacetObjectToString(eDataType, instanceValue);
			case EdmPackage.TVARIABLE_OBJECT:
				return convertTVariableObjectToString(eDataType, instanceValue);
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
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdmRoot createEdmRoot() {
		EdmRootImpl edmRoot = new EdmRootImpl();
		return edmRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaType createSchemaType() {
		SchemaTypeImpl schemaType = new SchemaTypeImpl();
		return schemaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAction createTAction() {
		TActionImpl tAction = new TActionImpl();
		return tAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TActionFunctionParameter createTActionFunctionParameter() {
		TActionFunctionParameterImpl tActionFunctionParameter = new TActionFunctionParameterImpl();
		return tActionFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TActionFunctionReturnType createTActionFunctionReturnType() {
		TActionFunctionReturnTypeImpl tActionFunctionReturnType = new TActionFunctionReturnTypeImpl();
		return tActionFunctionReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TActionImport createTActionImport() {
		TActionImportImpl tActionImport = new TActionImportImpl();
		return tActionImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotations createTAnnotations() {
		TAnnotationsImpl tAnnotations = new TAnnotationsImpl();
		return tAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TApplyExpression createTApplyExpression() {
		TApplyExpressionImpl tApplyExpression = new TApplyExpressionImpl();
		return tApplyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBinaryConstantExpression createTBinaryConstantExpression() {
		TBinaryConstantExpressionImpl tBinaryConstantExpression = new TBinaryConstantExpressionImpl();
		return tBinaryConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBoolConstantExpression createTBoolConstantExpression() {
		TBoolConstantExpressionImpl tBoolConstantExpression = new TBoolConstantExpressionImpl();
		return tBoolConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCastOrIsOfExpression createTCastOrIsOfExpression() {
		TCastOrIsOfExpressionImpl tCastOrIsOfExpression = new TCastOrIsOfExpressionImpl();
		return tCastOrIsOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCollectionExpression createTCollectionExpression() {
		TCollectionExpressionImpl tCollectionExpression = new TCollectionExpressionImpl();
		return tCollectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TComplexType createTComplexType() {
		TComplexTypeImpl tComplexType = new TComplexTypeImpl();
		return tComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDateConstantExpression createTDateConstantExpression() {
		TDateConstantExpressionImpl tDateConstantExpression = new TDateConstantExpressionImpl();
		return tDateConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDateTimeOffsetConstantExpression createTDateTimeOffsetConstantExpression() {
		TDateTimeOffsetConstantExpressionImpl tDateTimeOffsetConstantExpression = new TDateTimeOffsetConstantExpressionImpl();
		return tDateTimeOffsetConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecimalConstantExpression createTDecimalConstantExpression() {
		TDecimalConstantExpressionImpl tDecimalConstantExpression = new TDecimalConstantExpressionImpl();
		return tDecimalConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDurationConstantExpression createTDurationConstantExpression() {
		TDurationConstantExpressionImpl tDurationConstantExpression = new TDurationConstantExpressionImpl();
		return tDurationConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEntityContainer createTEntityContainer() {
		TEntityContainerImpl tEntityContainer = new TEntityContainerImpl();
		return tEntityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEntityKeyElement createTEntityKeyElement() {
		TEntityKeyElementImpl tEntityKeyElement = new TEntityKeyElementImpl();
		return tEntityKeyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEntitySet createTEntitySet() {
		TEntitySetImpl tEntitySet = new TEntitySetImpl();
		return tEntitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEntityType createTEntityType() {
		TEntityTypeImpl tEntityType = new TEntityTypeImpl();
		return tEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEnumType createTEnumType() {
		TEnumTypeImpl tEnumType = new TEnumTypeImpl();
		return tEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEnumTypeMember createTEnumTypeMember() {
		TEnumTypeMemberImpl tEnumTypeMember = new TEnumTypeMemberImpl();
		return tEnumTypeMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFloatConstantExpression createTFloatConstantExpression() {
		TFloatConstantExpressionImpl tFloatConstantExpression = new TFloatConstantExpressionImpl();
		return tFloatConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunction createTFunction() {
		TFunctionImpl tFunction = new TFunctionImpl();
		return tFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionImport createTFunctionImport() {
		TFunctionImportImpl tFunctionImport = new TFunctionImportImpl();
		return tFunctionImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGuidConstantExpression createTGuidConstantExpression() {
		TGuidConstantExpressionImpl tGuidConstantExpression = new TGuidConstantExpressionImpl();
		return tGuidConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIfExpression createTIfExpression() {
		TIfExpressionImpl tIfExpression = new TIfExpressionImpl();
		return tIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIntConstantExpression createTIntConstantExpression() {
		TIntConstantExpressionImpl tIntConstantExpression = new TIntConstantExpressionImpl();
		return tIntConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLabeledElementExpression createTLabeledElementExpression() {
		TLabeledElementExpressionImpl tLabeledElementExpression = new TLabeledElementExpressionImpl();
		return tLabeledElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLabeledElementReferenceExpression createTLabeledElementReferenceExpression() {
		TLabeledElementReferenceExpressionImpl tLabeledElementReferenceExpression = new TLabeledElementReferenceExpressionImpl();
		return tLabeledElementReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNavigationProperty createTNavigationProperty() {
		TNavigationPropertyImpl tNavigationProperty = new TNavigationPropertyImpl();
		return tNavigationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNavigationPropertyBinding createTNavigationPropertyBinding() {
		TNavigationPropertyBindingImpl tNavigationPropertyBinding = new TNavigationPropertyBindingImpl();
		return tNavigationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNullExpression createTNullExpression() {
		TNullExpressionImpl tNullExpression = new TNullExpressionImpl();
		return tNullExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOnDelete createTOnDelete() {
		TOnDeleteImpl tOnDelete = new TOnDeleteImpl();
		return tOnDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOneChildExpression createTOneChildExpression() {
		TOneChildExpressionImpl tOneChildExpression = new TOneChildExpressionImpl();
		return tOneChildExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProperty createTProperty() {
		TPropertyImpl tProperty = new TPropertyImpl();
		return tProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPropertyRef createTPropertyRef() {
		TPropertyRefImpl tPropertyRef = new TPropertyRefImpl();
		return tPropertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPropertyValue createTPropertyValue() {
		TPropertyValueImpl tPropertyValue = new TPropertyValueImpl();
		return tPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRecordExpression createTRecordExpression() {
		TRecordExpressionImpl tRecordExpression = new TRecordExpressionImpl();
		return tRecordExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TReferentialConstraint createTReferentialConstraint() {
		TReferentialConstraintImpl tReferentialConstraint = new TReferentialConstraintImpl();
		return tReferentialConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSingleton createTSingleton() {
		TSingletonImpl tSingleton = new TSingletonImpl();
		return tSingleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStringConstantExpression createTStringConstantExpression() {
		TStringConstantExpressionImpl tStringConstantExpression = new TStringConstantExpressionImpl();
		return tStringConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTerm createTTerm() {
		TTermImpl tTerm = new TTermImpl();
		return tTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTimeOfDayConstantExpression createTTimeOfDayConstantExpression() {
		TTimeOfDayConstantExpressionImpl tTimeOfDayConstantExpression = new TTimeOfDayConstantExpressionImpl();
		return tTimeOfDayConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression createTTwoChildrenExpression() {
		TTwoChildrenExpressionImpl tTwoChildrenExpression = new TTwoChildrenExpressionImpl();
		return tTwoChildrenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTypeDefinition createTTypeDefinition() {
		TTypeDefinitionImpl tTypeDefinition = new TTypeDefinitionImpl();
		return tTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType createTAbstractTypeFromString(EDataType eDataType, String initialValue) {
		TAbstractType result = TAbstractType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAbstractTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAppliesToElementsItem createTAppliesToElementsItemFromString(EDataType eDataType, String initialValue) {
		TAppliesToElementsItem result = TAppliesToElementsItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAppliesToElementsItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClientFunctionMember1 createTClientFunctionMember1FromString(EDataType eDataType, String initialValue) {
		TClientFunctionMember1 result = TClientFunctionMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTClientFunctionMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloating createTFloatingFromString(EDataType eDataType, String initialValue) {
		TFloating result = TFloating.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFloatingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMax createTMaxFromString(EDataType eDataType, String initialValue) {
		TMax result = TMax.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMaxToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOnDeleteAction createTOnDeleteActionFromString(EDataType eDataType, String initialValue) {
		TOnDeleteAction result = TOnDeleteAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTOnDeleteActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPrimitiveTypeMember0 createTPrimitiveTypeMember0FromString(EDataType eDataType, String initialValue) {
		TPrimitiveTypeMember0 result = TPrimitiveTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPrimitiveTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariable createTVariableFromString(EDataType eDataType, String initialValue) {
		TVariable result = TVariable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVariableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBinaryFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanFromString(EdmPackage.eINSTANCE.getBoolean(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanToString(EdmPackage.eINSTANCE.getBoolean(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeStampFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeStampToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDayTimeDurationFromString(EDataType eDataType, String initialValue) {
		return (Duration)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayTimeDurationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType createTAbstractTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTAbstractTypeFromString(EdmPackage.eINSTANCE.getTAbstractType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAbstractTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAbstractTypeToString(EdmPackage.eINSTANCE.getTAbstractType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTAppliesToFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTAppliesToElementsFromString(EdmPackage.eINSTANCE.getTAppliesToElements(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTSimpleIdentifierFromString(EdmPackage.eINSTANCE.getTSimpleIdentifier(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAppliesToToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (EdmPackage.eINSTANCE.getTAppliesToElements().isInstance(instanceValue)) {
			try {
				String value = convertTAppliesToElementsToString(EdmPackage.eINSTANCE.getTAppliesToElements(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (EdmPackage.eINSTANCE.getTSimpleIdentifier().isInstance(instanceValue)) {
			try {
				String value = convertTSimpleIdentifierToString(EdmPackage.eINSTANCE.getTSimpleIdentifier(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TAppliesToElementsItem> createTAppliesToElementsFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<TAppliesToElementsItem> result = new ArrayList<TAppliesToElementsItem>();
		for (String item : split(initialValue)) {
			result.add(createTAppliesToElementsItemFromString(EdmPackage.eINSTANCE.getTAppliesToElementsItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAppliesToElementsToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTAppliesToElementsItemToString(EdmPackage.eINSTANCE.getTAppliesToElementsItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAppliesToElementsItem createTAppliesToElementsItemObjectFromString(EDataType eDataType, String initialValue) {
		return createTAppliesToElementsItemFromString(EdmPackage.eINSTANCE.getTAppliesToElementsItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAppliesToElementsItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAppliesToElementsItemToString(EdmPackage.eINSTANCE.getTAppliesToElementsItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTClientFunctionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTQualifiedNameFromString(EdmPackage.eINSTANCE.getTQualifiedName(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTClientFunctionMember1FromString(EdmPackage.eINSTANCE.getTClientFunctionMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTClientFunctionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (EdmPackage.eINSTANCE.getTQualifiedName().isInstance(instanceValue)) {
			try {
				String value = convertTQualifiedNameToString(EdmPackage.eINSTANCE.getTQualifiedName(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (EdmPackage.eINSTANCE.getTClientFunctionMember1().isInstance(instanceValue)) {
			try {
				String value = convertTClientFunctionMember1ToString(EdmPackage.eINSTANCE.getTClientFunctionMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClientFunctionMember1 createTClientFunctionMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTClientFunctionMember1FromString(EdmPackage.eINSTANCE.getTClientFunctionMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTClientFunctionMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTClientFunctionMember1ToString(EdmPackage.eINSTANCE.getTClientFunctionMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTDecimalLiteralFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDecimalLiteralToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createTEnumMemberListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createTPathFromString(EdmPackage.eINSTANCE.getTPath(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTEnumMemberListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTPathToString(EdmPackage.eINSTANCE.getTPath(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloating createTFloatingObjectFromString(EDataType eDataType, String initialValue) {
		return createTFloatingFromString(EdmPackage.eINSTANCE.getTFloating(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFloatingObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatingToString(EdmPackage.eINSTANCE.getTFloating(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTGuidLiteralFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTGuidLiteralToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTInstancePathFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTInstancePathToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTMaxLengthFacetFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTMaxFromString(EdmPackage.eINSTANCE.getTMax(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMaxLengthFacetToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (EdmPackage.eINSTANCE.getTMax().isInstance(instanceValue)) {
			try {
				String value = convertTMaxToString(EdmPackage.eINSTANCE.getTMax(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMax createTMaxObjectFromString(EDataType eDataType, String initialValue) {
		return createTMaxFromString(EdmPackage.eINSTANCE.getTMax(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMaxObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTMaxToString(EdmPackage.eINSTANCE.getTMax(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTModelPathFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTModelPathToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTNamespaceNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTNamespaceNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOnDeleteAction createTOnDeleteActionObjectFromString(EDataType eDataType, String initialValue) {
		return createTOnDeleteActionFromString(EdmPackage.eINSTANCE.getTOnDeleteAction(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTOnDeleteActionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTOnDeleteActionToString(EdmPackage.eINSTANCE.getTOnDeleteAction(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTPathFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPathToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createTPrecisionFacetFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPrecisionFacetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPrimitiveTypeMember0FromString(EdmPackage.eINSTANCE.getTPrimitiveTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTPrimitiveTypeMember1FromString(EdmPackage.eINSTANCE.getTPrimitiveTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (EdmPackage.eINSTANCE.getTPrimitiveTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertTPrimitiveTypeMember0ToString(EdmPackage.eINSTANCE.getTPrimitiveTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (EdmPackage.eINSTANCE.getTPrimitiveTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTPrimitiveTypeMember1ToString(EdmPackage.eINSTANCE.getTPrimitiveTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPrimitiveTypeMember0 createTPrimitiveTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createTPrimitiveTypeMember0FromString(EdmPackage.eINSTANCE.getTPrimitiveTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPrimitiveTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPrimitiveTypeMember0ToString(EdmPackage.eINSTANCE.getTPrimitiveTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTPrimitiveTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPrimitiveTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTQualifiedNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTQualifiedNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTScaleFacetFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTFloatingFromString(EdmPackage.eINSTANCE.getTFloating(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTVariableFromString(EdmPackage.eINSTANCE.getTVariable(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTScaleFacetToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (EdmPackage.eINSTANCE.getTFloating().isInstance(instanceValue)) {
			try {
				String value = convertTFloatingToString(EdmPackage.eINSTANCE.getTFloating(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (EdmPackage.eINSTANCE.getTVariable().isInstance(instanceValue)) {
			try {
				String value = convertTVariableToString(EdmPackage.eINSTANCE.getTVariable(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTSimpleIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSimpleIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTSridFacetFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTVariableFromString(EdmPackage.eINSTANCE.getTVariable(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSridFacetToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (EdmPackage.eINSTANCE.getTVariable().isInstance(instanceValue)) {
			try {
				String value = convertTVariableToString(EdmPackage.eINSTANCE.getTVariable(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTTargetFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTargetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTTypeNameFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPrimitiveTypeFromString(EdmPackage.eINSTANCE.getTPrimitiveType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTAbstractTypeFromString(EdmPackage.eINSTANCE.getTAbstractType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTQualifiedNameFromString(EdmPackage.eINSTANCE.getTQualifiedName(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTTypeNameMember3FromString(EdmPackage.eINSTANCE.getTTypeNameMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTypeNameToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (EdmPackage.eINSTANCE.getTPrimitiveType().isInstance(instanceValue)) {
			try {
				String value = convertTPrimitiveTypeToString(EdmPackage.eINSTANCE.getTPrimitiveType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (EdmPackage.eINSTANCE.getTAbstractType().isInstance(instanceValue)) {
			try {
				String value = convertTAbstractTypeToString(EdmPackage.eINSTANCE.getTAbstractType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (EdmPackage.eINSTANCE.getTQualifiedName().isInstance(instanceValue)) {
			try {
				String value = convertTQualifiedNameToString(EdmPackage.eINSTANCE.getTQualifiedName(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (EdmPackage.eINSTANCE.getTTypeNameMember3().isInstance(instanceValue)) {
			try {
				String value = convertTTypeNameMember3ToString(EdmPackage.eINSTANCE.getTTypeNameMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTTypeNameMember3FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTypeNameMember3ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTUnicodeFacetFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTUnicodeFacetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTUnicodeFacetObjectFromString(EDataType eDataType, String initialValue) {
		return createTUnicodeFacetFromString(EdmPackage.eINSTANCE.getTUnicodeFacet(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTUnicodeFacetObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTUnicodeFacetToString(EdmPackage.eINSTANCE.getTUnicodeFacet(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariable createTVariableObjectFromString(EDataType eDataType, String initialValue) {
		return createTVariableFromString(EdmPackage.eINSTANCE.getTVariable(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVariableObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTVariableToString(EdmPackage.eINSTANCE.getTVariable(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdmPackage getEdmPackage() {
		return (EdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdmPackage getPackage() {
		return EdmPackage.eINSTANCE;
	}

} //EdmFactoryImpl
