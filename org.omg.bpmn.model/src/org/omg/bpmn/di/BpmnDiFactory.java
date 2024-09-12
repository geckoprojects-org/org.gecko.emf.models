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
package org.omg.bpmn.di;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.bpmn.di.BpmnDiPackage
 * @generated
 */
@ProviderType
public interface BpmnDiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnDiFactory eINSTANCE = org.omg.bpmn.di.impl.BpmnDiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BPMNDI Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMNDI Root</em>'.
	 * @generated
	 */
	BPMNDIRoot createBPMNDIRoot();

	/**
	 * Returns a new object of class '<em>BPMN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Diagram</em>'.
	 * @generated
	 */
	BPMNDiagram createBPMNDiagram();

	/**
	 * Returns a new object of class '<em>BPMN Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Edge</em>'.
	 * @generated
	 */
	BPMNEdge createBPMNEdge();

	/**
	 * Returns a new object of class '<em>BPMN Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Label</em>'.
	 * @generated
	 */
	BPMNLabel createBPMNLabel();

	/**
	 * Returns a new object of class '<em>BPMN Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Label Style</em>'.
	 * @generated
	 */
	BPMNLabelStyle createBPMNLabelStyle();

	/**
	 * Returns a new object of class '<em>BPMN Plane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Plane</em>'.
	 * @generated
	 */
	BPMNPlane createBPMNPlane();

	/**
	 * Returns a new object of class '<em>BPMN Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Shape</em>'.
	 * @generated
	 */
	BPMNShape createBPMNShape();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BpmnDiPackage getBpmnDiPackage();

} //BpmnDiFactory
