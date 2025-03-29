/*
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
package org.omg.spec.dmn.dmndi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.omg.spec.dmn.dc.Dimension;

import org.omg.spec.dmn.di.Diagram;
import org.omg.spec.dmn.di.DiagramElement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDiagram#getSize <em>Size</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDiagram#getDMNDiagramElementGroup <em>DMN Diagram Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDiagram#getDMNDiagramElement <em>DMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDiagram#isUseAlternativeInputDataShape <em>Use Alternative Input Data Shape</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDiagram()
 * @model extendedMetaData="name='DMNDiagram' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DMNDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Dimension)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDiagram_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Size' namespace='##targetNamespace'"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDiagram#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>DMN Diagram Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element should never be instantiated directly, but rather concrete implementation should. It is placed there only to be referred in the sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DMN Diagram Element Group</em>' attribute list.
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDiagram_DMNDiagramElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DMNDiagramElement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDMNDiagramElementGroup();

	/**
	 * Returns the value of the '<em><b>DMN Diagram Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.di.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element should never be instantiated directly, but rather concrete implementation should. It is placed there only to be referred in the sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DMN Diagram Element</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDiagram_DMNDiagramElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNDiagramElement' namespace='##targetNamespace' group='DMNDiagramElement:group'"
	 * @generated
	 */
	EList<DiagramElement> getDMNDiagramElement();

	/**
	 * Returns the value of the '<em><b>Use Alternative Input Data Shape</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Alternative Input Data Shape</em>' attribute.
	 * @see #isSetUseAlternativeInputDataShape()
	 * @see #unsetUseAlternativeInputDataShape()
	 * @see #setUseAlternativeInputDataShape(boolean)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDiagram_UseAlternativeInputDataShape()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='useAlternativeInputDataShape'"
	 * @generated
	 */
	boolean isUseAlternativeInputDataShape();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDiagram#isUseAlternativeInputDataShape <em>Use Alternative Input Data Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Alternative Input Data Shape</em>' attribute.
	 * @see #isSetUseAlternativeInputDataShape()
	 * @see #unsetUseAlternativeInputDataShape()
	 * @see #isUseAlternativeInputDataShape()
	 * @generated
	 */
	void setUseAlternativeInputDataShape(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDiagram#isUseAlternativeInputDataShape <em>Use Alternative Input Data Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseAlternativeInputDataShape()
	 * @see #isUseAlternativeInputDataShape()
	 * @see #setUseAlternativeInputDataShape(boolean)
	 * @generated
	 */
	void unsetUseAlternativeInputDataShape();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmndi.DMNDiagram#isUseAlternativeInputDataShape <em>Use Alternative Input Data Shape</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Alternative Input Data Shape</em>' attribute is set.
	 * @see #unsetUseAlternativeInputDataShape()
	 * @see #isUseAlternativeInputDataShape()
	 * @see #setUseAlternativeInputDataShape(boolean)
	 * @generated
	 */
	boolean isSetUseAlternativeInputDataShape();

} // DMNDiagram
