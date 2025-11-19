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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.open.oasis.docs.odata.ns.edm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage
 * @generated
 */
public class EdmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmSwitch() {
		if (modelPackage == null) {
			modelPackage = EdmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EdmPackage.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.EDM_ROOT: {
				EdmRoot edmRoot = (EdmRoot)theEObject;
				T result = caseEdmRoot(edmRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.SCHEMA_TYPE: {
				SchemaType schemaType = (SchemaType)theEObject;
				T result = caseSchemaType(schemaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TACTION: {
				TAction tAction = (TAction)theEObject;
				T result = caseTAction(tAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TACTION_FUNCTION_PARAMETER: {
				TActionFunctionParameter tActionFunctionParameter = (TActionFunctionParameter)theEObject;
				T result = caseTActionFunctionParameter(tActionFunctionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TACTION_FUNCTION_RETURN_TYPE: {
				TActionFunctionReturnType tActionFunctionReturnType = (TActionFunctionReturnType)theEObject;
				T result = caseTActionFunctionReturnType(tActionFunctionReturnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TACTION_IMPORT: {
				TActionImport tActionImport = (TActionImport)theEObject;
				T result = caseTActionImport(tActionImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TANNOTATIONS: {
				TAnnotations tAnnotations = (TAnnotations)theEObject;
				T result = caseTAnnotations(tAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TAPPLY_EXPRESSION: {
				TApplyExpression tApplyExpression = (TApplyExpression)theEObject;
				T result = caseTApplyExpression(tApplyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TBINARY_CONSTANT_EXPRESSION: {
				TBinaryConstantExpression tBinaryConstantExpression = (TBinaryConstantExpression)theEObject;
				T result = caseTBinaryConstantExpression(tBinaryConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TBOOL_CONSTANT_EXPRESSION: {
				TBoolConstantExpression tBoolConstantExpression = (TBoolConstantExpression)theEObject;
				T result = caseTBoolConstantExpression(tBoolConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TCAST_OR_IS_OF_EXPRESSION: {
				TCastOrIsOfExpression tCastOrIsOfExpression = (TCastOrIsOfExpression)theEObject;
				T result = caseTCastOrIsOfExpression(tCastOrIsOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TCOLLECTION_EXPRESSION: {
				TCollectionExpression tCollectionExpression = (TCollectionExpression)theEObject;
				T result = caseTCollectionExpression(tCollectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TCOMPLEX_TYPE: {
				TComplexType tComplexType = (TComplexType)theEObject;
				T result = caseTComplexType(tComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TDATE_CONSTANT_EXPRESSION: {
				TDateConstantExpression tDateConstantExpression = (TDateConstantExpression)theEObject;
				T result = caseTDateConstantExpression(tDateConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TDATE_TIME_OFFSET_CONSTANT_EXPRESSION: {
				TDateTimeOffsetConstantExpression tDateTimeOffsetConstantExpression = (TDateTimeOffsetConstantExpression)theEObject;
				T result = caseTDateTimeOffsetConstantExpression(tDateTimeOffsetConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TDECIMAL_CONSTANT_EXPRESSION: {
				TDecimalConstantExpression tDecimalConstantExpression = (TDecimalConstantExpression)theEObject;
				T result = caseTDecimalConstantExpression(tDecimalConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TDURATION_CONSTANT_EXPRESSION: {
				TDurationConstantExpression tDurationConstantExpression = (TDurationConstantExpression)theEObject;
				T result = caseTDurationConstantExpression(tDurationConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TENTITY_CONTAINER: {
				TEntityContainer tEntityContainer = (TEntityContainer)theEObject;
				T result = caseTEntityContainer(tEntityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TENTITY_KEY_ELEMENT: {
				TEntityKeyElement tEntityKeyElement = (TEntityKeyElement)theEObject;
				T result = caseTEntityKeyElement(tEntityKeyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TENTITY_SET: {
				TEntitySet tEntitySet = (TEntitySet)theEObject;
				T result = caseTEntitySet(tEntitySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TENTITY_TYPE: {
				TEntityType tEntityType = (TEntityType)theEObject;
				T result = caseTEntityType(tEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TENUM_TYPE: {
				TEnumType tEnumType = (TEnumType)theEObject;
				T result = caseTEnumType(tEnumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TENUM_TYPE_MEMBER: {
				TEnumTypeMember tEnumTypeMember = (TEnumTypeMember)theEObject;
				T result = caseTEnumTypeMember(tEnumTypeMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TFLOAT_CONSTANT_EXPRESSION: {
				TFloatConstantExpression tFloatConstantExpression = (TFloatConstantExpression)theEObject;
				T result = caseTFloatConstantExpression(tFloatConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TFUNCTION: {
				TFunction tFunction = (TFunction)theEObject;
				T result = caseTFunction(tFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TFUNCTION_IMPORT: {
				TFunctionImport tFunctionImport = (TFunctionImport)theEObject;
				T result = caseTFunctionImport(tFunctionImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TGUID_CONSTANT_EXPRESSION: {
				TGuidConstantExpression tGuidConstantExpression = (TGuidConstantExpression)theEObject;
				T result = caseTGuidConstantExpression(tGuidConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TIF_EXPRESSION: {
				TIfExpression tIfExpression = (TIfExpression)theEObject;
				T result = caseTIfExpression(tIfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TINT_CONSTANT_EXPRESSION: {
				TIntConstantExpression tIntConstantExpression = (TIntConstantExpression)theEObject;
				T result = caseTIntConstantExpression(tIntConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TLABELED_ELEMENT_EXPRESSION: {
				TLabeledElementExpression tLabeledElementExpression = (TLabeledElementExpression)theEObject;
				T result = caseTLabeledElementExpression(tLabeledElementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TLABELED_ELEMENT_REFERENCE_EXPRESSION: {
				TLabeledElementReferenceExpression tLabeledElementReferenceExpression = (TLabeledElementReferenceExpression)theEObject;
				T result = caseTLabeledElementReferenceExpression(tLabeledElementReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TNAVIGATION_PROPERTY: {
				TNavigationProperty tNavigationProperty = (TNavigationProperty)theEObject;
				T result = caseTNavigationProperty(tNavigationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TNAVIGATION_PROPERTY_BINDING: {
				TNavigationPropertyBinding tNavigationPropertyBinding = (TNavigationPropertyBinding)theEObject;
				T result = caseTNavigationPropertyBinding(tNavigationPropertyBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TNULL_EXPRESSION: {
				TNullExpression tNullExpression = (TNullExpression)theEObject;
				T result = caseTNullExpression(tNullExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TON_DELETE: {
				TOnDelete tOnDelete = (TOnDelete)theEObject;
				T result = caseTOnDelete(tOnDelete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TONE_CHILD_EXPRESSION: {
				TOneChildExpression tOneChildExpression = (TOneChildExpression)theEObject;
				T result = caseTOneChildExpression(tOneChildExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TPROPERTY: {
				TProperty tProperty = (TProperty)theEObject;
				T result = caseTProperty(tProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TPROPERTY_REF: {
				TPropertyRef tPropertyRef = (TPropertyRef)theEObject;
				T result = caseTPropertyRef(tPropertyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TPROPERTY_VALUE: {
				TPropertyValue tPropertyValue = (TPropertyValue)theEObject;
				T result = caseTPropertyValue(tPropertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TRECORD_EXPRESSION: {
				TRecordExpression tRecordExpression = (TRecordExpression)theEObject;
				T result = caseTRecordExpression(tRecordExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TREFERENTIAL_CONSTRAINT: {
				TReferentialConstraint tReferentialConstraint = (TReferentialConstraint)theEObject;
				T result = caseTReferentialConstraint(tReferentialConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TSINGLETON: {
				TSingleton tSingleton = (TSingleton)theEObject;
				T result = caseTSingleton(tSingleton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TSTRING_CONSTANT_EXPRESSION: {
				TStringConstantExpression tStringConstantExpression = (TStringConstantExpression)theEObject;
				T result = caseTStringConstantExpression(tStringConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TTERM: {
				TTerm tTerm = (TTerm)theEObject;
				T result = caseTTerm(tTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TTIME_OF_DAY_CONSTANT_EXPRESSION: {
				TTimeOfDayConstantExpression tTimeOfDayConstantExpression = (TTimeOfDayConstantExpression)theEObject;
				T result = caseTTimeOfDayConstantExpression(tTimeOfDayConstantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TTWO_CHILDREN_EXPRESSION: {
				TTwoChildrenExpression tTwoChildrenExpression = (TTwoChildrenExpression)theEObject;
				T result = caseTTwoChildrenExpression(tTwoChildrenExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TTYPE_DEFINITION: {
				TTypeDefinition tTypeDefinition = (TTypeDefinition)theEObject;
				T result = caseTTypeDefinition(tTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdmRoot(EdmRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaType(SchemaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAction(TAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAction Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAction Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTActionFunctionParameter(TActionFunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAction Function Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAction Function Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTActionFunctionReturnType(TActionFunctionReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAction Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAction Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTActionImport(TActionImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotations(TAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TApply Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TApply Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTApplyExpression(TApplyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBinary Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBinary Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBinaryConstantExpression(TBinaryConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBool Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBool Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBoolConstantExpression(TBoolConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCast Or Is Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCast Or Is Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCastOrIsOfExpression(TCastOrIsOfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCollection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCollection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCollectionExpression(TCollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TComplex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TComplex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTComplexType(TComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDate Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDate Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDateConstantExpression(TDateConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDate Time Offset Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDate Time Offset Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDateTimeOffsetConstantExpression(TDateTimeOffsetConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecimal Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecimal Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecimalConstantExpression(TDecimalConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDuration Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDuration Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDurationConstantExpression(TDurationConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntity Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntity Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntityContainer(TEntityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntity Key Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntity Key Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntityKeyElement(TEntityKeyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntity Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntity Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntitySet(TEntitySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntityType(TEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEnumType(TEnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnum Type Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnum Type Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEnumTypeMember(TEnumTypeMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFloat Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFloat Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFloatConstantExpression(TFloatConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFunction(TFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFunction Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFunction Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFunctionImport(TFunctionImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGuid Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGuid Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGuidConstantExpression(TGuidConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIf Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIfExpression(TIfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInt Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInt Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIntConstantExpression(TIntConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLabeled Element Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLabeled Element Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLabeledElementExpression(TLabeledElementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLabeled Element Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLabeled Element Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLabeledElementReferenceExpression(TLabeledElementReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNavigation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNavigation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNavigationProperty(TNavigationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNavigation Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNavigation Property Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNavigationPropertyBinding(TNavigationPropertyBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNull Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNull Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNullExpression(TNullExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOn Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOn Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOnDelete(TOnDelete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOne Child Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOne Child Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOneChildExpression(TOneChildExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTProperty(TProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProperty Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProperty Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPropertyRef(TPropertyRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProperty Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProperty Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPropertyValue(TPropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRecord Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRecord Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRecordExpression(TRecordExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TReferential Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TReferential Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTReferentialConstraint(TReferentialConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSingleton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSingleton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSingleton(TSingleton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TString Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TString Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTStringConstantExpression(TStringConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTerm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTerm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTerm(TTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTime Of Day Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTime Of Day Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTimeOfDayConstantExpression(TTimeOfDayConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTwo Children Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTwo Children Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTwoChildrenExpression(TTwoChildrenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TType Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TType Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTypeDefinition(TTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EdmSwitch
