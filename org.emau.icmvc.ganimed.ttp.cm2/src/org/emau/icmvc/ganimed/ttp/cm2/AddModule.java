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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddModule#getModule <em>Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddModule#isFinaliseRelatedEntities <em>Finalise Related Entities</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddModule()
 * @model extendedMetaData="name='addModule' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AddModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(ModuleDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddModule_Module()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='module'"
	 * @generated
	 */
	ModuleDTO getModule();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddModule#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ModuleDTO value);

	/**
	 * Returns the value of the '<em><b>Finalise Related Entities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Related Entities</em>' attribute.
	 * @see #isSetFinaliseRelatedEntities()
	 * @see #unsetFinaliseRelatedEntities()
	 * @see #setFinaliseRelatedEntities(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddModule_FinaliseRelatedEntities()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='finaliseRelatedEntities'"
	 * @generated
	 */
	boolean isFinaliseRelatedEntities();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddModule#isFinaliseRelatedEntities <em>Finalise Related Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Related Entities</em>' attribute.
	 * @see #isSetFinaliseRelatedEntities()
	 * @see #unsetFinaliseRelatedEntities()
	 * @see #isFinaliseRelatedEntities()
	 * @generated
	 */
	void setFinaliseRelatedEntities(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddModule#isFinaliseRelatedEntities <em>Finalise Related Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinaliseRelatedEntities()
	 * @see #isFinaliseRelatedEntities()
	 * @see #setFinaliseRelatedEntities(boolean)
	 * @generated
	 */
	void unsetFinaliseRelatedEntities();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddModule#isFinaliseRelatedEntities <em>Finalise Related Entities</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Finalise Related Entities</em>' attribute is set.
	 * @see #unsetFinaliseRelatedEntities()
	 * @see #isFinaliseRelatedEntities()
	 * @see #setFinaliseRelatedEntities(boolean)
	 * @generated
	 */
	boolean isSetFinaliseRelatedEntities();

} // AddModule
