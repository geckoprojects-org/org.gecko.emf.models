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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.ecore.EClass;

import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.TextAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextAnnotationImpl extends AnnotationImpl implements TextAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getTextAnnotation();
	}

} //TextAnnotationImpl
