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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import javax.xml.namespace.QName;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Type Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FeatureTypeStepType#getFeatureTypeName <em>Feature Type Name</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFeatureTypeStepType()
 * @model extendedMetaData="name='FeatureTypeStepType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureTypeStepType extends FirstStepType1 {
	/**
	 * Returns the value of the '<em><b>Feature Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des FeatureTypes, von dem der Pfad ausgehen soll. 
	 * 
	 * Es handelt sich um einen namesraumbehafteten Namen, z.B. AX_Strassenachse im Namensraum <a href="http://www.adv-online.de/namespaces/adv/gid/6.0"><font color="#0000ff"><u>http://www.adv-online.de/namespaces/adv/gid/6.0</u></font></a>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Type Name</em>' attribute.
	 * @see #setFeatureTypeName(QName)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFeatureTypeStepType_FeatureTypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='featureTypeName'"
	 * @generated
	 */
	QName getFeatureTypeName();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FeatureTypeStepType#getFeatureTypeName <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type Name</em>' attribute.
	 * @see #getFeatureTypeName()
	 * @generated
	 */
	void setFeatureTypeName(QName value);

} // FeatureTypeStepType
