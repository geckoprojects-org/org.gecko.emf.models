/*
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
package org.camunda.bpmn.camunda.impl;

import org.camunda.bpmn.camunda.BoundaryEvent;
import org.camunda.bpmn.camunda.CamundaPackage;

import org.eclipse.emf.ecore.EClass;

import org.omg.spec.bpmn.bpmn.impl.TBoundaryEventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoundaryEventImpl extends TBoundaryEventImpl implements BoundaryEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.BOUNDARY_EVENT;
	}

} //BoundaryEventImpl
