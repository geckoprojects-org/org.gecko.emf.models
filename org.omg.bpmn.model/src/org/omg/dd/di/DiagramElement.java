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
package org.omg.dd.di;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.dd.di.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getStyle <em>Style</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.omg.dd.di.DiPackage#getDiagramElement()
 * @model extendedMetaData="name='DiagramElement' kind='elementOnly' abstract='true'"
 * @generated
 */
@ProviderType
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.dd.di.Diagram#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Diagram</em>' reference.
	 * @see org.omg.dd.di.DiPackage#getDiagramElement_OwningDiagram()
	 * @see org.omg.dd.di.Diagram#getRootElement
	 * @model opposite="rootElement" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Diagram getOwningDiagram();

	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.dd.di.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see org.omg.dd.di.DiPackage#getDiagramElement_OwningElement()
	 * @see org.omg.dd.di.DiagramElement#getOwnedElement
	 * @model opposite="ownedElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getOwningElement();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.dd.di.DiagramElement}.
	 * It is bidirectional and its opposite is '{@link org.omg.dd.di.DiagramElement#getOwningElement <em>Owning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.omg.dd.di.DiPackage#getDiagramElement_OwnedElement()
	 * @see org.omg.dd.di.DiagramElement#getOwningElement
	 * @model opposite="owningElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<DiagramElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see org.omg.dd.di.DiPackage#getDiagramElement_ModelElement()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EObject getModelElement();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' reference.
	 * @see org.omg.dd.di.DiPackage#getDiagramElement_Style()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.omg.dd.di.DiPackage#getDiagramElement_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DiagramElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.omg.dd.di.DiPackage#getDiagramElement_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DiagramElement
