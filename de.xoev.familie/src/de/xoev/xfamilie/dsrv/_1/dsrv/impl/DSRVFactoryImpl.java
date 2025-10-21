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
package de.xoev.xfamilie.dsrv._1.dsrv.impl;

import de.xoev.xfamilie.dsrv._1.dsrv.*;

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
public class DSRVFactoryImpl extends EFactoryImpl implements DSRVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSRVFactory init() {
		try {
			DSRVFactory theDSRVFactory = (DSRVFactory)EPackage.Registry.INSTANCE.getEFactory(DSRVPackage.eNS_URI);
			if (theDSRVFactory != null) {
				return theDSRVFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DSRVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSRVFactoryImpl() {
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
			case DSRVPackage.ANY_TYPE_FAMILIE_DSRV_TYPE: return createAnyTypeFamilieDSRVType();
			case DSRVPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE: return createDsrvAnfragervbea0401Type();
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE: return createDsrvEinkommensdatenrvbea0402Type();
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE: return createDsrvStatusantwortrvbea0403Type();
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
	public AnyTypeFamilieDSRVType createAnyTypeFamilieDSRVType() {
		AnyTypeFamilieDSRVTypeImpl anyTypeFamilieDSRVType = new AnyTypeFamilieDSRVTypeImpl();
		return anyTypeFamilieDSRVType;
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
	public DsrvAnfragervbea0401Type createDsrvAnfragervbea0401Type() {
		DsrvAnfragervbea0401TypeImpl dsrvAnfragervbea0401Type = new DsrvAnfragervbea0401TypeImpl();
		return dsrvAnfragervbea0401Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsrvEinkommensdatenrvbea0402Type createDsrvEinkommensdatenrvbea0402Type() {
		DsrvEinkommensdatenrvbea0402TypeImpl dsrvEinkommensdatenrvbea0402Type = new DsrvEinkommensdatenrvbea0402TypeImpl();
		return dsrvEinkommensdatenrvbea0402Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsrvStatusantwortrvbea0403Type createDsrvStatusantwortrvbea0403Type() {
		DsrvStatusantwortrvbea0403TypeImpl dsrvStatusantwortrvbea0403Type = new DsrvStatusantwortrvbea0403TypeImpl();
		return dsrvStatusantwortrvbea0403Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSRVPackage getDSRVPackage() {
		return (DSRVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DSRVPackage getPackage() {
		return DSRVPackage.eINSTANCE;
	}

} //DSRVFactoryImpl
