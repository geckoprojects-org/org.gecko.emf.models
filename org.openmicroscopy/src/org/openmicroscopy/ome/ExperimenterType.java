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
 * A representation of the model object '<em><b>Experimenter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getEmail <em>Email</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimenterType#getUserName <em>User Name</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType()
 * @model extendedMetaData="name='Experimenter_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExperimenterType extends EObject {
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
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person's email address. [valid email address as string]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_Email()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Email'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimenterType#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First name, sometime called christian name or given name or forename. [plain text string]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_FirstName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FirstName'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimenterType#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_ID()
	 * @model dataType="org.openmicroscopy.ome.ExperimenterID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimenterType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A person's Institution
	 *             The organizing structure that people belong to other than groups.  A university, or company, etc.
	 *             We do not specify a department element, and do not mean for Institution to be used in this way.
	 *             We simply wish to say XXX at YYY.  Where YYY has a better chance of being tied to a geographically fixed location
	 *             and of being more recognizable than a group of experimenters. [plain text string]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_Institution()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Institution'"
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimenterType#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person's last name sometimes called surname or family name. [plain text string]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_LastName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LastName'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimenterType#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other names. [plain text string]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_MiddleName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MiddleName'"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimenterType#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the username of the experimenter (in a 'unix' or 'database' sense). [plain text string]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimenterType_UserName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='UserName'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimenterType#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

} // ExperimenterType
