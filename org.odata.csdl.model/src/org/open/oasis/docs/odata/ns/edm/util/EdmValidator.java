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
package org.open.oasis.docs.odata.ns.edm.util;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.open.oasis.docs.odata.ns.edm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage
 * @generated
 */
public class EdmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EdmValidator INSTANCE = new EdmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.open.oasis.docs.odata.ns.edm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EdmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EdmPackage.ANNOTATION_TYPE:
				return validateAnnotationType((AnnotationType)value, diagnostics, context);
			case EdmPackage.EDM_ROOT:
				return validateEdmRoot((EdmRoot)value, diagnostics, context);
			case EdmPackage.SCHEMA_TYPE:
				return validateSchemaType((SchemaType)value, diagnostics, context);
			case EdmPackage.TACTION:
				return validateTAction((TAction)value, diagnostics, context);
			case EdmPackage.TACTION_FUNCTION_PARAMETER:
				return validateTActionFunctionParameter((TActionFunctionParameter)value, diagnostics, context);
			case EdmPackage.TACTION_FUNCTION_RETURN_TYPE:
				return validateTActionFunctionReturnType((TActionFunctionReturnType)value, diagnostics, context);
			case EdmPackage.TACTION_IMPORT:
				return validateTActionImport((TActionImport)value, diagnostics, context);
			case EdmPackage.TANNOTATIONS:
				return validateTAnnotations((TAnnotations)value, diagnostics, context);
			case EdmPackage.TAPPLY_EXPRESSION:
				return validateTApplyExpression((TApplyExpression)value, diagnostics, context);
			case EdmPackage.TBINARY_CONSTANT_EXPRESSION:
				return validateTBinaryConstantExpression((TBinaryConstantExpression)value, diagnostics, context);
			case EdmPackage.TBOOL_CONSTANT_EXPRESSION:
				return validateTBoolConstantExpression((TBoolConstantExpression)value, diagnostics, context);
			case EdmPackage.TCAST_OR_IS_OF_EXPRESSION:
				return validateTCastOrIsOfExpression((TCastOrIsOfExpression)value, diagnostics, context);
			case EdmPackage.TCOLLECTION_EXPRESSION:
				return validateTCollectionExpression((TCollectionExpression)value, diagnostics, context);
			case EdmPackage.TCOMPLEX_TYPE:
				return validateTComplexType((TComplexType)value, diagnostics, context);
			case EdmPackage.TDATE_CONSTANT_EXPRESSION:
				return validateTDateConstantExpression((TDateConstantExpression)value, diagnostics, context);
			case EdmPackage.TDATE_TIME_OFFSET_CONSTANT_EXPRESSION:
				return validateTDateTimeOffsetConstantExpression((TDateTimeOffsetConstantExpression)value, diagnostics, context);
			case EdmPackage.TDECIMAL_CONSTANT_EXPRESSION:
				return validateTDecimalConstantExpression((TDecimalConstantExpression)value, diagnostics, context);
			case EdmPackage.TDURATION_CONSTANT_EXPRESSION:
				return validateTDurationConstantExpression((TDurationConstantExpression)value, diagnostics, context);
			case EdmPackage.TENTITY_CONTAINER:
				return validateTEntityContainer((TEntityContainer)value, diagnostics, context);
			case EdmPackage.TENTITY_KEY_ELEMENT:
				return validateTEntityKeyElement((TEntityKeyElement)value, diagnostics, context);
			case EdmPackage.TENTITY_SET:
				return validateTEntitySet((TEntitySet)value, diagnostics, context);
			case EdmPackage.TENTITY_TYPE:
				return validateTEntityType((TEntityType)value, diagnostics, context);
			case EdmPackage.TENUM_TYPE:
				return validateTEnumType((TEnumType)value, diagnostics, context);
			case EdmPackage.TENUM_TYPE_MEMBER:
				return validateTEnumTypeMember((TEnumTypeMember)value, diagnostics, context);
			case EdmPackage.TFLOAT_CONSTANT_EXPRESSION:
				return validateTFloatConstantExpression((TFloatConstantExpression)value, diagnostics, context);
			case EdmPackage.TFUNCTION:
				return validateTFunction((TFunction)value, diagnostics, context);
			case EdmPackage.TFUNCTION_IMPORT:
				return validateTFunctionImport((TFunctionImport)value, diagnostics, context);
			case EdmPackage.TGUID_CONSTANT_EXPRESSION:
				return validateTGuidConstantExpression((TGuidConstantExpression)value, diagnostics, context);
			case EdmPackage.TIF_EXPRESSION:
				return validateTIfExpression((TIfExpression)value, diagnostics, context);
			case EdmPackage.TINT_CONSTANT_EXPRESSION:
				return validateTIntConstantExpression((TIntConstantExpression)value, diagnostics, context);
			case EdmPackage.TLABELED_ELEMENT_EXPRESSION:
				return validateTLabeledElementExpression((TLabeledElementExpression)value, diagnostics, context);
			case EdmPackage.TLABELED_ELEMENT_REFERENCE_EXPRESSION:
				return validateTLabeledElementReferenceExpression((TLabeledElementReferenceExpression)value, diagnostics, context);
			case EdmPackage.TNAVIGATION_PROPERTY:
				return validateTNavigationProperty((TNavigationProperty)value, diagnostics, context);
			case EdmPackage.TNAVIGATION_PROPERTY_BINDING:
				return validateTNavigationPropertyBinding((TNavigationPropertyBinding)value, diagnostics, context);
			case EdmPackage.TNULL_EXPRESSION:
				return validateTNullExpression((TNullExpression)value, diagnostics, context);
			case EdmPackage.TON_DELETE:
				return validateTOnDelete((TOnDelete)value, diagnostics, context);
			case EdmPackage.TONE_CHILD_EXPRESSION:
				return validateTOneChildExpression((TOneChildExpression)value, diagnostics, context);
			case EdmPackage.TPROPERTY:
				return validateTProperty((TProperty)value, diagnostics, context);
			case EdmPackage.TPROPERTY_REF:
				return validateTPropertyRef((TPropertyRef)value, diagnostics, context);
			case EdmPackage.TPROPERTY_VALUE:
				return validateTPropertyValue((TPropertyValue)value, diagnostics, context);
			case EdmPackage.TRECORD_EXPRESSION:
				return validateTRecordExpression((TRecordExpression)value, diagnostics, context);
			case EdmPackage.TREFERENTIAL_CONSTRAINT:
				return validateTReferentialConstraint((TReferentialConstraint)value, diagnostics, context);
			case EdmPackage.TSINGLETON:
				return validateTSingleton((TSingleton)value, diagnostics, context);
			case EdmPackage.TSTRING_CONSTANT_EXPRESSION:
				return validateTStringConstantExpression((TStringConstantExpression)value, diagnostics, context);
			case EdmPackage.TTERM:
				return validateTTerm((TTerm)value, diagnostics, context);
			case EdmPackage.TTIME_OF_DAY_CONSTANT_EXPRESSION:
				return validateTTimeOfDayConstantExpression((TTimeOfDayConstantExpression)value, diagnostics, context);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION:
				return validateTTwoChildrenExpression((TTwoChildrenExpression)value, diagnostics, context);
			case EdmPackage.TTYPE_DEFINITION:
				return validateTTypeDefinition((TTypeDefinition)value, diagnostics, context);
			case EdmPackage.TABSTRACT_TYPE:
				return validateTAbstractType((TAbstractType)value, diagnostics, context);
			case EdmPackage.TAPPLIES_TO_ELEMENTS_ITEM:
				return validateTAppliesToElementsItem((TAppliesToElementsItem)value, diagnostics, context);
			case EdmPackage.TCLIENT_FUNCTION_MEMBER1:
				return validateTClientFunctionMember1((TClientFunctionMember1)value, diagnostics, context);
			case EdmPackage.TFLOATING:
				return validateTFloating((TFloating)value, diagnostics, context);
			case EdmPackage.TMAX:
				return validateTMax((TMax)value, diagnostics, context);
			case EdmPackage.TON_DELETE_ACTION:
				return validateTOnDeleteAction((TOnDeleteAction)value, diagnostics, context);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER0:
				return validateTPrimitiveTypeMember0((TPrimitiveTypeMember0)value, diagnostics, context);
			case EdmPackage.TVARIABLE:
				return validateTVariable((TVariable)value, diagnostics, context);
			case EdmPackage.BINARY:
				return validateBinary((String)value, diagnostics, context);
			case EdmPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			case EdmPackage.BOOLEAN_OBJECT:
				return validateBooleanObject((Boolean)value, diagnostics, context);
			case EdmPackage.DATE:
				return validateDate((XMLGregorianCalendar)value, diagnostics, context);
			case EdmPackage.DATE_TIME_STAMP:
				return validateDateTimeStamp((XMLGregorianCalendar)value, diagnostics, context);
			case EdmPackage.DAY_TIME_DURATION:
				return validateDayTimeDuration((Duration)value, diagnostics, context);
			case EdmPackage.TABSTRACT_TYPE_OBJECT:
				return validateTAbstractTypeObject((TAbstractType)value, diagnostics, context);
			case EdmPackage.TAPPLIES_TO:
				return validateTAppliesTo(value, diagnostics, context);
			case EdmPackage.TAPPLIES_TO_ELEMENTS:
				return validateTAppliesToElements((List<?>)value, diagnostics, context);
			case EdmPackage.TAPPLIES_TO_ELEMENTS_ITEM_OBJECT:
				return validateTAppliesToElementsItemObject((TAppliesToElementsItem)value, diagnostics, context);
			case EdmPackage.TCLIENT_FUNCTION:
				return validateTClientFunction(value, diagnostics, context);
			case EdmPackage.TCLIENT_FUNCTION_MEMBER1_OBJECT:
				return validateTClientFunctionMember1Object((TClientFunctionMember1)value, diagnostics, context);
			case EdmPackage.TDECIMAL_LITERAL:
				return validateTDecimalLiteral((String)value, diagnostics, context);
			case EdmPackage.TENUM_MEMBER_LIST:
				return validateTEnumMemberList((List<?>)value, diagnostics, context);
			case EdmPackage.TFLOATING_OBJECT:
				return validateTFloatingObject((TFloating)value, diagnostics, context);
			case EdmPackage.TGUID_LITERAL:
				return validateTGuidLiteral((String)value, diagnostics, context);
			case EdmPackage.TIME:
				return validateTime((String)value, diagnostics, context);
			case EdmPackage.TINSTANCE_PATH:
				return validateTInstancePath((String)value, diagnostics, context);
			case EdmPackage.TMAX_LENGTH_FACET:
				return validateTMaxLengthFacet(value, diagnostics, context);
			case EdmPackage.TMAX_OBJECT:
				return validateTMaxObject((TMax)value, diagnostics, context);
			case EdmPackage.TMODEL_PATH:
				return validateTModelPath((String)value, diagnostics, context);
			case EdmPackage.TNAMESPACE_NAME:
				return validateTNamespaceName((String)value, diagnostics, context);
			case EdmPackage.TON_DELETE_ACTION_OBJECT:
				return validateTOnDeleteActionObject((TOnDeleteAction)value, diagnostics, context);
			case EdmPackage.TPATH:
				return validateTPath((String)value, diagnostics, context);
			case EdmPackage.TPRECISION_FACET:
				return validateTPrecisionFacet((BigInteger)value, diagnostics, context);
			case EdmPackage.TPRIMITIVE_TYPE:
				return validateTPrimitiveType(value, diagnostics, context);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER0_OBJECT:
				return validateTPrimitiveTypeMember0Object((TPrimitiveTypeMember0)value, diagnostics, context);
			case EdmPackage.TPRIMITIVE_TYPE_MEMBER1:
				return validateTPrimitiveTypeMember1((String)value, diagnostics, context);
			case EdmPackage.TQUALIFIED_NAME:
				return validateTQualifiedName((String)value, diagnostics, context);
			case EdmPackage.TSCALE_FACET:
				return validateTScaleFacet(value, diagnostics, context);
			case EdmPackage.TSIMPLE_IDENTIFIER:
				return validateTSimpleIdentifier((String)value, diagnostics, context);
			case EdmPackage.TSRID_FACET:
				return validateTSridFacet(value, diagnostics, context);
			case EdmPackage.TTARGET:
				return validateTTarget((String)value, diagnostics, context);
			case EdmPackage.TTYPE_NAME:
				return validateTTypeName(value, diagnostics, context);
			case EdmPackage.TTYPE_NAME_MEMBER3:
				return validateTTypeNameMember3((String)value, diagnostics, context);
			case EdmPackage.TUNICODE_FACET:
				return validateTUnicodeFacet((Boolean)value, diagnostics, context);
			case EdmPackage.TUNICODE_FACET_OBJECT:
				return validateTUnicodeFacetObject((Boolean)value, diagnostics, context);
			case EdmPackage.TVARIABLE_OBJECT:
				return validateTVariableObject((TVariable)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationType(AnnotationType annotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdmRoot(EdmRoot edmRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edmRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaType(SchemaType schemaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAction(TAction tAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTActionFunctionParameter(TActionFunctionParameter tActionFunctionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tActionFunctionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTActionFunctionReturnType(TActionFunctionReturnType tActionFunctionReturnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tActionFunctionReturnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTActionImport(TActionImport tActionImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tActionImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAnnotations(TAnnotations tAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTApplyExpression(TApplyExpression tApplyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tApplyExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBinaryConstantExpression(TBinaryConstantExpression tBinaryConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tBinaryConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBoolConstantExpression(TBoolConstantExpression tBoolConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tBoolConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCastOrIsOfExpression(TCastOrIsOfExpression tCastOrIsOfExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCastOrIsOfExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCollectionExpression(TCollectionExpression tCollectionExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCollectionExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTComplexType(TComplexType tComplexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tComplexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDateConstantExpression(TDateConstantExpression tDateConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDateConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDateTimeOffsetConstantExpression(TDateTimeOffsetConstantExpression tDateTimeOffsetConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDateTimeOffsetConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDecimalConstantExpression(TDecimalConstantExpression tDecimalConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDecimalConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDurationConstantExpression(TDurationConstantExpression tDurationConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDurationConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEntityContainer(TEntityContainer tEntityContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEntityContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEntityKeyElement(TEntityKeyElement tEntityKeyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEntityKeyElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEntitySet(TEntitySet tEntitySet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEntitySet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEntityType(TEntityType tEntityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEntityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumType(TEnumType tEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumTypeMember(TEnumTypeMember tEnumTypeMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEnumTypeMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFloatConstantExpression(TFloatConstantExpression tFloatConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tFloatConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFunction(TFunction tFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFunctionImport(TFunctionImport tFunctionImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tFunctionImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGuidConstantExpression(TGuidConstantExpression tGuidConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tGuidConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIfExpression(TIfExpression tIfExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tIfExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIntConstantExpression(TIntConstantExpression tIntConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tIntConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLabeledElementExpression(TLabeledElementExpression tLabeledElementExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tLabeledElementExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLabeledElementReferenceExpression(TLabeledElementReferenceExpression tLabeledElementReferenceExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tLabeledElementReferenceExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNavigationProperty(TNavigationProperty tNavigationProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNavigationProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNavigationPropertyBinding(TNavigationPropertyBinding tNavigationPropertyBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNavigationPropertyBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNullExpression(TNullExpression tNullExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNullExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOnDelete(TOnDelete tOnDelete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tOnDelete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOneChildExpression(TOneChildExpression tOneChildExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tOneChildExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProperty(TProperty tProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPropertyRef(TPropertyRef tPropertyRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPropertyRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPropertyValue(TPropertyValue tPropertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPropertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRecordExpression(TRecordExpression tRecordExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRecordExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTReferentialConstraint(TReferentialConstraint tReferentialConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tReferentialConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSingleton(TSingleton tSingleton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSingleton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTStringConstantExpression(TStringConstantExpression tStringConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tStringConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTerm(TTerm tTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTimeOfDayConstantExpression(TTimeOfDayConstantExpression tTimeOfDayConstantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTimeOfDayConstantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTwoChildrenExpression(TTwoChildrenExpression tTwoChildrenExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTwoChildrenExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTypeDefinition(TTypeDefinition tTypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTypeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAbstractType(TAbstractType tAbstractType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAppliesToElementsItem(TAppliesToElementsItem tAppliesToElementsItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTClientFunctionMember1(TClientFunctionMember1 tClientFunctionMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFloating(TFloating tFloating, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMax(TMax tMax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOnDeleteAction(TOnDeleteAction tOnDeleteAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrimitiveTypeMember0(TPrimitiveTypeMember0 tPrimitiveTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVariable(TVariable tVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinary(String binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBinary_Pattern(binary, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBinary_Pattern
	 */
	public static final  PatternMatcher [][] BINARY__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Za-z0-9_\\-]{4})*([A-Za-z0-9_\\-]{3}[A-Za-z0-9_\\-]|[A-Za-z0-9_\\-]{2}[AEIMQUYcgkosw048]=?|[A-Za-z0-9_\\-][AQgw](==)?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinary_Pattern(String binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getBinary(), binary, BINARY__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBoolean_Pattern(boolean_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBoolean_Pattern
	 */
	public static final  PatternMatcher [][] BOOLEAN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("true|false")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Pattern(boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getBoolean(), boolean_, BOOLEAN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanObject(Boolean booleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBoolean_Pattern(booleanObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(XMLGregorianCalendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDate_Pattern(date, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDate_Pattern
	 */
	public static final  PatternMatcher [][] DATE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate_Pattern(XMLGregorianCalendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getDate(), date, DATE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeStamp(XMLGregorianCalendar dateTimeStamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeStamp_Pattern(dateTimeStamp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimeStamp_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_STAMP__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".*([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]{1,12})?(Z|(\\+|-)[0-9][0-9]:[0-9][0-9])")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeStamp_Pattern(XMLGregorianCalendar dateTimeStamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getDateTimeStamp(), dateTimeStamp, DATE_TIME_STAMP__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayTimeDuration(Duration dayTimeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDayTimeDuration_Pattern(dayTimeDuration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDayTimeDuration_Pattern
	 */
	public static final  PatternMatcher [][] DAY_TIME_DURATION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^YM]*[DT].*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Day Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayTimeDuration_Pattern(Duration dayTimeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getDayTimeDuration(), dayTimeDuration, DAY_TIME_DURATION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAbstractTypeObject(TAbstractType tAbstractTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAppliesTo(Object tAppliesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTAppliesTo_MemberTypes(tAppliesTo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TApplies To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAppliesTo_MemberTypes(Object tAppliesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (EdmPackage.eINSTANCE.getTAppliesToElements().isInstance(tAppliesTo)) {
				if (validateTAppliesToElements((List<?>)tAppliesTo, tempDiagnostics, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTSimpleIdentifier().isInstance(tAppliesTo)) {
				if (validateTSimpleIdentifier((String)tAppliesTo, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (EdmPackage.eINSTANCE.getTAppliesToElements().isInstance(tAppliesTo)) {
				if (validateTAppliesToElements((List<?>)tAppliesTo, null, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTSimpleIdentifier().isInstance(tAppliesTo)) {
				if (validateTSimpleIdentifier((String)tAppliesTo, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAppliesToElements(List<?> tAppliesToElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTAppliesToElements_ItemType(tAppliesToElements, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>TApplies To Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAppliesToElements_ItemType(List<?> tAppliesToElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = tAppliesToElements.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (EdmPackage.eINSTANCE.getTAppliesToElementsItem().isInstance(item)) {
				result &= validateTAppliesToElementsItem((TAppliesToElementsItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(EdmPackage.eINSTANCE.getTAppliesToElementsItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAppliesToElementsItemObject(TAppliesToElementsItem tAppliesToElementsItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTClientFunction(Object tClientFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTClientFunction_MemberTypes(tClientFunction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TClient Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTClientFunction_MemberTypes(Object tClientFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (EdmPackage.eINSTANCE.getTQualifiedName().isInstance(tClientFunction)) {
				if (validateTQualifiedName((String)tClientFunction, tempDiagnostics, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTClientFunctionMember1().isInstance(tClientFunction)) {
				if (validateTClientFunctionMember1((TClientFunctionMember1)tClientFunction, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (EdmPackage.eINSTANCE.getTQualifiedName().isInstance(tClientFunction)) {
				if (validateTQualifiedName((String)tClientFunction, null, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTClientFunctionMember1().isInstance(tClientFunction)) {
				if (validateTClientFunctionMember1((TClientFunctionMember1)tClientFunction, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTClientFunctionMember1Object(TClientFunctionMember1 tClientFunctionMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDecimalLiteral(String tDecimalLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTDecimalLiteral_Pattern(tDecimalLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTDecimalLiteral_Pattern
	 */
	public static final  PatternMatcher [][] TDECIMAL_LITERAL__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\+|-)?[0-9]+(\\.[0-9]+)?([Ee](\\+|-)?[0-9]+)?|-?INF|NaN")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TDecimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDecimalLiteral_Pattern(String tDecimalLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTDecimalLiteral(), tDecimalLiteral, TDECIMAL_LITERAL__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumMemberList(List<?> tEnumMemberList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTEnumMemberList_ItemType(tEnumMemberList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>TEnum Member List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumMemberList_ItemType(List<?> tEnumMemberList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = tEnumMemberList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (EdmPackage.eINSTANCE.getTPath().isInstance(item)) {
				result &= validateTPath((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(EdmPackage.eINSTANCE.getTPath(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFloatingObject(TFloating tFloatingObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGuidLiteral(String tGuidLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTGuidLiteral_Pattern(tGuidLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTGuidLiteral_Pattern
	 */
	public static final  PatternMatcher [][] TGUID_LITERAL__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TGuid Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGuidLiteral_Pattern(String tGuidLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTGuidLiteral(), tGuidLiteral, TGUID_LITERAL__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(String time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTime_Pattern(time, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTime_Pattern
	 */
	public static final  PatternMatcher [][] TIME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([01][0-9]|2[0-3]):[0-5][0-9](:[0-5][0-9](\\.[0-9]{1,12})?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_Pattern(String time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTime(), time, TIME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTInstancePath(String tInstancePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMaxLengthFacet(Object tMaxLengthFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTMaxLengthFacet_MemberTypes(tMaxLengthFacet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TMax Length Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMaxLengthFacet_MemberTypes(Object tMaxLengthFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (EdmPackage.eINSTANCE.getTMax().isInstance(tMaxLengthFacet)) {
				if (validateTMax((TMax)tMaxLengthFacet, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(tMaxLengthFacet)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)tMaxLengthFacet, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (EdmPackage.eINSTANCE.getTMax().isInstance(tMaxLengthFacet)) {
				if (validateTMax((TMax)tMaxLengthFacet, null, context)) return true;
			}
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(tMaxLengthFacet)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)tMaxLengthFacet, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMaxObject(TMax tMaxObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTModelPath(String tModelPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTModelPath_Pattern(tModelPath, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTModelPath_Pattern
	 */
	public static final  PatternMatcher [][] TMODEL_PATH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(/?@?[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(([\\./#@]|/@)[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){0,}(/$count)?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TModel Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTModelPath_Pattern(String tModelPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTModelPath(), tModelPath, TMODEL_PATH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNamespaceName(String tNamespaceName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTNamespaceName_Pattern(tNamespaceName, diagnostics, context);
		if (result || diagnostics != null) result &= validateTNamespaceName_MaxLength(tNamespaceName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTNamespaceName_Pattern
	 */
	public static final  PatternMatcher [][] TNAMESPACE_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(\\.[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){0,}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TNamespace Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNamespaceName_Pattern(String tNamespaceName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTNamespaceName(), tNamespaceName, TNAMESPACE_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>TNamespace Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNamespaceName_MaxLength(String tNamespaceName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tNamespaceName.length();
		boolean result = length <= 511;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(EdmPackage.eINSTANCE.getTNamespaceName(), tNamespaceName, length, 511, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOnDeleteActionObject(TOnDeleteAction tOnDeleteActionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPath(String tPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTPath_Pattern(tPath, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTPath_Pattern
	 */
	public static final  PatternMatcher [][] TPATH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}([\\./][\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){0,}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TPath</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPath_Pattern(String tPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTPath(), tPath, TPATH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrecisionFacet(BigInteger tPrecisionFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(tPrecisionFacet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrimitiveType(Object tPrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTPrimitiveType_MemberTypes(tPrimitiveType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TPrimitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrimitiveType_MemberTypes(Object tPrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (EdmPackage.eINSTANCE.getTPrimitiveTypeMember0().isInstance(tPrimitiveType)) {
				if (validateTPrimitiveTypeMember0((TPrimitiveTypeMember0)tPrimitiveType, tempDiagnostics, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTPrimitiveTypeMember1().isInstance(tPrimitiveType)) {
				if (validateTPrimitiveTypeMember1((String)tPrimitiveType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (EdmPackage.eINSTANCE.getTPrimitiveTypeMember0().isInstance(tPrimitiveType)) {
				if (validateTPrimitiveTypeMember0((TPrimitiveTypeMember0)tPrimitiveType, null, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTPrimitiveTypeMember1().isInstance(tPrimitiveType)) {
				if (validateTPrimitiveTypeMember1((String)tPrimitiveType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrimitiveTypeMember0Object(TPrimitiveTypeMember0 tPrimitiveTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrimitiveTypeMember1(String tPrimitiveTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTPrimitiveTypeMember1_Pattern(tPrimitiveTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTPrimitiveTypeMember1_Pattern
	 */
	public static final  PatternMatcher [][] TPRIMITIVE_TYPE_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("Edm\\..+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TPrimitive Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrimitiveTypeMember1_Pattern(String tPrimitiveTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTPrimitiveTypeMember1(), tPrimitiveTypeMember1, TPRIMITIVE_TYPE_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTQualifiedName(String tQualifiedName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTQualifiedName_Pattern(tQualifiedName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTQualifiedName_Pattern
	 */
	public static final  PatternMatcher [][] TQUALIFIED_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(\\.[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){1,}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TQualified Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTQualifiedName_Pattern(String tQualifiedName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTQualifiedName(), tQualifiedName, TQUALIFIED_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTScaleFacet(Object tScaleFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTScaleFacet_MemberTypes(tScaleFacet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TScale Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTScaleFacet_MemberTypes(Object tScaleFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (EdmPackage.eINSTANCE.getTFloating().isInstance(tScaleFacet)) {
				if (validateTFloating((TFloating)tScaleFacet, tempDiagnostics, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTVariable().isInstance(tScaleFacet)) {
				if (validateTVariable((TVariable)tScaleFacet, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(tScaleFacet)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)tScaleFacet, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (EdmPackage.eINSTANCE.getTFloating().isInstance(tScaleFacet)) {
				if (validateTFloating((TFloating)tScaleFacet, null, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTVariable().isInstance(tScaleFacet)) {
				if (validateTVariable((TVariable)tScaleFacet, null, context)) return true;
			}
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(tScaleFacet)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)tScaleFacet, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSimpleIdentifier(String tSimpleIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTSimpleIdentifier_Pattern(tSimpleIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateTSimpleIdentifier_MaxLength(tSimpleIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTSimpleIdentifier_Pattern
	 */
	public static final  PatternMatcher [][] TSIMPLE_IDENTIFIER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TSimple Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSimpleIdentifier_Pattern(String tSimpleIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTSimpleIdentifier(), tSimpleIdentifier, TSIMPLE_IDENTIFIER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>TSimple Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSimpleIdentifier_MaxLength(String tSimpleIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tSimpleIdentifier.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(EdmPackage.eINSTANCE.getTSimpleIdentifier(), tSimpleIdentifier, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSridFacet(Object tSridFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTSridFacet_MemberTypes(tSridFacet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TSrid Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSridFacet_MemberTypes(Object tSridFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (EdmPackage.eINSTANCE.getTVariable().isInstance(tSridFacet)) {
				if (validateTVariable((TVariable)tSridFacet, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(tSridFacet)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)tSridFacet, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (EdmPackage.eINSTANCE.getTVariable().isInstance(tSridFacet)) {
				if (validateTVariable((TVariable)tSridFacet, null, context)) return true;
			}
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(tSridFacet)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)tSridFacet, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTarget(String tTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTTarget_Pattern(tTarget, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTTarget_Pattern
	 */
	public static final  PatternMatcher [][] TTARGET__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(([\\.\\(,#]|/@?)(\\)|[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}\\)?)){0,}(/$ReturnType)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TTarget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTarget_Pattern(String tTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTTarget(), tTarget, TTARGET__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTypeName(Object tTypeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTTypeName_MemberTypes(tTypeName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TType Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTypeName_MemberTypes(Object tTypeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (EdmPackage.eINSTANCE.getTPrimitiveType().isInstance(tTypeName)) {
				if (validateTPrimitiveType(tTypeName, tempDiagnostics, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTAbstractType().isInstance(tTypeName)) {
				if (validateTAbstractType((TAbstractType)tTypeName, tempDiagnostics, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTQualifiedName().isInstance(tTypeName)) {
				if (validateTQualifiedName((String)tTypeName, tempDiagnostics, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTTypeNameMember3().isInstance(tTypeName)) {
				if (validateTTypeNameMember3((String)tTypeName, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (EdmPackage.eINSTANCE.getTPrimitiveType().isInstance(tTypeName)) {
				if (validateTPrimitiveType(tTypeName, null, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTAbstractType().isInstance(tTypeName)) {
				if (validateTAbstractType((TAbstractType)tTypeName, null, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTQualifiedName().isInstance(tTypeName)) {
				if (validateTQualifiedName((String)tTypeName, null, context)) return true;
			}
			if (EdmPackage.eINSTANCE.getTTypeNameMember3().isInstance(tTypeName)) {
				if (validateTTypeNameMember3((String)tTypeName, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTypeNameMember3(String tTypeNameMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTTypeNameMember3_Pattern(tTypeNameMember3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTTypeNameMember3_Pattern
	 */
	public static final  PatternMatcher [][] TTYPE_NAME_MEMBER3__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("Collection\\([\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(\\.[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){1,}\\)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TType Name Member3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTypeNameMember3_Pattern(String tTypeNameMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdmPackage.eINSTANCE.getTTypeNameMember3(), tTypeNameMember3, TTYPE_NAME_MEMBER3__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUnicodeFacet(boolean tUnicodeFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUnicodeFacetObject(Boolean tUnicodeFacetObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVariableObject(TVariable tVariableObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EdmValidator
