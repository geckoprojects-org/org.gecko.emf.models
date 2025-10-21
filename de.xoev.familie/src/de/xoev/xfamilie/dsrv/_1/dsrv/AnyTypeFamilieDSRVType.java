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
package de.xoev.xfamilie.dsrv._1.dsrv;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Type Familie DSRV Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Typ schränkt xs:anyType ein, indem nur zwei namespaces möglich sind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getAnyTypeFamilieDSRVType()
 * @model extendedMetaData="name='AnyTypeFamilieDSRVType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnyTypeFamilieDSRVType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getAnyTypeFamilieDSRVType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='http://www.rvbea.de/XMLSchema/DXWL http://www.rvbea.de/XMLSchema/RVBEA_Antwort' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AnyTypeFamilieDSRVType
