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
package org.camunda.bpmn.model.impl;

import org.camunda.bpmn.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CamundaFactoryImpl extends EFactoryImpl implements CamundaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CamundaFactory init() {
		try {
			CamundaFactory theCamundaFactory = (CamundaFactory)EPackage.Registry.INSTANCE.getEFactory(CamundaPackage.eNS_URI);
			if (theCamundaFactory != null) {
				return theCamundaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CamundaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamundaFactoryImpl() {
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
			case CamundaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CamundaPackage.START_EVENT: return createStartEvent();
			case CamundaPackage.EXECUTION_LISTENER_TYPE: return createExecutionListenerType();
			case CamundaPackage.FIELD_TYPE: return createFieldType();
			case CamundaPackage.FORM_PROPERTY_TYPE: return createFormPropertyType();
			case CamundaPackage.IN_TYPE: return createInType();
			case CamundaPackage.OUT_TYPE: return createOutType();
			case CamundaPackage.TASK_LISTENER_TYPE: return createTaskListenerType();
			case CamundaPackage.CALL_ACTIVITY: return createCallActivity();
			case CamundaPackage.BOUNDARY_EVENT: return createBoundaryEvent();
			case CamundaPackage.VALUE_TYPE: return createValueType();
			case CamundaPackage.FORM_DATA_TYPE: return createFormDataType();
			case CamundaPackage.FORM_FIELD_TYPE: return createFormFieldType();
			case CamundaPackage.PROPERTIES_TYPE: return createPropertiesType();
			case CamundaPackage.PROPERTY_TYPE: return createPropertyType();
			case CamundaPackage.VALIDATION_TYPE: return createValidationType();
			case CamundaPackage.CONSTRAINT_TYPE: return createConstraintType();
			case CamundaPackage.USER_TASK: return createUserTask();
			case CamundaPackage.FORM_DATA_CONTAINER: return createFormDataContainer();
			case CamundaPackage.EXPRESSION: return createExpression();
			case CamundaPackage.CONNECTOR_TYPE: return createConnectorType();
			case CamundaPackage.INPUT_OUTPUT_TYPE: return createInputOutputType();
			case CamundaPackage.PARAMETER_TYPE: return createParameterType();
			case CamundaPackage.SCRIPT_TYPE: return createScriptType();
			case CamundaPackage.MAP_TYPE: return createMapType();
			case CamundaPackage.ENTRY_TYPE: return createEntryType();
			case CamundaPackage.LIST_TYPE: return createListType();
			case CamundaPackage.FAILED_JOB_RETRY_TIME_CYCLE_TYPE: return createFailedJobRetryTimeCycleType();
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
			case CamundaPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case CamundaPackage.EVENT_TYPE1:
				return createEventType1FromString(eDataType, initialValue);
			case CamundaPackage.HISTORY_TYPE:
				return createHistoryTypeFromString(eDataType, initialValue);
			case CamundaPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case CamundaPackage.CLASS_TYPE:
				return createClassTypeFromString(eDataType, initialValue);
			case CamundaPackage.EVENT_TYPE_OBJECT:
				return createEventTypeObjectFromString(eDataType, initialValue);
			case CamundaPackage.EVENT_TYPE_OBJECT1:
				return createEventTypeObject1FromString(eDataType, initialValue);
			case CamundaPackage.FORM_HANDLER_CLASS_TYPE:
				return createFormHandlerClassTypeFromString(eDataType, initialValue);
			case CamundaPackage.HISTORY_TYPE_OBJECT:
				return createHistoryTypeObjectFromString(eDataType, initialValue);
			case CamundaPackage.TEXPRESSION:
				return createTExpressionFromString(eDataType, initialValue);
			case CamundaPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
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
			case CamundaPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case CamundaPackage.EVENT_TYPE1:
				return convertEventType1ToString(eDataType, instanceValue);
			case CamundaPackage.HISTORY_TYPE:
				return convertHistoryTypeToString(eDataType, instanceValue);
			case CamundaPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case CamundaPackage.CLASS_TYPE:
				return convertClassTypeToString(eDataType, instanceValue);
			case CamundaPackage.EVENT_TYPE_OBJECT:
				return convertEventTypeObjectToString(eDataType, instanceValue);
			case CamundaPackage.EVENT_TYPE_OBJECT1:
				return convertEventTypeObject1ToString(eDataType, instanceValue);
			case CamundaPackage.FORM_HANDLER_CLASS_TYPE:
				return convertFormHandlerClassTypeToString(eDataType, instanceValue);
			case CamundaPackage.HISTORY_TYPE_OBJECT:
				return convertHistoryTypeObjectToString(eDataType, instanceValue);
			case CamundaPackage.TEXPRESSION:
				return convertTExpressionToString(eDataType, instanceValue);
			case CamundaPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
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
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionListenerType createExecutionListenerType() {
		ExecutionListenerTypeImpl executionListenerType = new ExecutionListenerTypeImpl();
		return executionListenerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormPropertyType createFormPropertyType() {
		FormPropertyTypeImpl formPropertyType = new FormPropertyTypeImpl();
		return formPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InType createInType() {
		InTypeImpl inType = new InTypeImpl();
		return inType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutType createOutType() {
		OutTypeImpl outType = new OutTypeImpl();
		return outType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskListenerType createTaskListenerType() {
		TaskListenerTypeImpl taskListenerType = new TaskListenerTypeImpl();
		return taskListenerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallActivity createCallActivity() {
		CallActivityImpl callActivity = new CallActivityImpl();
		return callActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryEvent createBoundaryEvent() {
		BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormDataType createFormDataType() {
		FormDataTypeImpl formDataType = new FormDataTypeImpl();
		return formDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormFieldType createFormFieldType() {
		FormFieldTypeImpl formFieldType = new FormFieldTypeImpl();
		return formFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationType createValidationType() {
		ValidationTypeImpl validationType = new ValidationTypeImpl();
		return validationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintType createConstraintType() {
		ConstraintTypeImpl constraintType = new ConstraintTypeImpl();
		return constraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormDataContainer createFormDataContainer() {
		FormDataContainerImpl formDataContainer = new FormDataContainerImpl();
		return formDataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputOutputType createInputOutputType() {
		InputOutputTypeImpl inputOutputType = new InputOutputTypeImpl();
		return inputOutputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptType createScriptType() {
		ScriptTypeImpl scriptType = new ScriptTypeImpl();
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailedJobRetryTimeCycleType createFailedJobRetryTimeCycleType() {
		FailedJobRetryTimeCycleTypeImpl failedJobRetryTimeCycleType = new FailedJobRetryTimeCycleTypeImpl();
		return failedJobRetryTimeCycleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType1 createEventType1FromString(EDataType eDataType, String initialValue) {
		EventType1 result = EventType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryType createHistoryTypeFromString(EDataType eDataType, String initialValue) {
		HistoryType result = HistoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTypeFromString(CamundaPackage.Literals.EVENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTypeToString(CamundaPackage.Literals.EVENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType1 createEventTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createEventType1FromString(CamundaPackage.Literals.EVENT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertEventType1ToString(CamundaPackage.Literals.EVENT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormHandlerClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormHandlerClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryType createHistoryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHistoryTypeFromString(CamundaPackage.Literals.HISTORY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHistoryTypeToString(CamundaPackage.Literals.HISTORY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExpressionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExpressionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(CamundaPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(CamundaPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamundaPackage getCamundaPackage() {
		return (CamundaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CamundaPackage getPackage() {
		return CamundaPackage.eINSTANCE;
	}

} //CamundaFactoryImpl
