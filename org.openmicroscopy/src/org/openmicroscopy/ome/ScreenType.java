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
package org.openmicroscopy.ome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getReagent <em>Reagent</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getPlateRef <em>Plate Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getProtocolDescription <em>Protocol Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getProtocolIdentifier <em>Protocol Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getReagentSetDescription <em>Reagent Set Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getReagentSetIdentifier <em>Reagent Set Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ScreenType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getScreenType()
 * @model extendedMetaData="name='Screen_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScreenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the screen.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType8"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reagent</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ReagentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Reagent is used to describe a chemical or some other physical experimental parameter.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reagent</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_Reagent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Reagent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReagentType> getReagent();

	/**
	 * Returns the value of the '<em><b>Plate Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.PlateRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The PlateRef element is a reference to a Plate element.
	 *               Screen elements may have one or more PlateRef elements to define the plates that are part of the screen.
	 *               Plates may belong to more than one screen.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plate Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_PlateRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlateRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlateRefType> getPlateRef();

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.AnnotationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_ID()
	 * @model dataType="org.openmicroscopy.ome.ScreenID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A description of the screen protocol; may contain very detailed information to
	 *             reproduce some of that found in a screening database.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Description</em>' attribute.
	 * @see #setProtocolDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_ProtocolDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ProtocolDescription'"
	 * @generated
	 */
	String getProtocolDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getProtocolDescription <em>Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Description</em>' attribute.
	 * @see #getProtocolDescription()
	 * @generated
	 */
	void setProtocolDescription(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A pointer to an externally defined protocol, usually in a screening database.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Identifier</em>' attribute.
	 * @see #setProtocolIdentifier(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_ProtocolIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ProtocolIdentifier'"
	 * @generated
	 */
	String getProtocolIdentifier();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getProtocolIdentifier <em>Protocol Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Identifier</em>' attribute.
	 * @see #getProtocolIdentifier()
	 * @generated
	 */
	void setProtocolIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Reagent Set Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A description of the set of reagents; may contain very detailed information to
	 *             reproduce some of that information found in a screening database.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reagent Set Description</em>' attribute.
	 * @see #setReagentSetDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_ReagentSetDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ReagentSetDescription'"
	 * @generated
	 */
	String getReagentSetDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getReagentSetDescription <em>Reagent Set Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reagent Set Description</em>' attribute.
	 * @see #getReagentSetDescription()
	 * @generated
	 */
	void setReagentSetDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reagent Set Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A pointer to an externally defined set of reagents, usually in a screening
	 *             database/automation database.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reagent Set Identifier</em>' attribute.
	 * @see #setReagentSetIdentifier(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_ReagentSetIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ReagentSetIdentifier'"
	 * @generated
	 */
	String getReagentSetIdentifier();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getReagentSetIdentifier <em>Reagent Set Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reagent Set Identifier</em>' attribute.
	 * @see #getReagentSetIdentifier()
	 * @generated
	 */
	void setReagentSetIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A human readable identifier for the screen type; e.g. RNAi, cDNA, SiRNA, etc.
	 *             This string is likely to become an enumeration in future releases.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getScreenType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ScreenType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ScreenType
