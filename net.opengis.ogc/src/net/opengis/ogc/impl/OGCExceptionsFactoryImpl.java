/**
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
package net.opengis.ogc.impl;

import net.opengis.ogc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OGCExceptionsFactoryImpl extends EFactoryImpl implements OGCExceptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OGCExceptionsFactory init() {
		try {
			OGCExceptionsFactory theOGCExceptionsFactory = (OGCExceptionsFactory)EPackage.Registry.INSTANCE.getEFactory(OGCExceptionsPackage.eNS_URI);
			if (theOGCExceptionsFactory != null) {
				return theOGCExceptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OGCExceptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OGCExceptionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OGCExceptionsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OGCExceptionsPackage.SERVICE_EXCEPTION_REPORT_TYPE: return createServiceExceptionReportType();
			case OGCExceptionsPackage.SERVICE_EXCEPTION_TYPE: return createServiceExceptionType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceExceptionReportType createServiceExceptionReportType() {
		ServiceExceptionReportTypeImpl serviceExceptionReportType = new ServiceExceptionReportTypeImpl();
		return serviceExceptionReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceExceptionType createServiceExceptionType() {
		ServiceExceptionTypeImpl serviceExceptionType = new ServiceExceptionTypeImpl();
		return serviceExceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OGCExceptionsPackage getOGCExceptionsPackage() {
		return (OGCExceptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OGCExceptionsPackage getPackage() {
		return OGCExceptionsPackage.eINSTANCE;
	}

} //OGCExceptionsFactoryImpl
