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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Portrayal Catalogue Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information identifing the portrayal catalogue used
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDPortrayalCatalogueReferenceType#getPortrayalCatalogueCitation <em>Portrayal Catalogue Citation</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDPortrayalCatalogueReferenceType()
 * @model extendedMetaData="name='MD_PortrayalCatalogueReference_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDPortrayalCatalogueReferenceType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Portrayal Catalogue Citation</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CICitationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrayal Catalogue Citation</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDPortrayalCatalogueReferenceType_PortrayalCatalogueCitation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='portrayalCatalogueCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CICitationPropertyType> getPortrayalCatalogueCitation();

} // MDPortrayalCatalogueReferenceType
