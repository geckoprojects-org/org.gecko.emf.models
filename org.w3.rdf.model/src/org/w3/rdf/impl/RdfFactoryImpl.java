/**
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
package org.w3.rdf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3.rdf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfFactoryImpl extends EFactoryImpl implements RdfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdfFactory init() {
		try {
			RdfFactory theRdfFactory = (RdfFactory)EPackage.Registry.INSTANCE.getEFactory(RdfPackage.eNS_URI);
			if (theRdfFactory != null) {
				return theRdfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfFactoryImpl() {
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
			case RdfPackage.RDF_LIST: return createRDFList();
			case RdfPackage.REST: return createRest();
			case RdfPackage.ALT: return createAlt();
			case RdfPackage.BAG: return createBag();
			case RdfPackage.IRI: return createIRI();
			case RdfPackage.RDF_SUBJECT: return createRDFSubject();
			case RdfPackage.RDF_STATEMENT: return createRDFStatement();
			case RdfPackage.RDF_PREDICATE: return createRDFPredicate();
			case RdfPackage.RDF_TYPE: return createRDFType();
			case RdfPackage.RDF_VALUE: return createRDFValue();
			case RdfPackage.FIRST: return createFirst();
			case RdfPackage.SEQ: return createSeq();
			case RdfPackage.RDF_OBJECT: return createRDFObject();
			case RdfPackage.RDFURI: return createRDFURI();
			case RdfPackage.RDF_PROPERTY: return createRDFProperty();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RdfPackage.PRIMITIVE_LITERAL:
				return createPrimitiveLiteralFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RdfPackage.PRIMITIVE_LITERAL:
				return convertPrimitiveLiteralToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFList createRDFList() {
		RDFListImpl rdfList = new RDFListImpl();
		return rdfList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rest createRest() {
		RestImpl rest = new RestImpl();
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alt createAlt() {
		AltImpl alt = new AltImpl();
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bag createBag() {
		BagImpl bag = new BagImpl();
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IRI createIRI() {
		IRIImpl iri = new IRIImpl();
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFSubject createRDFSubject() {
		RDFSubjectImpl rdfSubject = new RDFSubjectImpl();
		return rdfSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFStatement createRDFStatement() {
		RDFStatementImpl rdfStatement = new RDFStatementImpl();
		return rdfStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFPredicate createRDFPredicate() {
		RDFPredicateImpl rdfPredicate = new RDFPredicateImpl();
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFType createRDFType() {
		RDFTypeImpl rdfType = new RDFTypeImpl();
		return rdfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFValue createRDFValue() {
		RDFValueImpl rdfValue = new RDFValueImpl();
		return rdfValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public First createFirst() {
		FirstImpl first = new FirstImpl();
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seq createSeq() {
		SeqImpl seq = new SeqImpl();
		return seq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFObject createRDFObject() {
		RDFObjectImpl rdfObject = new RDFObjectImpl();
		return rdfObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFURI createRDFURI() {
		RDFURIImpl rdfuri = new RDFURIImpl();
		return rdfuri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFProperty createRDFProperty() {
		RDFPropertyImpl rdfProperty = new RDFPropertyImpl();
		return rdfProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPrimitiveLiteralFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveLiteralToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPackage getRdfPackage() {
		return (RdfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdfPackage getPackage() {
		return RdfPackage.eINSTANCE;
	}

} //RdfFactoryImpl
