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
package org.camunda.bpmn.camunda.util;

import org.camunda.bpmn.camunda.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.spec.bpmn.bpmn.BPMNRoot;
import org.omg.spec.bpmn.bpmn.TActivity;
import org.omg.spec.bpmn.bpmn.TBaseElement;
import org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent;
import org.omg.spec.bpmn.bpmn.TBoundaryEvent;
import org.omg.spec.bpmn.bpmn.TCallActivity;
import org.omg.spec.bpmn.bpmn.TCatchEvent;
import org.omg.spec.bpmn.bpmn.TEvent;
import org.omg.spec.bpmn.bpmn.TExpression;
import org.omg.spec.bpmn.bpmn.TFlowElement;
import org.omg.spec.bpmn.bpmn.TFlowNode;
import org.omg.spec.bpmn.bpmn.TStartEvent;
import org.omg.spec.bpmn.bpmn.TTask;
import org.omg.spec.bpmn.bpmn.TUserTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.camunda.bpmn.camunda.CamundaPackage
 * @generated
 */
public class CamundaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CamundaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamundaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CamundaPackage.eINSTANCE;
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
	protected CamundaSwitch<Adapter> modelSwitch =
		new CamundaSwitch<Adapter>() {
			@Override
			public Adapter caseCamundaRoot(CamundaRoot object) {
				return createCamundaRootAdapter();
			}
			@Override
			public Adapter caseStartEvent(StartEvent object) {
				return createStartEventAdapter();
			}
			@Override
			public Adapter caseExecutionListenerType(ExecutionListenerType object) {
				return createExecutionListenerTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseFormPropertyType(FormPropertyType object) {
				return createFormPropertyTypeAdapter();
			}
			@Override
			public Adapter caseInType(InType object) {
				return createInTypeAdapter();
			}
			@Override
			public Adapter caseOutType(OutType object) {
				return createOutTypeAdapter();
			}
			@Override
			public Adapter caseTaskListenerType(TaskListenerType object) {
				return createTaskListenerTypeAdapter();
			}
			@Override
			public Adapter caseCallActivity(CallActivity object) {
				return createCallActivityAdapter();
			}
			@Override
			public Adapter caseBoundaryEvent(BoundaryEvent object) {
				return createBoundaryEventAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseFormDataType(FormDataType object) {
				return createFormDataTypeAdapter();
			}
			@Override
			public Adapter caseFormFieldType(FormFieldType object) {
				return createFormFieldTypeAdapter();
			}
			@Override
			public Adapter casePropertiesType(PropertiesType object) {
				return createPropertiesTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseValidationType(ValidationType object) {
				return createValidationTypeAdapter();
			}
			@Override
			public Adapter caseConstraintType(ConstraintType object) {
				return createConstraintTypeAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseFormDataContainer(FormDataContainer object) {
				return createFormDataContainerAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseConnectorType(ConnectorType object) {
				return createConnectorTypeAdapter();
			}
			@Override
			public Adapter caseInputOutputType(InputOutputType object) {
				return createInputOutputTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseScriptType(ScriptType object) {
				return createScriptTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseFailedJobRetryTimeCycleType(FailedJobRetryTimeCycleType object) {
				return createFailedJobRetryTimeCycleTypeAdapter();
			}
			@Override
			public Adapter caseBPMNRoot(BPMNRoot object) {
				return createBPMNRootAdapter();
			}
			@Override
			public Adapter caseTBaseElement(TBaseElement object) {
				return createTBaseElementAdapter();
			}
			@Override
			public Adapter caseTFlowElement(TFlowElement object) {
				return createTFlowElementAdapter();
			}
			@Override
			public Adapter caseTFlowNode(TFlowNode object) {
				return createTFlowNodeAdapter();
			}
			@Override
			public Adapter caseTEvent(TEvent object) {
				return createTEventAdapter();
			}
			@Override
			public Adapter caseTCatchEvent(TCatchEvent object) {
				return createTCatchEventAdapter();
			}
			@Override
			public Adapter caseTStartEvent(TStartEvent object) {
				return createTStartEventAdapter();
			}
			@Override
			public Adapter caseTActivity(TActivity object) {
				return createTActivityAdapter();
			}
			@Override
			public Adapter caseTCallActivity(TCallActivity object) {
				return createTCallActivityAdapter();
			}
			@Override
			public Adapter caseTBoundaryEvent(TBoundaryEvent object) {
				return createTBoundaryEventAdapter();
			}
			@Override
			public Adapter caseTTask(TTask object) {
				return createTTaskAdapter();
			}
			@Override
			public Adapter caseTUserTask(TUserTask object) {
				return createTUserTaskAdapter();
			}
			@Override
			public Adapter caseTBaseElementWithMixedContent(TBaseElementWithMixedContent object) {
				return createTBaseElementWithMixedContentAdapter();
			}
			@Override
			public Adapter caseTExpression(TExpression object) {
				return createTExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.CamundaRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.CamundaRoot
	 * @generated
	 */
	public Adapter createCamundaRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ExecutionListenerType <em>Execution Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ExecutionListenerType
	 * @generated
	 */
	public Adapter createExecutionListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.FormPropertyType <em>Form Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.FormPropertyType
	 * @generated
	 */
	public Adapter createFormPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.InType <em>In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.InType
	 * @generated
	 */
	public Adapter createInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.OutType <em>Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.OutType
	 * @generated
	 */
	public Adapter createOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.TaskListenerType <em>Task Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.TaskListenerType
	 * @generated
	 */
	public Adapter createTaskListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.CallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.CallActivity
	 * @generated
	 */
	public Adapter createCallActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.BoundaryEvent
	 * @generated
	 */
	public Adapter createBoundaryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.FormDataType <em>Form Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.FormDataType
	 * @generated
	 */
	public Adapter createFormDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.FormFieldType <em>Form Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.FormFieldType
	 * @generated
	 */
	public Adapter createFormFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.PropertiesType
	 * @generated
	 */
	public Adapter createPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ValidationType <em>Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ValidationType
	 * @generated
	 */
	public Adapter createValidationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ConstraintType
	 * @generated
	 */
	public Adapter createConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.FormDataContainer <em>Form Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.FormDataContainer
	 * @generated
	 */
	public Adapter createFormDataContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.InputOutputType <em>Input Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.InputOutputType
	 * @generated
	 */
	public Adapter createInputOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ScriptType
	 * @generated
	 */
	public Adapter createScriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.camunda.bpmn.camunda.FailedJobRetryTimeCycleType <em>Failed Job Retry Time Cycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.camunda.bpmn.camunda.FailedJobRetryTimeCycleType
	 * @generated
	 */
	public Adapter createFailedJobRetryTimeCycleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.BPMNRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot
	 * @generated
	 */
	public Adapter createBPMNRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TBaseElement <em>TBase Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElement
	 * @generated
	 */
	public Adapter createTBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TFlowElement <em>TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TFlowElement
	 * @generated
	 */
	public Adapter createTFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TFlowNode <em>TFlow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TFlowNode
	 * @generated
	 */
	public Adapter createTFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEvent <em>TEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEvent
	 * @generated
	 */
	public Adapter createTEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCatchEvent <em>TCatch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent
	 * @generated
	 */
	public Adapter createTCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TStartEvent <em>TStart Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TStartEvent
	 * @generated
	 */
	public Adapter createTStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TActivity <em>TActivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TActivity
	 * @generated
	 */
	public Adapter createTActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCallActivity <em>TCall Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCallActivity
	 * @generated
	 */
	public Adapter createTCallActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent <em>TBoundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TBoundaryEvent
	 * @generated
	 */
	public Adapter createTBoundaryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TTask <em>TTask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TTask
	 * @generated
	 */
	public Adapter createTTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TUserTask <em>TUser Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TUserTask
	 * @generated
	 */
	public Adapter createTUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent <em>TBase Element With Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent
	 * @generated
	 */
	public Adapter createTBaseElementWithMixedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TExpression <em>TExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TExpression
	 * @generated
	 */
	public Adapter createTExpressionAdapter() {
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

} //CamundaAdapterFactory
