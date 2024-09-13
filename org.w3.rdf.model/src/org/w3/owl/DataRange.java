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
package org.w3.owl;

import org.osgi.annotation.versioning.ProviderType;

import org.w3.rdfs.RDFDatatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of OWL data ranges, which are special kinds of datatypes. Note: The use of the IRI owl:DataRange has been deprecated as of OWL 2. The IRI rdfs:Datatype SHOULD be used instead.
 * <!-- end-model-doc -->
 *
 *
 * @see org.w3.owl.OwlPackage#getDataRange()
 * @model
 * @generated
 */
@ProviderType
public interface DataRange extends RDFDatatype {
} // DataRange
